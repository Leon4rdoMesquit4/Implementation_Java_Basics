public class Pessoa {
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

    int idade;
    int dia;
    int mes;
    int ano;
    String nome;

    public Pessoa(int dia, int mes, int ano, String nome) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.nome = nome;
    }

//    void ajustarDataNascimento(int dia, int mes, int ano){
//        this.dia = dia;
//        this.mes = mes;
//        this.ano = ano;
//    }

    void calcularIdade(int diaA, int mesA, int anoA){
        if (mes > mesA){
            idade = anoA - ano - 1;
        } else if (mes == mesA) {
            if (dia > diaA){
                idade = anoA - ano - 1;
            } else{
                idade = anoA - ano;
            }
        } else {
            idade = anoA - ano;
        }
    }

    int informaIdade(){
        return idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                ", idade: " + idade +
                "\nData de nascimento: " + dia +
                "/" + mes + "/" + ano + "\n";
    }
}
