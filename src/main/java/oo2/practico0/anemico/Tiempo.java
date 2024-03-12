package oo2.practico0.anemico;

import java.time.LocalDateTime;

public class Tiempo {
    private int dia, mes, año;
    private int hora, minuto, segundo;

    public Tiempo() {
        LocalDateTime fecha = LocalDateTime.now();
        dia = fecha.getDayOfMonth();
        mes = fecha.getMonthValue();
        año = fecha.getYear();
        hora = fecha.getHour();
        minuto = fecha.getMinute();
        segundo = fecha.getSecond();
    }

    public Tiempo(int dia, int mes, int año, int hora, int minuto, int segundo) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }
}
