

public class Ex07_casting {
    static void main() {
        double resultado = 2;
        System.out.println("Resultado double: " + resultado);
        int resultadoInt = (int)resultado;
        System.out.println("Resultado int: " + resultadoInt);

        String idade = "17";
        int idadeInt = Integer.parseInt(idade);
        System.out.println(idadeInt+1);
        String idadeStr = String.valueOf(idadeInt);
        System.out.println(idadeStr + ".");
    }
}
