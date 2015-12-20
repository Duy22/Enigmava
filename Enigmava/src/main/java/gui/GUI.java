package gui;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import engine.Alphabet;
import engine.CryptAlgo;
import engine.Key;
import engine.Reflector;
import engine.Rotor;
import javax.swing.SpinnerNumberModel;

public class GUI extends JFrame{

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
	private JButton setButton;
	private JSpinner keyFirstRotorInitialRotation;
	private JSpinner keySecondRotorInitialRotation;
	private JSpinner keyThirdRotorInitialRotation;
	private JLabel lblFirstRotor;
	private JLabel lblSecondRotor;
	private JLabel lblThirdRotor;
	private JLabel lblRotorNumber;
	private JLabel lblLeftOrRight;
	private JLabel lblInitialRotations;
	private JComboBox keyFirstRotorOrientation;
	private JComboBox keySecondRotorOrientation;
	private JComboBox keyThirdRotorOrientation;
	private JComboBox keyFirstRotorNumber;
	private JComboBox keySecondRotorNumber;
	private JComboBox keyThirdRotorNumber;
	private JTextPane txtpnEntrezLaChaine;
	private JTextPane textPane_1;
	private JButton encrypt;
	private JButton nextStepButton;
	private JButton decrypt;
	private Alphabet abc;
	private Reflector ref;
	private Rotor rot1;
	private Rotor rot2;
	private Rotor rot3;
	private Key k;
	private ArrayList<Rotor> rotList;
	private CryptAlgo algo;

	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		//instance of components
		abc = new Alphabet();
		ref = new Reflector();
		rot1 = new Rotor();
		rot2 = new Rotor();
		rot3 = new Rotor();
		k = new Key(rot2,rot3,rot1);
		rotList = new ArrayList<Rotor>();
		rotList.add(0, rot1);
		rotList.add(1, rot2);
		rotList.add(2, rot3);
		algo = new CryptAlgo(k, rotList, ref, abc);
		algo.initReflector();
		
