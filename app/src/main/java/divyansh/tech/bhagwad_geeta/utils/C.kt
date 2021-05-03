package divyansh.tech.bhagwad_geeta.utils

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import divyansh.tech.bhagwad_geeta.R

object C {
    const val BASE_URL = "https://vedicscripturesapi.herokuapp.com/"

    fun setFragment(fragmentManager: FragmentManager, fragment: Fragment, view: Int) {
        fragmentManager.beginTransaction().apply {
            replace(view, fragment)
            commit()
        }
    }
}