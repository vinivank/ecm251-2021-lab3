package ivankovich.vinicius;

public class basico2 {
    //estruturas de decisão
    public static void main(String[] args) {
        int ano=2021;

        //estrutura de decisão simples
//        if(ano%2==0){
//            System.out.println("é par");
//        }
//        if(ano%2==1){
//            System.out.println("é impar");
//        }
        //estrutura d decisão composta
//        if(ano%2==0){
//            System.out.println("é par");
//        }else{
//            System.out.println("é impar");
//        }
        //várias decisões
        switch (ano){
            case 2020:
                System.out.println("Vixi!");
                break;
            case 1996:
                System.out.println("Pokemon Red!!");
                break;
            default:
                System.out.println("Quase Boku no Hero saindo!");
                break;
        }


    }
}
