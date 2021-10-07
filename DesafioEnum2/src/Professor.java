public class Professor
{


    /*("Departamento de Ciência da Computação"),
        ("Departamento de Matemática"),
        ("Departamendo de Física"),
        ("Departamento de Música"); */
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private Departamento departamento;
    private String dataAdmissao;
    private String numeroRegistro;

    public Professor(String nome, Departamento departamento, String dataAdmissao, String numeroRegistro)
    {
        this.nome = nome;
        this.departamento = departamento;
        this.dataAdmissao = dataAdmissao;
        this.numeroRegistro = numeroRegistro;
    }

    public Professor(String nome, Departamento departamento, String numeroRegistro)
    {
        this.nome = nome;
        this.departamento = departamento;
        this.dataAdmissao = "01/01/2009";
        this.numeroRegistro = numeroRegistro;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public String getDataAdmissao() {
        return this.dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getNumeroRegistro() {
        return this.numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public void setDepartamento(int departamento) {

       /* for (Departamento dep : Departamento.values()) {
            if (dep.getValue() == departamento) {
                setDepartamento(dep.getNome());
            }
        } */
        for (SiglasDepartamento sigla : SiglasDepartamento.values()) {
            if (sigla.getDep().getNumero() == departamento) {
                this.departamento = sigla.getDep();
            }
        }
    }

    public void setDepartamento (SiglasDepartamento sigla) {

        this.departamento = sigla.getDep();
    }



    public static void main(String args[]){

        /*Professor teste = new Professor("Fulano", "Dep teste", "114");

        System.out.println(teste.getNome());
        System.out.println(teste.getDepartamento());
        System.out.println(teste.getDataAdmissao());
        System.out.println(teste.getNumeroRegistro());

        teste.setDepartamento(4);
        /* 1 - ciencia da computacao
        2 - fisica
        3 - matematica
        4 - musica


        System.out.println(teste.getDepartamento()); */


    }

}
