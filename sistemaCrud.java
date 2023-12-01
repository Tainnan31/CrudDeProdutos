import java.util.ArrayList;
import java.util.Scanner;

public class SistemaCRUD {

    static ArrayList<Produto> listaProdutos = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            Menu.exibirMenu();
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    Menu.cadastrarProduto();
                    break;
                case 2:
                    Menu.editarProduto();
                    break;
                case 3:
                    Menu.deletarProduto();
                    break;
                case 4:
                    Menu.visualizarProdutos();
                    break;
                case 0:
                    System.out.println("Saindo do sistema. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);
    }
}
