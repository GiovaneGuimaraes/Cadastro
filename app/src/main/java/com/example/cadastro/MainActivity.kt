package com.example.cadastro


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.cadastro.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    private lateinit var formulario: Formulario
    private lateinit var amb: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = ActivityMainBinding.inflate(this.layoutInflater)
        setContentView(amb.root)

        setSupportActionBar(amb.mainTb)
        supportActionBar?. title= getString(R.string.app_name)


        amb.limparBt.setOnClickListener(){

            amb.nomeEt.text.clear()
            amb.telefoneEt.text.clear()
            amb.emailEt.text.clear()
            amb.cidadeTv.text.clear()
            amb.emailRb.isChecked = false
            amb.masculinoRb.isChecked = true
            amb.femininoRb.isChecked = false
            amb.estadosSp.setSelection(0)
        }

        amb.salvaBt.setOnClickListener(){
            val sexoSelecionado = if (amb.masculinoRb.isChecked) "Masculino" else "Feminino"
            var nome = amb.nomeEt.text.toString()
            var telefone = amb.telefoneEt.text.toString()
            var email = amb.emailEt.text.toString()
            var sexo = sexoSelecionado
            var cidade = amb.cidadeTv.text.toString()
            var uf = amb.estadosSp.selectedItem.toString()

            formulario = Formulario(nome, telefone, email, sexo, cidade, uf)
            Toast.makeText(this@MainActivity, formulario.toString(),
                Toast.LENGTH_LONG).show()
        }

    }
}