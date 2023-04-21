public class Main {

/*
Criar a classe Pessoa com as seguintes características:

• atributos: idade e dia, mês e ano de nascimento, nome da pessoa

• métodos: o calculaIdade(), que recebe a data atual em dias, mês e anos e calcula e armazena
no atributo idade a idade atual da pessoa o informaIdade(), que retorna o valor da idade, o
metodo toString(), que retorna os dados do objeto Pessoa, o ajustaDataDeNascimento(), que
recebe dia, mês e ano de nascimento como parâmetros e preenche nos atributos correspondentes
do objeto.

• Criar dois objetos da classe Pessoa, um representando Albert Einstein (nascido em 14/3/1879)
e o outro representando Isaac Newton (nascido em 4/1/1643)

• Fazer uma classe principal que instancie os objetos, inicialize e mostre quais seriam as
idades de Einstein e Newton caso estivessem vivos.

Alterar o programa do exercício para substituir o método ajustaDataDeNascimento por um construtor.
*/

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(14, 3,1879,"Albert Einstein");
        Pessoa pessoa2 = new Pessoa(4, 1,1643,"Isaac Newton");

        pessoa1.calcularIdade(21, 04, 2023);
        pessoa2.calcularIdade(21, 04, 2023);

        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());


    }


}
