public class Revista extends Titulo {
  private int periodicidade;
  private static final float iss = (float)0.01;
  final static float descontoVip = (float)0.02;
  
  public Revista (String nome, String editora, float preco, int periodicidade) {
    super(nome, editora, preco);
    this.periodicidade = periodicidade;
  }

  public int getPeriodicidade() {
    return this.periodicidade;
  }

  public void setPeriodicidade(int periodicidade) {
    this.periodicidade = periodicidade;
  }

  public static boolean mesmaEditora(Revista revista1, Revista revista2){
    if (revista1.getEditora().equals(revista2.getEditora())) {
      return true;
    } else {
      return false;
    }
  }

  public float calculaPrecoFinal() {
    return this.getPreco() + (this.getPreco() * Revista.iss);
  }

  public String toString() {
    return super.toString() + ", periodicidade(dias): " + this.periodicidade;
  }
}