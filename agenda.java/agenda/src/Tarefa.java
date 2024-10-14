
class Tarefa {
    private String titulo;
    private String descricao;
    private boolean concluida;

    // Construtor
    public Tarefa(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = false; // tarefa começa como não concluída
    }

    // Métodos getter e setter
    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void concluir() {
        this.concluida = true;
    }

    @Override
    public String toString() {
        return "Tarefa: " + titulo + " | Descrição: " + descricao + " | Concluída: " + (concluida ? "Sim" : "Não");
    }
}
