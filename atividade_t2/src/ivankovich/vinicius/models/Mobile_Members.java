package ivankovich.vinicius.models;

import ivankovich.vinicius.enums.Funcoes;

public class Mobile_Members extends Membro{



    public Mobile_Members(String usuario, String email, Funcoes funcao ) {
        super(usuario, email, funcao);
    }


    @Override
    public void mNormal() {
        System.out.println("Happy Coding!");
    }



    @Override
    public void mExtra() {
        System.out.println("Happy_C0d1ng. Maskers");
    }



}
