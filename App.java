import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        try (Scanner ler = new Scanner(System.in)) {

            String name = "Daniel";
            int age = 19;
            double salário = 18.000;

            String name2 = "abroba";
            int age2 = 19;
            double salary2 = 40.000;

            String Computer = "GamerDesk";
            String Computer2 = "Meoovo";

            double price = 10.000;
            double price2 = 7.000;

            String processamento;

            System.out.print("Qual dos clientes desejam um computador? ");
            processamento = ler.next();

            if (processamento.equals(name)) {
                System.out.printf("NAME: %s%nAGE: %d%nSALARY: %.3f%n", name, age, salário);
                System.out.printf("COMPUTER HIS: %s%nPRICE: %.3f%n", Computer, price);

            } else if (processamento.equals(name2)) {
                System.out.printf("NAME: %s%nAGE: %d%nSALARY: %.3f%n", name2, age2, salary2);
                System.out.printf("COMPUTER HIS: %s%nPRICE: %.3f", Computer2, price2);

            } else System.out.print("Erro!");

            boolean isDezMaiorQueVinte = 10 > 20;
            System.out.println(isDezMaiorQueVinte);
        }
    }
}
