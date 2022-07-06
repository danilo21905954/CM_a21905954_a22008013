package pt.ulusofona.deisi.cm2122.g22008013_21905954

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_form.view.*
import kotlinx.android.synthetic.main.fragment_setting.view.*

class RegistoFragment : Fragment() {

	private val m: List<AvisoModel> = avisos()


	companion object {
		fun newInstance() = RegistoFragment()
	}

	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?

	): View? {

		val view = inflater.inflate(R.layout.fragment_setting, container, false)

		view.btn_submit.setOnClickListener{

			var model : AvisoModel? = null
			model?.nome =  view.emailEditText.toString()
			if (model != null) {
				m.toMutableList().add(model)
			}

		}
		return view

	}
}