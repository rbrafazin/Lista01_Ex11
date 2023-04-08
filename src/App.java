import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n1 = sc.nextInt();
        System.out.print("Digite outro número inteiro: ");
        int n2 = sc.nextInt();
        System.out.print("Digite um número real: ");
        double n3 = sc.nextDouble();
        int r1 = (2 * n1) * (n2 / 2);
        double r2 = (3 * n1) + n3;
        double r3 = Math.pow(n3, 3);

        System.out.println("O produto do dobro do primeiro com metade do segundo é " + r1);
        System.out.println("A soma do triplo do primeiro com o terceiro é " + r2);
        System.out.println("O terceiro elevado ao cubo é " + r3);

        sc.close();

    }

}
