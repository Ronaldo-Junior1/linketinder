"use strict";
document.addEventListener("DOMContentLoaded", function () {
    const form = document.getElementById("loginForm");
    const cadastroLink = document.getElementById("cadastroLink");
    form.addEventListener("submit", function (event) {
        var _a;
        event.preventDefault();
        const tipoUsuario = (_a = document.querySelector('input[name="tipo_usuario"]:checked')) === null || _a === void 0 ? void 0 : _a.value;
        if (tipoUsuario === "empresa") {
            window.location.href = "../Candidato/Listagem/Listagem-Candidatos.html";
        }
        else if (tipoUsuario === "candidato") {
            window.location.href = "../Empresa/Listagem/Listagem-Empresas.html";
        }
    });
    cadastroLink.addEventListener("click", function (event) {
        var _a;
        event.preventDefault();
        const tipoUsuario = (_a = document.querySelector('input[name="tipo_usuario"]:checked')) === null || _a === void 0 ? void 0 : _a.value;
        if (tipoUsuario === "empresa") {
            window.location.href = "../Empresa/Cadastro/Cadastro-Empresa.html";
        }
        else if (tipoUsuario === "candidato") {
            window.location.href = "../Candidato/Cadastro/Cadastro-Candidato.html";
        }
    });
});
