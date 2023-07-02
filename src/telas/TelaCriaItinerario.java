package telas;

import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;

/**
 * Classe responsável pela interface gráfica da tela inicial
 * @author Artur Pereira e Patrick Anderson
 * @since release 1
 */

public class TelaCriaItinerario {
    private JFrame frame;
    private JLabel background;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_8;
    private JTextField textField_9;

    /**
     * Construtor da classe ViewFirstScreen, onde é criada a interface gráfica.
     */
    public TelaCriaItinerario() {
        frame = new JFrame();
        frame.setBounds(150, 150, 600, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);
        
        /**
         * Botão Cancelar
         */
        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        btnCancelar.setBounds(441, 275, 106, 23);
        frame.getContentPane().add(btnCancelar);
        
        /**
         * Botão Confirmar
         */
        JButton btnConfirmar = new JButton("Confirmar");
        btnConfirmar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        btnConfirmar.setBounds(26, 275, 106, 23);
        frame.getContentPane().add(btnConfirmar);
        
        /**
         * Caixa dupla de Cliente
         */
        JComboBox comboBoxCliente = new JComboBox();
        comboBoxCliente.setModel(new DefaultComboBoxModel(new String[] {"Cliente"}));
        comboBoxCliente.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        comboBoxCliente.setBounds(10, 41, 537, 22);
        frame.getContentPane().add(comboBoxCliente);
                
        /**
         * Label Itinerário
         */
                JLabel lbItinerario = new JLabel("Itinerário");
                lbItinerario.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
                lbItinerario.setBounds(251, 11, 73, 14);
                frame.getContentPane().add(lbItinerario);
                                
                /**
                 * Label Cidade de Origem
                 */
                                JLabel lblCidadeOrigem = new JLabel("Cidade de Origem:");
                                lblCidadeOrigem.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
                                lblCidadeOrigem.setBounds(10, 82, 122, 22);
                                frame.getContentPane().add(lblCidadeOrigem);
                                                
                                /**
                                 * Label Aeroporto Origem
                                 */
                                                JLabel lblAeroportoOrigem = new JLabel("Aeroporto Origem");
                                                lblAeroportoOrigem.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
                                                lblAeroportoOrigem.setBounds(10, 115, 114, 14);
                                                frame.getContentPane().add(lblAeroportoOrigem);
                                                                
                                                /**
                                                 * Caixas de Preenchimento
                                                 */
                                                                textField = new JTextField();
                                                                textField.setBounds(134, 84, 138, 20);
                                                                frame.getContentPane().add(textField);
                                                                textField.setColumns(10);
                                                                
                                                                textField_1 = new JTextField();
                                                                textField_1.setBounds(134, 115, 138, 20);
                                                                frame.getContentPane().add(textField_1);
                                                                textField_1.setColumns(10);
                                                                
                                                                /**
                                                                 * Caixa de Preenchimento Formatada para Data
                                                                 */
                                                                textField_2 = new JTextField();
                                                                textField_2.setText("  /  /    ");
                                                                textField_2.setBounds(134, 146, 138, 20);
                                                                frame.getContentPane().add(textField_2);
                                                                textField_2.setColumns(10);
                                                                
                                                                textField_3 = new JTextField();
                                                                textField_3.setBounds(134, 177, 138, 20);
                                                                frame.getContentPane().add(textField_3);
                                                                textField_3.setColumns(10);
                                                                
                                                                textField_4 = new JTextField();
                                                                textField_4.setText("  :  ");
                                                                textField_4.setBounds(134, 208, 138, 20);
                                                                frame.getContentPane().add(textField_4);
                                                                textField_4.setColumns(10);
                                                                        
                                                                /**
                                                                 * Label Cidade de Origem
                                                                 */
                                                                        JLabel lblCidadeOrigem = new JLabel("Cidade de Origem:");
                                                                        lblCidadeOrigem.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
                                                                        lblCidadeOrigem.setBounds(282, 82, 122, 22);
                                                                        frame.getContentPane().add(lblCidadeOrigem);
                                                                                
                                                                        /**
                                                                         * Caixas de Preenchimento
                                                                         */
                                                                                textField_5 = new JTextField();
                                                                                textField_5.setColumns(10);
                                                                                textField_5.setBounds(409, 82, 138, 20);
                                                                                frame.getContentPane().add(textField_5);
                                                                                
                                                                                textField_6 = new JTextField();
                                                                                textField_6.setColumns(10);
                                                                                textField_6.setBounds(409, 113, 138, 20);
                                                                                frame.getContentPane().add(textField_6);
                                                                                
                                                                                textField_8 = new JTextField();
                                                                                textField_8.setColumns(10);
                                                                                textField_8.setBounds(409, 175, 138, 20);
                                                                                frame.getContentPane().add(textField_8);
                                                                                
                                                                                textField_9 = new JTextField();
                                                                                textField_9.setText("  :  ");
                                                                                textField_9.setColumns(10);
                                                                                textField_9.setBounds(409, 206, 138, 20);
                                                                                frame.getContentPane().add(textField_9);
                                                                                        
                                                                                /**
                                                                                 * Label Data de Partida
                                                                                 */
                                                                                        JLabel lblDataPartida = new JLabel("Data de Partida");
                                                                                        lblDataPartida.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
                                                                                        lblDataPartida.setBounds(10, 149, 114, 14);
                                                                                        frame.getContentPane().add(lblDataPartida);
                                                                                        
                                                                                        /**
                                                                                         * Label Avião
                                                                                         */
                                                                                        JLabel lblAviao = new JLabel("Avião:");
                                                                                        lblAviao.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
                                                                                        lblAviao.setBounds(10, 180, 114, 14);
                                                                                        frame.getContentPane().add(lblAviao);
                                                                                        
                                                                                        /**
                                                                                         * Label Horário Partida
                                                                                         */
                                                                                        JLabel lblHorárioPartida = new JLabel("Horário Partida:");
                                                                                        lblHorárioPartida.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
                                                                                        lblHorárioPartida.setBounds(10, 211, 114, 14);
                                                                                        frame.getContentPane().add(lblHorárioPartida);
                                                                                        
                                                                                        /**
                                                                                         * Label Aeroporto Destino
                                                                                         */
                                                                                        JLabel lblAeroportoDestino = new JLabel("Aeroporto Destino");
                                                                                        lblAeroportoDestino.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
                                                                                        lblAeroportoDestino.setBounds(282, 116, 114, 14);
                                                                                        frame.getContentPane().add(lblAeroportoDestino);
                                                                                        
                                                                                        /**
                                                                                         * Label Vagas Disponíveis
                                                                                         */
                                                                                        JLabel lblVagasDisponíveis = new JLabel("Vagas Disponíveis");
                                                                                        lblVagasDisponíveis.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
                                                                                        lblVagasDisponíveis.setBounds(282, 180, 114, 14);
                                                                                        frame.getContentPane().add(lblVagasDisponíveis);
                                                                                        
                                                                                        /**
                                                                                         * Label Horário Chegada
                                                                                         */
                                                                                        JLabel lblHorárioChegada = new JLabel("Horário Chegada:");
                                                                                        lblHorárioChegada.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
                                                                                        lblHorárioChegada.setBounds(282, 211, 114, 14);
                                                                                        frame.getContentPane().add(lblHorárioChegada);
                                                                                        
                                                                                                background = new JLabel("");
                                                                                                background.setBounds(-93, -51, 875, 872);
                                                                                                frame.getContentPane().add(background);
       

                               
    }

    // leva a tela
    public JFrame getOriginFrame() {
        return frame;
    }
}