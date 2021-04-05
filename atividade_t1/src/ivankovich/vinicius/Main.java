package ivankovich.vinicius;



public class Main {

    public static void main(String[] args) {
        Conta c1=new Conta() ,c2=new Conta(),c3=new Conta() ;
        transacoes t=new transacoes();
        c1.cliente.usuario= "microsoft";
        c2.cliente.usuario= "samsung";
        c3.cliente.usuario= "apple" ;
        c1.saldo=1000;
        c2.saldo=250;
        c3.saldo=3000;


        System.out.println("saldos antes");
        System.out.println(c1.saldo);
        System.out.println(c2.saldo);
        System.out.println(c3.saldo);





        String qr1= t.gerartran(250,c1,c1.cliente);
        t.pagar(qr1,c2,c1);
        t.pagar(qr1,c3,c1);
        t.pagar(qr1,c2,c1);
        String qr2= t.gerartran(1000,c2,c2.cliente);
        t.pagar(qr2,c3,c2);


        System.out.println("saldos depois");
        System.out.println(c1.saldo);
        System.out.println(c2.saldo);
        System.out.println(c3.saldo);













    }
}
