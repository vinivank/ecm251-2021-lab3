package ivankovich.vinicius;

public class Conta {
    int numero;
    double saldo;
    Cliente cliente;



    void visualizarsaldo(){
        double saldo=this.saldo;

        System.out.println("Saldo da conta: R$"+this.saldo);

    }
    void depositar(double valor){
       // this.saldo=this.saldo+valor;
        this.saldo+=valor;

    }
    boolean sacar(double valor){
        if(this.saldo>=valor){
        this.saldo-=valor;
            System.out.println("transação aceita");
        return true;

        }
        System.out.println("Saldo insuficiente");
        return false;





    }
    boolean transferirpara(double valor,Conta destino){
        if(this.sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;


    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente.toString() +
                '}';
    }
}
