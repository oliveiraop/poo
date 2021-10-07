public class Assinante {
    private String cpf;
    private String nome;
    private String endereco;
    private String telefone;
    private Anuncio[] anuncios;

    public Assinante(String cpf, String nome, String endereco, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        if (telefone.length() == 9) {
            this.telefone = "71" + telefone;
        } else this.telefone = telefone;
    }

    public String getCpf() {return cpf;}

    public void setCpf(String cpf) {this.cpf = cpf;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getEndereco() {return endereco;}

    public void setEndereco(String endereco) {this.endereco = endereco;}

    public String getTelefone() {return telefone;}

    public void setTelefone(String telefone) {this.telefone = telefone;}

    public Anuncio[] getAnuncios() {return anuncios;}

    public void setAnuncios(Anuncio[] anuncios) {this.anuncios = anuncios;}

    public void consultaAssinante(String par) {
        String par2 = "71" + par;
        if (par.equals(this.nome) || par.equals(this.telefone) || par2.equals(this.telefone)) {
            System.out.println("Assinante{" +
                    "cpf=" + this.cpf +
                    ", nome='" + this.nome + '\'' +
                    ", endereco='" + this.endereco + '\'' +
                    ", telefone=" + this.telefone +
                    '}');
        }
    }
    public static void main(String[] args) {
        Assinante teste1 = new Assinante("21354896324", "Carlos", "Ladeira da Montanha", "21989298745");
        Assinante teste2 = new Assinante("32154236512", "Jorge", "Ladeira do cabrito", "991208740");

        teste1.consultaAssinante("Carlos");
        teste1.consultaAssinante("Jorge");
        teste1.consultaAssinante("21989298745");
        teste1.consultaAssinante("989298745");
        teste1.consultaAssinante("989298105405745");


        teste2.consultaAssinante("Carlos");
        teste2.consultaAssinante("Jorge");
        teste2.consultaAssinante("71991208740");
        teste2.consultaAssinante("991208740");
        teste2.consultaAssinante("989298105405745");



    }

}
