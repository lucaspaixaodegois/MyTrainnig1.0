package lucaspg.unitins.br.academia

import java.io.Serializable

class Usuario  {

    var nome: String = ""
    var peso: Double=0.0
    var altura: Double= 0.0
    var login: String= ""
    var senha: String= ""





    constructor(nome: String, peso: Double,altura: Double,login: String,senha: String){
        this.nome = nome
        this.peso = peso
        this.altura = altura
        this.login = login
        this.senha = senha
    }

}