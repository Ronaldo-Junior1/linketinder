"use strict";
var _a;
class Candidato {
    constructor(nome, email, estado, cep, descricao, competencias, cpf, idade, formacao) {
        this.nome = nome;
        this.email = email;
        this.estado = estado;
        this.cep = cep;
        this.descricao = descricao;
        this.competencias = competencias;
        this.cpf = cpf;
        this.idade = idade;
        this.formacao = formacao;
    }
}
let candidatos = [];
(_a = document.getElementById('formCandidato')) === null || _a === void 0 ? void 0 : _a.addEventListener('submit', (event) => {
    event.preventDefault();
    const nome = document.getElementById('nome').value;
    const email = document.getElementById('email').value;
    const estado = document.getElementById('estado').value;
    const cep = document.getElementById('cep').value;
    const descricao = document.getElementById('descricao').value;
    const competencias = document.getElementById('competencias').value.split(',');
    const cpf = document.getElementById('cpf').value;
    const idade = parseInt(document.getElementById('idade').value);
    const formacao = document.getElementById('formacao').value;
    const novoCandidato = new Candidato(nome, email, estado, cep, descricao, competencias, cpf, idade, formacao);
    candidatos.push(novoCandidato);
    localStorage.setItem('candidatos', JSON.stringify(candidatos));
    console.log('Candidato adicionado:', novoCandidato);
    console.log('Lista de Candidatos:', candidatos);
    const listaCandidatos = document.getElementById('listaCandidatos');
    const listItem = document.createElement('li');
    listItem.textContent = novoCandidato.nome;
    listaCandidatos === null || listaCandidatos === void 0 ? void 0 : listaCandidatos.appendChild(listItem);
    document.getElementById('nome').value = '';
    document.getElementById('email').value = '';
    document.getElementById('estado').value = '';
    document.getElementById('cep').value = '';
    document.getElementById('descricao').value = '';
    document.getElementById('competencias').value = '';
    document.getElementById('cpf').value = '';
    document.getElementById('idade').value = '';
});
