package com.classes


class Candidato extends Pessoa{
    String cpf
    int idade

    Candidato(String nome, String email, String estado, String cep, String descricao, ArrayList<String> competencias, String cpf, int idade) {
        super(nome, email, estado, cep, descricao, competencias)
        this.cpf = cpf
        this.idade = idade
    }

    @Override
    String toString() {
        return "Candidato{" +
                "nome='"+ nome + '\'' +
                ", email='"+ email + '\'' +
                ", estado='"+ estado + '\'' +
                ", cep='"+ cep + '\'' +
                ", descrição='"+ descricao + '\'' +
                ", competencias=" + competencias + '\''+
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade +
                '}';
    }

   static listarCandidatos(List<Candidato> candidatos) {
       candidatos.each { candidato ->
           println(candidato)
       }
    }

}



