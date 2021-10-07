public class Quarto {

    private float diaria;
    private String nome;
    private int numero;
    private int capacidade;
    private int lotacaoAtual;
    private Hospede[] hospedes;

    public Quarto(float diaria, String nome, int numero, int capacidade, int lotacaoAtual) {
        this.diaria = diaria;
        this.nome = nome;
        this.numero = numero;
        this.capacidade = capacidade;
        this.lotacaoAtual = lotacaoAtual;
        this.hospedes = new Hospede[capacidade];
    }

    public Quarto(float diaria, String nome, int numero, int capacidade) {
        this(diaria, nome, numero, capacidade, 0);
    }

    public float getDiaria() {return diaria;}

    public void setDiaria(float diaria) {this.diaria = diaria;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public int getNumero() {return numero;}

    public void setNumero(int numero) {this.numero = numero;}

    public int getCapacidade() {return capacidade;}

    public void setCapacidade(int capacidade) {this.capacidade = capacidade;}

    public int getLotacaoAtual() {return lotacaoAtual;}

    public void setLotacaoAtual(int lotacaoAtual) {this.lotacaoAtual = lotacaoAtual;}

    public Hospede[] getHospedes() {return hospedes;}

    public void setHospedes(Hospede[] hospedes) {this.hospedes = hospedes;}

    public String hospedesToString() {
        String retorno = "Quarto: " + this.nome + " " + this.numero + "\n";

        if (this.hospedes != null) { //Teste se existem hospedes
            int maiorDiaria = 0;
            float valorTotal = 0;
            for (Hospede i : this.hospedes) {
                if (i != null) { // Evitar dar erro
                    retorno = retorno + i.getNome() + " Cpf: " + i.getCpf() + "\n";
                    if (maiorDiaria < i.getDiarias()) {
                        maiorDiaria = i.getDiarias();
                        valorTotal = maiorDiaria * this.diaria;
                    }
                }
            }
            retorno = retorno + "Valor total das diarias: " + valorTotal + "\n";
        } else {
            retorno = retorno + "Nao ha hospedes \n";
        }
        return retorno;
    }

    public boolean alojaHospede(Hospede hospede) {
        if (this.capacidade-this.lotacaoAtual >= 1) {
            this.hospedes[lotacaoAtual] = hospede;
            lotacaoAtual++;
            return true;
        } else {
            return false;
        }
    }

    public boolean alojaHospede(Hospede hospede, Hospede hospede2) {
        if (this.capacidade-this.lotacaoAtual >= 2) {
            this.hospedes[lotacaoAtual] = hospede;
            this.hospedes[lotacaoAtual+1] = hospede2;
            lotacaoAtual+=2;
            return true;
        } else {
            return false;
        }
    }
}
