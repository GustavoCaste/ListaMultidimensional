package listaMultidimensional;

public class Main {

	public static void main(String[] args) {

		
		
		int[][] matriz = {{1,2,3}, {4, 5}, {6, 7, 8, 9}};
		
//		Para remover primeiro elemento :
		
//		int[][] novaMatriz = removerPrimeira(matriz);
//		imprimirMatriz(novaMatriz);
//		_________________________________________________________
		
//		Para inverter a Matriz :
//		int[][] Matriz4 = inverterMatriz(matriz);
//		imprimirMatriz(Matriz4);
//		_________________________________________________________
		
//		Para adicionar um elemento no final da Matriz:
//		int [][] matriz5 = adicionarElementoFinal(matriz, 10);
//		imprimirMatriz(matriz5);
//		_________________________________________________________
		 int[] lista = {10, 11, 12};
		 int[][] Matriz2 = adicionarListaFinal(matriz, lista);
		 imprimirMatriz(Matriz2);
//		  Adicionar lista no final da matriz-----------
		 int[][] Matriz3 = adicionarListaFinal(Matriz2, lista);
		 imprimirMatriz(Matriz3);
		 

	}
	public static void imprimirMatriz(int[][] matriz) {
	    for (int i = 0; i < matriz.length; i++) {
	        for (int j = 0; j < matriz[i].length; j++) {
	            System.out.print(matriz[i][j] + " ");
	        }
	        System.out.println();
	    }System.out.println();
	}
	
	public static int[][] inverterMatriz(int[][] matriz) {
	    int[][] novaMatriz = new int[matriz.length][];
	    for (int i = 0; i < matriz.length; i++) {
	        novaMatriz[i] = new int[matriz[i].length];
	        for (int j = 0; j < matriz[i].length; j++) {
	            novaMatriz[i][j] = matriz[i][matriz[i].length - 1 - j];
	        }
	    }
	    return novaMatriz;
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
	public static int[][] adicionarElementoFinal(int[][] matriz, int elemento) {
	    int linha = matriz.length - 1;
	    int coluna = matriz[linha].length;
	    int[][] novaMatriz = new int[linha + 1][coluna + 1];
	    for (int i = 0; i < linha; i++) {
	        novaMatriz[i] = matriz[i];
	    }
	    novaMatriz[linha] = new int[coluna + 1];
	    for (int i = 0; i < coluna; i++) {
	        novaMatriz[linha][i] = matriz[linha][i];
	    }
	    novaMatriz[linha][coluna] = elemento;
	    return novaMatriz;
	}




}
