package ivankovich.vinicius.models;

import ivankovich.vinicius.enums.Funcoes;

public class ScriptGuys extends Membro{

    public ScriptGuys(String usuario, String email, Funcoes funcao ) {
        super(usuario, email, funcao);
    }



    @Override
    public void mNormal() {
        System.out.println("Prazer em ajudar novos amigos de código!");
    }



    @Override
    public void mExtra() {
        System.out.println("QU3Ro_S3us_r3curs0s.py");
    }



}
