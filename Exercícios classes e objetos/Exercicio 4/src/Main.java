public class Main {
    /*
4.Crie classes para uma loja que venda livros, CDs e DVDs. Crie um método que imprima:

• Para livros: nome, preço e autor;

• Para CDs: nome, preço e número de faixas;

• Para DVDs: nome, preço e duração.

Crie uma classe Loja com o método main() que adicione 5 produtos diferentes (a sua escolha).
*/
    public static void main(String[] args) {
        Livro livro1 = new Livro("O segredo do secreto", "Segredo", 98.49);
        Cd cd2 = new Cd("Músicas do calado", 12, 40.59);
        Cd cd1 = new Cd("As melhores do piseiro parte 3", 60, 53.99);
        Dvd dvd1 = new Dvd("As aventuras do desaventurado", 2, 12.79);
        Livro livro2 = new Livro("O manual da escola", "Dani Alex", 33.89);
    }
}
