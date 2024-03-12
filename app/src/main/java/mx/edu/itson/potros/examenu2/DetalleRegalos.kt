package mx.edu.itson.potros.examenu2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetalleRegalos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_regalos)

        val iv_img_regalo : ImageView = findViewById<ImageView>(R.id.iv_img_regalo)
        val precio : TextView = findViewById(R.id.tv_regalo_precio)

        val bundle = intent.extras
        if (bundle != null){
            iv_img_regalo.setImageResource(bundle.getInt("header"))
            precio.setText(bundle.getString("Precio"))
        }

    }
}