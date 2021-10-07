import java.util.ArrayList;

public class AnuncioVenda extends Anuncio {
    private float preco;

    public AnuncioVenda(String titulo, boolean ativo, Assinante assinante, ArrayList<Livro> livros, float preco) {
        super(titulo, ativo, assinante, livros);
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setPreco(float preco, boolean ativo) {
        this.setPreco(preco);
        this.setAtivo(ativo);
    }

    @Override
    public String toString() {
        String retorno = "Titulo: " + this.getTitulo() + "\n";
        retorno = retorno + "Livros: \n";
        for (Livro i : this.getLivros()) {
            if (i != null) {
                retorno = retorno + i.getTitulo() + ", " +
                        i.getMateria() + ", " +
                        i.getAno() + ", " +
                        i.getEdicao() + "\n";
            }
        }
        retorno = retorno + "Preço: R$" + this.getPreco() + "\n";
        retorno = retorno + "Anunciante: " +this.getAssinante().getNome() + "\n";
        return retorno;
    }
}
