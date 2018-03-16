
package apprelojdespertador;

import javax.swing.JOptionPane;

/**
 * Atributos, Getters, Setters, Método que pide la hora.
 * @author David
 */
public class Alarma {
    static int horas;
    static int minutos;
    static int segundos;
    static String hmsS=horas+":"+minutos+":"+segundos;

    public Alarma() {
    }

    public static int getHoras() {
        return horas;
    }

    public static void setHoras(int horas) {
        Alarma.horas = horas;
    }

    public static int getMinutos() {
        return minutos;
    }

    public static void setMinutos(int minutos) {
        Alarma.minutos = minutos;
    }

    public static int getSegundos() {
        return segundos;
    }

    public static void setSegundos(int segundos) {
        Alarma.segundos = segundos;
    }

    public static String getHmsS() {
        return hmsS;
    }

    public static void setHmsS(String hmsS) {
        Alarma.hmsS = hmsS;
    }

    /**
     * Se pide introducir la hora en la que quiere que suene la alarma.
     */
    public static void hmsS() {
        horas=Integer.parseInt(JOptionPane.showInputDialog("Introduzca las horas: "));
        minutos=Integer.parseInt(JOptionPane.showInputDialog("Introduzca los minutos: "));
        segundos=Integer.parseInt(JOptionPane.showInputDialog("Introduzca los segundos: "));
        hmsS=horas+":"+minutos+":"+segundos;
    }
    
    /**
     * Retorna la hora introducida en el metodo hmsS().
    */
    public String getHmss() {
        return hmsS;
    }
}
