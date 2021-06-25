package ivankovich.vinicius.models;

import ivankovich.vinicius.enums.Funcoes;

public class HeavyLifters extends Membro {

    public HeavyLifters(String usuario, String email, Funcoes funcao ) {
        super(usuario, email, funcao);
    }

    @Override
    public void mNormal() {
        System.out.println("Podem contar conosco!");
    }


    @Override
    public void mExtra() {
        System.out.println("N00b_qu3_n_Se_r3pita.bat");
    }



}
