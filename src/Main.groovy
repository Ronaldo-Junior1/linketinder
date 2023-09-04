import com.classes.Candidato
import com.classes.CandidatoManager
import com.classes.Empresa
import com.classes.EmpresaManager

static void main(String[] args) {
    Scanner scanner = new Scanner(System.in)
    EmpresaManager empresaManager = new EmpresaManager()
    CandidatoManager candidatoManager = new CandidatoManager()



    int escolha
    while (true) {
        println("1. Listar Candidatos")
        println("2. Listar Empresas")
        println("3. Cadastrar Candidatos")
        println("4. Cadastrar Empresas")
        println("5. Sair")
        escolha = scanner.nextInt()

        switch (escolha) {
            case 1:
                candidatoManager.listarCandidatos()
                break
            case 2:
                empresaManager.listarEmpresas()
                break
            case 3:
                scanner.nextLine()
                System.out.println("Digite o nome do candidato (ou 'sair' para encerrar): ");
                String nome = scanner.nextLine()

                if (nome.equalsIgnoreCase("sair")) {
                    break
                }

                System.out.println("Digite o email do candidato: ")
                String email = scanner.nextLine()

                System.out.println("Digite o estado do candidato: ")
                String estado = scanner.nextLine()

                System.out.println("Digite o CEP do candidato: ")
                String cep = scanner.nextLine()

                System.out.println("Digite a descrição do candidato: ")
                String descricao = scanner.nextLine()

                System.out.println("Digite as competências do candidato (separadas por vírgula): ")
                String competenciasInput = scanner.nextLine()
                List<String> competencias = competenciasInput.split(",")

                System.out.println("Digite o CPF do candidato: ")
                String cpf = scanner.nextLine()

                int idade
                while (true) {
                    System.out.println("Digite a idade do candidato")
                    String idadeInput = scanner.nextLine()
                    try {
                        idade = Integer.parseInt(idadeInput)
                        break
                    } catch (NumberFormatException e) {
                        System.out.println("Idade inválida. Por favor, digite um número inteiro.")
                    }
                }

                Candidato novoCandidato = new Candidato(nome, email, estado, cep, descricao, competencias as ArrayList<String>, cpf, idade)
                candidatoManager.cadastrarCandidatos(novoCandidato)
                break
            case 4:
                scanner.nextLine()
                println("Digite o nome da empresa (ou 'sair' para encerrar): ")
                String nome = scanner.nextLine()

                if (nome.equalsIgnoreCase("sair")) {
                    break
                }

                println("Digite o email da empresa: ")
                String email = scanner.nextLine()

                println("Digite o estado da empresa: ")
                String estado = scanner.nextLine()

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

                Empresa novaEmpresa = new Empresa(nome, email, estado, cep, descricao, tecnologias as ArrayList<String>, cnpj, pais)
                empresaManager.cadastrarEmpresa(novaEmpresa)
                break
            case 5:
                println("Até logo")
                return
            default:
                println("Opção inválida. Escolha novamente.")
        }
    }
}

