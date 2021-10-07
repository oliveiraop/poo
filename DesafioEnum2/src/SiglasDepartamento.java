public enum SiglasDepartamento {
    DCC("Departamento de Ciência da Computação", 1, "DCC"),
    DMAT("Departamento de Matemática", 2, "DMAT"),
    DFIS("Departamendo de Física", 3, "DFIS"),
    DMU("Departamento de Música", 4, "DMU");

    private final Departamento dep;

    SiglasDepartamento(String nome, int numero, String sigla) {
        this.dep = new Departamento(nome, numero, sigla);
    }

    public Departamento getDep() {
        return dep;
    }
}
