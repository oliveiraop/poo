import java.util.ArrayList;

public class Anuncio {
    private String titulo;
    private boolean ativo;
    private Assinante assinante;
    private ArrayList<Livro> livros;

    public Anuncio(String titulo, boolean ativo, Assinante assinante, ArrayList<Livro> livros) {
        this.titulo = titulo;
        this.ativo = ativo;
        this.assinante = assinante;
        this.livros = livros;
    }

    public Anuncio(String titulo, boolean ativo, Assinante assinante) {
        this(titulo, ativo, assinante, new ArrayList<Livro>());
    }

    public String getTitulo() {return titulo;}

    public void setTitulo(String titulo) {this.titulo = titulo;}

    public void setTitulo(String titulo, boolean ativo) {
        this.titulo = titulo;
        this.ativo = ativo;
    }


    public boolean isAtivo() {return ativo;}

    public void setAtivo(boolean ativo) {this.ativo = ativo;}

    public Assinante getAssinante() {return assinante;}

    public void setAssinante(Assinante assinante) {this.assinante = assinante;}

    public void setAssinante(Assinante assinante, boolean ativo) {
        this.assinante = assinante;
        this.ativo = ativo;
    }

    public ArrayList<Livro> getLivros() {return livros;}

    public void setLivros(ArrayList<Livro> livros) {this.livros = livros;}

    public void setLivros(ArrayList<Livro> livros, boolean ativo) {
        this.livros = livros;
        this.ativo = ativo;
    }

    public String toString() {
        String retorno = "Titulo: " + this.titulo + "\n";
        retorno = retorno + "Livros: \n";
        for (Livro i : this.livros) {
            if (i != null) {
                retorno = retorno + i.getTitulo() + ", " +
                        i.getMateria() + ", " +
                        i.getAno() + ", " +
                        i.getEdicao() + "\n";
            }
        }
        retorno = retorno + "Anunciante: " +this.assinante.getNome() + "\n";
        return retorno;
    }



}
