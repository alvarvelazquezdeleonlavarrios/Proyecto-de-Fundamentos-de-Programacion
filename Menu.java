// Bibliotecas
import java.awt.event.*;
import javax.swing.*;

public class Menu extends JFrame 
implements ActionListener{
 private JButton cifrado,descifrado,salir; 
 
 public static void main(String args[]){
 new Menu (0); //Llamo a la clase 
 }
  
public Menu(int sal){ //sal es el parámetro, la variable cantidad. 
 this.setLayout(null);
 this.setSize(515, 600); //tamaño de ventana
 this.setTitle("..:: Aplicación de Números Enteros  :::.."); //título de la ventana 
 this.setVisible(true);
 this.setResizable(true);
 this.setLocationRelativeTo(null);

 		cifrado = new JButton("Cifrado por Desplazamiento");
        add(cifrado);
        cifrado.setBounds(140, 200, 220, 25);
        cifrado.addActionListener(this);
        
        descifrado = new JButton("Descifrado por Desplazamiento");
        add(descifrado);
        descifrado.setBounds(140, 250, 220, 25);
        descifrado.addActionListener(this);

        salir = new JButton("Salir de la Aplicación");
        add(salir);
        salir.setBounds(150, 400, 200, 25);
        salir.addActionListener(this);
             
}


public void actionPerformed(ActionEvent event) { //evento 
    if (event.getSource()== cifrado){ //si el usuario decide pasar alguna cantidad 
     dispose(); //destruye la ventana 
     new Cifrar ();  
     } 
         
    if (event.getSource()== descifrado){ //si se necesita consultar el cantidad
    	dispose(); //destruye la ventana 
        new Descifrar ();
     }
    if (event.getSource()== salir){
    	System.exit(0);   
    }
}
}