package desafiodecodigo03.bancodigital.dominio;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(String agencia, String numeroConta) {
        super(agencia, numeroConta);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.printf("Novo saldo R$ %.2f %n", saldo);
    }

    @Override
    public void transferir(double valor, Conta destino) {
        if (valor <= saldo) {
            sacar(valor);
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para transferência! ");
        }
    }

    @Override
    public String getAgencia() {
        return super.getAgencia();
    }

    @Override
    public String getNumeroConta() {
        return super.getNumeroConta();
    }

    @Override
    public double getSaldo() {
        return super.getSaldo();
    }

}
