package t22_Swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class T4_TextField extends JFrame {
	JPanel pn1, pn2, pn3;
	JTextField txtMid, txtName, txtAge;
	JLabel lblNewLabel, lblMid, lblPwd, lblName, lblAge, lblImage;
	JButton btnInput, btnReset, btnExit;
	private JPasswordField txtPwd;
	
	String regAge = "^[0-9]+$";
	
	public T4_TextField() {
		setTitle("텍스트박스 연습");
		setSize(600, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		pn1 = new JPanel();
		pn1.setBackground(Color.ORANGE);
		pn1.setBounds(12, 10, 560, 53);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		lblNewLabel = new JLabel("회 원 가 입");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 560, 53);
		pn1.add(lblNewLabel);
		
		pn2 = new JPanel();
		pn2.setBounds(12, 73, 560, 293);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		lblMid = new JLabel("아 이 디");
		lblMid.setHorizontalAlignment(SwingConstants.CENTER);
		lblMid.setFont(new Font("굴림", Font.BOLD, 18));
		lblMid.setBounds(73, 33, 132, 32);
		pn2.add(lblMid);
		
		lblPwd = new JLabel("비밀번호");
		lblPwd.setHorizontalAlignment(SwingConstants.CENTER);
		lblPwd.setFont(new Font("굴림", Font.BOLD, 18));
		lblPwd.setBounds(73, 98, 132, 32);
		pn2.add(lblPwd);
		
		lblName = new JLabel("성  명");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("굴림", Font.BOLD, 18));
		lblName.setBounds(73, 163, 132, 32);
		pn2.add(lblName);
		
		lblAge = new JLabel("나  이");
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setFont(new Font("굴림", Font.BOLD, 18));
		lblAge.setBounds(73, 228, 132, 32);
		pn2.add(lblAge);
		
		txtMid = new JTextField();
		txtMid.setFont(new Font("굴림", Font.BOLD, 18));
		txtMid.setBounds(264, 33, 180, 32);
		pn2.add(txtMid);
		txtMid.setColumns(10);
		
		txtPwd = new JPasswordField();
		txtPwd.setFont(new Font("굴림", Font.BOLD, 18));
		txtPwd.setBounds(264, 98, 180, 32);
		pn2.add(txtPwd);
		
		txtName = new JTextField();
		txtName.setFont(new Font("굴림", Font.BOLD, 18));
		txtName.setColumns(10);
		txtName.setBounds(264, 163, 180, 32);
		pn2.add(txtName);
		
		txtAge = new JTextField();
		txtAge.setFont(new Font("굴림", Font.BOLD, 18));
		txtAge.setColumns(10);
		txtAge.setBounds(264, 228, 180, 32);
		pn2.add(txtAge);
		
		lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon(T4_TextField.class.getResource("/t22_Swing/images/21.jpg")));
		lblImage.setBounds(0, 0, 560, 293);
		pn2.add(lblImage);
		
		pn3 = new JPanel();
		pn3.setBackground(Color.CYAN);
		pn3.setBounds(12, 378, 560, 53);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		btnInput = new JButton("회원가입");
		btnInput.setFont(new Font("굴림", Font.PLAIN, 18));
		btnInput.setBounds(25, 10, 153, 33);
		pn3.add(btnInput);
		
		btnReset = new JButton("다시입력");
		btnReset.setFont(new Font("굴림", Font.PLAIN, 18));
		btnReset.setBounds(203, 10, 153, 33);
		pn3.add(btnReset);
		
		btnExit = new JButton("작업종료");
		btnExit.setFont(new Font("굴림", Font.PLAIN, 18));
		btnExit.setBounds(381, 10, 153, 33);
		pn3.add(btnExit);
		
		
		/* ======================================== */
		setVisible(true);
		/* ======================================== */
		
		// 회원가입버튼 클릭
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtMid.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "아이디를 입력하세요.");
					txtMid.requestFocus();
				}
				else if(txtPwd.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "비밀번호를 입력하세요.");
					txtPwd.requestFocus();
				}
				else if(txtName.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "성명을 입력하세요.");
					txtName.requestFocus();
				}
				//else if(txtAge.getText().trim().equals("")) {
				else if(!Pattern.matches(regAge, txtAge.getText().trim())) {
					JOptionPane.showMessageDialog(null, "나이를 입력하세요.(나이는 숫자만 가능)");
					txtAge.requestFocus();
				}
				else {
					JOptionPane.showMessageDialog(null, "회원 가입이 완료되었습니다.");
				}
			}
		});
		
		// 다시입력버튼 클릭
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMid.setText("");
				txtPwd.setText("");
				txtName.setText("");
				txtAge.setText("");
				txtMid.requestFocus();
			}
		});
		
		// 작업 종료버튼 클릭
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new T4_TextField();
	}
}
