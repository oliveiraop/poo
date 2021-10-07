import java.util.Calendar;
import java.util.spi.CalendarDataProvider;

public class Jogador {
    private String nome;
    private String posicao;
    private int anoDeNascimento;
    private String nacionalidade;
    private float altura;
    private float peso;

    public static void main(String[] args) {

        Jogador Neymar = new Jogador("Neymar", "Atacante", 1993, "Brasileiro", 172, 70);

        System.out.println(Neymar.toString());
        System.out.println(Neymar.Idade());
        System.out.println(Neymar.Aposenta());
    }

    public Jogador(String nome, String posicao, int anoDeNascimento, String nacionalidade, float altura, float peso) {
        this.nome = nome;
        this.posicao = posicao;
        this.anoDeNascimento = anoDeNascimento;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", posicao='" + posicao + '\'' +
                ", anoDeNascimento=" + anoDeNascimento +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }


    public int Idade() {
        Calendar ano = Calendar.getInstance();
        int anoAtual = ano.get(Calendar.YEAR);
        return  anoAtual-this.anoDeNascimento;
    }

    public int Aposenta() {
        int aposentadoria = 0;
        int result;
        if (this.posicao == "Defesa") {
            aposentadoria = 40;
        } else if (this.posicao == "Meia") {
            aposentadoria = 38;
        } else if (this.posicao == "Atacante") {
            aposentadoria = 35;
        }
        result = aposentadoria - this.Idade();

        if (result < 0) {
            return 0;
        } else {
            return result;
        }
    }



}


