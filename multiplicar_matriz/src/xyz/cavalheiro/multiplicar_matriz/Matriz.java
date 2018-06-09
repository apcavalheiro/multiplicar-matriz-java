package xyz.cavalheiro.multiplicar_matriz;

import java.util.Random;

public class Matriz {
	private static Random random = new Random();
	private int[][] multiplicador;
	private int[][] multiplicando;
	private int[][] produto;

	public Matriz(int[][] matriz, int[][] matriz1, int[][] produto) {
		super();
		this.multiplicador = matriz;
		this.multiplicando = matriz1;
		this.produto = produto;
	}

	public int[][] getMatriz() {
		return multiplicador;
	}

	public void setMatriz(int[][] matriz) {
		this.multiplicador = matriz;
	}

	public int[][] getMatriz1() {
		return multiplicando;
	}

	public void setMatriz1(int[][] matriz1) {
		this.multiplicando = matriz1;
	}

	public int[][] getProduto() {
		return produto;
	}

	public void setProduto(int[][] produto) {
		this.produto = produto;
	}

	public static void inicializarMatriz(int[][] matriz, int[][] matriz1,int numAleatrorio) {
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

	public static void multiplicarMatriz(int[][] matriz, int[][] matriz1, int[][] produto) {
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz.length; j++) {	
				for (int k=0; k<matriz.length; k++) {
					produto[i][j] += (matriz[i][k] * matriz1[k][j]);
				}
			}
		}
	}

	public static void exibirMatriz(int[][] matriz, int[][] matriz1, int[][] produto) {
		System.out.print("1ª Matriz___________________\n");
		for (int i=0; i<matriz.length; i++) {
			System.out.print((i+1)+"ª. linha: ");
			for (int j=0; j<matriz.length; j++) {
				System.out.print(" "+ matriz[i][j]);
			}
			System.out.println();
		}

		System.out.print("\n2ª Matriz________________\n");
		for (int i=0; i<matriz.length; i++) {
			System.out.print((i+1)+"ª. linha: ");
			for (int j=0; j<matriz.length; j++) {
				System.out.print(" "+ matriz1[i][j]);
			}
			System.out.println();
		}

		System.out.printf("\nProduto__________________\n");
		for (int i=0; i<matriz.length; i++)  {
			System.out.print((i+1)+"ª. linha: ");
			for (int j=0; j<matriz.length; j++){
				System.out.print(" "+ produto[i][j]);
			}
			System.out.println();
		}
	}		
}
