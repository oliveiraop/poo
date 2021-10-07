public class Artigo extends Publicacao{
    private String resumo;

    public Artigo(String titulo, String autores, String veiculo, String dataPublicacao, int anoPublicacao, int copias, String resumo) {
        super(titulo, autores, veiculo, dataPublicacao, anoPublicacao, copias);
        this.resumo = resumo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    @Override
    public int tempoLocacao() {
        if (this.getAnoPublicacao() == 2020) {
            return Publicacao.tempoMaximoLocacao / 4;
        } else {
            return super.tempoLocacao();
        }
    }
    
}
