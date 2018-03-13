
package apprelojdespertador;
import static apprelojdespertador.Despertador.hms;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Despertador {
    Timer timer;
    javax.swing.Timer tiempo;
    private int hor, min, seg;
    public static String hms;
    Alarma obxA=new Alarma();
    
    public Despertador() {
        //creamos un Timer
        timer = new Timer();
        //con el Timer ejecutamos la tarea TicTac, con un retardo de 0sg y repetimos cada 1sg
        timer.schedule(new TicTac(), 0, 1000);
    }
    
    public class TicTac extends TimerTask {

        @Override
        public void run() {
            Date date=new Date();
            hor=date.getHours();
            min=date.getMinutes();
            seg=date.getSeconds();
            
            hms=hor+":"+min+":"+seg;
            Display.textoHora.setText(Despertador.hms);
            
            if(hms.contains(obxA.getHmss())){
                Icon icon=new javax.swing.ImageIcon(getClass().getResource("/images/icono-despertador.png"));
                JOptionPane.showMessageDialog(null, "*-_*-_*-_ RING _-*_-*_-*"
                        + "\n*-_*-_*-_ RING _-*_-*_-*"
                        + "\n*-_*-_*-_ RING _-*_-*_-*"
                        + "\n*-_*-_*-_ RING _-*_-*_-*"
                        + "\n*-_*-_*-_ RING _-*_-*_-*"
                        + "\n*-_*-_*-_ RING _-*_-*_-*", "DESPERTADOR", JOptionPane.INFORMATION_MESSAGE, icon);
            }
            
        }
    }
}