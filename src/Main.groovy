import com.classes.Candidato

static void main(String[] args) {

  def candidatos = [
          new Candidato("Ronaldo","email","São paulo","1838920","Dev Java","11111",17,["Aaaa","aaaaa"]),
          new Candidato("Vitor","email","São paulo","1838920","Dev Java","11111",17,["Aaaa","aaaaa"])
  ]

Candidato.listarCandidatos(candidatos)
}

