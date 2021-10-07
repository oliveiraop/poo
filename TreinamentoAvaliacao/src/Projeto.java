public class Projeto {
    private String nome;
    private String cliente;
    private float horaTrabalhada;
    private Tarefa[] tarefas;

    public Projeto(String nome, String cliente, float horaTrabalhada, Tarefa[] tarefas) {
        this.nome = nome;
        this.cliente = cliente;
        this.horaTrabalhada = horaTrabalhada;
        this.tarefas = tarefas;
    }
}
