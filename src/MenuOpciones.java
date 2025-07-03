import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuOpciones extends JFrame {
    private JButton registroButton;
    private JButton ventasButton;
    private JButton verProductosButton;
    private JPanel Menu;

    public MenuOpciones(){
        setTitle(",Menu de Opciones");
        setSize( 250,400);
        setContentPane(Menu);
        setLocationRelativeTo(null);

        registroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegistroProducto rp= new RegistroProducto();
                rp.setVisible(true);
                dispose();
            }
        });
        ventasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ventas ventas= new Ventas(null, null,null,null,null);
                ventas.setVisible(true);
                dispose();
            }
        });
        verProductosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VerProductos vp= new VerProductos(null, null,null,null,null);
                vp.setVisible(true);
                setVisible(true);
                dispose();
            }
        });
    }


}
