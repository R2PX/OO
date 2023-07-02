package telas;

import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

/**
 * Classe responsável pela interface gráfica da tela inicial
 * @author Artur Pereira e Patrick Anderson
 * @since release 1
 */

public class Menu {
    private JFrame frame;
    private JButton btnRegister;
    private JButton btnLogin;
    private JLabel background;
    private JLabel lblNewLabel;

    /**
     * Construtor da classe ViewFirstScreen, onde é criada a interface gráfica.
     */
    public Menu() {
        frame = new JFrame();
        frame.setBounds(150, 150, 600, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);

        btnLogin = new JButton("Passageiros");
        btnLogin.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnLogin.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
        btnLogin.setBounds(170, 125, 210, 45);
        frame.getContentPane().add(btnLogin);

        btnRegister = new JButton("Reservas");
        btnRegister.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
        btnRegister.setBounds(170, 181, 210, 45);
        frame.getContentPane().add(btnRegister);
        
        lblNewLabel = new JLabel("OOAirlines");
        lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 32));
        lblNewLabel.setBounds(200, 21, 155, 61);
        frame.getContentPane().add(lblNewLabel);
        
        JButton btnItinerario = new JButton("Itinerario");
        btnItinerario.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
        btnItinerario.setBounds(170, 237, 210, 45);
        frame.getContentPane().add(btnItinerario);
        
        JButton btnRegister_1_1 = new JButton("Sair");
        btnRegister_1_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnRegister_1_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
        btnRegister_1_1.setBounds(170, 293, 210, 45);
        frame.getContentPane().add(btnRegister_1_1);
        
                background = new JLabel("");
                background.setBounds(-51, -74, 875, 843);
                frame.getContentPane().add(background);
       

                               
    }

    // leva a tela
    public JFrame getOriginFrame() {
        return frame;
    }
}package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class CRUDItinerario extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CRUDItinerario frame = new CRUDItinerario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CRUDItinerario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
