package ivankovich.vinicius.models;


import ivankovich.vinicius.enums.Funcoes;
import ivankovich.vinicius.enums.Horario;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {

    static Horario atual= Horario.Normal;

    int j = 0; // Variavel auxiliar da removerMembro ( case 2 )

    int k = 0; //Variavel usada no exibir membros  ( case 4 )

    int indiceRemocao;

    ArrayList<Membro> dadosMembros = new ArrayList<>();
    private boolean exec = true;

    private final Scanner acao = new Scanner(System.in);
    private final Scanner usuarios = new Scanner(System.in);
    private final Scanner emails = new Scanner(System.in);
    private final Scanner funcoes = new Scanner(System.in);
    private final Scanner id = new Scanner(System.in);


    public void Executar(){

        int opcao;
        while (exec){
            Menu();
            opcao = acao.nextInt();
            avaliarOpcao(opcao);
        }




    }


    private void Menu() {
        System.out.println("Boas vindas á MAsK_S0c13ty\n\n");
        System.out.println("Horario atual é :  "+atual+"\n");
        System.out.println("Escolha a ação desejada: ");
        System.out.println("[ 1 ] Cadastrar membro");
        System.out.println("[ 2 ] Remover membro");
        System.out.println("[ 3 ] Trocar horario");
        System.out.println("[ 4 ] Exibir todos os membros");
        System.out.println("[ 5 ] Postar mensagem");
        System.out.println("[ 6 ] Sair \n");
    }




    private void avaliarOpcao(int opcao) {
        switch (opcao){

            case 1:
                System.out.println("Digite o usuario: ");
                String usuario = usuarios.next();
                System.out.println("Digite o email : ");
                String email = emails.next();
                System.out.println("Escolha a função:\n [ 1 ] MobileMember\n [ 2 ] HeavyLifter\n [ 3 ] ScriptGuys\n [ 4 ] BigBrothers ");
                int funcao = funcoes.nextInt();
                if(funcao < 1 || funcao > 4) {
                    System.out.println("Número invalido");
                    break;
                }
                if (funcao == 1)
                    dadosMembros.add(new Mobile_Members(usuario,email, Funcoes.Mobile_Members));

                if (funcao == 2)
                    dadosMembros.add(new HeavyLifters(usuario,email,Funcoes.Heavy_Lifters));

                if (funcao == 3)
                    dadosMembros.add(new ScriptGuys(usuario,email,Funcoes.Script_Guys));

                if (funcao == 4)
                    dadosMembros.add(new BigBrother(usuario,email,Funcoes.Big_Brother));

                System.out.println("Adição de membro concluida\n");

                break;

            case 2:

                for(Membro i: dadosMembros){
                    System.out.println(j+"º: "+i.toString());
                    dadosMembros.get(j).apresentar();
                    j++;
                }
                j = 0;
                System.out.println("Selecione o id de quem deseja remover ");
                indiceRemocao = id.nextInt();
                dadosMembros.remove(indiceRemocao);
                break;


            case 3:
                if(atual == Horario.Normal){
                    atual = Horario.Extra;
                    System.out.println("O horario agora é : "+atual);

                }else if (atual == Horario.Extra){
                    atual = Horario.Normal;
                    System.out.println("O horario agora é : "+atual);
                }

                break;
            case 4:
                for(Membro i: dadosMembros){
                    i.apresentar();
                    k++;
                }
                k = 0;

                break;

            case 5:

                for(Membro i: dadosMembros){
                    System.out.println(j+"º: "+i.toString());
                    if(atual == Horario.Normal)i.mNormal();
                    else i.mExtra();
                    j++;
                }
                j = 0;

                break;

            case 6:
                System.out.println("Sistema Desligando");
                this.exec=false;
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }
    }




}
