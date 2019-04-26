package lucaspg.unitins.br.academia

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_cadastro.*

class CadastroActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        var nome = findViewById<EditText>(R.id.idNome)
        var peso = findViewById<EditText>(R.id.idPeso)
        var altura = findViewById<EditText>(R.id.idAltura)
        var login = findViewById<EditText>(R.id.idLogin)
        var senha = findViewById<EditText>(R.id.idSenha)
        var usuario: Usuario
        var lista: ListUsuario

        fun Salvar() {

            lista = ListUsuario()

            if ((nome.text.toString().isNullOrEmpty()) || (peso.text.toString().isNullOrEmpty()) || (altura.text.toString().isNullOrEmpty())
                || (login.text.toString().isNullOrEmpty()) || (senha.text.toString().isNullOrEmpty())
            ) {
                alert("Favor preencher todos os campos!")

                if (nome.text.toString().isNullOrEmpty()) {
                    idNome.requestFocus()
                }
                if (peso.text.toString().isNullOrEmpty()) {
                    idPeso.requestFocus()
                }
                if (altura.text.toString().isNullOrEmpty()) {
                    idAltura.requestFocus()
                }
                if (login.text.toString().isNullOrEmpty()) {
                    idNome.requestFocus()
                }
                if (senha.text.toString().isNullOrEmpty()) {
                    idSenha.requestFocus()
                }
            } else {
                usuario = Usuario(
                    nome.text.toString(),
                    peso.text.toString().toDouble(),
                    altura.text.toString().toDouble(),
                    login.text.toString(),
                    senha.text.toString()
                )
                usuario.nome = nome.text.toString()
                usuario.login = login.text.toString()
                usuario.altura = altura.text.toString().toDouble()
                usuario.peso = peso.text.toString().toDouble()
                usuario.senha = senha.text.toString()


                lista.add(usuario)

                idNome.setText("")
                idPeso.setText("")
                idAltura.setText("")
                idLogin.setText("")
                idSenha.setText("")
                idLista.setText(usuario.nome)

                // nome.setText(usuario.nome)
                nome.setText(lista.usuarios[0].nome.toString())
                peso.setText(lista.usuarios[0].peso.toString())
                altura.setText(lista.usuarios[0].altura.toString())
                login.setText(lista.usuarios[0].login.toString())
                senha.setText(lista.usuarios[0].senha.toString())

                alert("Usuário cadastrado com sucesso!")
            }
        }

        var btSalvar = findViewById<Button>(R.id.btnSalvar)
        btSalvar.setOnClickListener { Salvar() }

        var btLimpar = findViewById<Button>(R.id.btnLimpar)
        btLimpar.setOnClickListener { Limpar() }

        var btVoltar = findViewById<Button>(R.id.btnVoltar)
        btVoltar.setOnClickListener {
            var intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }


    }

    fun Limpar() {
        idNome.setText("")
        idPeso.setText("")
        idAltura.setText("")
        idLogin.setText("")
        idSenha.setText("")
        idNome.requestFocus()
    }

    fun alert(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

}
