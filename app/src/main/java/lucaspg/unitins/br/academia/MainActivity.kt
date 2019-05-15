package lucaspg.unitins.br.academia

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.util.Log
import android.view.Menu
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var usuarios: ArrayList<Usuario> = arrayListOf()
    lateinit var usuario: Usuario
    lateinit var lt: ListUsuario

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tLogin = findViewById<EditText>(R.id.editTextLogin)
        var tSenha = findViewById<EditText>(R.id.editTextSenha)


        var btEntrar = findViewById<Button>(R.id.btnEntrar)
        btEntrar.setOnClickListener { Logar(tLogin,tSenha) }

        var btCadastrar = findViewById<Button>(R.id.btnCadastrar)
        btCadastrar.setOnClickListener {
            Cadastrar()
        }

        var btLimpar = findViewById<Button>(R.id.btnLimpar)
        btLimpar.setOnClickListener { Limpar() }
    }


    fun Logar(tLogin: EditText, tSenha: EditText) {

        var login = tLogin.text.toString()
        var senha = tSenha.text.toString()



            if ("admin".equals(login) && "123".equals(senha)) {
                var intent = Intent(applicationContext, MenuMembroActivity::class.java)
                startActivity(intent)
                alert("Bem Vindo, Acesso Realizado com Sucesso")
            } else {
                alert("Login e/ou Senha Incorretos")
            }
        }


    fun Cadastrar() {
        var intent = Intent(applicationContext, CadastroActivity::class.java)
        startActivity(intent)
    }

    fun Limpar() {

        editTextLogin.setText("")
        editTextSenha.setText("")
        editTextLogin.requestFocus()

    }

    fun alert(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

    }

}




