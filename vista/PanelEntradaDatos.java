package vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //Atributos
    private JLabel lbImagen;
    private ImageIcon iImagen;
    private JLabel lPrecio;
    private JLabel lAños;
    private JLabel lMatricula;
    private JTextField tfPrecio;
    private JTextField tfAños;
    private JTextField tfMatricula;


    //Métodos

    /*Método Constructor */

    public PanelEntradaDatos()
    {
        //Definicion del contenedor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de la imagen
        iImagen= new ImageIcon(getClass().getResource("/vista/Carro.png"));
        lbImagen= new JLabel (iImagen);
        lbImagen.setBounds(5, 20, 128, 128);
        this.add(lbImagen);

        //Crear y agregar etiquetas, campos de texto
        lPrecio = new JLabel("Precio Vehiculo =");
        lPrecio.setBounds(155,40,150,20);
        this.add(lPrecio);
        
        tfPrecio = new JTextField();
        tfPrecio.setBounds(270,40,100,20);
        this.add(tfPrecio);

        lAños = new JLabel("Años del vehiculo =");
        lAños.setBounds(155,70,150,20);
        this.add(lAños);

        tfAños = new JTextField();
        tfAños.setBounds(270,70,100,20);
        this.add(tfAños);

        lMatricula = new JLabel("Lugar del vehiculo =");
        lMatricula.setBounds(155,100,150,20);
        this.add(lMatricula);

        tfMatricula = new JTextField();
        tfMatricula.setBounds(270,100,100,20);
        this.add(tfMatricula);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de entrada");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }

    //Metodos de acceso a la información de las cajas de texto
    public String getPrecioVehiculo()
    {
        return tfPrecio.getText();
    }
    
    public String getAños()
    {
        return tfAños.getText();
    }
    
    public String getMatricula()
    {
        return tfMatricula.getText();
    }
    
    //Metodo para borrar cajas de texto
    public void borrar()
    {
        tfPrecio.setText("");
        tfAños.setText("");
        tfMatricula.setText("");
    }
}
