package ivankovich.vinicius.models;

import ivankovich.vinicius.enums.Funcoes;
import ivankovich.vinicius.interfaces.Apresentacao;
import ivankovich.vinicius.interfaces.PostMensagem;

abstract public class Membro implements PostMensagem, Apresentacao {
    protected String email;
    protected Funcoes funcao;
    protected String usuario;



    public Membro(String usuario, String email, Funcoes funcao) {
        this.usuario = usuario;
        this.email = email;
        this.funcao = funcao;
    }


}
