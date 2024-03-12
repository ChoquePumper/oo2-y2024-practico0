package oo2.practico0.noanemico;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tiempo {
    private int dia, mes, año;
    private int hora, minuto, segundo;

    public Tiempo() throws Exception {
        LocalDateTime fecha = LocalDateTime.now();
        dia = fecha.getDayOfMonth();
        mes = fecha.getMonthValue();
        año = fecha.getYear();
        hora = fecha.getHour();
        minuto = fecha.getMinute();
        segundo = fecha.getSecond();
    }

    public Tiempo(int dia, int mes, int año, int hora, int minuto, int segundo) throws Exception {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        validarOError();
    }

    private static LocalDateTime stCrearLocalDateTime(int dia, int mes, int año, int hora, int minuto, int segundo) {
        return LocalDateTime.of(año, mes, dia, hora, minuto, segundo);
    }

    private LocalDateTime crearLocalDateTime() {
        return Tiempo.stCrearLocalDateTime(dia, mes, año, hora, minuto, segundo);
    }

    private void validarOError() throws Exception {
        try {
            crearLocalDateTime();
        } catch (DateTimeException e) {
            throw new Exception("Error al validar fecha " + formatoCorto() + ": " + e.getMessage());
        }
    }

    public String formatoLargo() {
        return crearLocalDateTime().format(DateTimeFormatter.ofPattern("EEEE, d 'de' MMMM 'de' uuuu, HH:mm:ss"));
    }

    public String formatoCorto() {
        // return crearLocalDate().format( DateTimeFormatter.ofPattern("dd/MM/uuuu") );
        return String.format("%02d/%02d/%04d %02d:%02d", dia, mes, año, hora, minuto);
    }
}
