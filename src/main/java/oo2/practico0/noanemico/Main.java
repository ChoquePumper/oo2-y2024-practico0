package oo2.practico0.noanemico;

public class Main {
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        Tiempo tiempo = new Tiempo();
        System.out.println(tiempo.formatoLargo());
        System.out.println(tiempo.formatoCorto());
        Tiempo otrotiempo = new Tiempo(23, 05, 2023, 15, 25, 17);
        System.out.println(otrotiempo.formatoLargo());
        System.out.println(otrotiempo.formatoCorto());
    }
}
