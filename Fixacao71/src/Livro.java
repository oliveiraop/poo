public class Livro extends Publicacao {
    private String isbn;

    public Livro(String titulo, String autores, String veiculo, String dataPublicacao, int anoPublicacao, int copias, String isbn) {
        super(titulo, autores, veiculo, dataPublicacao, anoPublicacao, copias);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public int tempoLocacao() {
        if (this.getCopias() > 2) {
            return super.tempoLocacao();
        } else if (this.getCopias() > 1) {
            return Publicacao.tempoMaximoLocacao / 2;
        } else {
            return 0;
        }
    }
}
