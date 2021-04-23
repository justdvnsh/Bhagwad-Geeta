package divyansh.tech.bhagwad_geeta.presentation.verse

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class VerseFragmentAdapter(
    private val fragmentActivity: FragmentActivity,
    private val chapterId: Int,
    private val verseCount: Int
): FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int = verseCount

    override fun createFragment(position: Int): Fragment {
        return VerseItemFragment.newInstance(chapterId, verseCount)
    }
}