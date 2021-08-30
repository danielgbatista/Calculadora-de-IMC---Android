package br.senai.sp.jandira.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Linkando os edit text e botão
        val editPeso = findViewById<EditText>(R.id.edit_peso)
        val editAltura = findViewById<EditText>(R.id.edit_altura)
        val buttonCalcular = findViewById<Button>(R.id.button_calcular)

        //chmando bloco de comando quando o botão for clicado
        buttonCalcular.setOnClickListener{
            //pegando texto do editPeso
            Toast.makeText(this, editPeso.text.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}