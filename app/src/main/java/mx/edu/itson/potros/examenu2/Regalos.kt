package mx.edu.itson.potros.examenu2

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView

class Regalos : AppCompatActivity() {
    var adapter: RegaloAdapter? = null
    var regalos = ArrayList<Detalles>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regalos)
        var option : String? = intent.getStringExtra("menuType")

        var gridDetalles: GridView = findViewById(R.id.regalos_catalogo)
        gridDetalles
        cargarDetalles(option)
    }

    fun cargarDetalles(option){
        when(option){
            "Regalos" -> {
                regalos.add(Detalles(R.drawable.regalos, "3.99"))
                regalos.add(Detalles(R.drawable.regaloazul, "3.99"))
                regalos.add(Detalles(R.drawable.regalobebe, "3.99"))
                regalos.add(Detalles(R.drawable.regalocajas, "3.99"))
                regalos.add(Detalles(R.drawable.regalocolores, "3.99"))
                regalos.add(Detalles(R.drawable.regalovarios, "3.99"))
            }
            "Globos" -> {
                regalos.add(Detalles(R.drawable.globoamor, "3.99"))
                regalos.add(Detalles(R.drawable.globocumple, "3.99"))
                regalos.add(Detalles(R.drawable.globofestejo, "3.99"))
                regalos.add(Detalles(R.drawable.globonum, "3.99"))
                regalos.add(Detalles(R.drawable.globos, "3.99"))
                regalos.add(Detalles(R.drawable.globoregalo, "3.99"))
            }
            "Peluches" -> {
                regalos.add(Detalles(R.drawable.peluchemario, "3.99"))
                regalos.add(Detalles(R.drawable.pelucheminecraft, "3.99"))
                regalos.add(Detalles(R.drawable.peluchepeppa, "3.99"))
                regalos.add(Detalles(R.drawable.peluches, "3.99"))
                regalos.add(Detalles(R.drawable.peluchesony, "3.99"))
                regalos.add(Detalles(R.drawable.peluchestich, "3.99"))
            }
            "Tazas" -> {
                regalos.add(Detalles(R.drawable.tazaabuela, "3.99"))
                regalos.add(Detalles(R.drawable.tazalove, "3.99"))
                regalos.add(Detalles(R.drawable.tazaquiero, "3.99"))
                regalos.add(Detalles(R.drawable.tazas, "3.99"))
            }
            "Detalles" -> {
                regalos.add(Detalles(R.drawable.cumplebotanas, "3.99"))
                regalos.add(Detalles(R.drawable.cumplecheve, "3.99"))
                regalos.add(Detalles(R.drawable.cumpleescolar, "3.99"))
                regalos.add(Detalles(R.drawable.cumplepaletas, "3.99"))
                regalos.add(Detalles(R.drawable.cumplesnack, "3.99"))
                regalos.add(Detalles(R.drawable.cumplevinos, "3.99"))
            }
        }
    }

    class RegaloAdapter: BaseAdapter{
        var detalles = java.util.ArrayList<Detalles>()
        var contexto : Context?= null

        constructor(context: Context, detalles: ArrayList<Detalles>){
            this.detalles = detalles
            this.contexto = context
        }

        override fun getCount(): Int {
            return detalles.count()
        }

        override fun getItem(position: Int): Any {
            return detalles[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var detalle = detalles[position]
            var inflator = contexto!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var vista = inflator.inflate(R.layout.detalle_regalos, null)
            var image: ImageView = vista.findViewById<ImageView>(R.id.iv_img_regalo)
            var precio: TextView = vista.findViewById(R.id.tv_regalo_precio)

            image.setImageResource(detalle.image)
            precio.setText(detalle.precio)

            image.setOnClickListener {
                val intento = Intent(contexto, DetalleRegalos::class.java)
                intento.putExtra("imagen", detalle.image)
                intento.putExtra("Precio", detalle.precio)
                contexto!!.startActivity(intento)
            }
            return vista
        }

    }
}