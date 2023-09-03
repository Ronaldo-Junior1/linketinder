import com.classes.Candidato
import com.classes.Empresa
import com.classes.EmpresaManager

static void main(String[] args) {
    Scanner scanner = new Scanner(System.in)
    EmpresaManager empresaManager = new EmpresaManager()

    ArrayList<Candidato> candidatos = [
            new Candidato("Ronaldo","ronaldo@gmail.com","São paulo","18407-720","Dev Java",["Java","Angular"],"145.938.720-20",17),
            new Candidato("Vitor","vitor@gmail.com","Rio de Janeiro","21401-450","Dev Python",["Python"],"290.122.904-50",22),
            new Candidato("Maria", "maria@gmail.com", "São Paulo", "01234-567", "Dev Java", ["Java"], "123.456.789-01", 30),
            new Candidato("João", "joao@gmail.com", "Porto Alegre", "89012-345", "Dev C#", ["C#"], "987.654.321-00", 28),
            new Candidato("Carla", "carla@gmail.com", "Curitiba", "56789-012", "Dev Ruby",["Ruby"], "456.789.012-34", 25),
            new Candidato("Pedro", "pedro@gmail.com", "Belo Horizonte", "45678-901", "Dev JavaScript", ["JavaScript"], "765.432.109-87", 27)
    ]


    int escolha
    while (true) {
        println("1. Listar Candidatos")
        println("2. Listar Empresas")
        println("3. Cadastrar Empresas")
        println("4. Sair")
        escolha = scanner.nextInt()

        switch (escolha) {
            case 1:
                Candidato.listarCandidatos(candidatos)
                break
            case 2:
                empresaManager.listarEmpresas()
                break
            case 3:
                    scanner.nextLine()
                    println("Digite o nome da empresa (ou 'sair' para encerrar): ")
                    String nome = scanner.nextLine()

                    if (nome.equalsIgnoreCase("sair")) {
                        break
                    }

                    println("Digite o email da empresa: ")
                    String email = scanner.nextLine()

                    println("Digite a cidade da empresa: ")
                    String cidade = scanner.nextLine()

                    println("Digite o CEP da empresa: ")
                    String cep = scanner.nextLine()

                    println("Digite a descrição da empresa: ")
                    String descricao = scanner.nextLine()

                    println("Digite as tecnologias da empresa (separadas por vírgula): ")
                    String tecnologiasInput = scanner.nextLine()
                    List<String> tecnologias = tecnologiasInput.split(",")

                    println("Digite o CNPJ da empresa: ")
                    String cnpj = scanner.nextLine()

                    println("Digite o país da empresa: ")
                    String pais = scanner.nextLine()

                    Empresa novaEmpresa = new Empresa(nome, email, cidade, cep, descricao, tecnologias as ArrayList<String>, cnpj, pais)
                    empresaManager.cadastrarEmpresa(novaEmpresa)
                break
            case 4:
                println("Até logo")
                return
            default:
                println("Opção inválida. Escolha novamente.")
        }
    }
}

