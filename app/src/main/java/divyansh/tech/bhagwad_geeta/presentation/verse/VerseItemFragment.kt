package divyansh.tech.bhagwad_geeta.presentation.verse

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import dagger.hilt.android.AndroidEntryPoint
import divyansh.tech.bhagwad_geeta.databinding.FragmentVerseItemBinding
import divyansh.tech.bhagwad_geeta.utils.ResultWrapper

@AndroidEntryPoint
class VerseItemFragment: Fragment() {

    private lateinit var binding: FragmentVerseItemBinding
    private val viewModel: VerseViewModel by viewModels()
    private var chapterId: Int? = null
    private var verseId: Int? = null

    companion object {
        fun newInstance(chapterId: Int, verseId: Int): VerseItemFragment {
            val frag = VerseItemFragment()
            frag.arguments = Bundle().apply {
                putInt("CHAPTER", chapterId)
                putInt("VERSE", verseId)
            }
            return frag
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentVerseItemBinding.inflate(
            inflater,
            container,
            false
        )
        chapterId = arguments?.getInt("CHAPTER")
        verseId = arguments?.getInt("VERSE")
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("VIEWMODEL->CHAPTER:::", chapterId.toString())
        Log.i("VIEWMODEL->VERSE:::", verseId.toString())
        viewModel.getVerse(chapterId!!, verseId!!)
        setupObservers()
    }

    private fun setupObservers() {
        viewModel.verse.observe(viewLifecycleOwner, Observer {
            when (it) {
                is ResultWrapper.Success -> binding.verse = it.data
                is ResultWrapper.Loading -> {}
                is ResultWrapper.Error -> {}
            }
        })
    }

}