package com.test

import com.classes.Candidato
import com.classes.CandidatoManager

import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.*;


class CandidatoTest {
    @Test
    void testCadastrarCandidato(){
        CandidatoManager candidatoManager = new CandidatoManager()
        Candidato candidatoTeste = new Candidato("Teste", "Teste", "Teste", "Teste", "Teste", ["Teste1", "Teste2"], "Teste", 12)
        candidatoManager.cadastrarCandidatos(candidatoTeste)
        String resultado = "Candidato{nome='Teste', email='Teste', estado='Teste', cep='Teste', descrição='Teste', competencias='[Teste1, Teste2]', cpf='Teste', idade='12'}"

        int index = candidatoManager.candidatos.size()-1
        assertEquals(resultado,candidatoManager.candidatos.get(index).toString())
    }
}
