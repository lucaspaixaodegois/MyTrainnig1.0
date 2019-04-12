package lucaspg.unitins.br.academia

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuMembroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_membro)


        var btnExercicioBiceps = findViewById<Button>(R.id.btnBiceps)
        btnExercicioBiceps.setOnClickListener { biceps() }

        var btnExercicioAbdominal = findViewById<Button>(R.id.btnAbdominal)
        btnExercicioAbdominal.setOnClickListener { abdominal() }

        var btnExercicioAntebracos = findViewById<Button>(R.id.btnAntebracos)
        btnExercicioAntebracos.setOnClickListener { pernas() }

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
