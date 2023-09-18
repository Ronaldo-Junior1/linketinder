"use strict";
document.addEventListener('DOMContentLoaded', () => {
    const listaEmpresas = document.getElementById('listaEmpresas');
    const empresasString = localStorage.getItem('empresas');
    const empresas = empresasString ? JSON.parse(empresasString) : [];
    console.log(empresasString);
    console.log(empresas);
    empresas.forEach((empresa) => {
        const listaEmpresas = document.getElementById('listaEmpresas');
        const listItem = document.createElement('li');
        listItem.textContent = empresa.nome;
        listaEmpresas === null || listaEmpresas === void 0 ? void 0 : listaEmpresas.appendChild(listItem);
    });
});
