package ivankovich.vinicius.models;


import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {

    ArrayList<Membro> dadosMembros = new ArrayList<>();
    private boolean exec = true;

    Scanner acao = new Scanner(System.in);
    Scanner usuarios = new Scanner(System.in);
    Scanner emails = new Scanner(System.in);
    Scanner funcaos = new Scanner(System.in);


    public void Executar(){

        int opcao;
        while (exec){
            Menu();
            opcao = acao.nextInt();
            avaliarOpcao(opcao);
        }




    }


    private void Menu() {
        System.out.println("Boas vindas á MAsK_S0c13ty");
        System.out.println("Escolha a ação desejada: ");
        System.out.println("[ 1 ] Cadastrar membro");
        System.out.println("[ 2 ] Remover membro");
        System.out.println("[ 3 ] Exibir horário");
        System.out.println("[ 4 ] Sair \n");
    }




    private void avaliarOpcao(int opcao) {
        switch (opcao){
            case 0:
                System.out.println("Até Logo!");
                this.exec = false;
                break;
            case 1:
                System.out.println("Digite o usuario: ");
                String usuario = usuarios.next();
                System.out.println("Digite o email : ");
                String email = emails.next();
                System.out.println("Escolha a função:\n [ 1 ] MobileMember\n [ 2 ] HeavyLifter\n [ 3 ] ScriptGuys\n [ 4 ] BigBrothers ");
                int funcao = funcaos.nextInt();

                break;
            case 2:



                break;
            case 3:



                break;
            case 4:
                exec=false;
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }
    }




}
