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

        //Teste da classe administradora

        Administrador administrador = new Administrador("Leonardo", "Lugar nenhum",
                "61 99992474", 34, 8640.34, 0.6, 980.5);
        System.out.println(administrador.calcularSalario());

        //Teste da classe operario

        Operario operario = new Operario("Leonardo", "Lugar nenhum",
                "61 99992474", 34, 8640.34, 0.2, 98.8, 0.23);
        System.out.println(operario.calcularSalario());

        //Teste da classe Vendedor

        Vendedor vendedor = new Vendedor("Leonardo", "Lugar nenhum",
                "61 99992474", 34, 8640.34, 0.2, 9867.4, 0.8);
        System.out.println(vendedor.calcularSalario());
    }
}
