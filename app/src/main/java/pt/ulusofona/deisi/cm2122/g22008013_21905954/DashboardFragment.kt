package pt.ulusofona.deisi.cm2122.g22008013_21905954

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_dashboard.view.*


class DashboardFragment : Fragment() {

	companion object {
		fun newInstance() = DashboardFragment()
	}
	private val m: List<AvisoModel> = avisos()

	override fun onCreateView(

		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?

	): View? {
		val view = inflater.inflate(R.layout.fragment_dashboard, container, false)
		view.casos_incendio.text = m.size.toString()
		view.veiculos.text = m.size.toString()
		view.man_combat.text = m.size.toString()
		return view
	}
}
