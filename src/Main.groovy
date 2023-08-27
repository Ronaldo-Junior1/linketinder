import com.classes.Candidato
import com.classes.Empresa

static void main(String[] args) {

  def candidatos = [
          new Candidato("Ronaldo","email","São paulo","1838920","Dev Java",["Aaaa","aaaaa"],"11111",17),
          new Candidato("Vitor","email","São paulo","1838920","Dev Java",["Aaaa","aaaaa"],"11111",17)
  ]
  def empresas = [
          new Empresa("Arroz top","email","São paulo","1838920","Empresa mt top",["Aaaa", "aaaaa"],"11111","Brasil"),
          new Empresa("Feijão top","email","São paulo","1838920","Empresa mt top",["Aaaa","aaaaa"],"11111","Argentina")
  ]

 Candidato.listarCandidatos(candidatos)
 Empresa.listarEmpresa(empresas)
}

