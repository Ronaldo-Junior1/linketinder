package com.classes

class EmpresaManager {
    ArrayList<Empresa> empresas = [
            new Empresa("Arroz top","ArrozEmpresarial@gmail.com","São paulo","18508-715","Empresa de Arroz",["Angular", "TypeScript"],"12.345.678/0001-90","Brasil"),
            new Empresa("Feijão top","FeijãoEmpresa@gmail.com","São paulo","18390-156","Empresa de Feijão",["Java","Spring"],"14.124.567/0001-45","Brasil"),
            new Empresa("ByteCoders", "info@bytecoders.net", "Rio de Janeiro", "20000-000", "Soluções Tecnológicas", ["Python", "Angular"], "98.765.432/0001-23", "Brasil"),
            new Empresa("WebSolutions", "contato@websolutions.com", "Minas Gerais", "30000-000", "Desenvolvimento Web", ["Java", "Angular"], "11.223.344/0001-99", "Brasil"),
            new Empresa("TechInnovation", "info@techinnovation.com", "Bahia", "40000-000", "Inovação Tecnológica", ["Java", "Spring Framework"], "55.667.778/0001-12", "Brasil"),
    ]

     void cadastrarEmpresa(Empresa empresa) {
             empresas.add(empresa)
    }

    void listarEmpresas() {
        empresas.each { empresa ->
            println(empresa)
        }
    }
}
