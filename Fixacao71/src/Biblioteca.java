import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private String endereco;
    private ArrayList<Publicacao> publicacoes;

    public Biblioteca(String nome, String endereco, ArrayList<Publicacao> publicacoes) {
        this.nome = nome;
        this.endereco = endereco;
        this.publicacoes = publicacoes;
    }

    public Biblioteca(String nome, String endereco) {
        this(nome, endereco, new ArrayList<Publicacao>());
    }

    public void addPublicacao(Publicacao nova) {
        publicacoes.add(nova);
    }

    public static void main(String[] args) {
        
    }

}
