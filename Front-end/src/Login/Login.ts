document.addEventListener("DOMContentLoaded", function() {
    const form = document.getElementById("loginForm") as HTMLFormElement;
    const cadastroLink = document.getElementById("cadastroLink") as HTMLAnchorElement;

    form.addEventListener("submit", function(event) {
        event.preventDefault();
        const tipoUsuario = (document.querySelector('input[name="tipo_usuario"]:checked') as HTMLInputElement)?.value;

        if (tipoUsuario === "empresa") {
            window.location.href = "../Candidato/Listagem/Listagem-Candidatos.html";
        } else if (tipoUsuario === "candidato") {
            window.location.href = "../Empresa/Listagem/Listagem-Empresas.html";
        }
    });

    cadastroLink.addEventListener("click", function(event) {
        event.preventDefault();
        const tipoUsuario = (document.querySelector('input[name="tipo_usuario"]:checked') as HTMLInputElement)?.value;

        if (tipoUsuario === "empresa") {
            window.location.href = "../Empresa/Cadastro/Cadastro-Empresa.html";
        } else if (tipoUsuario === "candidato") {
            window.location.href = "../Candidato/Cadastro/Cadastro-Candidato.html";
        }
    });
});
