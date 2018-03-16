
package apprelojdespertador;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Muestra el entorno gráfico del "reloj".
 * @author David
 */
public class Display extends JFrame implements ActionListener{
    
    /**
     * Creación de los botones. 
     * Creación del campo de texto donde se mostrará la hora.
     */
    Despertador obxD=new Despertador();
    public JButton btnOnOff=new JButton("ON/OFF");
    public JButton btnSalir=new JButton("SALIR");
    public JButton btnAlarma=new JButton("ALARMA");
    public static JTextField textoHora=new JTextField();
    public JTextArea lblHoras=new JTextArea();
    public JPanel jPanel=new JPanel();
    
    public Display(){
        /**
         * Venta JFrame, ancho y largo de la ventana.
         */
        super("ALARMA");
        this.setSize(397, 242);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /**
         * Gestiona los eventos de los botones.
         */
        this.btnOnOff.addActionListener(this);
        this.btnSalir.addActionListener(this);
        this.btnSalir.addActionListener(this);
        this.btnAlarma.addActionListener(this);

        /**
         * Distribuye los objetos al jPanel.
         */
        FlowLayout DISTRIBUIDOR = new FlowLayout(FlowLayout.LEFT, 30, 30);
        this.jPanel.setLayout(DISTRIBUIDOR);
        
        /**
         * Incorporamos los objetos a la ventana.
         */
        this.jPanel.add(this.textoHora);
        this.jPanel.add(this.btnOnOff);
        this.jPanel.add(this.lblHoras);
        this.jPanel.add(this.btnAlarma);
        this.jPanel.add(this.btnSalir);

        /**
         * Distribución de los objetos en el jPanel.
         */
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(textoHora)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnOnOff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAlarma, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                                        .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(textoHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnOnOff)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlarma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalir)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        this.add(this.jPanel);
    }
    
    /**
     * Asignación de acciones a los botones.
     */
    boolean apagado=false;
    @Override
    public void actionPerformed(ActionEvent ae){
        //Con "getSource()" VEMOS EN QUE BOTON SE HIZO CLICK
        if(ae.getSource()==this.btnOnOff){
            //Condición de un boton on/off
            if(apagado==false){
                apagado=true;
            }else{
                apagado=false;
            }
        }else if(ae.getSource()==this.btnAlarma){//Si se pulsa el botón alarma llama a la alarma.
            Alarma.hmsS();
        }else if(ae.getSource()==this.btnSalir){
            System.exit(0);
        }
    }

}
