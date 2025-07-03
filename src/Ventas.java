import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventas extends JFrame {
    private JTextField textProducto;
    private JTextField textcodigo;
    private JTextField textPrecio;
    private JTextField textCantidad;
    private JTextField textSubtotal;
    private JButton calcularButton;
    private JButton btn_volver;
    private JPanel ventas;
    private JLabel lbresultado;

    public Ventas (String codigo, String nombre, String detalle, String preciou , String stock){
        setTitle("Ventas");
        setSize( 250,400);
        setContentPane(ventas);
        setLocationRelativeTo(null);

        btn_volver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
