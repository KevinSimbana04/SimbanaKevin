import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IniciarSesion extends JFrame{
    private JPanel Login;
    private JTextField textUsuario;
    private JTextField textpassword;
    private JButton btnLogin;
    private JButton btnLimpiar;

    public IniciarSesion(String usuario , String password){
        setTitle("Iniciar Sesión");
        setSize(400,250);
        setVisible(true);
        setContentPane(Login);
        setLocationRelativeTo(null);


        //Login
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Validar campos vacios
                if(textUsuario.getText().isEmpty()||textpassword.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Debe Llenar los Campos");
                }


                //Validacion de Usuario
                if(usuario.equals(textUsuario.getText()) && password.equals(textpassword.getText())){
                    MenuOpciones mu= new MenuOpciones();
                    mu.setVisible(true);
                    textUsuario.setText("");
                    textpassword.setText("");
                }else {
                    JOptionPane.showMessageDialog(null,"Usuario y contraseña Incorrecto");
                    textUsuario.setText("");
                    textpassword.setText("");
                }
            }
        });

        //Limpiar
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textUsuario.setText("");
                textpassword.setText("");
            }
        });
    }

}
