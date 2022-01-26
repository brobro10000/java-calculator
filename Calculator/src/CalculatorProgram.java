import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Color;

@SuppressWarnings("serial")
public class CalculatorProgram extends JFrame {
	
	private JPanel contentPane;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2; 
	private JTextField textFieldStatus;
	private JTextField textFieldResult;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					CalculatorProgram frame = new CalculatorProgram();
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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public CalculatorProgram() {
		setTitle("Simple Calculator");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textFieldNum1.setText("");
				textFieldNum2.setText("");
				textFieldStatus.setText("--Select--");
				textFieldResult.setText("");
			}
		});		
		btnClear.setBounds(236, 216, 91, 23);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(337, 216, 91, 23);
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		ButtonGroup output = new ButtonGroup();
		JRadioButton rdbtnPopup = new JRadioButton("Popup");
		rdbtnPopup.setBounds(321, 160, 111, 23);
		output.add(rdbtnPopup);
		
		JRadioButton rdbtnResult = new JRadioButton("Result");
		rdbtnResult.setBounds(321, 186, 111, 23);
		output.add(rdbtnResult);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				String s = textFieldNum1.getText();
				String s2 = textFieldNum2.getText();
				double x;
				double y;
				y= Double.parseDouble(s2);
				x= Double.parseDouble(s);
				Calculator outcome = new Calculator(x,y);
				if(rdbtnPopup.isSelected()) {
				JOptionPane.showMessageDialog(null, outcome.add());
				} else if(rdbtnResult.isSelected()) {	
					int z=0;
					while(z<100) {
					textFieldResult.setText(""+outcome.add());
					x+=y;
					z++;
					}
					
				} else
					JOptionPane.showMessageDialog(null, "Select output type");
				} catch(Exception e2)
				{
					JOptionPane.showMessageDialog(null,"Program Failed: " + e2 + "\n ----Enter number values for x and y----");
				}
			}
		});
		btnAdd.setBounds(22, 27, 91, 23);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				String s = textFieldNum1.getText();
				String s2 = textFieldNum2.getText();
				double x;
				double y;
				y= Double.parseDouble(s2);
				x= Double.parseDouble(s);
				Calculator outcome = new Calculator(x,y);
				if(rdbtnPopup.isSelected()) {
					JOptionPane.showMessageDialog(null, outcome.sub());
					} else if(rdbtnResult.isSelected()) {
						textFieldResult.setText(""+outcome.sub());
					} else
						JOptionPane.showMessageDialog(null, "Select output type");
				} catch(Exception e3) {
					JOptionPane.showMessageDialog(null,"Program Failed: " + e3 + "\n ----Enter number values for x and y----");
				}
			}
		});
		btnSub.setBounds(123, 27, 91, 23);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				String s = textFieldNum1.getText();
				String s2 = textFieldNum2.getText();
				double x;
				double y;
				y= Double.parseDouble(s2);
				x= Double.parseDouble(s);
				Calculator outcome = new Calculator(x,y);
				if(rdbtnPopup.isSelected()) {
					JOptionPane.showMessageDialog(null, outcome.mul());
					} else if(rdbtnResult.isSelected()) {
						textFieldResult.setText(""+outcome.mul());
					} else
						JOptionPane.showMessageDialog(null, "Select output type");
				} catch(Exception e6)
				{
					JOptionPane.showMessageDialog(null,"Program Failed: " + e6 + "\n ----Enter number values for x and y----");
				}
			}
		});
		btnMul.setBounds(22, 61, 91, 23);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setBounds(123, 61, 91, 23);
		btnDiv.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				String s = textFieldNum1.getText();
				String s2 = textFieldNum2.getText();
				double x;
				double y;
				y= Double.parseDouble(s2);
				x= Double.parseDouble(s);
				Calculator outcome = new Calculator(x,y);
				if(rdbtnPopup.isSelected()) {
					JOptionPane.showMessageDialog(null, outcome.div());
					} else if(rdbtnResult.isSelected()) {
						textFieldResult.setText(""+outcome.div());
					} else
						JOptionPane.showMessageDialog(null, "Select output type");
				} catch(Exception e4)
				{
					JOptionPane.showMessageDialog(null,"Program Failed: " + e4 + "\n ----Enter number values for x and y----");
				}
			}
		});
		
		JButton btnMod = new JButton("mod(x,y)");
		btnMod.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				String s = textFieldNum1.getText();
				String s2 = textFieldNum2.getText();
				double x;
				double y;
				y= Double.parseDouble(s2);
				x= Double.parseDouble(s);
				Calculator outcome = new Calculator(x,y);
				if(rdbtnPopup.isSelected()) {
					JOptionPane.showMessageDialog(null, outcome.mod());
					} else if(rdbtnResult.isSelected()) {
						textFieldResult.setText(""+outcome.mod());
					} else
						JOptionPane.showMessageDialog(null, "Select output type");
				} catch(Exception e4)
				{
					JOptionPane.showMessageDialog(null,"Program Failed: " + e4 + "\n ----Enter number values for x and y----");
				}
			}
		});
		btnMod.setBounds(123, 95, 91, 23);
		btnMod.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		JButton btnPower = new JButton("power(x,y)");
		btnPower.setBounds(22, 95, 91, 23);
		btnPower.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnPower.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				String s = textFieldNum1.getText();
				String s2 = textFieldNum2.getText();
				double x;
				double y;
				y= Double.parseDouble(s2);
				x= Double.parseDouble(s);
				Calculator outcome = new Calculator(x,y);
				if(rdbtnPopup.isSelected()) {
					JOptionPane.showMessageDialog(null, outcome.power());
					} else if(rdbtnResult.isSelected()) {
						textFieldResult.setText(""+outcome.power());
					} else
						JOptionPane.showMessageDialog(null, "Select output type");
				} catch(Exception e5)
				{
					JOptionPane.showMessageDialog(null,"Program Failed: " + e5 + "\n ----Enter number values for x and y----");
				}
				
			}
		});

		JLabel lblOperation = new JLabel("Operation");
		lblOperation.setBounds(248, 11, 48, 14);
		lblOperation.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		JLabel lblOperators = new JLabel("Operators:");
		lblOperators.setBounds(22, 11, 48, 14);
		lblOperators.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.setLayout(null);
		contentPane.add(btnClear);
		contentPane.add(btnExit);
		contentPane.add(btnAdd);
		contentPane.add(btnSub);
		contentPane.add(btnMul);
		contentPane.add(btnDiv);
		contentPane.add(btnMod);
		contentPane.add(btnPower);
		contentPane.add(rdbtnPopup);
		contentPane.add(rdbtnResult);
		contentPane.add(lblOperation);
		contentPane.add(lblOperators);
		JComboBox comboBoxOperators = new JComboBox();
		comboBoxOperators.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				textFieldStatus.setText("" + comboBoxOperators.getSelectedItem());
				int index = comboBoxOperators.getSelectedIndex();
				String s = textFieldNum1.getText();
				String s2 = textFieldNum2.getText();
				double x;
				double y;
				y= Double.parseDouble(s2);
				x= Double.parseDouble(s);
				Calculator outcome = new Calculator(x,y);
				
				if(index == 1) {
					if(rdbtnPopup.isSelected()) 
					{
						JOptionPane.showMessageDialog(null, outcome.add());
						} else if(rdbtnResult.isSelected()) {
							textFieldResult.setText(""+outcome.add());
						} else
							JOptionPane.showMessageDialog(null, "Select output type");
				}
				if(index == 2)
				{
					if(rdbtnPopup.isSelected()) 
					{
						JOptionPane.showMessageDialog(null, outcome.sub());
						} else if(rdbtnResult.isSelected()) {
							textFieldResult.setText(""+outcome.sub());
						} else
							JOptionPane.showMessageDialog(null, "Select output type");
				}
				if(index == 3)
				{
					if(rdbtnPopup.isSelected()) 
					{
						JOptionPane.showMessageDialog(null, outcome.mul());
						} else if(rdbtnResult.isSelected()) {
							textFieldResult.setText(""+outcome.mul());
						} else
							JOptionPane.showMessageDialog(null, "Select output type");	
				}
				if(index == 4)
				{
					if(rdbtnPopup.isSelected()) 
					{
						JOptionPane.showMessageDialog(null, outcome.div());
						} else if(rdbtnResult.isSelected()) {
							textFieldResult.setText(""+outcome.div());
						} else
							JOptionPane.showMessageDialog(null, "Select output type");
				}
		        if(index == 5)
		        {
		        	if(rdbtnPopup.isSelected()) 
					{
						JOptionPane.showMessageDialog(null, outcome.power());
						} else if(rdbtnResult.isSelected()) {
							textFieldResult.setText(""+outcome.power());
						} else
							JOptionPane.showMessageDialog(null, "Select output type");
		        }
		        if(index == 6)
		        {
		        	if(rdbtnPopup.isSelected()) 
					{
						JOptionPane.showMessageDialog(null, outcome.mod());
						} else if(rdbtnResult.isSelected()) {
							textFieldResult.setText(""+outcome.mod());
						} else
							JOptionPane.showMessageDialog(null, "Select output type");
		        }
				} catch(Exception e1) {
					if(comboBoxOperators.getSelectedIndex() == 0) {}
					else
					JOptionPane.showMessageDialog(null,"Program Failed: " + e1 + "\n ----Enter number values for x and y----");
				}
			}
		});
		comboBoxOperators.setModel(new DefaultComboBoxModel(new String[] {"--Select--","+","-","*","/","pow(x,y)", "mod(x,y)"}));
		comboBoxOperators.setBounds(22, 160, 192, 22);
		contentPane.add(comboBoxOperators);

		JLabel lblNum1 = new JLabel("x");
		lblNum1.setBounds(248, 31, 48, 14);
		contentPane.add(lblNum1);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(322, 28, 106, 20);
		contentPane.add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("y");
		lblNewLabel_1.setBounds(248, 99, 48, 14);
		contentPane.add(lblNewLabel_1);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(322, 96, 106, 20);
		contentPane.add(textFieldNum2);
		textFieldNum2.setColumns(10);

		textFieldStatus = new JTextField("--Select--");
		textFieldStatus.setBackground(Color.LIGHT_GRAY);
		textFieldStatus.setBounds(337, 62, 60, 20);
		contentPane.add(textFieldStatus);
		textFieldStatus.setColumns(10);
		
		textFieldResult = new JTextField();
		textFieldResult.setBounds(322, 133, 106, 20);
		contentPane.add(textFieldResult);
		textFieldResult.setColumns(10);
		
		JLabel lblResult = new JLabel("Result:");
		lblResult.setBounds(248, 136, 48, 14);
		contentPane.add(lblResult);
		
		JLabel lblOutput = new JLabel("Output:");
		lblOutput.setBounds(248, 164, 48, 14);
		contentPane.add(lblOutput);
	}
}
