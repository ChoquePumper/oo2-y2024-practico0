package oo2.practico0.anemico;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        Tiempo tiempo = new Tiempo();
        validarTiempo(tiempo.getDia(), tiempo.getMes(), tiempo.getAño(), tiempo.getHora(), tiempo.getMinuto(),
                tiempo.getSegundo());
        imprimirTiempo(tiempo.getDia(), tiempo.getMes(), tiempo.getAño(), tiempo.getHora(), tiempo.getMinuto(),
                tiempo.getSegundo());

        TiempoRecord tiempo_record = new TiempoRecord(23, 05, 2023, 15, 25, 17);
        validarTiempo(tiempo_record.dia(), tiempo_record.mes(), tiempo_record.año(), tiempo_record.hora(),
                tiempo_record.minuto(), tiempo_record.segundo());
        imprimirTiempo(tiempo_record.dia(), tiempo_record.mes(), tiempo_record.año(), tiempo_record.hora(),
                tiempo_record.minuto(), tiempo_record.segundo());
    }

    public static void validarTiempo(int dia, int mes, int año, int hora, int minuto, int segundo) throws Exception {
        try {
            LocalDateTime.of(año, mes, dia, hora, minuto, segundo);
        } catch (DateTimeException e) {
            throw new Exception(
                    "Tiempo no válido " + fechaCorta(dia, mes, año, hora, minuto, segundo) + ": " + e.getMessage());
        }
    }

    public static void imprimirTiempo(int dia, int mes, int año, int hora, int minuto, int segundo) {
        System.out.println(fechaLarga(dia, mes, año, hora, minuto, segundo));
        System.out.println(fechaCorta(dia, mes, año, hora, minuto, segundo));
    }

    public static String fechaLarga(int dia, int mes, int año, int hora, int minuto, int segundo) {
        LocalDateTime fecha = LocalDateTime.of(año, mes, dia, hora, minuto, segundo);
        String res = fecha.format(DateTimeFormatter.ofPattern("EEEE, d 'de' MMMM 'de' uuuu, HH:mm:ss"));
        return res;
    }

    public static String fechaCorta(int dia, int mes, int año, int hora, int minuto, int segundo) {
        return String.format("%02d/%02d/%04d %02d:%02d", dia, mes, año, hora, minuto);
    }
}
