import java.util.ArrayList;

class GerenciadorDeTarefas {
    private ArrayList<Tarefa> listaDeTarefas;

    // Construtor
    public GerenciadorDeTarefas() {
        listaDeTarefas = new ArrayList<>();
    }

    // Método para adicionar uma nova tarefa
    public void adicionarTarefa(String titulo, String descricao) {
        Tarefa novaTarefa = new Tarefa(titulo, descricao);
        listaDeTarefas.add(novaTarefa);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    // Método para listar todas as tarefas
    public void listarTarefas() {
        if (listaDeTarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa encontrada.");
        } else {
            for (int i = 0; i < listaDeTarefas.size(); i++) {
                System.out.println((i + 1) + ". " + listaDeTarefas.get(i));
            }
        }
    }

    // Método para marcar uma tarefa como concluída
    public void concluirTarefa(int indice) {
        if (indice < 1 || indice > listaDeTarefas.size()) {
            System.out.println("Índice inválido.");
        } else {
            listaDeTarefas.get(indice - 1).concluir();
            System.out.println("Tarefa concluída!");
        }
    }
}
