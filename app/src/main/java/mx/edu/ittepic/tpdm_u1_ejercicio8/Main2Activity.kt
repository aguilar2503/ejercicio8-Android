package mx.edu.ittepic.tpdm_u1_ejercicio8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    var posiscion : EditText?=null
    var boton2 : Button?=null
    var etiqueta : TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        posiscion = findViewById(R.id.ver)
        boton2 = findViewById(R.id.mostrar)
        etiqueta = findViewById(R.id.resultado)
        var cadena = intent.extras?.getString("num")
        var resultado = cadena.toString().split(",")

        boton2?.setOnClickListener {

            etiqueta?.setText(cadena)

        }

    }
}
