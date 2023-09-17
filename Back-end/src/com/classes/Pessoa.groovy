package com.classes

class Pessoa {
    String nome
    String email
    String estado
    String cep
    String descricao
    ArrayList<String> competencias

    Pessoa(String nome, String email, String estado, String cep, String descricao, ArrayList<String> competencias) {
        this.nome = nome
        this.email = email
        this.estado = estado
        this.cep = cep
        this.descricao = descricao
        this.competencias = competencias
    }
}
