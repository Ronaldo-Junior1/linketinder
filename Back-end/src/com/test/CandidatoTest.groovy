package com.test

import com.classes.Candidato
import com.classes.CandidatoManager

import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.*;


class CandidatoTest {
    CandidatoManager candidatoManager = new CandidatoManager()
    Candidato candidatoTeste = new Candidato("Ronaldo", "ronaldo@email", "São Paulo", "18408-715", "Teste", ["Java", "Angular"], "12345", 18)
    @Test
    void testCadastrarCandidato(){

        candidatoManager.cadastrarCandidatos(candidatoTeste)
        String resultado = "Candidato{nome='Ronaldo', email='ronaldo@email', estado='São Paulo', cep='18408-715', descrição='Teste', competencias='[Java, Angular]', cpf='12345', idade='18'}"

        int index = candidatoManager.candidatos.size()-1
        assertEquals(resultado,candidatoManager.candidatos.get(index).toString())
    }

    @Test
    void testGetNomeCandidato(){
        assertEquals("Ronaldo", candidatoTeste.getNome())
    }

    @Test
    void testGetEmailCandidato(){
        assertEquals("ronaldo@email", candidatoTeste.getEmail())
    }

    @Test
    void testGetEstadoCandidato(){
        assertEquals("São Paulo", candidatoTeste.getEstado())
    }

    @Test
    void testGetCepCandidato(){
        assertEquals("18408-715", candidatoTeste.getCep())
    }

    @Test
    void testGetDescricaoCandidato(){
        assertEquals("Teste", candidatoTeste.getDescricao())
    }

    @Test
    void testGetCompetenciasCandidato(){
        assertEquals("[Java, Angular]", candidatoTeste.getCompetencias().toString())
    }

    @Test
    void testGetCpfCandidato(){
        assertEquals("12345", candidatoTeste.getCpf())
    }

    @Test
    void testGetIdadeCandidato(){
        assertEquals(18, candidatoTeste.getIdade())
    }

}
