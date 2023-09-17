package com.test

import com.classes.Empresa
import com.classes.EmpresaManager
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.*


class EmpresaTest {
    EmpresaManager empresaManager = new EmpresaManager()
    Empresa empresaTeste = new Empresa("Ronaldo Company", "ronaldo@email", "São Paulo", "18408-715", "Teste", ["Java", "Angular"], "1234", "Brasil")

    @Test
     void testCadastrarEmpresa(){
        empresaManager.cadastrarEmpresa(empresaTeste)
        String resultado = "Empresa{nome='Ronaldo Company', email='ronaldo@email', estado='São Paulo', cep='18408-715', descrição='Teste', competencias='[Java, Angular]', cnpj='1234', pais='Brasil'}"

        int index = empresaManager.empresas.size()-1
        assertEquals(resultado,empresaManager.empresas.get(index).toString())
    }

    @Test
    void testGetNomeEmpresa(){
        assertEquals("Ronaldo Company", empresaTeste.getNome())
    }

    @Test
    void testGetEmailEmpresa(){
        assertEquals("ronaldo@email", empresaTeste.getEmail())
    }

    @Test
    void testGetEstadoEmpresa(){
        assertEquals("São Paulo", empresaTeste.getEstado())
    }

    @Test
    void testGetCepEmpresa(){
        assertEquals("18408-715", empresaTeste.getCep())
    }

    @Test
    void testGetDescricaoEmpresa(){
        assertEquals("Teste", empresaTeste.getDescricao())
    }

    @Test
    void testGetCompetenciasEmpresa(){
        assertEquals("[Java, Angular]", empresaTeste.getCompetencias().toString())
    }

    @Test
    void testGetCnpjEmpresa(){
        assertEquals("1234", empresaTeste.getCnpj())
    }

    @Test
    void testGetPaisEmpresa(){
        assertEquals("Brasil", empresaTeste.getPais())
    }
}

