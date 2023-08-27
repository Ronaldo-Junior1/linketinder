import com.classes.Candidato
import com.classes.Empresa

static void main(String[] args) {
    Scanner scan = new Scanner(System.in)

  def candidatos = [
          new Candidato("Ronaldo","ronaldo@gmail.com","São paulo","18407-720","Dev Java",["Java","Angular"],"145.938.720-20",17),
          new Candidato("Vitor","vitor@gmail.com","Rio de Janeiro","21401-450","Dev Python",["Python"],"290.122.904-50",22),
          new Candidato("Maria", "maria@gmail.com", "São Paulo", "01234-567", "Dev Java", ["Java"], "123.456.789-01", 30),
          new Candidato("João", "joao@gmail.com", "Porto Alegre", "89012-345", "Dev C#", ["C#"], "987.654.321-00", 28),
          new Candidato("Carla", "carla@gmail.com", "Curitiba", "56789-012", "Dev Ruby",["Ruby"], "456.789.012-34", 25),
          new Candidato("Pedro", "pedro@gmail.com", "Belo Horizonte", "45678-901", "Dev JavaScript", ["JavaScript"], "765.432.109-87", 27)
  ]
  def empresas = [
          new Empresa("Arroz top","ArrozEmpresarial@gmail.com","São paulo","18508-715","Empresa de Arroz",["Angular", "TypeScript"],"12.345.678/0001-90","Brasil"),
          new Empresa("Feijão top","FeijãoEmpresa@gmail.com","São paulo","18390-156","Empresa de Feijão",["Java","Spring"],"14.124.567/0001-45","Brasil"),
          new Empresa("ByteCoders", "info@bytecoders.net", "Rio de Janeiro", "20000-000", "Soluções Tecnológicas", ["Python", "Angular"], "98.765.432/0001-23", "Brasil"),
          new Empresa("WebSolutions", "contato@websolutions.com", "Minas Gerais", "30000-000", "Desenvolvimento Web", ["Java", "Angular"], "11.223.344/0001-99", "Brasil"),
          new Empresa("TechInnovation", "info@techinnovation.com", "Bahia", "40000-000", "Inovação Tecnológica", ["Java", "Spring Framework"], "55.667.778/0001-12", "Brasil"),
  ]

    int escolha
    while (true) {
        println("1. Listar Candidatos")
        println("2. Listar Empresas")
        println("3. Sair")
        escolha = scan.nextInt()

        switch (escolha) {
            case 1:
                Candidato.listarCandidatos(candidatos)
                break
            case 2:
                Empresa.listarEmpresas(empresas)
                break
            case 3:
                println("Até logo!")
                return
            default:
                println("Opção inválida. Escolha novamente.")
        }
    }
}

