public class Hospede {
    private String nome;
    private String cpf;
    private int diarias;
    private float conta;

    public Hospede(String nome, String cpf, int diarias, float conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.diarias = diarias;
        this.conta = conta;
    }

    public Hospede(String nome, String cpf, int diarias) {
        this(nome, cpf, diarias, 0);
    }

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getCpf() {return cpf;}

    public void setCpf(String cpf) {this.cpf = cpf;}

    public int getDiarias() {return diarias;}

    public void setDiarias(int diarias) {this.diarias = diarias;}

    public float getConta() {return conta;}

    public void setConta(float conta) {this.conta = conta;}

}
