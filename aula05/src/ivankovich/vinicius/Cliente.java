package ivankovich.vinicius;

public class Cliente {
    private String titular;
    private String cpf;

    public Cliente(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "titular='" + titular + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}