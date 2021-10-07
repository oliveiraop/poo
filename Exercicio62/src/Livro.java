public class Livro {


    //parametros
    private String titulo;
    private int isbn;
    private String materia;
    private int edicao;
    private int ano;
    private int anoPublicacao;


    //construtor
    public Livro(String titulo, int isbn, String materia, int edicao, int ano, int anoPublicacao) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.materia = materia;
        this.edicao = edicao;
        this.ano = ano;
        this.anoPublicacao = anoPublicacao;
    }
    public Livro(String titulo, int isbn, String materia, int edicao, int ano) {
        this(titulo, isbn, materia, edicao, ano, 2019);
    }

    public String getTitulo() {return titulo;}

    public void setTitulo(String titulo) {this.titulo = titulo;}

    public int getIsbn() {return isbn;}

    public void setIsbn(int isbn) {this.isbn = isbn;}

    public String getMateria() {return materia;}

    public void setMateria(String materia) {this.materia = materia;}

    public int getEdicao() {return edicao;}

    public void setEdicao(int edicao) {this.edicao = edicao;}

    public int getAno() {return ano;}

    public void setAno(int ano) {this.ano = ano;}

    public int getAnoPublicacao() {return anoPublicacao;}

    public void setAnoPublicacao(int anoPublicacao) {this.anoPublicacao = anoPublicacao;}

    public void consultaLivro(int isbn) {
        if (isbn == this.isbn) {
            System.out.println("Livro{" +
                    "titulo='" + this.titulo + '\'' +
                    ", isbn=" + this.isbn +
                    ", materia=" + this.materia +
                    ", edicao=" + this.edicao +
                    ", ano=" + this.ano +
                    ", anoPublicacao=" + this.anoPublicacao +
                    '}');
        }
    }
    public void consultaLivro(String titulo) {
        if (titulo.equals(this.titulo)) {
            System.out.println("Livro{" +
                    "titulo='" + this.titulo + '\'' +
                    ", isbn=" + this.isbn +
                    ", materia=" + this.materia +
                    ", edicao=" + this.edicao +
                    ", ano=" + this.ano +
                    ", anoPublicacao=" + this.anoPublicacao +
                    '}');
        }
    }


}
