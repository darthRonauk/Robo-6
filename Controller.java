/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package robo_6;

import com.fazecast.jSerialComm.SerialPort;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.PrintWriter;


/**
 *
 * @author Pavilion
 */
public class Controller extends javax.swing.JFrame {

    /**
     * Creates new form Controller
     */
    public Controller() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        connectButton.setText("Connect");

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 46)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ROBO 6");

        t1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        b1.setText("Forward");

        b5.setText("Stop");

        b2.setText("Back");

        b3.setText("Right");

        b4.setText("Left");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(portList, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(connectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(portList, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(connectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    
    static SerialPort chosenPort;

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Controller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Controller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Controller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Controller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try
        {
        SerialPort[] portNames = SerialPort.getCommPorts();
		for(int i = 0; i < portNames.length; i++)
			portList.addItem(portNames[i].getSystemPortName());
                connectButton.addActionListener(new ActionListener(){
			@Override public void actionPerformed(ActionEvent arg0) {
				if(connectButton.getText().equals("Connect")) {
					// attempt to connect to the serial port
					chosenPort = SerialPort.getCommPort(portList.getSelectedItem().toString());
					chosenPort.setComPortTimeouts(SerialPort.TIMEOUT_SCANNER, 0, 0);
					if(chosenPort.openPort()) {
						connectButton.setText("Disconnect");
						portList.setEnabled(false);
						
						// create a new thread for sending data to the arduino
						Thread thread = new Thread(){
							@Override public void run() {
								// wait after connecting, so the bootloader can finish
								try {Thread.sleep(100); } catch(Exception e) {}

								// enter an infinite loop that sends text to the arduino
								final PrintWriter output = new PrintWriter(chosenPort.getOutputStream());
                                                                t1.setText("Give command:");
								
                                                                    t1.addKeyListener(new KeyListener(){

                                                                        @Override
                                                                        public void keyTyped(KeyEvent e) {}

                                                                        @Override
                                                                        public void keyPressed(KeyEvent e) {
                                                                            int key=e.getKeyCode();
                                                                            switch(key)
                                                                            {
                                                                            case KeyEvent.VK_UP:
                                                                                t1.setText("I am moving forward");
                                                                                output.print("F");
                                                                                output.flush();
                                                                                break;
                                                                            case KeyEvent.VK_DOWN:
                                                                                t1.setText("I am moving backward");
                                                                                output.print("B");
                                                                                output.flush();
                                                                                break;
                                                                            case KeyEvent.VK_LEFT:
                                                                                t1.setText("I am moving left");
                                                                                output.print("L");
                                                                                output.flush();
                                                                                break;
                                                                            case KeyEvent.VK_RIGHT:
                                                                                t1.setText("I am moving right");
                                                                                output.print("R");
                                                                                output.flush();
                                                                                break;
                                                                            default:
                                                                                t1.setText("Plz enter a valid command");
                                                                                output.print("x");
                                                                                output.flush();
                                                                            }
                                                                             //To change body of generated methods, choose Tools | Templates.
                                                                        }

                                                                        @Override
                                                                        public void keyReleased(KeyEvent e) {
                                                                            t1.setText("I have stopped");
                                                                                output.print("S");
                                                                                output.flush();//To change body of generated methods, choose Tools | Templates.
                                                                        }
                                                                        
                                                                    });
                                                                    b1.addActionListener(new ActionListener(){

                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {
                                                                         t1.setText("I am moving forward");
                                                                                output.print("F");
                                                                                output.flush();//To change body of generated methods, choose Tools | Templates.
                                                                    }                                                                   
                                                                    });
                                                                    b2.addActionListener(new ActionListener(){

                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        t1.setText("I am moving backward");
                                                                                output.print("B");
                                                                                output.flush(); //To change body of generated methods, choose Tools | Templates.
                                                                    }
                                                                        
                                                                    });
                                                                    b3.addActionListener(new ActionListener(){

                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        t1.setText("I am moving right");
                                                                                output.print("R");
                                                                                output.flush(); //To change body of generated methods, choose Tools | Templates.
                                                                    }
                                                                        
                                                                    });
                                                                    b4.addActionListener(new ActionListener(){

                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        t1.setText("I am moving left");
                                                                                output.print("L");
                                                                                output.flush(); //To change body of generated methods, choose Tools | Templates.
                                                                    }
                                                                        
                                                                    });
                                                                    b5.addActionListener(new ActionListener(){

                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        t1.setText("I have stopped");
                                                                                output.print("S");
                                                                                output.flush(); //To change body of generated methods, choose Tools | Templates.
                                                                    }
                                                                        
                                                                    });  
							}
						};
						thread.start();
					}
				} else {
					// disconnect from the serial port
					chosenPort.closePort();
					portList.setEnabled(true);
					connectButton.setText("Connect");
				}
                        }
		});
        }
        catch(Exception e)
        {
            System.out.print(e.getMessage());
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Controller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static final javax.swing.JButton b1 = new javax.swing.JButton();
    private static final javax.swing.JButton b2 = new javax.swing.JButton();
    private static final javax.swing.JButton b3 = new javax.swing.JButton();
    private static final javax.swing.JButton b4 = new javax.swing.JButton();
    private static final javax.swing.JButton b5 = new javax.swing.JButton();
    private static final javax.swing.JButton connectButton = new javax.swing.JButton();
    private javax.swing.JLabel jLabel1;
    private static final javax.swing.JComboBox portList = new javax.swing.JComboBox<String>();
    private static final javax.swing.JTextField t1 = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
}
