import java.util.Scanner;

public class AgendaDeTarefas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();
        int opcao;

        do {
            System.out.println("\n--- Agenda de Tarefas ---");
            System.out.println("1. Adicionar nova tarefa");
            System.out.println("2. Listar todas as tarefas");
            System.out.println("3. Concluir uma tarefa");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título da tarefa: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    gerenciador.adicionarTarefa(titulo, descricao);
                    break;

                case 2:
                    gerenciador.listarTarefas();
                    break;

                case 3:
                    System.out.print("Digite o número da tarefa a ser concluída: ");
                    int indice = scanner.nextInt();
                    gerenciador.concluirTarefa(indice);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
