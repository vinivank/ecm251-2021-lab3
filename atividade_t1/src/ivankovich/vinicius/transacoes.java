package ivankovich.vinicius;

import java.util.Random;

public class transacoes {
    public Conta conta;
    public Cliente cliente;



    public String gerartran(float qua ){
        int tid=getRandomNumberInRange(1000,9999);
        String qr;
        qr=conta.id+";"+cliente.usuario+";"+qua+";"+tid  ;
        return qr;





    }

    public void pagar(String qr, Conta destino){
        String[] dados = qr.split( ";" ) ;
        conta.transferirPara(Double.parseDouble(dados[2]),destino);


    }


    private static int getRandomNumberInRange ( int min , int max ) {
        Random r = new Random ();
        return r . nextInt (( max - min ) + 1 ) + min ;
    }

}
