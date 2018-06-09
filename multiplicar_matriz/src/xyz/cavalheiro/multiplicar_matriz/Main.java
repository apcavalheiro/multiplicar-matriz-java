package xyz.cavalheiro.multiplicar_matriz;

public class Main {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		int tamanhoMatriz = 3;
		int numAleatrorio = 5;
		int matriz[][] = new int[tamanhoMatriz][tamanhoMatriz];
		int matriz1[][] = new int[tamanhoMatriz][tamanhoMatriz];
		int produto[][] = new int[tamanhoMatriz][tamanhoMatriz];
		
		Matriz mt = new Matriz(matriz,matriz1,produto);
		
		mt.inicializarMatriz(matriz, matriz1,numAleatrorio);

		mt.multiplicarMatriz(matriz, matriz1, produto);

		mt.exibirMatriz(matriz, matriz1, produto);
	}
}
