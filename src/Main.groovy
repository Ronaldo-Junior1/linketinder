import com.classes.Candidato

static void main(String[] args) {

  def candidatos = [
          new Candidato("Ronaldo","email","São paulo","1838920","Dev Java",["Aaaa","aaaaa"],"11111",17),
          new Candidato("Vitor","email","São paulo","1838920","Dev Java",["Aaaa","aaaaa"],"11111",17)
  ]

Candidato.listarCandidatos(candidatos)
}

