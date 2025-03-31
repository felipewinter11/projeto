package desenvolvimento;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
import java.util.Locale;

public class quest {

    public static String getDataPorExtenso() {
        LocalDateTime agora = LocalDateTime.now();
        
        String[] diasSemana = {"domingo", "segunda-feira", "terça-feira", "quarta-feira", "quinta-feira", "sexta-feira", "sábado"};
        DayOfWeek diaSemana = agora.getDayOfWeek();
        String nomeDiaSemana = diasSemana[diaSemana.getValue() % 7];
        
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy", new Locale("pt", "BR"));
        String dataFormatada = agora.format(formatoData);
        
        int horas = agora.getHour();
        int minutos = agora.getMinute();
        
        return String.format("Hoje é %s, dia %s e agora são %d horas e %d minutos.", nomeDiaSemana, dataFormatada, horas, minutos);
    }

    public static void main(String[] args) {
        System.out.println(getDataPorExtenso());
    }
}