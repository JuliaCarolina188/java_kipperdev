import java.util.Scanner;

public class Ex06_while {
    public static void main() {
        byte contador = 0;

        while (contador <= 10) {
            System.out.println(contador);
            contador++;
        }

        int soma = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Digite um número até que some 100.\n>");
            soma += scan.nextInt();
        } while (soma < 100);
    }
}
