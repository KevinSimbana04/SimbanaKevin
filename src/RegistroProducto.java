import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistroProducto extends JFrame {
    private JTextField textcodigo;
    private JTextField textnombre;
    private JTextField textdetalle;
    private JTextField textPrecioU;
    private JTextField textStock;
    private JButton limpiarButton;
    private JButton volverButton;
    private JButton guardarButton;
    private JPanel Registro;

    public RegistroProducto(){
        setTitle("Registro");
        setSize( 250,400);
        setVisible(true);
        setContentPane(Registro);
        setLocationRelativeTo(null);


        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuOpciones mu= new MenuOpciones();
                mu.setVisible(true);
                setVisible(false);
                dispose();
            }
        });
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VerProductos vp= new VerProductos(textcodigo.getText(), textnombre.getText(),textdetalle.getText(),textPrecioU.getText(), textStock.getText());
                setVisible(true);
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textcodigo.setText("");
                textnombre.setText("");
                textdetalle.setText("");
                textPrecioU.setText("");
                textStock.setText("");
            }
        });
    }
}
