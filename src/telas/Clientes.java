package telas;
//tentar mudar o package de Telas para telas pois um dos erros é ele estar com capital letter

import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.DefaultComboBoxModel;

/**
 * Classe responsável pela interface gráfica da tela inicial
 * @author Artur Pereira e Patrick Anderson
 * @since release 1
 */

public class Clientes {
    private JFrame frame;
    private JLabel background;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_4;

    /**
     * Construtor da classe ViewFirstScreen, onde é criada a interface gráfica.
     */
    public Clientes() {
        frame = new JFrame();
        frame.setBounds(150, 150, 600, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);
        
        /**
         * Botão Cancelar
         */
        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
        btnCancelar.setBounds(376, 434, 145, 42);
        frame.getContentPane().add(btnCancelar);
        
        /**
         * Botão Confirmar
         */
        JButton btnConfirmar = new JButton("Confirmar");
        btnConfirmar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
        btnConfirmar.setBounds(67, 434, 145, 42);
        frame.getContentPane().add(btnConfirmar);
        
        /**
         * Botão Consultar
         */
        JButton btnConsultar = new JButton("Consultar");
        btnConsultar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
        btnConsultar.setBounds(393, 79, 128, 23);
        frame.getContentPane().add(btnConsultar);
        
        /**
         * Caixa de Preenchimento
         */
        textField_4 = new JTextField();
        textField_4.setBounds(128, 80, 255, 20);
        frame.getContentPane().add(textField_4);
        textField_4.setColumns(10);
        
        /**
         * Caixa Formatada para Data
         */
        JFormattedTextField formattedTextField = new JFormattedTextField("  /  /    ");
        formattedTextField.setText("  /  /    ");
        formattedTextField.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        formattedTextField.setBounds(88, 296, 93, 20);
        frame.getContentPane().add(formattedTextField);
        
        /**
         * Caixa dupla de CPF/CNPJ
         */
        JComboBox comboBoxCPFCNPJ = new JComboBox();
        comboBoxCPFCNPJ.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        comboBoxCPFCNPJ.setModel(new DefaultComboBoxModel(new String[] {"     CPF", "    CNPJ"}));
        comboBoxCPFCNPJ.setToolTipText("");
        comboBoxCPFCNPJ.setBounds(10, 79, 85, 22);
        frame.getContentPane().add(comboBoxCPFCNPJ);
        
        /**
         * Caixa dupla de Masculino/Feminino
         */
        JComboBox comboBoxMF = new JComboBox();
        comboBoxMF.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        comboBoxMF.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Feminino"}));
        comboBoxMF.setToolTipText("Masculino\r\nFeminino");
        comboBoxMF.setBounds(88, 256, 93, 22);
        frame.getContentPane().add(comboBoxMF);
        
        /**
         * Caixas de Preenchimento
         */
        textField_2 = new JTextField();
        textField_2.setBounds(89, 222, 432, 20);
        frame.getContentPane().add(textField_2);
        textField_2.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setBounds(89, 178, 432, 20);
        frame.getContentPane().add(textField_1);
        textField_1.setColumns(10);
        
        textField = new JTextField();
        textField.setBounds(128, 129, 392, 20);
        frame.getContentPane().add(textField);
        textField.setColumns(10);
        
        /**
         * Label Novo Cliente
         */
        JLabel lblNovoCliente = new JLabel("Novo Cliente");
        lblNovoCliente.setFont(new Font("Segoe UI Semibold", Font.BOLD, 22));
        lblNovoCliente.setBounds(214, 11, 137, 29);
        frame.getContentPane().add(lblNovoCliente);
        
        /**
         * Label Nome Completo
         */
        JLabel lblNomeCompleto = new JLabel("Nome Completo:");
        lblNomeCompleto.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
        lblNomeCompleto.setBounds(10, 129, 108, 18);
        frame.getContentPane().add(lblNomeCompleto);

        /**
         * Label Endereço
         */
        JLabel lblEndereco = new JLabel("Endereço:");
        lblEndereco.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        lblEndereco.setBounds(10, 180, 65, 14);
        frame.getContentPane().add(lblEndereco);
        
        /**
         * Label Telefone
         */
        JLabel lblTelefone = new JLabel("Telefone:");
        lblTelefone.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        lblTelefone.setBounds(10, 224, 65, 14);
        frame.getContentPane().add(lblTelefone);
        
        /**
         * Label Sexo
         */
        JLabel lblSexo = new JLabel("Sexo:");
        lblSexo.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        lblSexo.setBounds(10, 259, 32, 14);
        frame.getContentPane().add(lblSexo);
                
        /**
         * Label Nascimento
         */
                JLabel lblNascimento = new JLabel("Nascimento:");
                lblNascimento.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
                lblNascimento.setBounds(10, 296, 75, 18);
                frame.getContentPane().add(lblNascimento);
        
                background = new JLabel("");
                background.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
                background.setBounds(0, 0, 875, 843);
                frame.getContentPane().add(background);
       

                               
    }

    // leva a tela
    public JFrame getOriginFrame() {
        return frame;
    }
}