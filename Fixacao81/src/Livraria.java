import java.util.ArrayList;

public class Livraria {
    private String nome;


    public String emitirNotaFiscal(ArrayList<Titulo> titulos, boolean isVip) {
        float precoFinal = 0;
        float desconto = 1;
        String retorno = "Livraria: " + this.nome + "\n";
        float preco;
        for (Titulo i : titulos) {
            if (i instanceof Livro) {
                i = (Livro)i;
                desconto = Livro.descontoVip;
            } else if (i instanceof LivroDidatico) {
                i = (LivroDidatico)i;
                desconto = LivroDidatico.descontoVip;
            } else if (i instanceof Revista) {
                i = (Revista)i;
                desconto = Revista.descontoVip;
            }
            if (isVip) {
                preco = i.calculaPrecoFinal() - (i.calculaPrecoFinal()*desconto);
            } else {
                preco = i.calculaPrecoFinal();
            }
            precoFinal = precoFinal + preco;
            retorno = retorno + i.getNome() + ":    " + preco + "\n";
        }
        return retorno + "Total da compra: " + precoFinal;
    } // Fiz para varios produtos por que achei que ficaria mais simples.
}
