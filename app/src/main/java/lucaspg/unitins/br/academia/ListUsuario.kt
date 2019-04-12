package lucaspg.unitins.br.academia

class ListUsuario {

    var usuarios:ArrayList<Usuario> = arrayListOf()
    var cont: Int = 0


    fun add(novo_usuario: Usuario){
        usuarios.add(novo_usuario)
    }


}