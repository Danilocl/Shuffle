import java.util.Arrays;
import java.util.Collections;

/**
 * @author danilo.lessa
 *
 */

class Solution {

	public static void main(String[] args) {

		System.out.println(geraResult(6,432));
		System.out.println("");
		System.out.println(geraResult(4,432));
	}

	/**
	 * Verifica se há elementos repeditos no array
	 */
	public static String geraResult(int quant, int val) {

		int indice = 0;

		int[] array = new int[quant];

		while (indice < quant) {
			array[indice] = sorteador(val);
			indice++;
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				while (array[i] == array[j] && i != j) {
					array[i] = sorteador(val);
					j = 0;
				}
			}
		}		

		return Arrays.toString(array);
	}

	/**
	 * Cria um array com números reorganizados
	 * 
	 * @param X
	 * @return
	 */
	public static int sorteador(int X) {

		String[] randonChar = ("" + X).split("(?<=.)");

		Collections.shuffle(Arrays.asList(randonChar));

		String result = "";

		for (String string : randonChar) {
			result += string;
		}

		int shuffle = Integer.parseInt(result);

		return shuffle;
	}

}
