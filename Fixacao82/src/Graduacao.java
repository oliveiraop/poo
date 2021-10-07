public class Graduacao extends Curso {
    int obrigatorias;
    int optativas;
    static double taxaMatricula = 0;

    public Graduacao(int codigo, String nome, String area, int numeroDeVagas, int obrigatorias, int optativas, double preco) {
        super(codigo, nome, area, numeroDeVagas, preco);
        this.obrigatorias = obrigatorias;
        this.optativas = optativas;
    }

    public int getObrigatorias() {
        return obrigatorias;
    }

    public void setObrigatorias(int obrigatorias) {
        this.obrigatorias = obrigatorias;
    }

    public int getOptativas() {
        return optativas;
    }

    public void setOptativas(int optativas) {
        this.optativas = optativas;
    }

    public static double getTaxaMatricula() {
        return taxaMatricula;
    }

    public static void setTaxaMatricula(double taxaMatricula) {
        Graduacao.taxaMatricula = taxaMatricula;
    }

    @Override
    public String toString() {
        return "Graduacao{" +
                "Disciplinas totais=" + (this.obrigatorias + this.optativas) +
                '}';
    }

    @Override
    public double getDesconto() {
        return 0.10;
    }

    @Override
    public double getDescontoAdicional() {
        return 0.05;
    }
}
