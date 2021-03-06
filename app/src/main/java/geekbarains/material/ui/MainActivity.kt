package geekbarains.material.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import geekbarains.material.R
import geekbarains.material.ui.picture.PictureOfTheDayFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, PictureOfTheDayFragment.newInstance())
                .commitAllowingStateLoss()
        }
    }
}
