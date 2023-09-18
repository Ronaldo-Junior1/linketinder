"use strict";
document.addEventListener('DOMContentLoaded', () => {
    const listaCandidatos = document.getElementById('listaCandidatos');
    // Obtém os candidatos do armazenamento local
    const candidatosString = localStorage.getItem('candidatos');
    const candidatos = candidatosString ? JSON.parse(candidatosString) : [];
    console.log(candidatosString);
    console.log(candidatos);
    candidatos.forEach((candidato) => {
        const listaCandidatos = document.getElementById('listaCandidatos');
        const listItem = document.createElement('li');
        listItem.textContent = candidato.nome;
        listaCandidatos === null || listaCandidatos === void 0 ? void 0 : listaCandidatos.appendChild(listItem);
    });
});
