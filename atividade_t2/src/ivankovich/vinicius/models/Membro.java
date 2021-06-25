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
    @Override
    public String toString() {
        return "{" +
                "usuario ='" + usuario + '\'' +
                ", email ='" + email + '\'' +
                ", cargo =" + funcao +
                '}';
    }


    public String get_email() { return email; }
    public Funcoes get_funcao() { return funcao; }
    public String get_usuario() { return usuario; }

    @Override
    public void apresentar() {
        System.out.println("Meu usuario é :"+get_usuario()+", meu e-mail é "+get_email()+" e tenho o cargo de:"+get_funcao());
    }



    

}
