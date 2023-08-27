package com.classes


class Candidato extends Pessoa{
    String cpf
    int idade
    ArrayList<String> competencias


    Candidato(String nome, String email, String estado, String cep, String descricao, String cpf, int idade, ArrayList<String> competencias) {
        super(nome, email, estado, cep, descricao)
        this.cpf = cpf
        this.idade = idade
        this.competencias = competencias

    }


    @Override
    String toString() {
        return "Candidato{" +
                "nome='"+ nome + '\'' +
                "nome='"+ email + '\'' +
                "nome='"+ estado + '\'' +
                "nome='"+ cep + '\'' +
                "nome='"+ descricao + '\'' +
                "cpf='" + cpf + '\'' +
                ", idade=" + idade +
                ", competencias=" + competencias +
                '}';
    }

   static listarCandidatos(List<Candidato> candidatos) {
       candidatos.each { candidato ->
           println(candidato)
       }
    }

}



