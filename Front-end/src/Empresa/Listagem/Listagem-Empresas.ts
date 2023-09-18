
document.addEventListener('DOMContentLoaded', () => {
    const listaEmpresas = document.getElementById('listaEmpresas');

    const empresasString = localStorage.getItem('empresas');
    const empresas = empresasString ? JSON.parse(empresasString) : [];
    console.log(empresasString)
    console.log(empresas)
    empresas.forEach((empresa: any) => { 
        const listaEmpresas = document.getElementById('listaEmpresas');
        const listItem = document.createElement('li');
        listItem.textContent = empresa.nome;
        listaEmpresas?.appendChild(listItem);
    });
});