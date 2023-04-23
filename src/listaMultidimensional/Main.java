package listaMultidimensional;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		
		
		int[][] matriz = {{1}, {4, 5}, {6, 7, 8, 9}};
		int[][] novaMatriz = removerPrimeira(matriz);
		System.out.println(Arrays.deepToString(novaMatriz));
		 int[] lista = {10, 11, 12};
//		 int[][] Matriz2 = adicionarListaFinal(matriz, lista);
//		 System.out.println(Arrays.deepToString(Matriz2));
		 // Adicionar lista no final da matriz-----------
//		 int[][] Matriz3 = adicionarListaFinal(Matriz2, lista);
//		 System.out.println(Arrays.deepToString(Matriz3));
		 

	}
	private static int[][] adicionarListaFinal(int[][] matriz, int[] lista) {
	    int linhas = matriz.length;
	    int colunas = matriz[0].length;
	    int[][] novaMatriz = new int[linhas + 1][colunas];

	    // Copia as linhas existentes da matriz para a nova matriz
	    for (int i = 0; i < linhas; i++) {
	        novaMatriz[i] = matriz[i];
	    }

	    // Verifica se a lista tem o mesmo número de colunas da matriz
	    if (lista.length != colunas) {
	        System.out.println("Erro: a lista não tem o mesmo número de colunas da matriz");
	        return matriz; // Retorna a matriz original
	    }

	    // Copia a lista para a última linha da nova matriz
	    novaMatriz[linhas] = lista;

	    return novaMatriz;
	}
	
	private static int[][] removerPrimeira(int[][] matriz) {
		 int linhas = matriz.length;
		    int[][] novaMatriz = new int[linhas][];
		    for (int i = 0; i < linhas; i++) {
		        int colunas = matriz[i].length;    //if? se sim1|0se nao
		        novaMatriz[i] = new int[colunas - ((i == 0) ? 1 : 0)]; 
		        for (int j = 0; j < colunas; j++) {
		            if (i == 0 && j == 0) {
		                continue;
		        //se o if acontecer antes do final do for, o "continue"
	           //quebra o loop
		            }
		            int novaColuna = j - ((i == 0) ? 1 : 0);
		            novaMatriz[i][novaColuna] = matriz[i][j];
		        }
		    }
		    return novaMatriz;
	}




}
