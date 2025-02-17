package recursiva_contador_negativo;

public class Contador {
	public static int negativos(int[] vetor, int tamanho) {

		int contador = 0;

		// parada quando chegar na ultima posicao do vetor 0
		if (tamanho == 0) {
			return 0;
		}

		// verificar se é negativo e atribui o valor ao contador
		if (vetor[tamanho - 1] < 0) {
			contador = 1;
		} 
		
		//chama a função passando o proximo indice do vetor
		return contador + negativos(vetor, tamanho - 1);
	}
}
