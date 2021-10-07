public class Tarefa {
    private String descricao;
    private float horasGastas;
    private String executor;
    private String status;


    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.horasGastas = 0;
        this.executor = "";
        this.status = "Iniciada";
    }

    public Tarefa(String descricao, String executor) {
        this.descricao = descricao;
        this.horasGastas = 0;
        this.executor = executor;
        this.status = "Iniciada";
    }

    public String getStatus() {
        return status;
    }
}
