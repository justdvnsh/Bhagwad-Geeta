package divyansh.tech.bhagwad_geeta.presentation.chapter

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import divyansh.tech.bhagwad_geeta.R
import divyansh.tech.bhagwad_geeta.databinding.FragmentChapterDetailsBinding
import divyansh.tech.bhagwad_geeta.domain.VerseClickCallback
import divyansh.tech.bhagwad_geeta.domain.chapter.epoxy.ChapterController
import divyansh.tech.bhagwad_geeta.domain.chapter.epoxy.VerseController
import divyansh.tech.bhagwad_geeta.presentation.verse.VerseFragment
import divyansh.tech.bhagwad_geeta.utils.ResultWrapper
import kotlinx.android.synthetic.main.activity_main.view.*
import javax.inject.Inject

@AndroidEntryPoint
class ChapterFragment: Fragment(), VerseClickCallback {

    private lateinit var binding: FragmentChapterDetailsBinding
    private val viewModel: ChapterViewModel by viewModels()
    private var chapNum: Int? = null
    @Inject
    lateinit var controller: VerseController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentChapterDetailsBinding.inflate(
            inflater,
            container,
            false
        )
        chapNum = arguments?.getInt("NUM")
        Log.i("chapter", chapNum.toString())
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("chapter", chapNum.toString())
        viewModel.getChapter(chapNum!!)
        setupRecyclerView()
        setupObservers()
    }

    private fun setupRecyclerView() {
        binding.versesRv.apply {
            layoutManager = GridLayoutManager(requireContext(), 3)
            adapter = controller.adapter
        }
    }

    private fun setupObservers() {
        viewModel.chapter.observe(viewLifecycleOwner, {
            when (it) {
                is ResultWrapper.Error -> {
                }
                is ResultWrapper.Loading -> {
                }
                is ResultWrapper.Success -> {
                    binding.chapter = it.data
                    setupTextViewToggleListener(binding.chapterSummaryTv)
                    val list: MutableList<Int> = mutableListOf()
                    for (i in 1 until it.data?.versesCount!! + 1) {
                        list.add(i)
                    }
                    controller.setData(list)
                }
            }
        })
    }

    private fun setupTextViewToggleListener(textView: TextView) {
        var isTextViewClicked = false
        textView.setOnClickListener {
            if (isTextViewClicked) {
                textView.maxLines = 2
                isTextViewClicked = false
            } else {
                textView.maxLines = Int.MAX_VALUE
                isTextViewClicked = true
            }
        }
    }

    override fun onVerseClick(verseNum: Int) {
        val frag = VerseFragment.newInstance(chapNum!!, verseNum)
        requireActivity().supportFragmentManager.beginTransaction().apply {
            replace(R.id.mainNavHost, frag)
            commit()
        }
    }
}