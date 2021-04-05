package ivankovich.vinicius;

import java.util.Random;

public class transacoes {




    public String gerartran(float qua ,Conta c, Cliente u){
        int tid=getRandomNumberInRange(1000,9999);
        String qr;
        qr=c.id+";"+u.usuario+";"+qua+";"+tid  ;
        return qr;





    }

    public void pagar(String qr,Conta pagador, Conta recebedor){
        String[] dados = qr.split( ";" ) ;
        if ((recebedor.id == Integer.parseInt(dados[0]))&&(recebedor.cliente.usuario.equals(dados[1]))){
             if (pagador.transferirPara(Double.parseDouble(dados[2]),recebedor))
                 System.out.println("transação feita com sucesso");
             else
                 System.out.println("saldo insuficiente");
        }
        else{

            System.out.println("os dados não conferem");
        }



    }


    private static int getRandomNumberInRange ( int min , int max ) {
        Random r = new Random ();
        return r . nextInt (( max - min ) + 1 ) + min ;
    }

}
