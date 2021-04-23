package divyansh.tech.bhagwad_geeta.presentation.verse

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import divyansh.tech.bhagwad_geeta.databinding.FragmentVerseBinding
import kotlinx.android.synthetic.main.fragment_verse.*

@AndroidEntryPoint
class VerseFragment: Fragment() {

    private lateinit var binding: FragmentVerseBinding
    private var chapterId: Int? = null
    private var verseId: Int? = null

    companion object {
        fun newInstance(chapterId: Int, verseId: Int): VerseFragment {
            val frag = VerseFragment()
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
        binding = FragmentVerseBinding.inflate(
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
        Log.i("VIEWMODEL->CHAPTER", chapterId.toString())
        Log.i("VIEWMODEL->VERSE", verseId.toString())
        binding.chapNum = chapterId!!
        binding.verseNum = verseId!!
        versePager.adapter = VerseFragmentAdapter(requireActivity(), chapterId!!, verseId!!)
    }
}