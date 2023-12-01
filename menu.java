import java.util.Scanner;

public class Menu {

    static Scanner scanner = new Scanner(System.in);

    static void exibirMenu() {
        System.out.println("\n----- Menu -----");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Editar produto");
        System.out.println("3 - Deletar produto");
        System.out.println("4 - Visualizar lista de produtos");
        System.out.println("0 - Sair do sistema");
    }

    static void cadastrarProduto() {
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a quantidade do produto: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o valor do produto: ");
        double valor = scanner.nextDouble();

        String dataCadastro = "";

        Produto novoProduto = new Produto(nome, quantidade, valor, dataCadastro);
        SistemaCRUD.listaProdutos.add(novoProduto);

        System.out.println("Produto cadastrado com sucesso!");
    }

    static void editarProduto() {
        System.out.print("Digite o ID do produto que deseja editar: ");
        int id = scanner.nextInt();

        if (id >= 1 && id <= SistemaCRUD.listaProdutos.size()) {
            Produto produto = SistemaCRUD.listaProdutos.get(id - 1);

            System.out.print("Digite o novo nome do produto: ");
            String novoNome = scanner.next();
            produto.setNome(novoNome);

            System.out.print("Digite a nova quantidade do produto: ");
            int novaQuantidade = scanner.nextInt();
            produto.setQuantidade(novaQuantidade);

            System.out.print("Digite o novo valor do produto: ");
            double novoValor = scanner.nextDouble();
            produto.setValor(novoValor);

            System.out.println("Produto editado com sucesso!");
        } else {
            System.out.println("ID de produto inválido!");
        }
    }

    static void deletarProduto() {
        System.out.print("Digite o ID do produto que deseja deletar: ");
        int id = scanner.nextInt();

        if (id >= 1 && id <= SistemaCRUD.listaProdutos.size()) {
            SistemaCRUD.listaProdutos.remove(id - 1);
            System.out.println("Produto deletado com sucesso!");
        } else {
            System.out.println("ID de produto inválido!");
        }
    }

    static void visualizarProdutos() {
        System.out.println("\n----- Lista de Produtos -----");
        for (int i = 0; i < SistemaCRUD.listaProdutos.size(); i++) {
            Produto produto = SistemaCRUD.listaProdutos.get(i);
            System.out.println("ID: " + (i + 1) + ", Nome: " + produto.getNome() +
                    ", Quantidade: " + produto.getQuantidade() +
                    ", Valor: " + produto.getValor() +
                    ", Data de Cadastro: " + produto.getDataCadastro());
        }
    }
}
