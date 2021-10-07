

public class Publicacao {
    private String titulo;
    private String autores;
    private String veiculo;
    private String dataPublicacao;
    private int anoPublicacao;
    private int copias;
    protected static int tempoMaximoLocacao = 4;


    public Publicacao(String titulo, String autores, String veiculo, String dataPublicacao, int anoPublicacao, int copias) {
        this.titulo = titulo;
        this.autores = autores;
        this.veiculo = veiculo;
        this.dataPublicacao = dataPublicacao;
        this.anoPublicacao = anoPublicacao;
        this.copias = copias;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDataPublicacao() {
        return anoPublicacao;
    }

    public void setDataPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public static int getTempoMaximoLocacao() {
        return tempoMaximoLocacao;
    }

    public static void setTempoMaximoLocacao(int tempoMaximoLocacao) {
        Publicacao.tempoMaximoLocacao = tempoMaximoLocacao;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int tempoLocacao() {
        return Publicacao.tempoMaximoLocacao;
    }
}
