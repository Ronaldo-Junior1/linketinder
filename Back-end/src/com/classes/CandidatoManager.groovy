package com.classes

class CandidatoManager {
    ArrayList<Candidato> candidatos = [
            new Candidato("Ronaldo","ronaldo@gmail.com","São paulo","18407-720","Dev Java",["Java","Angular"],"145.938.720-20",17),
            new Candidato("Vitor","vitor@gmail.com","Rio de Janeiro","21401-450","Dev Python",["Python"],"290.122.904-50",22),
            new Candidato("Maria", "maria@gmail.com", "São Paulo", "01234-567", "Dev Java", ["Java"], "123.456.789-01", 30),
            new Candidato("João", "joao@gmail.com", "Porto Alegre", "89012-345", "Dev C#", ["C#"], "987.654.321-00", 28),
            new Candidato("Carla", "carla@gmail.com", "Curitiba", "56789-012", "Dev Ruby",["Ruby"], "456.789.012-34", 25),
            new Candidato("Pedro", "pedro@gmail.com", "Belo Horizonte", "45678-901", "Dev JavaScript", ["JavaScript"], "765.432.109-87", 27)
    ]

    void cadastrarCandidatos(Candidato candidato) {
        candidatos.add(candidato)
    }

    void listarCandidatos() {
        candidatos.each { candidato ->
            println(candidato)
        }
    }

}
