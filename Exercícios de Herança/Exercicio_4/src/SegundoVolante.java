public class SegundoVolante extends Volante{
    public SegundoVolante(String nome, int numeroCamisa, String clube, int numGol) {
        super(nome, numeroCamisa, clube, numGol);
    }

    public void subirProAtaque(){
        System.out.println("Subindo pro ataque");
    }

    @Override
    public String toString() {
        return "SegundoVolante{" +
                "nome='" + nome + '\'' +
                ", numeroCamisa=" + numeroCamisa +
                ", clube='" + clube + '\'' +
                ", numGol=" + numGol +
                '}';
    }
}
