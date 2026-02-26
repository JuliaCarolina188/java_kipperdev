public class Ex02_condicionais {
    public static void main() {
        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 10000000;
        float f = 10.5f;
        double d = 20.5;
        char c = 'a';
        String str = "julia";
        boolean bool = false;

        if (bool) {
            System.out.print("bool = verdadeiro");
        } else {
            System.out.println("bool = falso");
        }

        if (i < 0) {
            System.out.println("int negativo");
        } else if (i > 0 && i < 100) {
            System.out.println("int positivo e menor que 100");
        } else {
            System.out.println("int positivo maior que 100");
        }

        if (str == "aaaaa" || str.equals("julia")) {
            System.out.println("AAAAAA");
        } else {
            System.out.println("a.");
        }
        if (str.isBlank()) {
            System.out.println("A variável str está nula");
        }
    }
}
