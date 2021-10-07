public class AplicacaoFaculdade {

    public static void main(String args[]) {
        Graduacao.setTaxaMatricula(100);
        PosGraduacao.setTaxaMatricula(200);


    }

    public Graduacao novaGraduacao(int codigo, String nome, String area, int numeroDeVagas, int obrigatorias, int optativas, double preco) {
        return new Graduacao(codigo, nome, area, numeroDeVagas, obrigatorias, optativas, preco);
    }

    public PosGraduacao novaPosGraduacao(int codigo, String nome, String area, int numeroDeVagas, int cargaMaxima, double preco) {
        return new PosGraduacao(codigo, nome, area, numeroDeVagas, cargaMaxima, preco);
    }

    public String informacoesCurso(Curso curso) {
        if (curso instanceof Graduacao) {
            curso = (Graduacao) curso;
        } else if(curso instanceof PosGraduacao) {
            curso = (PosGraduacao) curso;
        }
        return curso.toString();
    }

    public double getDesconto(Curso curso, boolean adicional) {
        if (curso instanceof Graduacao) {
            curso = (Graduacao) curso;
        } else if(curso instanceof PosGraduacao) {
            curso = (PosGraduacao) curso;
        }
        if (adicional) {
            return curso.preco * (1 + curso.getDesconto() + curso.getDescontoAdicional());
        } else {
            return curso.preco * (1 + curso.getDesconto());
        }
    }

}
