package pt.ulusofona.deisi.cm2122.g22008013_21905954

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class TabPageAdapter(activity: FragmentActivity, private val tabCount: Int) : FragmentStateAdapter(activity)
{

	override fun getItemCount(): Int = tabCount

	override fun createFragment(position: Int): Fragment

	{
		return when (position)
		{
			0 -> DashboardFragment.newInstance()
			1 -> AvisoFragment.newInstance()
			2 -> RegistoFragment.newInstance()
			else -> DashboardFragment()
		}
	}
}