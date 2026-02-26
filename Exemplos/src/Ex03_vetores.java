import java.util.Arrays;

public class Ex03_vetores {
    public static void main() {
        int[] colecao = {1, 2, 3, 4, 5};
        System.out.println("Coleção inteira: " + Arrays.toString(colecao) + "\nPrimeira posição: " + colecao[0] + "\nÚltima posição: " + colecao[colecao.length - 1]);
        System.out.println("Tamanho total: " + colecao.length);
    }
}
