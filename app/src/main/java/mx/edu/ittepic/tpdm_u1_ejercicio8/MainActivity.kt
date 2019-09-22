package mx.edu.ittepic.tpdm_u1_ejercicio8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.util.*

class MainActivity : AppCompatActivity() {

    var num : EditText?=null
    var boton1 : Button?=null
    var numeros = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num = findViewById(R.id.numeros)
        boton1 = findViewById(R.id.abrir)




        boton1?.setOnClickListener {
            var otraActivity1 = Intent(this, Main2Activity::class.java )
            startActivity(otraActivity1)

            numeros = num?.text.toString()
            otraActivity1.putExtra("num",numeros)



        }
    }
}
