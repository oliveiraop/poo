abstract class Curso {
    int codigo;
    String nome;
    String area;
    int numeroDeVagas;
    double preco;

    public Curso(int codigo, String nome, String area, int numeroDeVagas, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.area = area;
        this.numeroDeVagas = numeroDeVagas;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getNumeroDeVagas() {
        return numeroDeVagas;
    }

    public void setNumeroDeVagas(int numeroDeVagas) {
        this.numeroDeVagas = numeroDeVagas;
    }

    public abstract double getDesconto();

    public abstract double getDescontoAdicional();

    public abstract String toString();


}
