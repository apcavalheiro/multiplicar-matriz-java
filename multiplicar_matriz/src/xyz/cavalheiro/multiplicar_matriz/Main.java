package xyz.cavalheiro.multiplicar_matriz;

public class Main {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		int tamanhoMatriz = 3;
		int matriz[][] = new int[tamanhoMatriz][tamanhoMatriz];
		int matriz1[][] = new int[tamanhoMatriz][tamanhoMatriz];
		int produto[][] = new int[tamanhoMatriz][tamanhoMatriz];
		int numAleatrorio = 5;
		Matriz mt = new Matriz(matriz,matriz1,produto);
		// entrada de dados
		mt.inicializarMatrizes(matriz, matriz1,numAleatrorio);

		// processamento: multiplicando as matrizes de entrada
		mt.multiplicarMatrizes(matriz, matriz1, produto);

		// saida
		mt.exibirMatrizes(matriz, matriz1, produto);
	}
}
