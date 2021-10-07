import java.util.ArrayList;

public class Agenda {
    private String dono;
    private String endereco;
    private ArrayList<Contato> contatos;

    public Agenda(String dono, String endereco) {
        this.dono = dono;
        this.endereco = endereco;
        this.contatos = new ArrayList<Contato>();
    }

    //Como não foi definido que tipo de associação, fiz os dois

    public void adicionaContato(Contato contato) { // Associação Fraca
        this.contatos.add(contato);
    }

    public void adicionaContato(String nome, long telefone) { // Associação Forte
        this.contatos.add(new Contato(nome, telefone));
    }

    public void removeContato(String nome){
        for (int i = 0; i < this.contatos.size(); i++) {
            if (this.contatos.get(i).getNome().equals(nome)) {
                this.contatos.remove(i);
            }
        }
    }

    public void removeContato(long telefone){
        for (int i = 0; i < this.contatos.size(); i++) {
            if (this.contatos.get(i).getTelefone() == telefone) {
                this.contatos.remove(i);
            }
        }
    }

    public void alteraContato(String nome, long telefone) {
        for (int i = 0; i < this.contatos.size(); i++) {
            if (this.contatos.get(i).getTelefone() == telefone) {
                this.contatos.get(i).setNome(nome);
            }
        }
    }

    public String listarContatos() {
        String retorno = "Agenda de " + this.dono +
                "\n---------------------------------------\n";
        for (Contato i : this.contatos) {
            retorno = retorno + i.getNome() + "\n" +
                    i.getTelefone() + "\n" +
                    "---------------------------------------\n";
        }
        return retorno;
    }

    public int quantidade() {
        return this.contatos.size();
    }
}
