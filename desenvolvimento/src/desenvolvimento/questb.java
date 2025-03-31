package desenvolvimento;

import java.time.LocalDate;
import java.time.Period;

public class questb {
    public static void main(String[] args) {
        contaTempo(1, 4, 2026);
    }

    public static void contaTempo(int dia, int mes, int ano) {
        LocalDate dataFutura = LocalDate.of(ano, mes, dia);
        LocalDate dataAtual = LocalDate.now();

        if (dataFutura.isBefore(dataAtual)) {
            System.out.println("A data informada já passou.");
            return;
        }

        Period periodo = Period.between(dataAtual, dataFutura);

        System.out.printf("Faltam %d ano(s), %d mes(es) e %d dia(s) para essa data em %d.%n",
                periodo.getYears(), periodo.getMonths(), periodo.getDays(), ano);
    }
}