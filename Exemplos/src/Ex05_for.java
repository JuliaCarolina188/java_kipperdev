import java.util.ArrayList;

public class Ex05_for {
    public static void main() {
        for (byte i = 1; i <= 10; i++) {
            System.out.print(i + "\n");
        }

        for (byte i = 0; i <= 20; i++) {
            System.out.print("2 x " + i + " = " + (i*2) + "\n");
        }

        ArrayList<String> letras = new ArrayList<>();
        letras.add("a");
        letras.add("b");
        letras.add("c");
        letras.add("d");
        letras.add("e");

        for(byte i = 0; i <= (letras.size()-1); i++) {
            if (i < letras.size() - 1) {
                System.out.print(letras.get(i) + ", ");
            } else {
                System.out.print(letras.get(i) + ". ");
            }
        }

        for (String letra : letras){
            System.out.print(letra = " ");
        }
    }

}
