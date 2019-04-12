package lucaspg.unitins.br.academia

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var btlogin = findViewById<Button>(R.id.btLogin)
        btlogin.setOnClickListener { Logar() }

        var btLimpar = findViewById<Button>(R.id.btnLimpar)
        btLimpar.setOnClickListener { ExercicioActivity() }

    }

    fun Logar() {

        var tLogin = findViewById<EditText>(R.id.editTextLogin)
        var tSenha = findViewById<EditText>(R.id.tSenha)
        var tTeste : String = ""

        var login = tLogin.text.toString()
        var senha = tSenha.text.toString()

        if ("admin".equals(login) && "123".equals(senha)) {

            alert("Bem Vindo, Acesso Realizado com Sucesso")
        } else {

            alert("Login e Senha Incorretos")
        }
    }

    fun Limpar() {

        editTextLogin.setText("")
        tSenha.setText("")
        editTextLogin.requestFocus()
    }

    fun alert(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

    }
}
