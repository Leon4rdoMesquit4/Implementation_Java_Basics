package HiallyTarefa;

import java.util.Objects;
import java.util.Scanner;

public class tarefa3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sexo ;
        String corOlho ;
        String corCabelo;
        int idade;
        float salario;

        float totalPessoas = 0, mulheresQueEntramNaCondicao = 0;

        while (true){
            sexo = "";
            corOlho = "";
            corCabelo = "";
            idade = -2;
            salario = -1;
            System.out.println("Cadastro nova Pessoa: ");
            System.out.println("Escreva o seu sexo(digite f ou m): ");
            while (!Objects.equals(sexo, "f") && !Objects.equals(sexo, "m")){
                sexo = sc.next();
            }

            System.out.println("Escreva a cor dos seus olhos(digite a, v, c ou p): ");
            while (!Objects.equals(corOlho, "a") && !Objects.equals(corOlho, "v")
                && !Objects.equals(corOlho, "c") && !Objects.equals(corOlho, "p")){
                corOlho = sc.next();
            }

            System.out.println("Escreva a cor dos seu cabelo(digite l, c, r ou p): ");
            while (!Objects.equals(corCabelo, "l") && !Objects.equals(corCabelo, "c")
            && !Objects.equals(corCabelo, "r") && !Objects.equals(corCabelo, "p")){
                corCabelo = sc.next();
            }

            System.out.println("Escreva a sua idade (-1 para o programa): ");
            while (idade < 10 || idade >100){
                idade = sc.nextInt();
                if (idade == -1){
                    break;
                }
            }

            if (idade == -1){
                break;
            }

            System.out.println("Escreva o seu salário: ");
            while (salario < 0){
                salario = sc.nextFloat();
            }


            if (Objects.equals(sexo, "f") && (idade >= 18) && (idade <= 35) &&
                    (Objects.equals(corCabelo, "c")) && (Objects.equals(corOlho, "c"))){
                mulheresQueEntramNaCondicao++;
            }
            totalPessoas++;

            System.out.println("\n");
        }

        System.out.println("A porcentagem de mulheres que entram nesse condição é de " +
                ((mulheresQueEntramNaCondicao/totalPessoas)*100) + "%");


    }

}