		setTitle("Enigmava");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1100, 800);
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
		gbc_upperPanel.insets = new Insets(10, 10, 5, 5);
		gbc_upperPanel.fill = GridBagConstraints.BOTH;
		gbc_upperPanel.gridx = 0;
		gbc_upperPanel.gridy = 0;
		contentPane.add(upperPanel, gbc_upperPanel);
		GridBagLayout gbl_upperPanel = new GridBagLayout();
		gbl_upperPanel.columnWidths = new int[] { 0, 0};
		gbl_upperPanel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_upperPanel.columnWeights = new double[] { 1.0, 1.0 };
		gbl_upperPanel.rowWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, 1.0 };
		upperPanel.setLayout(gbl_upperPanel);

		tableReflector = new JTable();
		tableReflector.setEnabled(false);
		tableReflector.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null, null, null, null, null, null,
						null, null, null, null, null, null, null, null, null, null, null, null }, },
				new String[] { "New column", "New column", "New column", "New column", "New column", "New column",
						"New column", "New column", "New column", "New column", "New column", "New column",
						"New column", "New column", "New column", "New column", "New column", "New column",
						"New column", "New column", "New column", "New column", "New column", "New column",
						"New column", "New column" }));
		GridBagConstraints gbc_tableReflector = new GridBagConstraints();
		gbc_tableReflector.weightx = 1.0;
		gbc_tableReflector.gridwidth = 2;
		gbc_tableReflector.insets = new Insets(5, 0, 10, 0);
		gbc_tableReflector.fill = GridBagConstraints.HORIZONTAL;
		gbc_tableReflector.gridx = 0;
		gbc_tableReflector.gridy = 0;
		upperPanel.add(tableReflector, gbc_tableReflector);

		tableRotor3 = new JTable();
		tableRotor3.setEnabled(false);
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
		gbc_tableRotor3.gridwidth = 2;
		gbc_tableRotor3.insets = new Insets(0, 0, 5, 0);
		gbc_tableRotor3.fill = GridBagConstraints.HORIZONTAL;
		gbc_tableRotor3.gridx = 0;
		gbc_tableRotor3.gridy = 1;
		upperPanel.add(tableRotor3, gbc_tableRotor3);

		tableRotor2 = new JTable();
		tableRotor2.setEnabled(false);
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
		gbc_tableRotor2.gridwidth = 2;
		gbc_tableRotor2.insets = new Insets(0, 0, 5, 0);
		gbc_tableRotor2.fill = GridBagConstraints.HORIZONTAL;
		gbc_tableRotor2.gridx = 0;
		gbc_tableRotor2.gridy = 2;
		upperPanel.add(tableRotor2, gbc_tableRotor2);

		tableRotor1 = new JTable();
		tableRotor1.setEnabled(false);
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
		gbc_tableRotor1.gridwidth = 2;
		gbc_tableRotor1.insets = new Insets(0, 0, 5, 0);
		gbc_tableRotor1.fill = GridBagConstraints.HORIZONTAL;
		gbc_tableRotor1.gridx = 0;
		gbc_tableRotor1.gridy = 3;
		upperPanel.add(tableRotor1, gbc_tableRotor1);

		tableAlphabet = new JTable();
		tableAlphabet.setEnabled(false);
		tableAlphabet.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null, null, null, null, null, null,
						null, null, null, null, null, null, null, null, null, null, null, null }, },
				new String[] { "New column", "New column", "New column", "New column", "New column", "New column",
						"New column", "New column", "New column", "New column", "New column", "New column",
						"New column", "New column", "New column", "New column", "New column", "New column",
						"New column", "New column", "New column", "New column", "New column", "New column",
						"New column", "New column" }));
		GridBagConstraints gbc_tableAlphabet = new GridBagConstraints();
		gbc_tableAlphabet.gridwidth = 2;
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

		keyFirstRotorNumber = new JComboBox();
		keyFirstRotorNumber.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3" }));
		GridBagConstraints gbc_keyFirstRotorNumber = new GridBagConstraints();
		gbc_keyFirstRotorNumber.insets = new Insets(0, 0, 5, 5);
		gbc_keyFirstRotorNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_keyFirstRotorNumber.gridx = 1;
		gbc_keyFirstRotorNumber.gridy = 1;
		lowerPanel.add(keyFirstRotorNumber, gbc_keyFirstRotorNumber);

		keySecondRotorNumber = new JComboBox();
		keySecondRotorNumber.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3" }));
		GridBagConstraints gbc_keySecondRotorNumber = new GridBagConstraints();
		gbc_keySecondRotorNumber.insets = new Insets(0, 0, 5, 5);
		gbc_keySecondRotorNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_keySecondRotorNumber.gridx = 2;
		gbc_keySecondRotorNumber.gridy = 1;
		lowerPanel.add(keySecondRotorNumber, gbc_keySecondRotorNumber);

		keyThirdRotorNumber = new JComboBox();
		keyThirdRotorNumber.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3" }));
		GridBagConstraints gbc_keyThirdRotorNumber = new GridBagConstraints();
		gbc_keyThirdRotorNumber.insets = new Insets(0, 0, 5, 5);
		gbc_keyThirdRotorNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_keyThirdRotorNumber.gridx = 3;
		gbc_keyThirdRotorNumber.gridy = 1;
		lowerPanel.add(keyThirdRotorNumber, gbc_keyThirdRotorNumber);

		lblLeftOrRight = new JLabel("Left or Right");
		lblLeftOrRight.setFont(new Font("Dialog", Font.BOLD, 8));
		GridBagConstraints gbc_lblLeftOrRight = new GridBagConstraints();
		gbc_lblLeftOrRight.anchor = GridBagConstraints.EAST;
		gbc_lblLeftOrRight.insets = new Insets(0, 0, 5, 5);
		gbc_lblLeftOrRight.gridx = 0;
		gbc_lblLeftOrRight.gridy = 2;
		lowerPanel.add(lblLeftOrRight, gbc_lblLeftOrRight);

		keyFirstRotorOrientation = new JComboBox();
		keyFirstRotorOrientation.setModel(new DefaultComboBoxModel(new String[] { "Left", "Right" }));
		GridBagConstraints gbc_keyFirstRotorOrientation = new GridBagConstraints();
		gbc_keyFirstRotorOrientation.insets = new Insets(0, 0, 5, 5);
		gbc_keyFirstRotorOrientation.fill = GridBagConstraints.HORIZONTAL;
		gbc_keyFirstRotorOrientation.gridx = 1;
		gbc_keyFirstRotorOrientation.gridy = 2;
		lowerPanel.add(keyFirstRotorOrientation, gbc_keyFirstRotorOrientation);

		keySecondRotorOrientation = new JComboBox();
		keySecondRotorOrientation.setModel(new DefaultComboBoxModel(new String[] { "Left", "Right" }));
		GridBagConstraints gbc_keySecondRotorOrientation = new GridBagConstraints();
		gbc_keySecondRotorOrientation.insets = new Insets(0, 0, 5, 5);
		gbc_keySecondRotorOrientation.fill = GridBagConstraints.HORIZONTAL;
		gbc_keySecondRotorOrientation.gridx = 2;
		gbc_keySecondRotorOrientation.gridy = 2;
		lowerPanel.add(keySecondRotorOrientation, gbc_keySecondRotorOrientation);

		keyThirdRotorOrientation = new JComboBox();
		keyThirdRotorOrientation.setModel(new DefaultComboBoxModel(new String[] { "Left", "Right" }));
		GridBagConstraints gbc_keyThirdRotorOrientation = new GridBagConstraints();
		gbc_keyThirdRotorOrientation.insets = new Insets(0, 0, 5, 5);
		gbc_keyThirdRotorOrientation.fill = GridBagConstraints.HORIZONTAL;
		gbc_keyThirdRotorOrientation.gridx = 3;
		gbc_keyThirdRotorOrientation.gridy = 2;
		lowerPanel.add(keyThirdRotorOrientation, gbc_keyThirdRotorOrientation);

		setButton = new JButton("Set");
		setButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				k.setSequenceRotor(0, rotList.get(getKeyFirstRotorNumber().getSelectedIndex()));
				k.setSequenceRotor(1, rotList.get(getKeySecondRotorNumber().getSelectedIndex()));
				k.setSequenceRotor(2, rotList.get(getKeyThirdRotorNumber().getSelectedIndex()));
				
				boolean orientation = false;
				if(getKeyFirstRotorOrientation().getSelectedIndex()==0) {
					orientation = true;
				}
				else {
					orientation = false;
				}
				k.setSequenceOrientation(0, orientation);
				if(getKeySecondRotorOrientation().getSelectedIndex()==0) {
					orientation = true;
				}
				else {
					orientation = false;
				}
				k.setSequenceOrientation(1, orientation);
				if(getKeyThirdRotorOrientation().getSelectedIndex()==0) {
					orientation = true;
				}
				else {
					orientation = false;
				}
				k.setSequenceOrientation(2, orientation);
				
				k.setSequenceInit(0, (Integer) getKeyFirstRotorInitialRotation().getValue());
				k.setSequenceInit(1, (Integer) getKeySecondRotorInitialRotation().getValue());
				k.setSequenceInit(2, (Integer) getKeyThirdRotorInitialRotation().getValue());
				algo.encrypt();
				
				for(int i=0; i<26;i++) {
					getTableReflector().setValueAt(ref.getNum(i), 0, i);
					getTableRotor3().setValueAt(rot3.getUpperLaneValue(i), 0, i);
					getTableRotor3().setValueAt(rot3.getLowerLaneValue(i), 1, i);
					getTableRotor2().setValueAt(rot2.getUpperLaneValue(i), 0, i);
					getTableRotor2().setValueAt(rot2.getLowerLaneValue(i), 1, i);
					getTableRotor1().setValueAt(rot1.getUpperLaneValue(i), 0, i);
					getTableRotor1().setValueAt(rot1.getLowerLaneValue(i), 1, i);
					getTableAlphabet().setValueAt(abc.getLetter(i), 0, i);
				}
			}
		});
		GridBagConstraints gbc_setButton = new GridBagConstraints();
		gbc_setButton.gridwidth = 3;
		gbc_setButton.insets = new Insets(0, 0, 5, 5);
		gbc_setButton.gridx = 4;
		gbc_setButton.gridy = 2;
		lowerPanel.add(setButton, gbc_setButton);

		lblInitialRotations = new JLabel("Initial Rotations");
		lblInitialRotations.setFont(new Font("Dialog", Font.BOLD, 8));
		GridBagConstraints gbc_lblInitialRotations = new GridBagConstraints();
		gbc_lblInitialRotations.insets = new Insets(0, 0, 5, 5);
		gbc_lblInitialRotations.gridx = 0;
		gbc_lblInitialRotations.gridy = 3;
		lowerPanel.add(lblInitialRotations, gbc_lblInitialRotations);

		keyFirstRotorInitialRotation = new JSpinner();
		keyFirstRotorInitialRotation.setModel(new SpinnerNumberModel(new Integer(0), null, null, new Integer(1)));
		GridBagConstraints gbc_keyFirstRotorInitialRotation = new GridBagConstraints();
		gbc_keyFirstRotorInitialRotation.fill = GridBagConstraints.HORIZONTAL;
		gbc_keyFirstRotorInitialRotation.insets = new Insets(0, 0, 5, 5);
		gbc_keyFirstRotorInitialRotation.gridx = 1;
		gbc_keyFirstRotorInitialRotation.gridy = 3;
		lowerPanel.add(keyFirstRotorInitialRotation, gbc_keyFirstRotorInitialRotation);

		keySecondRotorInitialRotation = new JSpinner();
		GridBagConstraints gbc_keySecondRotorInitialRotation = new GridBagConstraints();
		gbc_keySecondRotorInitialRotation.fill = GridBagConstraints.HORIZONTAL;
		gbc_keySecondRotorInitialRotation.insets = new Insets(0, 0, 5, 5);
		gbc_keySecondRotorInitialRotation.gridx = 2;
		gbc_keySecondRotorInitialRotation.gridy = 3;
		lowerPanel.add(keySecondRotorInitialRotation, gbc_keySecondRotorInitialRotation);

		keyThirdRotorInitialRotation = new JSpinner();
		GridBagConstraints gbc_keyThirdRotorInitialRotation = new GridBagConstraints();
		gbc_keyThirdRotorInitialRotation.fill = GridBagConstraints.HORIZONTAL;
		gbc_keyThirdRotorInitialRotation.insets = new Insets(0, 0, 5, 5);
		gbc_keyThirdRotorInitialRotation.gridx = 3;
		gbc_keyThirdRotorInitialRotation.gridy = 3;
		lowerPanel.add(keyThirdRotorInitialRotation, gbc_keyThirdRotorInitialRotation);

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

		panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
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
				//System.out.println("bouton encrypt");
				this.boutonEncrypt();
			}

			private void boutonEncrypt() {
				// TODO Auto-generated method stub
				System.out.println("encrypt bouton");
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
				System.out.println("bouton nextStep");
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
		
		for(int i=0; i<26;i++) {
			this.getTableReflector().setValueAt(ref.getNum(i), 0, i);
			this.getTableRotor3().setValueAt(rot3.getUpperLaneValue(i), 0, i);
			this.getTableRotor3().setValueAt(rot3.getLowerLaneValue(i), 1, i);
			this.getTableRotor2().setValueAt(rot2.getUpperLaneValue(i), 0, i);
			this.getTableRotor2().setValueAt(rot2.getLowerLaneValue(i), 1, i);
			this.getTableRotor1().setValueAt(rot1.getUpperLaneValue(i), 0, i);
			this.getTableRotor1().setValueAt(rot1.getLowerLaneValue(i), 1, i);
			this.getTableAlphabet().setValueAt(abc.getLetter(i), 0, i);
		}
		
	}
	
	/**
	 * @return the tableReflector
	 */
	public JTable getTableReflector() {
		return tableReflector;
	}

	/**
	 * @return the tableRotor3
	 */
	public JTable getTableRotor3() {
		return tableRotor3;
	}

	/**
	 * @return the tableRotor2
	 */
	public JTable getTableRotor2() {
		return tableRotor2;
	}

	/**
	 * @return the tableRotor1
	 */
	public JTable getTableRotor1() {
		return tableRotor1;
	}

	/**
	 * @return the tableAlphabet
	 */
	public JTable getTableAlphabet() {
		return tableAlphabet;
	}

	/**
	 * @return the spinner_1
	 */
	public JSpinner getKeyFirstRotorInitialRotation() {
		return keyFirstRotorInitialRotation;
	}

	/**
	 * @return the spinner_3
	 */
	public JSpinner getKeySecondRotorInitialRotation() {
		return keySecondRotorInitialRotation;
	}

	/**
	 * @return the spinner_5
	 */
	public JSpinner getKeyThirdRotorInitialRotation() {
		return keyThirdRotorInitialRotation;
	}

	/**
	 * @return the comboBox
	 */
	public JComboBox getKeyFirstRotorOrientation() {
		return keyFirstRotorOrientation;
	}

	/**
	 * @return the comboBox_1
	 */
	public JComboBox getKeySecondRotorOrientation() {
		return keySecondRotorOrientation;
	}

	/**
	 * @return the comboBox_2
	 */
	public JComboBox getKeyThirdRotorOrientation() {
		return keyThirdRotorOrientation;
	}

	/**
	 * @return the comboBox_3
	 */
	public JComboBox getKeyFirstRotorNumber() {
		return keyFirstRotorNumber;
	}

	/**
	 * @return the comboBox_4
	 */
	public JComboBox getKeySecondRotorNumber() {
		return keySecondRotorNumber;
	}

	/**
	 * @return the comboBox_5
	 */
	public JComboBox getKeyThirdRotorNumber() {
		return keyThirdRotorNumber;
	}
}