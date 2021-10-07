public class Anuncio {
    private String titulo;
    private float preco;
    private boolean ativo;
    private Assinante assinante;
    private Livro[] livros;

    public Anuncio(String titulo, float preco, boolean ativo, Assinante assinante, Livro[] livros) {
        this.titulo = titulo;
        this.preco = preco;
        this.ativo = ativo;
        this.assinante = assinante;
        this.livros = livros;
    }

    public Anuncio(String titulo, boolean ativo, Assinante assinante, Livro[] livros) {
        this(titulo, 0, ativo, assinante, livros);
    }

    public String getTitulo() {return titulo;}

    public void setTitulo(String titulo) {this.titulo = titulo;}

    public void setTitulo(String titulo, boolean ativo) {
        this.titulo = titulo;
        this.ativo = ativo;
    }

    public float getPreco() {return preco;}

    public void setPreco(float preco) {this.preco = preco;}

    public void setPreco(float preco, boolean ativo) {
        this.preco = preco;
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

    public Livro[] getLivros() {return livros;}

    public void setLivros(Livro[] livros) {this.livros = livros;}

    public void setLivros(Livro[] livros, boolean ativo) {
        this.livros = livros;
        this.ativo = ativo;
    }

    public String dados() {
        String retorno = "Titulo: " + this.titulo + "\n";
        if (this.isTrade()) {
            retorno = retorno + "Troca \n";
        } else {
            retorno = retorno + "Preço: " + this.preco + "\n";
        }
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

    public boolean isTrade() {
        if (this.preco == 0) {
            return true;
        } else {
            return false;
        }
    }


}
