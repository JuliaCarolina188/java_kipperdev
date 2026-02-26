import java.util.ArrayList;

public class Ex04_arraylists {
    public static void main() {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Julia");
        System.out.println("Lista: " + nomes + " (tamanho: " + nomes.toArray().length + ")");
        nomes.add("Marco");
        System.out.println("Lista: " + nomes);
        nomes.set(1, "Carolina");
        System.out.println("Lista: " + nomes);
        System.out.println(nomes.get(0));
        nomes.remove(0);
        System.out.println(nomes.get(0));
    }
}