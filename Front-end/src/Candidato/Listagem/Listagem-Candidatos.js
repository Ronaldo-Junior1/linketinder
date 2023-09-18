"use strict";
document.addEventListener('DOMContentLoaded', () => {
    const listaCandidatos = document.getElementById('listaCandidatos');
    // Obtém os candidatos do armazenamento local
    const candidatosString = localStorage.getItem('candidatos');
    const candidatosAvailable = candidatosString ? JSON.parse(candidatosString) : [];
    console.log(candidatosString);
    console.log(candidatosAvailable);
    candidatosAvailable.forEach((candidato) => {
        const listaCandidatos = document.getElementById('listaCandidatos');
        const listItem = document.createElement('li');
        const textoCandidato = `${candidato.nome}, Conhecimentos em: [${candidato.competencias.join(',')}] - Formado em: ${candidato.formacao}`;
        listItem.textContent = textoCandidato;
        listaCandidatos === null || listaCandidatos === void 0 ? void 0 : listaCandidatos.appendChild(listItem);
    });
    const canvas = document.getElementById('graficoHabilidades');
    if (canvas) {
        const ctx = canvas.getContext('2d');
        if (ctx) {
            const competenciasCount = {};
            candidatosAvailable.forEach((candidato) => {
                candidato.competencias.forEach((competencia) => {
                    if (competenciasCount[competencia]) {
                        competenciasCount[competencia]++;
                    }
                    else {
                        competenciasCount[competencia] = 1;
                    }
                });
            });
            const labels = Object.keys(competenciasCount);
            const data = Object.values(competenciasCount);
            const myChart = new Chart(ctx, {
                type: 'bar',
                data: {
                    labels: labels,
                    datasets: [{
                            label: 'Quantidade de Candidatos por Habilidade',
                            data: data,
                            backgroundColor: 'rgba(75, 192, 192, 0.2)',
                            borderColor: 'rgba(75, 192, 192, 1)',
                            borderWidth: 3,
                            barThickness: 300
                        }],
                },
                options: {
                    responsive: true
                }
            });
        }
    }
});
