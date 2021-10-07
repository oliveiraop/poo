public class PosGraduacao extends Curso{
    int cargaMaxima;
    static double taxaMatricula = 0;

    public PosGraduacao(int codigo, String nome, String area, int numeroDeVagas, int cargaMaxima, double preco) {
        super(codigo, nome, area, numeroDeVagas, preco);
        this.cargaMaxima = cargaMaxima;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public static double getTaxaMatricula() {
        return taxaMatricula;
    }

    public static void setTaxaMatricula(double taxaMatricula) {
        PosGraduacao.taxaMatricula = taxaMatricula;
    }

    @Override
    public String toString() {
        return "PosGraduacao{" +
                "Carga Maxima=" + cargaMaxima +
                '}';
    }

    @Override
    public double getDesconto() {
        return 0.05;
    }

    @Override
    public double getDescontoAdicional() {
        return 0.05;
    }
}
