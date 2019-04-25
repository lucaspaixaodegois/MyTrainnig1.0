package lucaspg.unitins.br.academia

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuMembroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_membro)


        var btnExercicioVoltar = findViewById<Button>(R.id.btnVoltar)
        btnExercicioVoltar.setOnClickListener { voltar() }

        var btnExercicioAbdominal = findViewById<Button>(R.id.btnAbdominal)
        btnExercicioAbdominal.setOnClickListener { abdominal() }

        var btnExercicioAntebracos = findViewById<Button>(R.id.btnAntebracos)
        btnExercicioAntebracos.setOnClickListener { pernas() }

    }

    fun voltar() {
        var intent = Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)
    }

    fun abdominal() {
        var intent = Intent(applicationContext, ExercicioPernasActivity::class.java)
        startActivity(intent)
    }
    fun antebracos() {
        var intent = Intent(applicationContext, ExercicioActivity::class.java)
        startActivity(intent)
    }
    fun pernas() {
        var intent = Intent(applicationContext, ExercicioPernasActivity::class.java)
        startActivity(intent)
    }
    fun biceps() {
        var intent = Intent(applicationContext, ExercicioActivity::class.java)
        startActivity(intent)
    }
}
