package divyansh.tech.bhagwad_geeta.presentation.read

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import divyansh.tech.bhagwad_geeta.R
import divyansh.tech.bhagwad_geeta.databinding.FragmentReadBinding
import divyansh.tech.bhagwad_geeta.domain.Callbacks
import divyansh.tech.bhagwad_geeta.domain.chapter.epoxy.ChapterController
import divyansh.tech.bhagwad_geeta.presentation.chapter.ChapterFragment
import divyansh.tech.bhagwad_geeta.utils.ResultWrapper
import kotlinx.android.synthetic.main.fragment_read.*
import javax.inject.Inject

@AndroidEntryPoint
class ReadFragment: Fragment(), Callbacks {

    private lateinit var binding: FragmentReadBinding
    private val viewModel: ReadViewModel by viewModels()
    @Inject lateinit var controller: ChapterController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentReadBinding.inflate(
            inflater,
            container,
            false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getDailyContent()
        viewModel.getChapters()
        setupRecyclerView()
        setupObservers()
    }

    private fun setupRecyclerView() {
        binding.chaptersRv.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = controller.adapter
        }
    }

    private fun setupObservers() {
        viewModel.dailyContent.observe(viewLifecycleOwner, Observer {
            when (it) {
                is ResultWrapper.Loading -> {}
                is ResultWrapper.Success -> binding.slok = it.data
                is ResultWrapper.Error -> {}
            }
        })

        viewModel.chapters.observe(viewLifecycleOwner, Observer {
            when (it) {
                is ResultWrapper.Loading -> {}
                is ResultWrapper.Success -> controller.setData(it.data)
                is ResultWrapper.Error -> Toast.makeText(requireContext(), "SOMETHING WRONG", Toast.LENGTH_SHORT).show()
            }
        })
    }

    override fun onChapterClicked(chapterNum: Int) {
        requireActivity().supportFragmentManager.beginTransaction().apply {
            val frag = ChapterFragment()
            frag.arguments = Bundle().apply {
                putInt("NUM", chapterNum)
            }
            Log.i("chapter", chapterNum.toString())
            replace(R.id.mainNavHost, frag)
            commit()
        }
    }
}