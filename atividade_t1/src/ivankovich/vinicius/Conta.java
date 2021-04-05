package ivankovich.vinicius;

public class Conta {
    public int id;
    private double saldo;
    private Cliente cliente;



    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
//        this.saldo = this.saldo + valor;
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferirPara(double valor, Conta destino) {
        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }


}