package ivankovich.vinicius;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Titulo {
    private double valor;
    private double jurosPorDia;
    private String nome;
    private LocalDate dataParaPagamento;

    public Titulo(double valor, double jurosPorDia, String nome, String dataParaPagamento) {
        this.valor = valor;
        this.jurosPorDia = jurosPorDia;
        this.nome = nome;
        this.dataParaPagamento = LocalDate.parse(dataParaPagamento);
    }

    public double getTotalPagamento(){
        if(!estaVencida()){
            return this.valor;
        } else {
            return calcularPagamentoComJuros();
        }
    }

    private double calcularPagamentoComJuros() {
        return this.valor + this.valor * this.jurosPorDia * dataParaPagamento.until(LocalDate.now(), DAYS);
    }

    private boolean estaVencida() {
        return LocalDate.now().isAfter(dataParaPagamento);
    }
}