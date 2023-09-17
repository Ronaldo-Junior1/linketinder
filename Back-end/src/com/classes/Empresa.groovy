package com.classes

class Empresa extends Pessoa{
    String cnpj
    String pais

    Empresa(String nome, String email, String estado, String cep, String descricao, ArrayList<String> competencias, String cnpj, String pais) {
        super(nome, email, estado, cep, descricao, competencias)
        this.cnpj = cnpj
        this.pais = pais
    }


    @Override
    String toString() {
        return "Empresa{" +
                "nome='"+ nome + '\'' +
                ", email='"+ email + '\'' +
                ", estado='"+ estado + '\'' +
                ", cep='"+ cep + '\'' +
                ", descrição='"+ descricao + '\'' +
                ", competencias='" + competencias + '\''+
                ", cnpj='" + cnpj + '\'' +
                ", pais='" + pais + '\'' +
                '}'
    }


}
