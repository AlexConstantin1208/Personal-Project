package CustomerBilling;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.print.PrinterException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class CustomerBilling extends JFrame {

	private JPanel contentPane;
	private JTextField jtxtCustomerRef;
	private JTextField jtxtFirstName;
	private JTextField jtxtSurname;
	private JTextField jtxtAddress;
	private JTextField jtxtPostCode;
	private JTextField jtxtMobile;
	private JTextField jtxtEmail;
	private JTextField jtxtDOB;
	private JTextField jtxtChicken;
	private JTextField jtxtTraditional;
	private JTextField jtxtGrilledFish;
	private JTextField jtxtChick;
	private JTextField jtxtTurkey;
	private JTextField jtxtPasta;
	private JTextField jtxtBaked;
	private JTextField jtxtMashed;
	private JTextField jtxtTomato;
	private JTextField jtxtRice;
	private JTextField jtxtChocolate;
	private JTextField jtxtIce;
	private JTextField jtxtTax;
	private JTextField jtxtSubTotal;
	private JTextField jtxtTotal;
	private JFrame frame;
	
	String iTax, iSubtotal, iTotal;
	double[] itemcost = new double[100];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					CustomerBilling frame = new CustomerBilling();
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
	public CustomerBilling() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				
				jtxtCustomerRef.setText(null);
				jtxtCustomerRef.setEnabled(false);
				int refs = 5015 + (int)(Math.random()*17238);
				String cRef = "";
				cRef += refs + 1560;
				jtxtCustomerRef.setText(cRef);
				
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setBorder(new MatteBorder(14, 14, 14, 14, new Color(32, 178, 170)));
		panel.setBounds(10, 11, 1175, 643);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(37, 23, 348, 434);
		panel_1.setBorder(new MatteBorder(14, 14, 14, 14, new Color(32, 178, 170)));
		panel_1.setBackground(new Color(224, 255, 255));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		jtxtCustomerRef = new JTextField();
		jtxtCustomerRef.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtCustomerRef.setBounds(180, 29, 127, 26);
		panel_1.add(jtxtCustomerRef);
		jtxtCustomerRef.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Customer Ref");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(28, 30, 142, 25);
		panel_1.add(lblNewLabel);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFirstName.setBounds(28, 66, 142, 25);
		panel_1.add(lblFirstName);
		
		jtxtFirstName = new JTextField();
		jtxtFirstName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtFirstName.setColumns(10);
		jtxtFirstName.setBounds(180, 65, 127, 26);
		panel_1.add(jtxtFirstName);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSurname.setBounds(28, 103, 142, 25);
		panel_1.add(lblSurname);
		
		jtxtSurname = new JTextField();
		jtxtSurname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtSurname.setColumns(10);
		jtxtSurname.setBounds(180, 102, 127, 26);
		panel_1.add(jtxtSurname);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAddress.setBounds(28, 140, 142, 25);
		panel_1.add(lblAddress);
		
		jtxtAddress = new JTextField();
		jtxtAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtAddress.setColumns(10);
		jtxtAddress.setBounds(180, 139, 127, 26);
		panel_1.add(jtxtAddress);
		
		JLabel lblPostCode = new JLabel("Post Code");
		lblPostCode.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPostCode.setBounds(28, 177, 142, 25);
		panel_1.add(lblPostCode);
		
		jtxtPostCode = new JTextField();
		jtxtPostCode.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtPostCode.setColumns(10);
		jtxtPostCode.setBounds(180, 176, 127, 26);
		panel_1.add(jtxtPostCode);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mobile");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(28, 213, 142, 25);
		panel_1.add(lblNewLabel_1_1);
		
		jtxtMobile = new JTextField();
		jtxtMobile.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtMobile.setColumns(10);
		jtxtMobile.setBounds(180, 212, 127, 26);
		panel_1.add(jtxtMobile);
		
		JLabel lblNewLabel_1_2 = new JLabel("E-mail");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(28, 249, 142, 25);
		panel_1.add(lblNewLabel_1_2);
		
		jtxtEmail = new JTextField();
		jtxtEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtEmail.setColumns(10);
		jtxtEmail.setBounds(180, 248, 127, 26);
		panel_1.add(jtxtEmail);
		
		JLabel lblNewLabel_1_3 = new JLabel("Date of Birth");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(28, 286, 142, 25);
		panel_1.add(lblNewLabel_1_3);
		
		jtxtDOB = new JTextField();
		jtxtDOB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtDOB.setColumns(10);
		jtxtDOB.setBounds(180, 285, 127, 26);
		panel_1.add(jtxtDOB);
		
		JLabel lblNewLabel_1_4 = new JLabel("Type of ID");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_4.setBounds(28, 325, 142, 25);
		panel_1.add(lblNewLabel_1_4);
		
		JComboBox jcmbID = new JComboBox();
		jcmbID.setModel(new DefaultComboBoxModel(new String[] {"-", "ID Card", "Driver's License"}));
		jcmbID.setBounds(180, 330, 127, 22);
		panel_1.add(jcmbID);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new MatteBorder(14, 14, 14, 14, new Color(32, 178, 170)));
		panel_1_1.setBackground(new Color(224, 255, 255));
		panel_1_1.setBounds(413, 23, 348, 598);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JCheckBox jchkTomato = new JCheckBox("Tomato Soup");
		jchkTomato.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(jchkTomato.isSelected()) {
					jtxtTomato.setEnabled(true);
					jtxtTomato.setText("");
					jtxtTomato.requestFocus();
				}
				else {
				jtxtTomato.setEnabled(false);
				jtxtTomato.setText("0");
				}
			}
		});
		jchkTomato.setBackground(new Color(175, 238, 238));
		jchkTomato.setBounds(23, 22, 142, 25);
		jchkTomato.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1_1.add(jchkTomato);
		
		JCheckBox jchkChicken = new JCheckBox("Chicken Soup");
		jchkChicken.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jchkChicken.isSelected()) {
					jtxtChicken.setEnabled(true);
					jtxtChicken.setText("");
					jtxtChicken.requestFocus();
				}
				else {
				jtxtChicken.setEnabled(false);
				jtxtChicken.setText("0");
				}
			}
		});
		jchkChicken.setBackground(new Color(175, 238, 238));
		jchkChicken.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jchkChicken.setBounds(23, 63, 142, 25);
		panel_1_1.add(jchkChicken);
		
		jtxtChicken = new JTextField();
		jtxtChicken.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtChicken.setText("0");
		jtxtChicken.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jtxtChicken.setColumns(10);
		jtxtChicken.setBounds(175, 62, 127, 26);
		panel_1_1.add(jtxtChicken);
		
		JCheckBox jchkTraditional = new JCheckBox("Traditional Soup");
		jchkTraditional.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jchkTraditional.isSelected()) {
					jtxtTraditional.setEnabled(true);
					jtxtTraditional.setText("");
					jtxtTraditional.requestFocus();
				}else {
				jtxtTraditional.setEnabled(false);
				jtxtTraditional.setText("0");
				}
			}
		});
		jchkTraditional.setBackground(new Color(175, 238, 238));
		jchkTraditional.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jchkTraditional.setBounds(23, 100, 142, 25);
		panel_1_1.add(jchkTraditional);
		
		jtxtTraditional = new JTextField();
		jtxtTraditional.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtTraditional.setText("0");
		jtxtTraditional.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jtxtTraditional.setColumns(10);
		jtxtTraditional.setBounds(175, 99, 127, 26);
		panel_1_1.add(jtxtTraditional);
		
		JCheckBox jchkGrilled = new JCheckBox("Grilled fish");
		jchkGrilled.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jchkGrilled.isSelected()) {
					jtxtGrilledFish.setEnabled(true);
					jtxtGrilledFish.setText("");
					jtxtGrilledFish.requestFocus();
				}
				else {
				jtxtGrilledFish.setEnabled(false);
				jtxtGrilledFish.setText("0");
				}
			}
		});
		jchkGrilled.setBackground(new Color(175, 238, 238));
		jchkGrilled.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jchkGrilled.setBounds(23, 143, 142, 25);
		panel_1_1.add(jchkGrilled);
		
		jtxtGrilledFish = new JTextField();
		jtxtGrilledFish.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtGrilledFish.setText("0");
		jtxtGrilledFish.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jtxtGrilledFish.setColumns(10);
		jtxtGrilledFish.setBounds(175, 142, 127, 26);
		panel_1_1.add(jtxtGrilledFish);
		
		JCheckBox jchkChick = new JCheckBox("Baked Chicken");
		jchkChick.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jchkChick.isSelected()) {
					jtxtChick.setEnabled(true);
					jtxtChick.setText("");
					jtxtChick.requestFocus();
				}
				else {
				jtxtChick.setEnabled(false);
				jtxtChick.setText("0");
				}
			}
		});
		jchkChick.setBackground(new Color(175, 238, 238));
		jchkChick.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jchkChick.setBounds(23, 185, 142, 25);
		panel_1_1.add(jchkChick);
		
		jtxtChick = new JTextField();
		jtxtChick.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtChick.setText("0");
		jtxtChick.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jtxtChick.setColumns(10);
		jtxtChick.setBounds(175, 184, 127, 26);
		panel_1_1.add(jtxtChick);
		
		JCheckBox jchkTurkey = new JCheckBox("Baked Turkey");
		jchkTurkey.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jchkTurkey.isSelected()) {
					jtxtTurkey.setEnabled(true);
					jtxtTurkey.setText("");
					jtxtTurkey.requestFocus();
				}
				else {
				jtxtTurkey.setEnabled(false);
				jtxtTurkey.setText("0");
				}
			}
		});
		jchkTurkey.setBackground(new Color(175, 238, 238));
		jchkTurkey.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jchkTurkey.setBounds(23, 222, 142, 25);
		panel_1_1.add(jchkTurkey);
		
		jtxtTurkey = new JTextField();
		jtxtTurkey.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtTurkey.setText("0");
		jtxtTurkey.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jtxtTurkey.setColumns(10);
		jtxtTurkey.setBounds(175, 221, 127, 26);
		panel_1_1.add(jtxtTurkey);
		
		JCheckBox jchkPasta = new JCheckBox("Pasta Carbonara");
		jchkPasta.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jchkPasta.isSelected()) {
					jtxtPasta.setEnabled(true);
					jtxtPasta.setText("");
					jtxtPasta.requestFocus();
				}
				else {
				jtxtPasta.setEnabled(false);
				jtxtPasta.setText("0");
				}
			}
		});
		jchkPasta.setBackground(new Color(175, 238, 238));
		jchkPasta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jchkPasta.setBounds(23, 258, 142, 25);
		panel_1_1.add(jchkPasta);
		
		jtxtPasta = new JTextField();
		jtxtPasta.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtPasta.setText("0");
		jtxtPasta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jtxtPasta.setColumns(10);
		jtxtPasta.setBounds(175, 258, 127, 26);
		panel_1_1.add(jtxtPasta);
		
		JCheckBox jchkBaked = new JCheckBox("Baked Potatoes");
		jchkBaked.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jchkBaked.isSelected()) {
					jtxtBaked.setEnabled(true);
					jtxtBaked.setText("");
					jtxtBaked.requestFocus();
				}
				else {
				jtxtBaked.setEnabled(false);
				jtxtBaked.setText("0");
				}
			}
		});
		jchkBaked.setBackground(new Color(175, 238, 238));
		jchkBaked.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jchkBaked.setBounds(23, 294, 142, 25);
		panel_1_1.add(jchkBaked);
		
		jtxtBaked = new JTextField();
		jtxtBaked.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtBaked.setText("0");
		jtxtBaked.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jtxtBaked.setColumns(10);
		jtxtBaked.setBounds(175, 295, 127, 26);
		panel_1_1.add(jtxtBaked);
		
		JCheckBox jchkMashed = new JCheckBox("Mashed Potatoes");
		jchkMashed.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jchkMashed.isSelected()) {
					jtxtMashed.setEnabled(true);
					jtxtMashed.setText("");
					jtxtMashed.requestFocus();
				}
				else {
				jtxtMashed.setEnabled(false);
				jtxtMashed.setText("0");
				}
			}
		});
		jchkMashed.setBackground(new Color(175, 238, 238));
		jchkMashed.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jchkMashed.setBounds(23, 330, 142, 25);
		panel_1_1.add(jchkMashed);
		
		jtxtMashed = new JTextField();
		jtxtMashed.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtMashed.setText("0");
		jtxtMashed.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jtxtMashed.setColumns(10);
		jtxtMashed.setBounds(175, 332, 127, 26);
		panel_1_1.add(jtxtMashed);
		
		jtxtTomato = new JTextField();
		jtxtTomato.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtTomato.setText("0");
		jtxtTomato.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jtxtTomato.setColumns(10);
		jtxtTomato.setBounds(175, 22, 127, 26);
		panel_1_1.add(jtxtTomato);
		
		jtxtRice = new JTextField();
		jtxtRice.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtRice.setText("0");
		jtxtRice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jtxtRice.setColumns(10);
		jtxtRice.setBounds(175, 369, 127, 26);
		panel_1_1.add(jtxtRice);
		
		JCheckBox jchkRice = new JCheckBox("Rice");
		jchkRice.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jchkRice.isSelected()) {
					jtxtRice.setEnabled(true);
					jtxtRice.setText("");
					jtxtRice.requestFocus();
				}
				else {
				jtxtRice.setEnabled(false);
				jtxtRice.setText("0");
				}
			}
		});
		jchkRice.setBackground(new Color(175, 238, 238));
		jchkRice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jchkRice.setBounds(23, 366, 142, 25);
		panel_1_1.add(jchkRice);
		
		JCheckBox jchkChocolate = new JCheckBox("Chocolate Cake");
		jchkChocolate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jchkTomato.isSelected()) {
					jtxtChocolate.setEnabled(true);
					jtxtChocolate.setText("");
					jtxtChocolate.requestFocus();
				}
				else {
				jtxtChocolate.setEnabled(false);
				jtxtChocolate.setText("0");
				}
			}
		});
		jchkChocolate.setBackground(new Color(175, 238, 238));
		jchkChocolate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jchkChocolate.setBounds(23, 406, 142, 25);
		panel_1_1.add(jchkChocolate);
		
		jtxtChocolate = new JTextField();
		jtxtChocolate.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtChocolate.setText("0");
		jtxtChocolate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jtxtChocolate.setColumns(10);
		jtxtChocolate.setBounds(175, 409, 127, 26);
		panel_1_1.add(jtxtChocolate);
		
		jtxtIce = new JTextField();
		jtxtIce.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtIce.setText("0");
		jtxtIce.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jtxtIce.setColumns(10);
		jtxtIce.setBounds(175, 446, 127, 26);
		panel_1_1.add(jtxtIce);
		
		JCheckBox jchkIce = new JCheckBox("Ice Cream");
		jchkIce.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jchkIce.isSelected()) {
					jtxtIce.setEnabled(true);
					jtxtIce.setText("");
					jtxtIce.requestFocus();
				}
				else {
				jtxtIce.setEnabled(false);
				jtxtIce.setText("0");
				}
			}
		});
		jchkIce.setBackground(new Color(175, 238, 238));
		jchkIce.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jchkIce.setBounds(23, 442, 142, 25);
		panel_1_1.add(jchkIce);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(32, 178, 170));
		panel_2.setBounds(33, 474, 269, 102);
		panel_1_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Tax");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_10.setBounds(10, 11, 109, 24);
		panel_2.add(lblNewLabel_10);
		
		JLabel lblNewLabel_10_1 = new JLabel("SubTotal");
		lblNewLabel_10_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_10_1.setBounds(10, 41, 109, 24);
		panel_2.add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_10_2 = new JLabel("Total");
		lblNewLabel_10_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_10_2.setBounds(10, 76, 109, 24);
		panel_2.add(lblNewLabel_10_2);
		
		jtxtTax = new JTextField();
		jtxtTax.setBounds(110, 11, 149, 24);
		panel_2.add(jtxtTax);
		jtxtTax.setColumns(10);
		
		jtxtSubTotal = new JTextField();
		jtxtSubTotal.setColumns(10);
		jtxtSubTotal.setBounds(110, 43, 149, 24);
		panel_2.add(jtxtSubTotal);
		
		jtxtTotal = new JTextField();
		jtxtTotal.setColumns(10);
		jtxtTotal.setBounds(110, 76, 149, 24);
		panel_2.add(jtxtTotal);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBorder(new MatteBorder(14, 14, 14, 14, new Color(32, 178, 170)));
		panel_1_1_1.setBackground(new Color(224, 255, 255));
		panel_1_1_1.setBounds(789, 23, 348, 434);
		panel.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JTextArea jtxtReceipt = new JTextArea();
		jtxtReceipt.setBounds(20, 19, 307, 393);
		panel_1_1_1.add(jtxtReceipt);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBorder(new MatteBorder(14, 14, 14, 14, new Color(32, 178, 170)));
		panel_1_1_2.setBackground(new Color(224, 255, 255));
		panel_1_1_2.setBounds(789, 468, 348, 152);
		panel.add(panel_1_1_2);
		panel_1_1_2.setLayout(null);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				jtxtFirstName.setText("");
				jtxtSurname.setText("");
				jtxtCustomerRef.setText("");
				jtxtAddress.setText("");
				jtxtPostCode.setText("");
				jtxtMobile.setText("");
				jtxtEmail.setText("");
				jtxtDOB.setText("");
				jtxtTax.setText("");
				jtxtSubTotal.setText("");
				jtxtTotal.setText("");
				jtxtReceipt.setText("");
				jcmbID.setSelectedIndex(0);
				
				jchkTomato.setSelected(false);
				jchkChick.setSelected(false);
				jchkTraditional.setSelected(false);
				jchkGrilled.setSelected(false);
				jchkChicken.setSelected(false);
				jchkTurkey.setSelected(false);
				jchkPasta.setSelected(false);
				jchkBaked.setSelected(false);
				jchkMashed.setSelected(false);
				jchkRice.setSelected(false);
				jchkChocolate.setSelected(false);
				jchkIce.setSelected(false);
				
				jtxtTomato.setText("0");
				jtxtChick.setText("0");
				jtxtTraditional.setText("0");
				jtxtGrilledFish.setText("0");
				jtxtChicken.setText("0");
				jtxtTurkey.setText("0");
				jtxtPasta.setText("0");
				jtxtBaked.setText("0");
				jtxtMashed.setText("0");
				jtxtRice.setText("0");
				jtxtChocolate.setText("0");
				jtxtIce.setText("0");
				
				jtxtCustomerRef.setText(null);
				jtxtCustomerRef.setEnabled(false);
				int refs = 5015 + (int)(Math.random()*17238);
				String cRef = "";
				cRef += refs + 1560;
				jtxtCustomerRef.setText(cRef);
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnReset.setBounds(30, 23, 136, 106);
		panel_1_1_2.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame();
				
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Customer Billing System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnExit.setBounds(180, 23, 136, 106);
		panel_1_1_2.add(btnExit);
		
		JPanel panel_1_1_2_1 = new JPanel();
		panel_1_1_2_1.setBorder(new MatteBorder(14, 14, 14, 14, new Color(32, 178, 170)));
		panel_1_1_2_1.setBackground(new Color(224, 255, 255));
		panel_1_1_2_1.setBounds(37, 468, 348, 152);
		panel.add(panel_1_1_2_1);
		panel_1_1_2_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				itemcost[0] = Double.parseDouble(jtxtTomato.getText())*1.50;
				itemcost[1] = Double.parseDouble(jtxtChicken.getText())*2.00;
				itemcost[2] = Double.parseDouble(jtxtTraditional.getText())*2.50;
				itemcost[3] = Double.parseDouble(jtxtGrilledFish.getText())*5.00;
				itemcost[4] = Double.parseDouble(jtxtChick.getText())*4.00;
				itemcost[5] = Double.parseDouble(jtxtTurkey.getText())*5.50;
				itemcost[6] = Double.parseDouble(jtxtPasta.getText())*4.50;
				itemcost[7] = Double.parseDouble(jtxtBaked.getText())*0.50;
				itemcost[8] = Double.parseDouble(jtxtMashed.getText())*0.75;
				itemcost[9] = Double.parseDouble(jtxtRice.getText())*2.90;
				itemcost[10] = Double.parseDouble(jtxtRice.getText())*6.50;
				itemcost[11] = Double.parseDouble(jtxtRice.getText())*3.50;
				
				itemcost[12] = itemcost[0] + itemcost[1] + itemcost[2] + itemcost[3] + itemcost[4] + itemcost[5];
				itemcost[13] = itemcost[6] + itemcost[7] + itemcost[8] + itemcost[9] +itemcost[10] + itemcost[11];
				
				itemcost[14] = itemcost[12] + itemcost[13];
				
				iTax = String.format("$ %.2f", itemcost[14]/100);
				iSubtotal = String.format("$ %.2f", itemcost[14]);
				iTotal = String.format("$ %.2f", itemcost[14] + (itemcost[14]/100));
				
				
				jtxtTax.setText(iTax);
				jtxtSubTotal.setText(iSubtotal);
				jtxtTotal.setText(iTotal);
				
				jtxtReceipt.setEnabled(true);
				
				int refs = 1325 + (int)(Math.random()*4238);
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				tTime.format(timer.getTime());
				SimpleDateFormat Tdate = new SimpleDateFormat("dd-MMM-yyyy");
				Tdate.format(timer.getTime());
				
				jtxtReceipt.append("\tCustomer Billing System" + 
				"Reference: \t\t\t" + refs + 
				"\n============================================\t" + 
				
                "\n============================================\t" + 
                "\nCustomer Ref:\t\t\t" + jtxtCustomerRef.getText() + 
                "\nFirst Name:\t\t\t" + jtxtFirstName.getText() + 
                "\nSurname:\t\t\t" + jtxtSurname.getText() + 
                "\nTomato Soup:\t\t\t" + jtxtTomato.getText() + 
                "\nChicken Soup:\t\t\t" + jtxtChicken.getText() +
				"\nTraditional Soup:\t\t\t" + jtxtTraditional.getText() + 
				"\nGrilled Fish:\t\t\t" + jtxtGrilledFish.getText() + 
				"\nBaked Chicken:\t\t\t" + jtxtChick.getText() + 
				"\nBaked Turkey:\t\t\t" + jtxtTurkey.getText() + 
				"\nPasta Carbonara:\t\t\t" + jtxtPasta.getText() + 
				"\nMashed Potatoes:\t\t\t" + jtxtMashed.getText() + 
				"\nBaked Potatoes:\t\t\t" + jtxtBaked.getText() + 
				"\nRice:\t\t\t" + jtxtRice.getText() + 
				"\nChocolate Cake:\t\t\t" + jtxtChocolate.getText() + 
				"\nIce Cream:\t\t\t" + jtxtIce.getText() + 
				
				"\n============================================\t" + 
				
				"nTax:\t\t\t" + iTax + "\nSub Total:\t\t\t" + iTotal + 
				"\nTotal:\t\t\t" + iTotal + 
				"\n============================================\t" + 
				"nDate: " + Tdate.format(timer.getTime()) + "\t\tTime: " + tTime.format(timer.getTime()) + 
				"\n\n\tThank you for dining in our restaurant!\n");
				
			}
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(23, 22, 136, 106);
		panel_1_1_2_1.add(btnNewButton);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					jtxtReceipt.print();
				} 
				 catch (PrinterException e1) {
					System.err.format("No Printer Found", e1.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnPrint.setBounds(179, 22, 136, 106);
		panel_1_1_2_1.add(btnPrint);
	}
}
