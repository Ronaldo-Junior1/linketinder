package com.test

import com.classes.Empresa
import com.classes.EmpresaManager
import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.*


class EmpresaTest {

    @Test
     void testCadastrarEmpresa(){
        EmpresaManager empresaManager = new EmpresaManager()
        Empresa empresaTeste = new Empresa("Teste", "Teste", "Teste", "Teste", "Teste", ["Teste1", "Teste2"], "Teste", "Teste")
        empresaManager.cadastrarEmpresa(empresaTeste)
        String resultado = "Empresa{nome='Teste', email='Teste', estado='Teste', cep='Teste', descrição='Teste', competencias='[Teste1, Teste2]', cnpj='Teste', pais='Teste'}"

        int index = empresaManager.empresas.size()-1
        assertEquals(resultado,empresaManager.empresas.get(index).toString())
    }
}

