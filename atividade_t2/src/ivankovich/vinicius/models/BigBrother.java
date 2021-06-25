package ivankovich.vinicius.models;

import ivankovich.vinicius.enums.Funcoes;

public class BigBrother extends Membro{

    public BigBrother(String usuario, String email, Funcoes funcao ) {
        super(usuario, email, funcao);
    }


    @Override
    public void mNormal() {
        System.out.println("Sempre ajudando as pessoas membros ou não S2!");
    }



    @Override
    public void mExtra() {
        System.out.println(". . .");
    }



}
