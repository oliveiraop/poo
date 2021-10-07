public class Televisao {

    private String marca;
    private String modelo;
    private boolean status;
    private int canalAtual;
    private String senhaSeguranca;

    public Televisao(String marca, String modelo, boolean status, int canalAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.status = status;
        this.canalAtual = canalAtual;
    }


    public String getSenhaSeguranca() {
        return senhaSeguranca;
    }

    public void setSenhaSeguranca(String senhaSeguranca) {
        this.senhaSeguranca = senhaSeguranca;
    }

    public String getMarca() {return marca;}

    public void setMarca(String marca) {this.marca = marca;}

    public String getModelo() {return modelo;}

    public void setModelo(String modelo) {this.modelo = modelo;}

    public boolean isStatus() {return status;}

    public void setStatus(boolean status) {this.status = status;}

    public int getCanalAtual() {return canalAtual;}

    public void setCanalAtual(int canalAtual) {this.canalAtual = canalAtual;}
}
