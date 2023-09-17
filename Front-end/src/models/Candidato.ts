import { Pessoa } from "./Pessoa";
export class Candidato implements Pessoa {
    nome: string;
    email: string;
    estado: string;
    cep: string;
    descricao: string;
    competencias: string[];
    cpf: string;
    idade:number;

    constructor(
        nome: string,
        email: string,
        estado: string,
        cep: string,
        descricao: string,
        competencias: string[],
        cpf:string,
        idade:number
    ) {
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
