package ivankovich.vinicius;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Conta c1=new Conta(),c2=new Conta(),c3=new Conta() ;
        c1.id=0;
        c2.id=1;
        c3.id=2;
        transacoes t=new transacoes();
        System.out.println("digite o primeiro usuario");
        Scanner u1=new Scanner(System.in);

        c1.cliente.usuario= u1.nextLine();
        System.out.println("digite o segundo usuario");
        c2.cliente.usuario= u1.nextLine();
        System.out.println("digite o terceiro usuario");
        c3.cliente.usuario= u1.nextLine() ;
        c1.saldo=1000;
        c2.saldo=250;
        c3.saldo=3000;


        System.out.println("Estado inicial");
        System.out.println("saldo de "+c1.cliente.usuario+":  ");
        System.out.println(c1.saldo);
        System.out.println("saldo de "+c2.cliente.usuario+":  ");
        System.out.println(c2.saldo);
        System.out.println("saldo de "+c3.cliente.usuario+":  ");
        System.out.println(c3.saldo);





        String qr1= t.gerartran(250,c1,c1.cliente);
        t.pagar(qr1,c2,c1);
        t.pagar(qr1,c3,c1);
        t.pagar(qr1,c2,c1);
        String qr2= t.gerartran(1000,c2,c2.cliente);
        t.pagar(qr2,c3,c2);


        System.out.println("Estado final");
        System.out.println("saldo de "+c1.cliente.usuario+":  ");
        System.out.println(c1.saldo);
        System.out.println("saldo de "+c2.cliente.usuario+":  ");
        System.out.println(c2.saldo);
        System.out.println("saldo de "+c3.cliente.usuario+":  ");
        System.out.println(c3.saldo);













    }
}
