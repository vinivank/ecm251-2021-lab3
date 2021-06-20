package ivankovich.vinicius;
public class Main {
    public static int Func (int n){
        int x = 30; //1
        for (int i = 0; i < n; ++i) { //2
            x = x + 2 - i; //3
        }
        return x;

    }
    public static void main(String[] args) {
        int resposta = Func(10) ;
        System.out.println("resposta = " + resposta);
    }
}
