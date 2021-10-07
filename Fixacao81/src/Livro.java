//Mauricio que fezzzzzzzzz 
public class Livro extends Titulo {
    private String resumo;
    private String autor;
    final static float iss = (float)0.08;
    final static float descontoVip = (float)0.03;

    /*
    * Construtores
    */ 
    public Livro(String resumo, String autor,String nome, String editora, float preco) {
        super(nome, editora, preco);
        this.resumo = resumo;
        this.autor = autor;
    }

    /*
    * Getters
    */
    public String getResumo() {
        return resumo;
    }

    public String getAutor() {
        return autor;
    }

    public float getIss(){ return Livro.iss;}

    /*
    * Setters
    */
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    /*
    * Metodos
    */
    @Override
    public String toString() {
        return "Livro{" +
                "resumo='" + this.getResumo() + '\'' +
                ", autor='" + this.getAutor() + '\'' +
                '}';
    }

    //Retorna o preço final com o imposto
    public float calculaPrecoFinal(){
          return this.getPreco()*(1+Livro.iss);
    }
} //Mau: Isso que eu fiz faz sentido?