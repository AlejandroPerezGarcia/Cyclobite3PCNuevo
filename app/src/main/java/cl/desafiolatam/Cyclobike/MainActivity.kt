package cl.desafiolatam.Cyclobike

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemLongClickListener
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , AdapterView.OnItemSelectedListener,
    OnItemLongClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listof = listOf( "Las Condes","La Reina","Ñuñoa","Macul","Providencia")

       val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,listof)
        FiltroComuna.adapter = adapter



    }

    /*
     * Boton sin filtrar
     */
    fun SinFiltro(view: View) {
        cyclo_recycler.adapter = CycloAdapter(SetupCiclovias().init())
    }

    /*
    * boton de filtro las condes
    */
    fun LasCondes(view: View) {
        cyclo_recycler.adapter = CycloAdapter(SetupCiclovias().condes())
    }



    override fun onNothingSelected(p0: AdapterView<*>?) {
        TODO("Not yet implemented")
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        TODO("Not yet implemented")
    }

    override fun onItemLongClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long): Boolean {
        TODO("Not yet implemented")
    }

}

