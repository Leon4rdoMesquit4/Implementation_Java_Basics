package polimorfismo2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Carro> carro = new ArrayList<>();
        ArrayList<Moto> moto = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean i = true;
        double precoTotalSemAjuste = 0;
        double precoTotalComAjuste = 0;

        while(i){
            int pop = 0;
            System.out.println("Definir os dados:");
            System.out.println("Moto(1) ou carro(2)?");
            pop = sc.nextInt();
            if (pop == 1){
                String modelo;
                int ano;
                double preco;
                sc.nextLine();
                System.out.println("Digite o modelo: ");
                modelo = sc.nextLine();
                System.out.println("Digite a ano: ");
                ano = sc.nextInt();
                System.out.println("Digite o preco: ");
                preco = sc.nextDouble();
                precoTotalSemAjuste += preco;
                moto.add(0, new Moto(ano,modelo,preco));
            } else if (pop == 2){
                String modelo;
                double km;
                double preco;
                sc.nextLine();
                System.out.println("Digite o modelo: ");
                modelo = sc.nextLine();
                System.out.println("Digite a KM: ");
                km = sc.nextDouble();
                System.out.println("Digite o preco: ");
                preco = sc.nextDouble();
                precoTotalSemAjuste += preco;
                carro.add(0, new Carro(km,modelo,preco));
            } else{
                break;
            }
        }

        for(int j = 0; j < carro.size(); j++){
            System.out.println("Carro " + (j+1) + ":");
            carro.get(j).printDados();
            precoTotalComAjuste += carro.get(j).getPreco();
        }

        for(int j = 0; j < moto.size(); j++){
            System.out.println("Moto " + (j+1) + ":");
            moto.get(j).printDados();
            precoTotalComAjuste += moto.get(j).getPreco();
        }

        System.out.println("Preço total sem ajuste: \n" + precoTotalSemAjuste);
        System.out.println("Preço total com ajuste: \n" + precoTotalComAjuste);


    }
    
}
