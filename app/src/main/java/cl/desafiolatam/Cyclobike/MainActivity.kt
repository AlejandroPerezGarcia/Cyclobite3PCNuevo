package cl.desafiolatam.Cyclobike

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


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

}

