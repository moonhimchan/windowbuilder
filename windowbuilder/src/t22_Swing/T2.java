package t22_Swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class T2 extends JFrame {
	JPanel pn1, pn2, pn3;

	public T2() {
		setTitle("연습하기");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		pn1 = new JPanel();
		pn1.setBounds(0, 0, 784, 87);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblTitle = new JLabel("이미지 연습창");
		lblTitle.setFont(new Font("굴림", Font.BOLD, 20));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(209, 10, 384, 67);
		pn1.add(lblTitle);
		
		JButton btnExit = new JButton("종료");
		btnExit.setFont(new Font("굴림", Font.BOLD, 18));
		btnExit.setBounds(620, 17, 152, 54);
		pn1.add(btnExit);
		
		JButton btnRandom = new JButton("랜덤보기");
		btnRandom.setFont(new Font("굴림", Font.BOLD, 18));
		btnRandom.setBounds(12, 10, 152, 54);
		pn1.add(btnRandom);
		
		pn2 = new JPanel();
		pn2.setBounds(0, 88, 784, 384);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JLabel lbl1 = new JLabel("");
		lbl1.setIcon(new ImageIcon(T2.class.getResource("/t22_Swing/images/11.jpg")));
		lbl1.setBounds(14, 10, 178, 351);
		pn2.add(lbl1);
		
		JLabel lbl2 = new JLabel("");
		lbl2.setIcon(new ImageIcon(T2.class.getResource("/t22_Swing/images/12.jpg")));
		lbl2.setBounds(206, 10, 178, 351);
		pn2.add(lbl2);
		
		JLabel lbl3 = new JLabel("");
		lbl3.setIcon(new ImageIcon("D:\\javaGroup\\java\\works2\\windowBuilder\\images\\13.jpg"));
		lbl3.setBounds(398, 10, 178, 351);
		pn2.add(lbl3);
		
		JLabel lbl4 = new JLabel("");
		lbl4.setIcon(new ImageIcon("D:\\javaGroup\\java\\works2\\windowBuilder\\images\\14.jpg"));
		lbl4.setBounds(590, 10, 178, 351);
		pn2.add(lbl4);
		
		pn3 = new JPanel();
		pn3.setBounds(0, 474, 784, 87);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		JButton btn1 = new JButton("그림1");
		btn1.setFont(new Font("굴림", Font.BOLD, 18));
		btn1.setBounds(40, 23, 108, 54);
		pn3.add(btn1);
		
		JButton btn2 = new JButton("그림2");
		btn2.setFont(new Font("굴림", Font.BOLD, 18));
		btn2.setBounds(188, 23, 108, 54);
		pn3.add(btn2);
		
		JButton btn3 = new JButton("그림3");
		btn3.setFont(new Font("굴림", Font.BOLD, 18));
		btn3.setBounds(336, 23, 108, 54);
		pn3.add(btn3);
		
		JButton btn4 = new JButton("그림4");
		btn4.setFont(new Font("굴림", Font.BOLD, 18));
		btn4.setBounds(484, 23, 108, 54);
		pn3.add(btn4);
		
		JButton btn5 = new JButton("모두보기");
		btn5.setFont(new Font("굴림", Font.BOLD, 18));
		btn5.setBounds(632, 23, 108, 54);
		pn3.add(btn5);
		
		
		setVisible(true);
		
		/* ============================== */
		
		// 종료버튼
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		// 1번그림보기
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl1.setVisible(true);
				lbl2.setVisible(false);
				lbl3.setVisible(false);
				lbl4.setVisible(false);
			}
		});
		
		// 2번그림보기
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl1.setVisible(false);
				lbl2.setVisible(true);
				lbl3.setVisible(false);
				lbl4.setVisible(false);
			}
		});
		
		// 3번그림보기
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl1.setVisible(false);
				lbl2.setVisible(false);
				lbl3.setVisible(true);
				lbl4.setVisible(false);
			}
		});
		
		// 4번그림보기
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl1.setVisible(false);
				lbl2.setVisible(false);
				lbl3.setVisible(false);
				lbl4.setVisible(true);
			}
		});
		
		// 모든그림보기
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl1.setVisible(true);
				lbl2.setVisible(true);
				lbl3.setVisible(true);
				lbl4.setVisible(true);
			}
		});
	}
	
	public static void main(String[] args) {
		new T2();
	}
}
