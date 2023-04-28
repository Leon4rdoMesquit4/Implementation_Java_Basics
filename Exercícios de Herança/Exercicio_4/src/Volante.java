public class Volante extends Jogador{
    public Volante(String nome, int numeroCamisa, String clube, int numGol) {
        super(nome, numeroCamisa, clube, numGol);
    }

    public void protegerABola(){
        System.out.println("Jogador protege a bola");
    }

    @Override
    public String toString() {
        return "Volante{" +
                "nome='" + nome + '\'' +
                ", numeroCamisa=" + numeroCamisa +
                ", clube='" + clube + '\'' +
                ", numGol=" + numGol +
                '}';
    }
}
