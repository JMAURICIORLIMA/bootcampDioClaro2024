package desafiodecodigo03.bancodigital.dominio;

public abstract class Conta {

    private String agencia;
    private String numeroConta;
    protected double saldo;

    public Conta(String agencia, String numeroConta) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public abstract void sacar(double valor);
    public abstract void depositar(double valor);
    public abstract void transferir(double valor, Conta destino);

    public String getAgencia() {
        return agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}

