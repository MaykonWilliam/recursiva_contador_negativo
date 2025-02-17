package recursiva_contador_negativo;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String input;
		String[] valores;
		int[] vetor;
		
		input = JOptionPane.showInputDialog("Digite os números separados por virgulas (,) :");
		valores = input.split(",");

		vetor = new int[valores.length];

		for (int i = 0; i < valores.length; i++) {
			vetor[i] = Integer.parseInt(valores[i]);
		}

		int resultado = Contador.negativos(vetor, vetor.length);
		
		JOptionPane.showMessageDialog(null, "O total de elementos negativos no vetor é: " + resultado);
	}
}
