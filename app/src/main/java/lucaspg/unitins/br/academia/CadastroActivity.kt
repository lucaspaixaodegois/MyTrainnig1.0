package lucaspg.unitins.br.academia

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
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

        var btVoltar = findViewById<Button>(R.id.idVoltar)
        var btSalvar = findViewById<Button>(R.id.idSalvar)

        var usuario: Usuario
        var lista: ListUsuario
        lista = ListUsuario()




        if (nome.text.toString().isNullOrEmpty() && peso.text.toString().isNullOrEmpty()) {
        }

        btSalvar.setOnClickListener(View.OnClickListener {
            if (nome.text.toString().isNullOrEmpty() && peso.text.toString().isNullOrEmpty() && altura.text.toString().isNullOrEmpty()
                && login.text.toString().isNullOrEmpty() && senha.text.toString().isNullOrEmpty()
            ) {

                idNome.setText("Digite Nome")
                idPeso.setText("Digite Peso")
                idAltura.setText("Digite Altura")
                idLogin.setText("Digite Login")
                idSenha.setText("")
                idLista.setText("Preencha todos os campos por favor!")

                return@OnClickListener
            }
            usuario = Usuario(
                nome.text.toString(), peso.text.toString().toDouble(), altura.text.toString().toDouble(),
                login.text.toString(), senha.text.toString()
            )

            lista.add(usuario)

            idNome.setText("")
            idPeso.setText("")
            idAltura.setText("")
            idLogin.setText("")
            idSenha.setText("")

            idLista.setText(usuario.nome)

        })


    }
}
