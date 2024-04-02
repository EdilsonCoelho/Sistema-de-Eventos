import java.util.Scanner;
import java.util.ArrayList;

public class CadastroUsuario {
    private String nome;
    private String email;
    private int idade;
    private String telefone;
    private String cidade;
    private static ArrayList<CadastroUsuario> usuariosCadastrados = new ArrayList<>();

    public CadastroUsuario() {
        this.nome = "";
        this.email = "";
        this.idade = 0;
        this.telefone = "";
        this.cidade = "";
    }

    public void solicitarInformacoes() {
        @SuppressWarnings("resource")

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, forneça as seguintes informações para cadastrar um usuário:");
        System.out.print("Nome: ");
        this.nome = scanner.nextLine();
        System.out.print("Email: ");
        this.email = scanner.nextLine();
        System.out.print("Idade: ");
        this.idade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.print("Telefone: ");
        this.telefone = scanner.nextLine();
        System.out.print("Cidade: ");
        this.cidade = scanner.nextLine();
    }
      // Método para exibir todos os usuários cadastrados
     public static void exibirUsuariosCadastrados() {
        System.out.println("\nUsuários cadastrados:");    
            for (CadastroUsuario usuario : usuariosCadastrados) {
                usuario.exibirInformacoes();
            }
        }     

    public void exibirInformacoes() {
        System.out.println("\nUsuário cadastrado com sucesso, seja bem-vindo à plataforma!");
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("Idade: " + this.idade);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Cidade: " + this.cidade);
    }
}