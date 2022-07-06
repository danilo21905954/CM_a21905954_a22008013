package pt.ulusofona.deisi.cm2122.g22008013_21905954
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_avisos.view.*


class AvisoFragment : Fragment(), AdapterAviso.OnListSelected {

	companion object {
		fun newInstance() = AvisoFragment()
	}

	private val m: List<AvisoModel> = avisos()


	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		val view = inflater.inflate(R.layout.fragment_avisos, container, false)

		childFragmentManager.popBackStackImmediate()

		view.recycler_view.layoutManager = LinearLayoutManager(activity)
		view.recycler_view.adapter = AdapterAviso(m, this)
		return view

	}

	fun openPage(){}

	override fun onSelected(aviso: AvisoModel) {
		val args = Bundle()
		args.putSerializable("detail", aviso)

		val fragment = AvisoDetailFragment.newInstance()
		fragment.arguments = args

		childFragmentManager
			.beginTransaction()
			.replace(R.id.recycler_view_container, fragment, "fragmentDetail")
			.addToBackStack(null)
			.commit()
	}
}






