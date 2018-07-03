package xyz.cavalheiro.matrizes;

import java.util.Random;

public class Matriz extends Thread {
    private static Random random = new Random();
    private int linha;
    private int coluna;
    private int[][] multiplicador;
    private int[][] multiplicando;
    private int[][] produto;


    public Matriz(int[][] matriz, int[][] matriz1, int[][] produto, int linha, int coluna) {
        super();
        this.multiplicador = matriz;
        this.multiplicando = matriz1;
        this.produto = produto;
        this.linha = linha;
        this.coluna = coluna;
    }

    public static void inicializarMatriz(int[][] matriz, int[][] matriz1, int numAleatrorio) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(numAleatrorio);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz1[i][j] = random.nextInt(numAleatrorio);
            }
        }
    }

    public static void exibirMatriz(int[][] matriz, int[][] matriz1, int[][] produto) {
        System.out.print("1ª Matriz___________________\n");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print((i + 1) + "ª. linha: ");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println();
        }

        System.out.print("\n2ª Matriz________________\n");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print((i + 1) + "ª. linha: ");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(" " + matriz1[i][j]);
            }
            System.out.println();
        }

        System.out.printf("\nProduto__________________\n");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print((i + 1) + "ª. linha: ");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(" " + produto[i][j]);
            }
            System.out.println();
        }
    }

    @Override
    public void run() {
        for (int k = 0; k < multiplicador.length; k++) {
            produto[linha][coluna] += (multiplicador[linha][k] * multiplicando[k][coluna]);
        }
    }

}
