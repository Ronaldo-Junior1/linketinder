"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Candidato = void 0;
class Candidato {
    constructor(nome, email, estado, cep, descricao, competencias, cpf, idade) {
        this.nome = nome;
        this.email = email;
        this.estado = estado;
        this.cep = cep;
        this.descricao = descricao;
        this.competencias = competencias;
        this.cpf = cpf;
        this.idade = idade;
    }
}
exports.Candidato = Candidato;
