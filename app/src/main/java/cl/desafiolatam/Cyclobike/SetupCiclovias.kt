package cl.desafiolatam.Cyclobike

import java.util.*

/**
 * Created by ciromine on 8/26/19.
 */
class SetupCiclovias {
    private val nombres = arrayOf(
        "Ciclovia 1",
        "Ciclovia 2",
        "Ciclovia 3",
        "Ciclovia 4",
        "Ciclovia 5",
        "Ciclovia 6",
        "Ciclovia 7",
        "Ciclovia 8",
        "Ciclovia 9",
        "Ciclovia 10",
        "Ciclovia 11",
        "Ciclovia 12",
        "Ciclovia 13",
        "Ciclovia 14",
        "Ciclovia 15",
        "Ciclovia 16",
        "Ciclovia 17",
        "Ciclovia 18",
        "Ciclovia 19",
        "Ciclovia 20"
    )
    private val comunas = arrayOf(
        "Las Condes",
        "La Reina",
        "Ñuñoa",
        "Macul",
        "Providencia",
        "Las Condes",
        "La Reina",
        "Ñuñoa",
        "Macul",
        "Providencia",
        "Las Condes",
        "La Reina",
        "Ñuñoa",
        "Macul",
        "Providencia",
        "Las Condes",
        "La Reina",
        "Ñuñoa",
        "Macul",
        "Providencia"
    )

    fun init(): MutableList<Ciclovia> {
        val lista: MutableList<Ciclovia> = ArrayList()
        for (i in 0..19) {
            val ciclovia = Ciclovia(nombres[i], comunas[i])
            lista.add(ciclovia)
        }
        return lista
    }
    fun condes(): MutableList<Ciclovia> {
        val lista: MutableList<Ciclovia> = ArrayList()

        for (i in 0..19) {
            if (init()[i].comuna == "Las Condes")

            lista.add(init()[i])
        }
        return lista
    }

    fun filtro(): MutableList<Ciclovia> {
        val lista: MutableList<Ciclovia> = ArrayList()

        for (i in 0..19) {
            if (init()[i].comuna == "Las Condes")

                lista.add(init()[i])
        }
        return lista
    }
}