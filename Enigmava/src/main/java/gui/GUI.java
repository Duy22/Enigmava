package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTable tableReflector;
	private JTable tableRotor3;
	private JTable tableRotor2;
	private JTable tableRotor1;
	private JTable tableAlphabet;
	private JPanel panel;
	private JLabel lblReflector;
	private JLabel lblRotor;
	private JLabel lblRotor_1;
	private JLabel lblRotor_2;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblFirstRotor;
	private JLabel lblFirstInit;
	private JLabel lblSecondRotor;
	private JLabel lblSecondInit;
	private JLabel lblThirdRotor;
	private JLabel lblThirdInit;
	private JLabel lblKey;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setTitle("Enigmava");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] {0, 0, 1};
		gbl_contentPane.rowHeights = new int[] {208, 29, 30, 0, 0, 1};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel upperPanel = new JPanel();
		GridBagConstraints gbc_upperPanel = new GridBagConstraints();
		gbc_upperPanel.insets = new Insets(0, 0, 5, 5);
		gbc_upperPanel.fill = GridBagConstraints.VERTICAL;
		gbc_upperPanel.gridx = 0;
		gbc_upperPanel.gridy = 0;
		contentPane.add(upperPanel, gbc_upperPanel);
		GridBagLayout gbl_upperPanel = new GridBagLayout();
		gbl_upperPanel.columnWidths = new int[]{0, 0};
		gbl_upperPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_upperPanel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_upperPanel.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		upperPanel.setLayout(gbl_upperPanel);
		
		tableReflector = new JTable();
		tableReflector.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		GridBagConstraints gbc_tableReflector = new GridBagConstraints();
		gbc_tableReflector.insets = new Insets(0, 0, 5, 0);
		gbc_tableReflector.fill = GridBagConstraints.HORIZONTAL;
		gbc_tableReflector.gridx = 0;
		gbc_tableReflector.gridy = 0;
		upperPanel.add(tableReflector, gbc_tableReflector);
		
		tableRotor3 = new JTable();
		tableRotor3.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		GridBagConstraints gbc_tableRotor3 = new GridBagConstraints();
		gbc_tableRotor3.insets = new Insets(0, 0, 5, 0);
		gbc_tableRotor3.fill = GridBagConstraints.HORIZONTAL;
		gbc_tableRotor3.gridx = 0;
		gbc_tableRotor3.gridy = 1;
		upperPanel.add(tableRotor3, gbc_tableRotor3);
		
		tableRotor2 = new JTable();
		tableRotor2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		GridBagConstraints gbc_tableRotor2 = new GridBagConstraints();
		gbc_tableRotor2.insets = new Insets(0, 0, 5, 0);
		gbc_tableRotor2.fill = GridBagConstraints.HORIZONTAL;
		gbc_tableRotor2.gridx = 0;
		gbc_tableRotor2.gridy = 2;
		upperPanel.add(tableRotor2, gbc_tableRotor2);
		
		tableRotor1 = new JTable();
		tableRotor1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		GridBagConstraints gbc_tableRotor1 = new GridBagConstraints();
		gbc_tableRotor1.insets = new Insets(0, 0, 5, 0);
		gbc_tableRotor1.fill = GridBagConstraints.HORIZONTAL;
		gbc_tableRotor1.gridx = 0;
		gbc_tableRotor1.gridy = 3;
		upperPanel.add(tableRotor1, gbc_tableRotor1);
		
		tableAlphabet = new JTable();
		tableAlphabet.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		GridBagConstraints gbc_tableAlphabet = new GridBagConstraints();
		gbc_tableAlphabet.fill = GridBagConstraints.HORIZONTAL;
		gbc_tableAlphabet.gridx = 0;
		gbc_tableAlphabet.gridy = 4;
		upperPanel.add(tableAlphabet, gbc_tableAlphabet);
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		lblReflector = new JLabel("Reflector");
		GridBagConstraints gbc_lblReflector = new GridBagConstraints();
		gbc_lblReflector.insets = new Insets(5, 0, 0, 0);
		gbc_lblReflector.gridx = 0;
		gbc_lblReflector.gridy = 0;
		panel.add(lblReflector, gbc_lblReflector);
		
		lblRotor = new JLabel("Rotor 3");
		GridBagConstraints gbc_lblRotor = new GridBagConstraints();
		gbc_lblRotor.insets = new Insets(25, 0, 5, 0);
		gbc_lblRotor.gridx = 0;
		gbc_lblRotor.gridy = 1;
		panel.add(lblRotor, gbc_lblRotor);
		
		lblRotor_1 = new JLabel("Rotor 2");
		GridBagConstraints gbc_lblRotor_1 = new GridBagConstraints();
		gbc_lblRotor_1.insets = new Insets(30, 0, 0, 0);
		gbc_lblRotor_1.gridx = 0;
		gbc_lblRotor_1.gridy = 2;
		panel.add(lblRotor_1, gbc_lblRotor_1);
		
		lblRotor_2 = new JLabel("Rotor 1");
		GridBagConstraints gbc_lblRotor_2 = new GridBagConstraints();
		gbc_lblRotor_2.insets = new Insets(35, 0, 0, 0);
		gbc_lblRotor_2.gridx = 0;
		gbc_lblRotor_2.gridy = 3;
		panel.add(lblRotor_2, gbc_lblRotor_2);
		
		JPanel lowerPanel = new JPanel();
		GridBagConstraints gbc_lowerPanel = new GridBagConstraints();
		gbc_lowerPanel.insets = new Insets(0, 0, 5, 5);
		gbc_lowerPanel.fill = GridBagConstraints.BOTH;
		gbc_lowerPanel.gridx = 0;
		gbc_lowerPanel.gridy = 1;
		contentPane.add(lowerPanel, gbc_lowerPanel);
		GridBagLayout gbl_lowerPanel = new GridBagLayout();
		gbl_lowerPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_lowerPanel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_lowerPanel.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_lowerPanel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		lowerPanel.setLayout(gbl_lowerPanel);
		
		lblKey = new JLabel("Key");
		GridBagConstraints gbc_lblKey = new GridBagConstraints();
		gbc_lblKey.insets = new Insets(0, 0, 5, 5);
		gbc_lblKey.gridx = 2;
		gbc_lblKey.gridy = 0;
		lowerPanel.add(lblKey, gbc_lblKey);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.BOTH;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.gridx = 0;
		gbc_textField_2.gridy = 1;
		lowerPanel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.BOTH;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		lowerPanel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		lowerPanel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.BOTH;
		gbc_textField_3.gridx = 3;
		gbc_textField_3.gridy = 1;
		lowerPanel.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.BOTH;
		gbc_textField_4.gridx = 4;
		gbc_textField_4.gridy = 1;
		lowerPanel.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.BOTH;
		gbc_textField_5.gridx = 5;
		gbc_textField_5.gridy = 1;
		lowerPanel.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		btnNewButton = new JButton("Set");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 2;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 6;
		gbc_btnNewButton.gridy = 1;
		lowerPanel.add(btnNewButton, gbc_btnNewButton);
		
		lblFirstRotor = new JLabel("First Rotor");
		lblFirstRotor.setFont(new Font("Dialog", Font.BOLD, 8));
		GridBagConstraints gbc_lblFirstRotor = new GridBagConstraints();
		gbc_lblFirstRotor.insets = new Insets(0, 0, 0, 5);
		gbc_lblFirstRotor.gridx = 0;
		gbc_lblFirstRotor.gridy = 2;
		lowerPanel.add(lblFirstRotor, gbc_lblFirstRotor);
		
		lblFirstInit = new JLabel("First Init");
		lblFirstInit.setFont(new Font("Dialog", Font.BOLD, 8));
		GridBagConstraints gbc_lblFirstInit = new GridBagConstraints();
		gbc_lblFirstInit.insets = new Insets(0, 0, 0, 5);
		gbc_lblFirstInit.gridx = 1;
		gbc_lblFirstInit.gridy = 2;
		lowerPanel.add(lblFirstInit, gbc_lblFirstInit);
		
		lblSecondRotor = new JLabel("Second Rotor");
		lblSecondRotor.setFont(new Font("Dialog", Font.BOLD, 8));
		GridBagConstraints gbc_lblSecondRotor = new GridBagConstraints();
		gbc_lblSecondRotor.insets = new Insets(0, 0, 0, 5);
		gbc_lblSecondRotor.gridx = 2;
		gbc_lblSecondRotor.gridy = 2;
		lowerPanel.add(lblSecondRotor, gbc_lblSecondRotor);
		
		lblSecondInit = new JLabel("Second Init");
		lblSecondInit.setFont(new Font("Dialog", Font.BOLD, 8));
		GridBagConstraints gbc_lblSecondInit = new GridBagConstraints();
		gbc_lblSecondInit.insets = new Insets(0, 0, 0, 5);
		gbc_lblSecondInit.gridx = 3;
		gbc_lblSecondInit.gridy = 2;
		lowerPanel.add(lblSecondInit, gbc_lblSecondInit);
		
		lblThirdRotor = new JLabel("Third Rotor");
		lblThirdRotor.setFont(new Font("Dialog", Font.BOLD, 8));
		GridBagConstraints gbc_lblThirdRotor = new GridBagConstraints();
		gbc_lblThirdRotor.insets = new Insets(0, 0, 0, 5);
		gbc_lblThirdRotor.gridx = 4;
		gbc_lblThirdRotor.gridy = 2;
		lowerPanel.add(lblThirdRotor, gbc_lblThirdRotor);
		
		lblThirdInit = new JLabel("Third Init");
		lblThirdInit.setFont(new Font("Dialog", Font.BOLD, 8));
		GridBagConstraints gbc_lblThirdInit = new GridBagConstraints();
		gbc_lblThirdInit.insets = new Insets(0, 0, 0, 5);
		gbc_lblThirdInit.gridx = 5;
		gbc_lblThirdInit.gridy = 2;
		lowerPanel.add(lblThirdInit, gbc_lblThirdInit);
		
		panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 2;
		contentPane.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0};
		gbl_panel_1.rowHeights = new int[]{0};
		gbl_panel_1.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 3;
		contentPane.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0};
		gbl_panel_2.rowHeights = new int[]{0};
		gbl_panel_2.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 0, 0, 5);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 4;
		contentPane.add(panel_3, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{0};
		gbl_panel_3.rowHeights = new int[]{0};
		gbl_panel_3.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
	}

}
