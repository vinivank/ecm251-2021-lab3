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
        pagador.transferirPara(Double.parseDouble(dados[2]),recebedor);


    }


    private static int getRandomNumberInRange ( int min , int max ) {
        Random r = new Random ();
        return r . nextInt (( max - min ) + 1 ) + min ;
    }

}
