
package sum;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Equation extends JFrame implements ActionListener, ItemListener, KeyListener {

	private int tam; private String s; private double x1,x2;
	private JLabel lbA, lbB, lbC, lbResult;
	private JTextField txtA, txtB, txtC, txtResult;
	private JButton btnSolve, btnReset, btnExit;
	private JPanel pA, pB, pC, pbtn, pResult, pmain;
	private JRadioButton ptb1, ptb2;

	public Equation() {
		// 1.thiet lap cho Frame
		super("Solve squarequation and linearequation");
		super.setSize(400, 500);
		super.setLocationRelativeTo(null);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setVisible(true);
		super.setLayout(new GridLayout(7,3));

		// 2.tao cac panels chua cac components
		JLabel a=new JLabel("solve Linearequation or squarequation",JLabel.CENTER);
		pA = new JPanel(new FlowLayout());
		lbA = new JLabel("Enter A");
		txtA = new JTextField(5);
		pA.add(lbA);
		pA.add(txtA);

		pB = new JPanel(new FlowLayout());
		lbB = new JLabel("Enter B");
		txtB = new JTextField(5);
		pB.add(lbB);
		pB.add(txtB);

		pC = new JPanel(new FlowLayout());
		lbC = new JLabel("Enter c");
		txtC = new JTextField(5);
		pC.add(lbC);
		pC.add(txtC);

		pResult = new JPanel();
		pResult.setLayout(new FlowLayout());
		lbResult = new JLabel("Result");
		txtResult = new JTextField(10);
		txtResult.setEnabled(false);
		pResult.add(lbResult);
		pResult.add(txtResult);

		pbtn = new JPanel(new FlowLayout());
		btnSolve = new JButton("solve");
		btnReset = new JButton("Reset");
		btnExit = new JButton("Exit");
		pbtn.add(btnSolve);
		pbtn.add(btnReset);
		pbtn.add(btnExit);

		pmain = new JPanel(new FlowLayout());
		ptb1 = new JRadioButton("linearequation");
		ptb2 = new JRadioButton("squarequation");
		ButtonGroup bg=new ButtonGroup();
		bg.add(ptb1);
		bg.add(ptb2);
		pmain.add(ptb1);
		pmain.add(ptb2);
		// 3.tao component
		super.add(a);
		super.add(pA);
		super.add(pB);
		super.add(pC);
		super.add(pmain);
		super.add(pResult);
		super.add(pbtn);
		// 4.dang ki su kien
		btnSolve.addActionListener(this);
		btnReset.addActionListener(this);
		btnExit.addActionListener(this);

		txtA.addKeyListener(this);
		txtB.addKeyListener(this);
		txtC.addKeyListener(this);
		txtResult.addKeyListener(this);
		btnSolve.addKeyListener(this);

		ptb1.addItemListener(this);
		ptb2.addItemListener(this);
		super.validate();
	}

	public static void main(String[] args) {
		Equation q = new Equation();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnExit) {
			System.exit(0);
		} else if (e.getSource() == btnReset) {
			txtA.setText("");
			txtB.setText("");
			txtC.setText("");
			txtResult.setText("");
		} else if (e.getSource() == btnSolve && tam == 1) {
			int b = Integer.parseInt(txtB.getText());
			int c = Integer.parseInt(txtC.getText());
			if (b == 0)
				if (c == 0)
					txtResult.setText("unlimits roofs");
				else
					txtResult.setText("no roofs");
			else {
				double t=1.0*-c/b;
				 s=String.valueOf(t);
				txtResult.setText("x="+s);
			}
		}
		else if(e.getSource()== btnSolve && tam==2) {
			int a=Integer.parseInt(txtA.getText());
			int b = Integer.parseInt(txtB.getText());
			int c = Integer.parseInt(txtC.getText());
			if(a==0)
				if(b==0)
					if(c==0)
						txtResult.setText("unlimits roofs");
					else
						txtResult.setText("no roofs");
				else {
					double t=1.0*-c/b;
					 s=String.valueOf(t);
					txtResult.setText("x="+s);
					}
			else if(a!=0) {
				double d=b*b-4*a*c;
				if(d<0)
					txtResult.setText("no roofs");
				else if(d==0) {
					double t1=1.0*-b/(2*a);
					s=String.valueOf(t1);
					txtResult.setText("x=x1=x2="+s);
				}
				else {
					x1=1.0*(-b+Math.sqrt(d))/(2*a);
					x2=1.0*(-b-Math.sqrt(d))/(2*a);
					txtResult.setText("x1="+x1+","+"x2="+x2);
					}
			}
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getItem() == ptb1) {
			tam = 1;
			txtA.setEnabled(false);
		} else if (e.getItem() == ptb2) {
			tam = 2;
			txtA.setEnabled(true);
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getSource()==txtA) {
			if(e.getKeyCode()==KeyEvent.VK_ENTER) {
				txtB.requestFocus();
			}
		}
		else if(e.getSource()==txtB) {
			if(e.getKeyCode()==KeyEvent.VK_ENTER) {
				txtC.requestFocus();
			}
		}
		else if(e.getSource()==txtC) {
			if(e.getKeyCode()==KeyEvent.VK_ENTER) {
				btnSolve.requestFocus();
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
