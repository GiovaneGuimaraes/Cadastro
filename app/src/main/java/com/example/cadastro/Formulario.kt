package com.example.cadastro

class Formulario(var nome: String?,
                 var telefone: String?,
                 var email: String?,
                 var sexo: String?,
                 var cidade: String?,
                 var uf: String?) {

    override fun toString(): String {
        return "nome: $nome\n" +
                "telefone: $telefone\n" +
                "email: $email\n" +
                "sexo: $sexo\n" +
                "cidade: $cidade\n" +
                "uf: $uf"
    }

}