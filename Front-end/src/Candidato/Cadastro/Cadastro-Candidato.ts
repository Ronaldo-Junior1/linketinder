
class Candidato {
    nome: string;
    email: string;
    estado: string;
    cep: string;
    descricao: string;
    competencias: string[];
    cpf: string;
    idade: number;
    formacao:string;

    constructor(
        nome: string,
        email: string,
        estado: string,
        cep: string,
        descricao: string,
        competencias: string[],
        cpf: string,
        idade: number,
        formacao:string
    ) {
        this.nome = nome;
        this.email = email;
        this.estado = estado;
        this.cep = cep;
        this.descricao = descricao;
        this.competencias = competencias;
        this.cpf = cpf;
        this.idade = idade;
        this.formacao = formacao
    }
}

let candidatos: Candidato[] = [];

document.getElementById('formCandidato')?.addEventListener('submit', (event) => {
    event.preventDefault();

    const nome = (<HTMLInputElement>document.getElementById('nome')).value;
    const email = (<HTMLInputElement>document.getElementById('email')).value;
    const estado = (<HTMLInputElement>document.getElementById('estado')).value;
    const cep = (<HTMLInputElement>document.getElementById('cep')).value;
    const descricao = (<HTMLInputElement>document.getElementById('descricao')).value;
    const competencias = (<HTMLInputElement>document.getElementById('competencias')).value.split(',');
    const cpf = (<HTMLInputElement>document.getElementById('cpf')).value;
    const idade = parseInt((<HTMLInputElement>document.getElementById('idade')).value);
    const formacao = (<HTMLInputElement>document.getElementById('formacao')).value;

    const novoCandidato = new Candidato(nome, email, estado, cep, descricao, competencias, cpf, idade,formacao);
    candidatos.push(novoCandidato);

    localStorage.setItem('candidatos', JSON.stringify(candidatos));
    
    console.log('Candidato adicionado:', novoCandidato);
    console.log('Lista de Candidatos:', candidatos);
    
    const listaCandidatos = document.getElementById('listaCandidatos');
    const listItem = document.createElement('li');
    listItem.textContent = novoCandidato.nome;
    listaCandidatos?.appendChild(listItem);

    (<HTMLInputElement>document.getElementById('nome')).value = '';
    (<HTMLInputElement>document.getElementById('email')).value = '';
    (<HTMLInputElement>document.getElementById('estado')).value = '';
    (<HTMLInputElement>document.getElementById('cep')).value = '';
    (<HTMLInputElement>document.getElementById('descricao')).value = '';
    (<HTMLInputElement>document.getElementById('competencias')).value = '';
    (<HTMLInputElement>document.getElementById('cpf')).value = '';
    (<HTMLInputElement>document.getElementById('idade')).value = '';
});

