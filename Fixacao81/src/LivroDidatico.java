public class LivroDidatico extends Livro{
  private String area;
  final static float iss = (float)0.005;
  final static float descontoVip = (float)0.10;

  public LivroDidatico(String nome, String autor, String editora, String resumo, float preco , String area){
    super(resumo, autor, nome, editora, preco);
    this.area = area;
  }

  public String getArea(){
    return area;
  }

  public void setArea(String area){
    this.area = area;
  }

  public float calculaPrecoFinal() {
    return this.getPreco() + (this.getPreco() * LivroDidatico.iss);
  }
}