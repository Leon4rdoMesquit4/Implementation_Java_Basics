public class Main {
    public static void main(String[] args) {
        //Teste da classe fornecedor
        Fornecedor fornecedor = new Fornecedor(1203.23, 30495.23,
                "Leonardo", "fkdjkfsdf ", "57817819678");

        System.out.println(fornecedor.getNome());
        System.out.println(fornecedor.getEndereco());
        System.out.println(fornecedor.getValorCredito());
        System.out.println(fornecedor.getValorDivida());
        System.out.println(fornecedor.obterSaldo());
        System.out.println(fornecedor.toString());

        //Teste da classe empregado

        Empregado empregado = new Empregado("Leonardo", "gcghf yuuffjf jff tff"
                , "6198775464", 52, 5879.90, 0.33);
        System.out.println(empregado.toString());
    }
}
