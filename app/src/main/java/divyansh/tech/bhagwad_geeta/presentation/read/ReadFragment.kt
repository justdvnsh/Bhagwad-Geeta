package divyansh.tech.bhagwad_geeta.presentation.read

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import dagger.hilt.android.AndroidEntryPoint
import divyansh.tech.bhagwad_geeta.R
import divyansh.tech.bhagwad_geeta.databinding.FragmentReadBinding
import divyansh.tech.bhagwad_geeta.models.chapters.ChapterItem
import divyansh.tech.bhagwad_geeta.utils.ResultWrapper

@AndroidEntryPoint
class ReadFragment: Fragment() {

    private lateinit var binding: FragmentReadBinding
    private val viewModel: ReadViewModel by viewModels()

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
        setupObservers()
    }

    private fun setupRecyclerView(data: List<ChapterItem>) {
        binding.chaptersRv.withModels {
            
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
                is ResultWrapper.Success -> setupRecyclerView(it.data!!)
                is ResultWrapper.Error -> {}
            }
        })
    }
}