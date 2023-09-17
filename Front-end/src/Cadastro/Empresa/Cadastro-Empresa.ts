class Empresa {
    nome: string;
    email: string;
    estado: string;
    cep: string;
    descricao: string;
    competencias: string[];
    cnpj: string;
    pais: string;

    constructor(
        nome: string,
        email: string,
        estado: string,
        cep: string,
        descricao: string,
        competencias: string[],
        cnpj: string,
        pais: string
    ) {
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

let empresas: Empresa[] = [];

document.getElementById('formEmpresa')?.addEventListener('submit', (event) => {
    event.preventDefault();

    const nome = (<HTMLInputElement>document.getElementById('nome')).value;
    const email = (<HTMLInputElement>document.getElementById('email')).value;
    const estado = (<HTMLInputElement>document.getElementById('estado')).value;
    const cep = (<HTMLInputElement>document.getElementById('cep')).value;
    const descricao = (<HTMLInputElement>document.getElementById('descricao')).value;
    const competencias = (<HTMLInputElement>document.getElementById('competencias')).value.split(',');
    const cnpj = (<HTMLInputElement>document.getElementById('cnpj')).value;
    const pais = ((<HTMLInputElement>document.getElementById('pais')).value);

    const novaEmpresa = new Empresa(nome, email, estado, cep, descricao, competencias, cnpj, pais);
    empresas.push(novaEmpresa);

    console.log('Empresa adicionada:', novaEmpresa);
    console.log('Lista de Empresas:', empresas);
    
    const listaEmpresas = document.getElementById('listaEmpresas');
    const listItem = document.createElement('li');
    listItem.textContent = novaEmpresa.nome;
    listaEmpresas?.appendChild(listItem);

    (<HTMLInputElement>document.getElementById('nome')).value = '';
    (<HTMLInputElement>document.getElementById('email')).value = '';
    (<HTMLInputElement>document.getElementById('estado')).value = '';
    (<HTMLInputElement>document.getElementById('cep')).value = '';
    (<HTMLInputElement>document.getElementById('descricao')).value = '';
    (<HTMLInputElement>document.getElementById('competencias')).value = '';
    (<HTMLInputElement>document.getElementById('cnpj')).value = '';
    (<HTMLInputElement>document.getElementById('pais')).value = '';
});