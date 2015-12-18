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
import javax.swing.JSlider;
import javax.swing.JTree;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	private JLabel lblKey;
	private JButton btnNewButton;
	private JSpinner spinner_1;
	private JSpinner spinner_3;
	private JSpinner spinner_5;
	private JLabel lblFirstRotor;
	private JLabel lblSecondRotor;
	private JLabel lblThirdRotor;
	private JLabel lblRotorNumber;
	private JLabel lblLeftOrRight;
	private JLabel lblInitialRotations;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JComboBox comboBox_4;
	private JComboBox comboBox_5;
	private JTextPane txtpnEntrezLaChaine;
	private JTextPane textPane_1;
	private JButton encrypt;
	private JButton nextStepButton;
	private JButton decrypt;

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
		setBounds(100, 100, 550, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 1 };
		gbl_contentPane.rowHeights = new int[] { 208, 0, 29, 30, 36, 0, 1 };
		gbl_contentPane.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JPanel upperPanel = new JPanel();
		GridBagConstraints gbc_upperPanel = new GridBagConstraints();
		gbc_upperPanel.insets = new Insets(0, 0, 5, 5);
		gbc_upperPanel.fill = GridBagConstraints.VERTICAL;
		gbc_upperPanel.gridx = 0;
		gbc_upperPanel.gridy = 0;
		contentPane.add(upperPanel, gbc_upperPanel);
		GridBagLayout gbl_upperPanel = new GridBagLayout();
		gbl_upperPanel.columnWidths = new int[] { 0, 0 };
		gbl_upperPanel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_upperPanel.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_upperPanel.rowWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		upperPanel.setLayout(gbl_upperPanel);

		tableReflector = new JTable();
		tableReflector.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null, null, null, null, null, null,
						null, null, null, null, null, null, null, null, null, null, null, null }, },
				new String[] { "New column", "New column", "New column", "New column", "New column", "New column",
						"New column", "New column", "New column", "New column", "New column", "New column",
						"New column", "New column", "New column", "New column", "New column", "New column",
						"New column", "New column", "New column", "New column", "New column", "New column",
						"New column", "New column" }));
		GridBagConstraints gbc_tableReflector = new GridBagConstraints();
		gbc_tableReflector.insets = new Insets(0, 0, 5, 0);
		gbc_tableReflector.fill = GridBagConstraints.HORIZONTAL;
		gbc_tableReflector.gridx = 0;
		gbc_tableReflector.gridy = 0;
		upperPanel.add(tableReflector, gbc_tableReflector);

		tableRotor3 = new JTable();
		tableRotor3.setModel(new DefaultTableModel(
				new Object[][] {
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null, null, null, null, null, null, null, null, null, null }, },
				new String[] { "New column", "New column", "New column", "New column", "New column", "New column",
						"New column", "New column", "New column", "New column", "New column", "New column",
						"New column", "New column", "New column", "New column", "New column", "New column",
						"New column", "New column", "New column", "New column", "New column", "New column",
						"New column", "New column" }));
		GridBagConstraints gbc_tableRotor3 = new GridBagConstraints();
		gbc_tableRotor3.insets = new Insets(0, 0, 5, 0);
		gbc_tableRotor3.fill = GridBagConstraints.HORIZONTAL;
		gbc_tableRotor3.gridx = 0;
		gbc_tableRotor3.gridy = 1;
		upperPanel.add(tableRotor3, gbc_tableRotor3);

		tableRotor2 = new JTable();
		tableRotor2.setModel(new DefaultTableModel(
				new Object[][] {
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null, null, null, null, null, null, null, null, null, null }, },
				new String[] { "New column", "New column", "New column", "New column", "New column", "New column",
						"New column", "New column", "New column", "New column", "New column", "New column",
						"New column", "New column", "New column", "New column", "New column", "New column",
						"New column", "New column", "New column", "New column", "New column", "New column",
						"New column", "New column" }));
		GridBagConstraints gbc_tableRotor2 = new GridBagConstraints();
		gbc_tableRotor2.insets = new Insets(0, 0, 5, 0);
		gbc_tableRotor2.fill = GridBagConstraints.HORIZONTAL;
		gbc_tableRotor2.gridx = 0;
		gbc_tableRotor2.gridy = 2;
		upperPanel.add(tableRotor2, gbc_tableRotor2);

		tableRotor1 = new JTable();
		tableRotor1.setModel(new DefaultTableModel(
				new Object[][] {
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null, null, null, null, null, null, null, null, null, null }, },
				new String[] { "New column", "New column", "New column", "New column", "New column", "New column",
						"New column", "New column", "New column", "New column", "New column", "New column",
						"New column", "New column", "New column", "New column", "New column", "New column",
						"New column", "New column", "New column", "New column", "New column", "New column",
						"New column", "New column" }));
		GridBagConstraints gbc_tableRotor1 = new GridBagConstraints();
		gbc_tableRotor1.insets = new Insets(0, 0, 5, 0);
		gbc_tableRotor1.fill = GridBagConstraints.HORIZONTAL;
		gbc_tableRotor1.gridx = 0;
		gbc_tableRotor1.gridy = 3;
		upperPanel.add(tableRotor1, gbc_tableRotor1);

		tableAlphabet = new JTable();
		tableAlphabet.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null, null, null, null, null, null,
						null, null, null, null, null, null, null, null, null, null, null, null }, },
				new String[] { "New column", "New column", "New column", "New column", "New column", "New column",
						"New column", "New column", "New column", "New column", "New column", "New column",
						"New column", "New column", "New column", "New column", "New column", "New column",
						"New column", "New column", "New column", "New column", "New column", "New column",
						"New column", "New column" }));
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
		gbl_panel.columnWidths = new int[] { 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
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

		lblKey = new JLabel("Key");
		GridBagConstraints gbc_lblKey = new GridBagConstraints();
		gbc_lblKey.insets = new Insets(0, 0, 5, 5);
		gbc_lblKey.gridx = 0;
		gbc_lblKey.gridy = 1;
		contentPane.add(lblKey, gbc_lblKey);

		JPanel lowerPanel = new JPanel();
		GridBagConstraints gbc_lowerPanel = new GridBagConstraints();
		gbc_lowerPanel.insets = new Insets(0, 0, 5, 5);
		gbc_lowerPanel.fill = GridBagConstraints.BOTH;
		gbc_lowerPanel.gridx = 0;
		gbc_lowerPanel.gridy = 2;
		contentPane.add(lowerPanel, gbc_lowerPanel);
		GridBagLayout gbl_lowerPanel = new GridBagLayout();
		gbl_lowerPanel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_lowerPanel.rowHeights = new int[] { 15, 34, 0, 0, 0, 0 };
		gbl_lowerPanel.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_lowerPanel.rowWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		lowerPanel.setLayout(gbl_lowerPanel);

		lblFirstRotor = new JLabel("First Rotor");
		lblFirstRotor.setFont(new Font("Dialog", Font.BOLD, 8));
		GridBagConstraints gbc_lblFirstRotor = new GridBagConstraints();
		gbc_lblFirstRotor.insets = new Insets(0, 0, 5, 5);
		gbc_lblFirstRotor.gridx = 1;
		gbc_lblFirstRotor.gridy = 0;
		lowerPanel.add(lblFirstRotor, gbc_lblFirstRotor);

		lblSecondRotor = new JLabel("Second Rotor");
		lblSecondRotor.setFont(new Font("Dialog", Font.BOLD, 8));
		GridBagConstraints gbc_lblSecondRotor = new GridBagConstraints();
		gbc_lblSecondRotor.insets = new Insets(0, 0, 5, 5);
		gbc_lblSecondRotor.gridx = 2;
		gbc_lblSecondRotor.gridy = 0;
		lowerPanel.add(lblSecondRotor, gbc_lblSecondRotor);

		lblThirdRotor = new JLabel("Third Rotor");
		lblThirdRotor.setFont(new Font("Dialog", Font.BOLD, 8));
		GridBagConstraints gbc_lblThirdRotor = new GridBagConstraints();
		gbc_lblThirdRotor.insets = new Insets(0, 0, 5, 5);
		gbc_lblThirdRotor.gridx = 3;
		gbc_lblThirdRotor.gridy = 0;
		lowerPanel.add(lblThirdRotor, gbc_lblThirdRotor);

		lblRotorNumber = new JLabel("Rotor Number");
		lblRotorNumber.setFont(new Font("Dialog", Font.BOLD, 8));
		GridBagConstraints gbc_lblRotorNumber = new GridBagConstraints();
		gbc_lblRotorNumber.anchor = GridBagConstraints.EAST;
		gbc_lblRotorNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblRotorNumber.gridx = 0;
		gbc_lblRotorNumber.gridy = 1;
		lowerPanel.add(lblRotorNumber, gbc_lblRotorNumber);

		comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3" }));
		GridBagConstraints gbc_comboBox_3 = new GridBagConstraints();
		gbc_comboBox_3.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_3.gridx = 1;
		gbc_comboBox_3.gridy = 1;
		lowerPanel.add(comboBox_3, gbc_comboBox_3);

		comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3" }));
		GridBagConstraints gbc_comboBox_4 = new GridBagConstraints();
		gbc_comboBox_4.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_4.gridx = 2;
		gbc_comboBox_4.gridy = 1;
		lowerPanel.add(comboBox_4, gbc_comboBox_4);

		comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3" }));
		GridBagConstraints gbc_comboBox_5 = new GridBagConstraints();
		gbc_comboBox_5.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_5.gridx = 3;
		gbc_comboBox_5.gridy = 1;
		lowerPanel.add(comboBox_5, gbc_comboBox_5);

		lblLeftOrRight = new JLabel("Left or Right");
		lblLeftOrRight.setFont(new Font("Dialog", Font.BOLD, 8));
		GridBagConstraints gbc_lblLeftOrRight = new GridBagConstraints();
		gbc_lblLeftOrRight.anchor = GridBagConstraints.EAST;
		gbc_lblLeftOrRight.insets = new Insets(0, 0, 5, 5);
		gbc_lblLeftOrRight.gridx = 0;
		gbc_lblLeftOrRight.gridy = 2;
		lowerPanel.add(lblLeftOrRight, gbc_lblLeftOrRight);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Left", "Right" }));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 2;
		lowerPanel.add(comboBox, gbc_comboBox);

		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "Left", "Right" }));
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 2;
		gbc_comboBox_1.gridy = 2;
		lowerPanel.add(comboBox_1, gbc_comboBox_1);

		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "Left", "Right" }));
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 3;
		gbc_comboBox_2.gridy = 2;
		lowerPanel.add(comboBox_2, gbc_comboBox_2);

		btnNewButton = new JButton("Set");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 3;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 4;
		gbc_btnNewButton.gridy = 2;
		lowerPanel.add(btnNewButton, gbc_btnNewButton);

		lblInitialRotations = new JLabel("Initial Rotations");
		lblInitialRotations.setFont(new Font("Dialog", Font.BOLD, 8));
		GridBagConstraints gbc_lblInitialRotations = new GridBagConstraints();
		gbc_lblInitialRotations.insets = new Insets(0, 0, 5, 5);
		gbc_lblInitialRotations.gridx = 0;
		gbc_lblInitialRotations.gridy = 3;
		lowerPanel.add(lblInitialRotations, gbc_lblInitialRotations);

		spinner_1 = new JSpinner();
		GridBagConstraints gbc_spinner_1 = new GridBagConstraints();
		gbc_spinner_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinner_1.insets = new Insets(0, 0, 5, 5);
		gbc_spinner_1.gridx = 1;
		gbc_spinner_1.gridy = 3;
		lowerPanel.add(spinner_1, gbc_spinner_1);

		spinner_3 = new JSpinner();
		GridBagConstraints gbc_spinner_3 = new GridBagConstraints();
		gbc_spinner_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinner_3.insets = new Insets(0, 0, 5, 5);
		gbc_spinner_3.gridx = 2;
		gbc_spinner_3.gridy = 3;
		lowerPanel.add(spinner_3, gbc_spinner_3);

		spinner_5 = new JSpinner();
		GridBagConstraints gbc_spinner_5 = new GridBagConstraints();
		gbc_spinner_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinner_5.insets = new Insets(0, 0, 5, 5);
		gbc_spinner_5.gridx = 3;
		gbc_spinner_5.gridy = 3;
		lowerPanel.add(spinner_5, gbc_spinner_5);

		panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 3;
		contentPane.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 0, 0 };
		gbl_panel_1.rowHeights = new int[] { 0, 0 };
		gbl_panel_1.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);

		txtpnEntrezLaChaine = new JTextPane();
		txtpnEntrezLaChaine.setFont(new Font("Dialog", Font.PLAIN, 10));
		String chaine = txtpnEntrezLaChaine.getText();
		GridBagConstraints gbc_txtpnEntrezLaChaine = new GridBagConstraints();
		gbc_txtpnEntrezLaChaine.weightx = 1.0;
		gbc_txtpnEntrezLaChaine.weighty = 1.0;
		gbc_txtpnEntrezLaChaine.fill = GridBagConstraints.BOTH;
		gbc_txtpnEntrezLaChaine.gridx = 0;
		gbc_txtpnEntrezLaChaine.gridy = 0;
		panel_1.add(txtpnEntrezLaChaine, gbc_txtpnEntrezLaChaine);
		this.

		panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.anchor = GridBagConstraints.NORTH;
		gbc_panel_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_2.insets = new Insets(0, 0, 0, 5);
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 4;
		contentPane.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel_2.rowHeights = new int[] { 0, 0 };
		gbl_panel_2.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_2.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		panel_2.setLayout(gbl_panel_2);

		encrypt = new JButton("Encrypt");
		encrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		GridBagConstraints gbc_encrypt = new GridBagConstraints();
		gbc_encrypt.insets = new Insets(0, 0, 0, 5);
		gbc_encrypt.gridx = 1;
		gbc_encrypt.gridy = 0;
		panel_2.add(encrypt, gbc_encrypt);

		nextStepButton = new JButton("Next Step");
		nextStepButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		GridBagConstraints gbc_nextStepButton = new GridBagConstraints();
		gbc_nextStepButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_nextStepButton.insets = new Insets(0, 0, 0, 5);
		gbc_nextStepButton.gridx = 3;
		gbc_nextStepButton.gridy = 0;
		panel_2.add(nextStepButton, gbc_nextStepButton);
		
		

		decrypt = new JButton("Decrypt");
		decrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		GridBagConstraints gbc_decrypt = new GridBagConstraints();
		gbc_decrypt.fill = GridBagConstraints.HORIZONTAL;
		gbc_decrypt.gridx = 5;
		gbc_decrypt.gridy = 0;
		panel_2.add(decrypt, gbc_decrypt);

		panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 0, 0, 5);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 5;
		contentPane.add(panel_3, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[] { 0, 0 };
		gbl_panel_3.rowHeights = new int[] { 0, 0 };
		gbl_panel_3.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panel_3.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		panel_3.setLayout(gbl_panel_3);

		textPane_1 = new JTextPane();
		textPane_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		GridBagConstraints gbc_textPane_1 = new GridBagConstraints();
		gbc_textPane_1.weightx = 1.0;
		gbc_textPane_1.weighty = 2.0;
		gbc_textPane_1.fill = GridBagConstraints.BOTH;
		gbc_textPane_1.gridx = 0;
		gbc_textPane_1.gridy = 0;
		panel_3.add(textPane_1, gbc_textPane_1);
	}

}