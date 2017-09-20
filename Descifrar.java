import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Descifrar extends JFrame implements ActionListener {
	JMenuBar barra;
	JMenu aplicacion, ayuda;
	JPanel p1, p2;
    JLabel label, label2;     
	JTextField texto;     
	JPasswordField clave;     
	JButton descifrar;
	
	public Descifrar()
	{
		configVentana();
		creatbar();
		
		label=new JLabel("TEXTO:");         
		label.setForeground(Color.red);         
		label.setFont(new Font("Arial",Font.BOLD,20));
		add(label);
		label.setBounds(50,20,150,30);         
		         
		texto=new JTextField(15);
		add(texto); 
		texto.setBounds(130,20,150,30);         
		                     
		label2=new JLabel("CLAVE:");         
		label2.setForeground(Color.BLACK);         
		label2.setFont(new Font("Arial",Font.BOLD,20));
		add(label2);
		label2.setBounds(50,60,150,30);         
		                  
		clave=new JPasswordField(15);
		add(clave);
		clave.setBounds(130,60,150,30);         
		                            
		descifrar  =  new JButton ("DESCIFRAR");
		add(descifrar);
		descifrar.setForeground(Color.BLUE);         
		descifrar.setFont(new Font("Arial",Font.BOLD,18));         
		descifrar.setBounds(130,110,150,30);                         
		descifrar.addActionListener(this);
	}
	
	public void configVentana()
	{
		setLayout(null);
		setTitle("Descifrado por Desplazamiento");
		setSize(350, 250);
		setResizable(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event) { //evento 
    	if (event.getSource()== descifrar){ //si oprime el botón 
    		String cadena = texto.getText();
    		cadena = cadena.toUpperCase();
    		int longitud = cadena.length();
    		JOptionPane.showMessageDialog(null,"La palabra " +cadena+ " tiene " +longitud+ " letras");
    		char[] letrasdecadena = cadena.toCharArray();
    		int i;
    		for(i=0; i<letrasdecadena.length; i++){
    			JOptionPane.showMessageDialog(null,letrasdecadena[i]+"\n");
    		}
    		String cadena2 = clave.getText();
    		cadena2 = cadena2.toUpperCase();
    		int longitud2 = cadena2.length();
    		JOptionPane.showMessageDialog(null,"La palabra " +cadena2+ " tiene " +longitud2+ " letras");
    		char[] letrasdecadena2 = cadena2.toCharArray();
    		int i2;
    		for(i2=0; i2<letrasdecadena2.length; i2++){
    			JOptionPane.showMessageDialog(null,letrasdecadena2[i2]+"\n");
    		}
    	}

    	          }
	
	public void creatbar() {
        barra = new JMenuBar();
        aplicacion = new JMenu("Aplicación");
        JMenuItem salir = new JMenuItem("Regresar");

        salir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            	dispose(); //destruye la ventana anterior
            	 new Menu(0);
            }
        });

        aplicacion.addSeparator();
        aplicacion.add(salir);
        barra.add(aplicacion);
        ayuda = new JMenu("Ayuda");
        JMenuItem creador = new JMenuItem("Información");
        JMenuItem instrucciones = new JMenuItem("Instrucciones");
        creador.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(p2, "Creadores: Brito Segura Angel \n Santillán Godinéz Alan Alejandro \n Maestro: Aldo Jiménez Arteaga \n Facultad de Ingeniería");
            }
        });
        
        instrucciones.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(p1, "Inserta una palabra que requieras descifrar con su respectiva clave");
            }
        });
        
        ayuda.add(creador);
        ayuda.add(instrucciones);
        barra.add(ayuda);
        setJMenuBar(barra);
    }
}