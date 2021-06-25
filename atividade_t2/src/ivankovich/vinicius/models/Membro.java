package ivankovich.vinicius.models;

import ivankovich.vinicius.interfaces.PostMensagem;

abstract public class Membro implements PostMensagem {
    protected String email;
    protected int funcao;
    protected String usuario;



    public Membro(String usuario, String email,int funcao) {
        this.usuario = usuario;
        this.email = email;
        this.funcao = funcao;
    }


}
