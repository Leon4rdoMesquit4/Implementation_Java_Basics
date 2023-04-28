public class Main {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor(1203.23, 30495.23,
                "Leonardo", "fkdjkfsdf ", "57817819678");
        System.out.println(fornecedor.getNome());
        System.out.println(fornecedor.getEndereco());
        System.out.println(fornecedor.getValorCredito());
        System.out.println(fornecedor.getValorDivida());
        System.out.println(fornecedor.obterSaldo());
        System.out.println(fornecedor.toString());
    }
}
