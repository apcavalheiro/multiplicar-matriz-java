package xyz.cavalheiro.multiplicar_matriz;

import java.util.Random;

public class Matriz {
	private static Random random = new Random();
	private int[][] matriz;
	private int[][] matriz1;
	private int[][] produto;

	public Matriz(int[][] matriz, int[][] matriz1, int[][] produto) {
		super();
		this.matriz = matriz;
		this.matriz1 = matriz1;
		this.produto = produto;
	}
	
	
	public int[][] getMatriz() {
		return matriz;
	}


	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}


	public int[][] getMatriz1() {
		return matriz1;
	}


	public void setMatriz1(int[][] matriz1) {
		this.matriz1 = matriz1;
	}


	public int[][] getProduto() {
		return produto;
	}


	public void setProduto(int[][] produto) {
		this.produto = produto;
	}

	public static void inicializarMatrizes(int[][] matriz, int[][] matriz1,int numAleatrorio) {
		for (int i=0; i<matriz.length; i++) {			
			for (int j=0; j<matriz.length; j++) {
				matriz[i][j] = random.nextInt(numAleatrorio);
			}
		}	
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz.length; j++) {
				matriz1[i][j] = random.nextInt(numAleatrorio);
			}
		}
	}

	public static void multiplicarMatrizes(int[][] matriz, int[][] matriz1, int[][] produto) {
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz.length; j++) {	
				for (int k=0; k<matriz.length; k++) {
					produto[i][j] += (matriz[i][k] * matriz1[k][j]);
				}
			}
		}
	}

	public static void exibirMatrizes(int[][] matriz, int[][] matriz1, int[][] produto) {
		System.out.print("1ª Matriz_________________________\n");
		for (int i=0; i<matriz.length; i++) {
			System.out.print((i+1)+"ª. linha: ");
			for (int j=0; j<matriz.length; j++) {
				System.out.print(" "+ matriz[i][j]);
			}
			System.out.println();
		}

		System.out.print("\n2ª Matriz_________________________\n");
		for (int i=0; i<matriz.length; i++) {
			System.out.print((i+1)+"ª. linha: ");
			for (int j=0; j<matriz.length; j++) {
				System.out.print(" "+ matriz1[i][j]);
			}
			System.out.println();
		}

		System.out.printf("\nProduto___________________________\n");
		for (int i=0; i<matriz.length; i++)  {
			System.out.print((i+1)+"ª. linha: ");
			for (int j=0; j<matriz.length; j++){
				System.out.print(" "+ produto[i][j]);
			}
			System.out.println();
		}
	}		
}
