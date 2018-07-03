package xyz.cavalheiro.matrizes;

public class Main {
    public static void main(String[] args) {

        int tamanhoMatriz = 3;
        int numAleatrorio = 5;
        int matriz[][] = new int[tamanhoMatriz][tamanhoMatriz];
        int matriz1[][] = new int[tamanhoMatriz][tamanhoMatriz];
        int produto[][] = new int[tamanhoMatriz][tamanhoMatriz];

        Matriz.inicializarMatriz(matriz,matriz1,numAleatrorio);

        for(int i = 0;i<matriz.length;i++){
            for(int j = 0;j<matriz.length;j++){
                Thread th = new Thread(new Matriz(matriz,matriz1,produto,i,j));
                th.start();//instanciando nove Matrizes e nove Threads
            }
        }
        Matriz.exibirMatriz(matriz,matriz1,produto);
    }
}
