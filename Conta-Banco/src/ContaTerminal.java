public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private Double saldo;

    public ContaTerminal(int numero, String agencia, String nomeCliente, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agencia é %s, conta %s, e seu saldo %s já esta disponível para saldo.", this.nomeCliente, this.agencia, this.numero, this.saldo);
    }
    
}
