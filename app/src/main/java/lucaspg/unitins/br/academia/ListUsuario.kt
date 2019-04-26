package lucaspg.unitins.br.academia

import java.io.Serializable

class ListUsuario : Serializable {

    var usuarios: ArrayList<Usuario> = arrayListOf()
    var cont: Int = 0


    fun add(novo_usuario: Usuario) {
        usuarios.add(novo_usuario)
    }


}