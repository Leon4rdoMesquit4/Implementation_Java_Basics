package HiallyTarefa;

import java.util.Scanner;

public class tarefa1 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double salarioFinal;

            System.out.println("Digite a seguir o número de carros vendidos: ");
            int numCarros = sc.nextInt();

            System.out.println("Digite o valor total das vendas: ");
            double vendasTotais = sc.nextDouble();

            System.out.println("Digite a seguir o valor do salário fixo: ");
            double salarioFixo = sc.nextDouble();

            System.out.println("Digite o valor recebido por carro vendido: ");
            double valorPorCarro = sc.nextDouble();

            salarioFinal = salarioFixo + (0.05 * vendasTotais) + (numCarros* valorPorCarro);

            System.out.println("O valor final recebido pelo vendedor foi R$" + salarioFinal);

            sc.close();
            //Exercício finalizado!
        }
}
