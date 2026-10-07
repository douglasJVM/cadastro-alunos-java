import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AlunoService alunoService = new AlunoService();

        int op;

        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Buscar");
            System.out.println("4 - Remover");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Digite o nome do aluno: ");
                    String nome = sc.nextLine();

                    System.out.print("Digite a matrícula: ");
                    int matricula = sc.nextInt();

                    System.out.print("Digite a nota 1: ");
                    double nota1 = sc.nextDouble();

                    System.out.print("Digite a nota 2: ");
                    double nota2 = sc.nextDouble();

                    Aluno novoAluno = new Aluno(nome, matricula, nota1, nota2);
                    alunoService.cadastrar(novoAluno);
                    break;
                case 2:
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    break;
                case 0:
                    System.out.println("Saindo do sistema");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (op != 0);

        sc.close();
    }
}