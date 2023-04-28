public class PrimeiroVolante extends Volante {

    public PrimeiroVolante(String nome, int numeroCamisa, String clube, int numGol) {
        super(nome, numeroCamisa, clube, numGol);
    }

    public void voltarParaDefesa(){
        System.out.println("Retornando para a defesa!");
    }

    @Override
    public String toString() {
        return "PrimeiroVolante{" +
                "nome='" + nome + '\'' +
                ", numeroCamisa=" + numeroCamisa +
                ", clube='" + clube + '\'' +
                ", numGol=" + numGol +
                '}';
    }
}
