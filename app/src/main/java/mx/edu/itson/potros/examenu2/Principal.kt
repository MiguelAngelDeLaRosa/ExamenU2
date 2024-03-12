package mx.edu.itson.potros.examenu2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        val btnDetalles : Button = findViewById(R.id.btn_detalles)
        val btnGlobos : Button = findViewById(R.id.btn_globos)
        val btnPeluches : Button = findViewById(R.id.btn_peluches)
        val btnRegalos : Button = findViewById(R.id.btn_regalos)
        val btnTazas : Button = findViewById(R.id.btn_tazas)

        btnDetalles.setOnClickListener {
            val intent : Intent = Intent(this, Regalos::class.java)
            intent.putExtra("menuType", "Detalles")
            startActivity(intent)
        }

        btnGlobos.setOnClickListener {
            val intent : Intent = Intent(this, Regalos::class.java)
            intent.putExtra("menuType", "Globos")
            startActivity(intent)
        }

        btnPeluches.setOnClickListener {
            val intent : Intent = Intent(this, Regalos::class.java)
            intent.putExtra("menuType", "Peluches")
            startActivity(intent)
        }

        btnRegalos.setOnClickListener {
            val intent : Intent = Intent(this, Regalos::class.java)
            intent.putExtra("menuType", "Regalos")
            startActivity(intent)
        }

        btnTazas.setOnClickListener {
            val intent : Intent = Intent(this, Regalos::class.java)
            intent.putExtra("menuType", "Tazas")
            startActivity(intent)
        }
    }
}