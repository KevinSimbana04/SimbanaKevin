import javax.swing.*;

public class VerProductos extends JFrame{
    private JLabel lbinformacion;
    private JButton btnvolver;
    private JPanel verProducto;

    public VerProductos(String codigo, String nombre, String detalle, String preciou , String stock){
        setTitle("Productos");
        setSize( 250,400);
        setContentPane(verProducto);
        setLocationRelativeTo(null);
        lbinformacion.setText("Codigo: "+codigo+ "\n Nombre: "+nombre+"\n detalle: "+detalle+ "Precio Unitario: "+preciou+"\n Stock:"+stock);
    }
}
