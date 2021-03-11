package ivankovich.vinicius;

public class Conta {
    private int numero;
    private double saldo;
    private Cliente cliente;




    public void visualizarsaldo(){
        double saldo=this.saldo;

        System.out.println("Saldo da conta: R$"+this.saldo);

    }
    public void depositar(double valor){
       // this.saldo=this.saldo+valor;
        this.saldo+=valor;

    }
    public boolean sacar(double valor){
        if(this.saldo>=valor){
        this.saldo-=valor;
            System.out.println("transação aceita");
        return true;

        }
        System.out.println("Saldo insuficiente");
        return false;





    }
    public boolean transferirpara(double valor,Conta destino){
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
