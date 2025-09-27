import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digit o valor do pão: ");
        double pao = scanner.nextDouble();

        System.out.print("Digite o valor do queijo: ");
        double queijo = scanner.nextDouble();

        System.out.print("Digite o valor da maçã: ");
        double maca = scanner.nextDouble();

        System.out.print("Digite o valor do desconto: ");
        double desconto = scanner.nextDouble();

        System.out.print("Digite o número de dias do mês: ");
        int totalDiasDoMes = scanner.nextInt();

        double valorTotal = pao + queijo + maca;
        double valorTotalComDesconto = valorTotal - desconto;
        double valorTotalDividido = valorTotalComDesconto / 2;
        double valorTotalMensal = valorTotalComDesconto * totalDiasDoMes;

        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("\nResumo da compra:");
        System.out.println("Valor da compra: R$" + df.format(valorTotal));
        System.out.println("Com desconto: R$" + df.format(valorTotalComDesconto));
        System.out.println("Dividido entre 2: R$" + df.format(valorTotalDividido));
        System.out.println("Mensal: R$" + df.format(valorTotalMensal));

        scanner.close();
    }
}
