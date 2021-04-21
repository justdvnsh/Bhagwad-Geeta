package divyansh.tech.bhagwad_geeta.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil.setContentView
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import divyansh.tech.bhagwad_geeta.R
import divyansh.tech.bhagwad_geeta.databinding.ActivityMainBinding
import divyansh.tech.bhagwad_geeta.presentation.player.PlayerFragment
import divyansh.tech.bhagwad_geeta.presentation.read.ReadFragment
import divyansh.tech.bhagwad_geeta.presentation.settings.SettingsFragment
import kotlinx.android.synthetic.main.bottom_bar.*
import kotlinx.android.synthetic.main.bottom_bar.view.*
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity: AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    @Inject lateinit var readFragment: ReadFragment
    @Inject lateinit var playerFragment: PlayerFragment
    @Inject lateinit var settingsFragment: SettingsFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = setContentView(this, R.layout.activity_main)
        setupBottomBar()
    }

    /*
    * Helper method to set bottom bar
    * */
    private fun setupBottomBar() {
        setupFragment(readFragment)
        binding.bottomBarLayout.apply {
            player.setOnClickListener(this@MainActivity)
            read.setOnClickListener(this@MainActivity)
            settings.setOnClickListener(this@MainActivity)
        }
    }

    /*
    * Helper method to replace current fragments
    * */
    private fun setupFragment(frag: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.mainNavHost, frag)
            commit()
        }
    }

    /*
    * OnClick listener functions
    * */
    override fun onClick(v: View?) {
        when(v) {
            player -> setupFragment(playerFragment)
            read -> setupFragment(readFragment)
            settings -> setupFragment(settingsFragment)
        }
    }
}