
document.addEventListener('DOMContentLoaded', () => {
    const listaEmpresas = document.getElementById('listaEmpresas');

    const empresasString = localStorage.getItem('empresas');
    const empresasAvailable = empresasString ? JSON.parse(empresasString) : [];
    console.log(empresasString)
    console.log(empresasAvailable)

    empresasAvailable.forEach((empresa: any) => { 

        const listaEmpresas = document.getElementById('listaEmpresas');
        const listItem = document.createElement('li');
         const textoEmpresa = `A empresa ${empresa.nome}, busca alguem com conhecimentos em: [${empresa.competencias.join(',')}]`;
        listItem.textContent = textoEmpresa;
        listaEmpresas?.appendChild(listItem);
    });
});