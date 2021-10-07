public class Cartao {

    private class Destinatario {
        private String nome;
        private String endereco;


        public Destinatario(String nome, String endereco) {
            this.nome = nome;
            this.endereco = endereco;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        @Override
        public String toString() {
            return "Destinatario{" +
                    "nome='" + nome + '\'' +
                    ", endereco='" + endereco + '\'' +
                    '}';
        }
    }


    private Destinatario destinatario;
    private String emissario;
    private String texto;
    private String horario;
    private double custo;

    public Cartao(String destinatario,String endereco, String emissario, String texto, String horario, double custo) {
        this.destinatario = new Destinatario(destinatario, endereco);
        this.emissario = emissario;
        this.texto = texto;
        this.horario = horario;
        this.custo = custo;
    }

    public Cartao(String destinatario,String endereco, String emissario, String texto, double custo) {
        this.destinatario = new Destinatario(destinatario, endereco);
        this.emissario = emissario;
        this.texto = texto;
        this.horario = "0000";
        this.custo = custo;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Destinatario destinatario) {
        this.destinatario = destinatario;
    }


    public String getEmissario() {
        return emissario;
    }

    public void setEmissario(String emissario) {
        this.emissario = emissario;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }


    public String toString() {
        return "Cartao{" +
                destinatario.toString() +
                ", emissario='" + emissario + '\'' +
                ", texto='" + texto + '\'' +
                ", horario='" + horario + '\'' +
                ", custo=" + custo +
                '}';
    }

    public static void main(String[] args) {
        Cartao teste = new Cartao("Jose", "Rua do carneiro", "Maria", "muito bom", "1620", 12.00);
        Cartao teste2 = new Cartao("Jose", "Rua do carneiro", "Maria", "muito bom tambem", 12.00);

        System.out.println(teste.toString());
        System.out.println(teste2.toString());

    }
}
