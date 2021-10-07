import java.util.ArrayList;

public class AnuncioTroca extends Anuncio{
    private ArrayList<Livro> desejados;

    public AnuncioTroca(String titulo, boolean ativo, Assinante assinante, ArrayList<Livro> livros, ArrayList<Livro> desejados) {
        super(titulo, ativo, assinante, livros);
        this.desejados = desejados;
    }

    public ArrayList<Livro> getDesejados() {
        return desejados;
    }

    public void setDesejados(ArrayList<Livro> desejados) {
        this.desejados = desejados;
    }

    public boolean addLivro(Livro livro) {
        return this.desejados.add(livro);
    }

    public boolean removeLivro(Livro livro) {
        return this.desejados.remove(livro);
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
        retorno = retorno + "Livros Desejados: \n";
        for (Livro i : this.desejados) {
            if (i != null) {
                retorno = retorno + i.getTitulo() + ", " +
                        i.getMateria() + ", " +
                        i.getAno() + ", " +
                        i.getEdicao() + "\n";
            }
        }
        retorno = retorno + "Anunciante: " +this.getAssinante().getNome() + "\n";
        return retorno;
    }
}
