package ordenadores;
public class OrdenarQuick implements Ordenador{

    @Override
    public int[] ordene(int[] array) {

        return array;
    }

    public int quickParticio(int[] array, int inicio, int fim){
        int pivo = array[fim];
        int num = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (array[j] <= pivo) {
                num++;
                int temp = array[num+1];
                array[num+1] = array[fim];
                array[fim] = temp;
            }
        }
        int temp = array[num +1];
        array[num +1] = array[fim];
        array[fim] = temp;
        return num;
    }
    
}
