package pt.ulusofona.deisi.cm2122.g22008013_21905954

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.item_list_details.view.*

class AvisoDetailFragment : Fragment() {

	companion object {
		fun newInstance() = AvisoDetailFragment()
	}

	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		val view = inflater.inflate(R.layout.item_list_details, container, false)
		val aviso = arguments?.getSerializable("detail") as AvisoModel
		view.image.setImageResource(aviso.image)
		view.tituloaviso.text = aviso.concelho

		return view
	}

	override fun onAttach(context: Context) {
		super.onAttach(context)
		val callback: OnBackPressedCallback =
			object : OnBackPressedCallback(true)
			{
				override fun handleOnBackPressed() {
					childFragmentManager.beginTransaction()
						.replace(R.id.item_detailLayout,AvisoFragment.newInstance())
						.commitNow()
				}
			}
		requireActivity().onBackPressedDispatcher.addCallback(
			this,
			callback
		)
	}
}