package HiallyTarefa;

import java.util.Scanner;

public class tarefa2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caloriasTotal = 0;

        System.out.println("PRATOS" +
                "\n1 - Vegetariano" +
                "\n2 - Peixe" +
                "\n3 - Frango" +
                "\n4 - Carne" +
                "\nSelecione qual tipo de prato deseja:");
        int prato = sc.nextInt();

        if (prato == 1){
            caloriasTotal += 180;
        } else if (prato == 2) {
            caloriasTotal += 230;
        } else if (prato == 3) {
            caloriasTotal += 250;
        } else if (prato == 4) {
            caloriasTotal += 350;
        }

        System.out.println("SOBREMESA" +
                "\n1 - Abacaxi" +
                "\n2 - Sorvete Diet" +
                "\n3 - Mouse Diet" +
                "\n4 - Mouse Chocolate" +
                "\nSelecione qual tipo de prato deseja:");
        int sobremesa = sc.nextInt();

        if (sobremesa == 1){
            caloriasTotal += 75;
        } else if (sobremesa == 2) {
            caloriasTotal += 110;
        } else if (sobremesa == 3) {
            caloriasTotal += 170;
        } else if (sobremesa == 4) {
            caloriasTotal += 200;
        }

        System.out.println("BEBIDA" +
                "\n1 - Chá" +
                "\n2 - Suco de Laranja" +
                "\n3 - Suco de Melão" +
                "\n4 - Refrigerante Diet" +
                "\nSelecione qual tipo de prato deseja:");
        int bebida = sc.nextInt();

        if (bebida == 1){
            caloriasTotal += 20;
        } else if (bebida == 2) {
            caloriasTotal += 70;
        } else if (bebida == 3) {
            caloriasTotal += 100;
        } else if (bebida == 4) {
            caloriasTotal += 65;
        }

        System.out.println("A quantidade de calorias totais foi de " + caloriasTotal);

        //Exercicio finalizado
    }

}
