"use strict";
var _a;
class Empresa {
    constructor(nome, email, estado, cep, descricao, competencias, cnpj, pais) {
        this.nome = nome;
        this.email = email;
        this.estado = estado;
        this.cep = cep;
        this.descricao = descricao;
        this.competencias = competencias;
        this.cnpj = cnpj;
        this.pais = pais;
    }
}
let empresas = [];
(_a = document.getElementById('formEmpresa')) === null || _a === void 0 ? void 0 : _a.addEventListener('submit', (event) => {
    event.preventDefault();
    const nome = document.getElementById('nome').value;
    const email = document.getElementById('email').value;
    const estado = document.getElementById('estado').value;
    const cep = document.getElementById('cep').value;
    const descricao = document.getElementById('descricao').value;
    const competencias = document.getElementById('competencias').value.split(',');
    const cnpj = document.getElementById('cnpj').value;
    const pais = (document.getElementById('pais').value);
    const novaEmpresa = new Empresa(nome, email, estado, cep, descricao, competencias, cnpj, pais);
    empresas.push(novaEmpresa);
    localStorage.setItem('empresas', JSON.stringify(empresas));
    console.log('Empresa adicionada:', novaEmpresa);
    console.log('Lista de Empresas:', empresas);
    const listaEmpresas = document.getElementById('listaEmpresas');
    const listItem = document.createElement('li');
    listItem.textContent = novaEmpresa.nome;
    listaEmpresas === null || listaEmpresas === void 0 ? void 0 : listaEmpresas.appendChild(listItem);
    document.getElementById('nome').value = '';
    document.getElementById('email').value = '';
    document.getElementById('estado').value = '';
    document.getElementById('cep').value = '';
    document.getElementById('descricao').value = '';
    document.getElementById('competencias').value = '';
    document.getElementById('cnpj').value = '';
    document.getElementById('pais').value = '';
});
