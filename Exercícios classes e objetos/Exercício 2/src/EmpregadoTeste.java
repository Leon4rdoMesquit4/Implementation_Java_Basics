
public class EmpregadoTeste {
    /*
    Crie uma classe em Java chamada Empregado que inclui três partes de informações como variáveis de
    instância – nome (String), sobrenome (String) e um salário mensal (double). A classe deve ter um
    construtor, métodos get e set para cada variável de instância. Escreva um aplicativo de teste chamado
    EmpregadoTeste que cria dois objetos Empregado e exibe o salário anual de cada objeto. Então dê a cada
     Empregado um aumento de 10% e exiba novamente o salário anual de cada Empregado.
     */
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Leonardo", " Mesquita Alves", 5467.43);
        Empregado empregado2 = new Empregado("Maria Clara", "Martins da Silva", 1354.05);

        System.out.println(empregado1.getSalarioMensal());
        System.out.println(empregado2.getSalarioMensal());
        empregado1.aumentoDezPorcento();
        empregado2.aumentoDezPorcento();
        System.out.println(empregado1.getSalarioMensal());
        System.out.println(empregado2.getSalarioMensal());
    }


}
