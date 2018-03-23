/*Resuelve el siguiente problema elaborando un programa que tenga 
 *una GUI. Debe usar los elementos vistos en clases para hacer una
 *interfaz atractiva al usuario. 
 *Se evaluará la solución correcta del problema y el uso de 
 *contenedores, layout managers, componentes y listeners:

Elabora un programa que pida una cantidad y especifique el 
tipo de moneda origen para que permita al usuario convertirla 
a un tipo de moneda destino. Los tipos de monedas pueden ser 
dólares, euros o pesos.*/

//Miguel alberto herrera rodriguez

package convertidor;
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class convertidor extends JFrame {
	
		JButton btn1;
		JTextField div;
		JLabel text1, text2;
		JTextArea res;
		JPanel conv;
		JComboBox combo1, combo2;
		AccionBoton oyentebtnGeneral;
			
		public convertidor() {
			this.setTitle("Conversor de Divisas");
			conv = new JPanel();
			conv.setBorder(javax.swing.BorderFactory.createTitledBorder("Divisas"));
			this.oyentebtnGeneral = new AccionBoton();
			
			text1 = new JLabel ("Convertir:");
			conv.add(text1);
			
			div = new JTextField("ingrese monto");
			div.setBounds(30, 30, 60, 20);
			conv.add(div);
			
			combo1 = new JComboBox();
			combo1.setBounds(10,10,80,20);
	        conv.add(combo1);
	        combo1.addItem("Dólares");
	        combo1.addItem("Euros");
	        combo1.addItem("Pesos");
	       
	        text2 = new JLabel ("A:");
	        conv.add(text2);
	        
	        combo2 = new JComboBox();
			combo2.setBounds(10,10,80,20);
	        conv.add(combo2);
	        combo2.addItem("Dólares");
	        combo2.addItem("Euros");
	        combo2.addItem("Pesos");
	        
	        btn1 = new JButton("Convertir");
	        this.btn1.addActionListener(this.oyentebtnGeneral);
	        
	        this.add(conv,BorderLayout.CENTER);
	        conv.add(btn1);
		}
		
	
	public static void main(String[] args) {
		convertidor ventana = new convertidor ();
		ventana.setSize(529, 200);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	 class AccionBoton implements ActionListener {

	        //MÃ©todo controlador del evento ActionEvent
	        @Override
	        public void actionPerformed(ActionEvent e) {
	             if((JButton)e.getSource() == btn1) {
	            	 if(combo1.getSelectedItem().equals("Pesos") && combo2.getSelectedItem().equals("Dólares")) {
		            		double pesos1 = Integer.parseInt(div.getText());
		                    double valorfinal = pesos1 / 20;
		                    JOptionPane.showMessageDialog(null, "Son: " + valorfinal, "conversion", JOptionPane.INFORMATION_MESSAGE);
		            	}
	             }
	             if((JButton)e.getSource() == btn1) {
	            	 if(combo1.getSelectedItem().equals("Pesos") && combo2.getSelectedItem().equals("Euros")) {
	            		 double pesos1 = Integer.parseInt(div.getText());
	                     double valorfinal = pesos1 / 22;
	                     JOptionPane.showMessageDialog(null, "Son: " + valorfinal, "conversion", JOptionPane.INFORMATION_MESSAGE);
		            	}
	             }
	             if((JButton)e.getSource() == btn1) {
	            	 if(combo1.getSelectedItem().equals("Dólares") && combo2.getSelectedItem().equals("Pesos")) {
	            		 double pesos1 = Integer.parseInt(div.getText());
	                     double valorfinal = pesos1 * 20 ;
	                     JOptionPane.showMessageDialog(null, "Son: " + valorfinal, "conversion", JOptionPane.INFORMATION_MESSAGE);
		            	}
	             }
	             if((JButton)e.getSource() == btn1) {
	            	 if(combo1.getSelectedItem().equals("Dólares") && combo2.getSelectedItem().equals("Euros")) {
	            		 double pesos1 = Integer.parseInt(div.getText());
	                     double valorfinal = pesos1 * 0.81;
	                     JOptionPane.showMessageDialog(null, "Son: " + valorfinal, "conversion", JOptionPane.INFORMATION_MESSAGE);
		            	}
	             }
	             if((JButton)e.getSource() == btn1) {
	            	 if(combo1.getSelectedItem().equals("Euros") && combo2.getSelectedItem().equals("Pesos")) {
	            		 double pesos1 = Integer.parseInt(div.getText());
	                     double valorfinal = pesos1 * 22;
	                     JOptionPane.showMessageDialog(null, "Son: " + valorfinal, "conversion", JOptionPane.INFORMATION_MESSAGE);
		            	}
	             }
	             if((JButton)e.getSource() == btn1) {
	            	 if(combo1.getSelectedItem().equals("Euros") && combo2.getSelectedItem().equals("Dólares")) {
	            		 double pesos1 = Integer.parseInt(div.getText());
	                     double valorfinal = pesos1 * 1.23;
	                     JOptionPane.showMessageDialog(null, "Son: " + valorfinal, "conversion", JOptionPane.INFORMATION_MESSAGE);
		            	}
	             }
	        }
	    } //Class Acc
}
