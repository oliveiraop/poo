import java.util.ArrayList;

public class Assinante {
    private String cpf;
    private String nome;
    private String endereco;
    private String telefone;
    private ArrayList<Anuncio> anuncios;

    public Assinante(String cpf, String nome, String endereco, String telefone, ArrayList<Anuncio> anuncios) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        if (telefone.length() == 9) {
            this.telefone = "71" + telefone;
        } else this.telefone = telefone;
        this.anuncios = anuncios;
    }

    public Assinante(String cpf, String nome, String endereco, String telefone) {
        this(cpf, nome, endereco, telefone, new ArrayList<Anuncio>());
    }

    public String getCpf() {return cpf;}

    public void setCpf(String cpf) {this.cpf = cpf;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getEndereco() {return endereco;}

    public void setEndereco(String endereco) {this.endereco = endereco;}

    public String getTelefone() {return telefone;}

    public void setTelefone(String telefone) {this.telefone = telefone;}

    public ArrayList<Anuncio> getAnuncios() {return anuncios;}

    public void setAnuncios(ArrayList<Anuncio> anuncios) {this.anuncios = anuncios;}

    public void addAnuncio(AnuncioVenda anuncio) {
        anuncios.add(anuncio);
    }

    public void addAnuncio(AnuncioTroca anuncio) {
        anuncios.add(anuncio);
    }

    public void addAnuncio(Anuncio anuncio) {
        anuncios.add(anuncio);
    }

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

}
