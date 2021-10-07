public class Livro {

    enum Materias {
        MATEMATICA,
        CIENCIAS,
        PORTUGUES,
        INGLES,
        SOCIOLOGIA,
        FILOSOFIA,
        QUIMICA,
        FISICA
    }

    //parametros
    private String titulo;
    private int isbn;
    private Materias materia;
    private int edicao;
    private int ano;
    private int anoPublicacao;


    //construtor
    public Livro(String titulo, int isbn, Materias materia, int edicao, int ano, int anoPublicacao) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.materia = materia;
        this.edicao = edicao;
        this.ano = ano;
        this.anoPublicacao = anoPublicacao;
    }
    public Livro(String titulo, int isbn, Materias materia, int edicao, int ano) {
        this(titulo, isbn, materia, edicao, ano, 2019);
    }

    public String getTitulo() {return titulo;}

    public void setTitulo(String titulo) {this.titulo = titulo;}

    public int getIsbn() {return isbn;}

    public void setIsbn(int isbn) {this.isbn = isbn;}

    public Materias getMateria() {return materia;}

    public void setMateria(Materias materia) {this.materia = materia;}

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
    public static void main(String[] args) {

        Livro teste1 = new Livro("Matematica infantil", 51479, Materias.MATEMATICA, 5, 1, 2015);
        Livro teste2 = new Livro("Fisica medio", 52315, Materias.FISICA, 3, 2);

        teste1.consultaLivro(51479);
        teste1.consultaLivro("Matematica infantil");
        teste1.consultaLivro(21230);
        teste1.consultaLivro("Teste");

        teste2.consultaLivro(52315);
        teste2.consultaLivro("Fisica medio");
        teste2.consultaLivro(21230);
        teste2.consultaLivro("Teste");

    }

}
