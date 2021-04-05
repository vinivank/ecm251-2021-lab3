
//Vinicius Savrutsky Ivankovich     RA:19.01014-0
//Mateus Silva Souza                RA:19.01309-4



package ivankovich.vinicius;

public class Conta {
    public int id;
    public double saldo;
    public Cliente cliente=new Cliente();






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