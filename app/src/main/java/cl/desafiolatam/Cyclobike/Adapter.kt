package cl.desafiolatam.Cyclobike


import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class CyclobikeViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){

    var tvCiclovia : TextView
    var tvComuna : TextView

    init {
        tvCiclovia = itemView.findViewById(R.id.tvCiclovia)
        tvComuna = itemView.findViewById(R.id.tvComuna)
    }


}


class CycloAdapter (val lista: List<Ciclovia>): RecyclerView.Adapter<CyclobikeViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CyclobikeViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return CyclobikeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: CyclobikeViewHolder, position: Int) {

        val ciclovia = lista[position]
        holder.tvComuna.text = ciclovia.comuna
        holder.tvCiclovia.text = ciclovia.nombre

    }


}