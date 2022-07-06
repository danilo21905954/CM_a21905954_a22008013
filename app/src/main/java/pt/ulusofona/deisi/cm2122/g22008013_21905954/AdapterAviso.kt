package pt.ulusofona.deisi.cm2122.g22008013_21905954

import android.annotation.SuppressLint
import android.content.ClipData
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_list.view.*
import java.text.SimpleDateFormat
import java.util.*


class AdapterAviso(
	private val mList: List<AvisoModel>,
	private val listener : OnListSelected
) : RecyclerView.Adapter<AdapterAviso.ViewHolder>() {


	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

		val view = LayoutInflater.from(parent.context)
			.inflate(R.layout.item_list, parent, false)
		return ViewHolder(view)
	}


	@SuppressLint("SimpleDateFormat")
	override fun onBindViewHolder(holder: ViewHolder, position: Int) {

		val ItemsViewModel = mList[position]

		holder.imageView.setImageResource(ItemsViewModel.image)
		holder.concelho.text = ItemsViewModel.concelho
		holder.data.text = ItemsViewModel.data
	}

	override fun getItemCount(): Int {
		return mList.size
	}


	inner class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView),View.OnClickListener {

		val imageView: ImageView = itemView.findViewById(R.id.list_img)
		val concelho: TextView = itemView.findViewById(R.id.list_name)
		val data: TextView = itemView.findViewById(R.id.data)

		init {
			itemView.setOnClickListener(this)
		}

		override fun onClick(p0: View?) {

			if(adapterPosition != RecyclerView.NO_POSITION) {
				listener.onSelected(mList[adapterPosition])
			}
		}
	}
	interface OnListSelected {

		fun onSelected(aviso: AvisoModel)
	}
}