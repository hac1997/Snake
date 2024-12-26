
import java.util.Scanner;

class Teste {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite algo");
        String aa = leitor.nextLine();
        System.err.println("Voce digitou " + aa);
    }
}
