package ivankovich.vinicius;

import java.util.Random;

public class basico03 {
    public static void main(String[] args) {
        //estruturas de repetição
        int limite=10;
        int cont;

        for(cont=0;cont<limite;cont++){
            System.out.println("contagem:"+cont);
        }
        //quebrador de senha ruim
        int senha=123456;
        //gerador de chutes
        Random gerador=new Random();
        int chute=gerador.nextInt(999999);
        int tent=0;
        while(chute != senha){
            System.out.println("Tentativa:" + tent);
            System.out.println("Chute:" + chute);
            tent++;
            chute = gerador.nextInt(999999);
        }
        System.out.println("senha:"+chute);
        System.out.println("Você quebrou a senha!");

    }
}
