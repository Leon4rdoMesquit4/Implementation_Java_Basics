public class Dvd {
    /*
4.Crie classes para uma loja que venda livros, CDs e DVDs. Crie um método que imprima:

• Para livros: nome, preço e autor;

• Para CDs: nome, preço e número de faixas;

• Para DVDs: nome, preço e duração.

Crie uma classe Loja com o método main() que adicione 5 produtos diferentes (a sua escolha).
*/

    String nome;
    int duracao;
    double preco;

    public Dvd(String nome, int duracao, double preco) {
        this.nome = nome;
        this.duracao = duracao;
        this.preco = preco;
    }
}
