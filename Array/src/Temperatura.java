import com.sun.jdi.FloatValue;

public class Temperatura {
    private float[] temperaturas;
    private int uso;


    public Temperatura(float[] temperaturas) {

        this.temperaturas = temperaturas;
        this.uso = temperaturas.length;
    }

    public Temperatura(int qtdTemperaturas) {
        this.temperaturas = new float[qtdTemperaturas];
        this.uso = 0;
    }
    public void adicionaTemperatura(float temperatura) {
        if(uso < this.temperaturas.length) {
            this.temperaturas[uso] = temperatura;
            this.uso++;
        }
    }

    public void removeTemperatura(float temperatura) {
        for (int i = 0 ; i < this.uso ; i++) {
            if (this.temperaturas[i] == temperatura) {
                while(i < this.uso-1) {
                    this.temperaturas[i] = this.temperaturas[i+1];
                    i++;
                }
                this.temperaturas[i] = 0;
                this.uso--;
            }
        }
    }
    public float maximaTemperatura() {
        float teste = this.temperaturas[0];
        for (int i = 0 ; i < this.uso ; i++) {
            if (this.temperaturas[i] > teste) {
                teste = this.temperaturas[i];
            }
        }
        return teste;
    }
    public float minimaTemperatura() {
        float teste = this.temperaturas[0];
        for (int i = 0 ; i < this.uso ; i++) {
            if (this.temperaturas[i] < teste) {
                teste = this.temperaturas[i];
            }
        }
        return teste;
    }
    public float amplitudeTemperatura() {
        return this.maximaTemperatura() - this.minimaTemperatura();
    }
    public float mediaTemperatura() {
        float total = 0;
        for (int i = 0 ; i < this.uso ; i++) {
            total += this.temperaturas[i];
        }
        return total/this.uso;
    }

    private void ordenaTemperaturas() {
        mergeSort(this.temperaturas, 0, this.uso);
    }

    private static void mergeSort(float[] vetor, int inicio, int fim) {
        if(inicio < fim - 1) {
            int meio = (inicio + fim) / 2;

            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio, fim);
            merge(vetor, inicio, meio, fim);
        }
    }

    private static void merge(float[] vetor, int inicio, int meio, int fim) {
        float[] novo = new float[fim];
        int i = inicio;
        int m = meio;
        int pos = 0;

        while(i < meio && m < fim) {
            if (vetor[i] <= vetor[m]) {
                novo[pos] = vetor[i];
                pos++;
                i++;
            } else {
                novo[pos] = vetor[m];
                pos++;
                m++;
            }
        }
        while(i < meio) {
            novo[pos] = vetor[i];
            pos++;
            i++;
        }
        while(m < fim) {
            novo[pos] = vetor[m];
            pos++;
            m++;
        }
        for (pos = 0, i = inicio; i < fim; i++, pos++) {
            vetor[i] = novo[pos];
        }
    }


}
