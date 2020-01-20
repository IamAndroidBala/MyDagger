package com.android.bala.dagger.ui.homescreen

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.android.bala.dagger.ui.userscreen.UserFragment
import com.android.bala.dagger.ui.albumscreen.AlbumFragment
import com.android.bala.dagger.ui.postscreen.PostFragment

class HomeAdapter (fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        var fragment: Fragment? = null

        when (position) {
            0 -> fragment = UserFragment()
            1 -> fragment = PostFragment()
            2 -> fragment = AlbumFragment()
        }

        return fragment!!
    }

    override fun getCount(): Int {
        return 3
    }

}