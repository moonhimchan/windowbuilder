package t22_Swing;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;

@SuppressWarnings("serial")
public class T5_Radio_CheckBOx extends JFrame{
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JPanel pn1, pn2, pn3;
	JLabel lbltitle, lblGender, lblHobby, lblMessage;
	JRadioButton raMaile, rdFemale;
	JCheckBox ckHobby1,  ckHobby2, ckHobby3, ckHobby4;
	JButton btnGender, btnHobby, btnExit;
	
	
	public T5_Radio_CheckBOx() {
		setTitle("텍스트박스 연습");
		setSize(600, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		pn1 = new JPanel();
		pn1.setBounds(0, 10, 584, 71);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblTitle = new JLabel("라디오버튼/체크박스");
		lblTitle.setFont(new Font("굴림", Font.PLAIN, 20));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(0, 0, 584, 71);
		pn1.add(lblTitle);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(0, 86, 584, 274);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JLabel lblGender = new JLabel("성별");
		lblGender.setBounds(28, 39, 106, 24);
		lblGender.setFont(new Font("굴림", Font.PLAIN, 15));
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		pn2.add(lblGender);
		
		lblHobby = new JLabel("취미");
		lblHobby.setHorizontalAlignment(SwingConstants.CENTER);
		lblHobby.setFont(new Font("굴림", Font.PLAIN, 15));
		lblHobby.setBounds(28, 138, 106, 24);
		pn2.add(lblHobby);
		
		JRadioButton rdMale = new JRadioButton("여자");
		buttonGroup.add(rdMale);
		rdMale.setHorizontalAlignment(SwingConstants.CENTER);
		rdMale.setFont(new Font("굴림", Font.PLAIN, 16));
		rdMale.setBounds(179, 39, 87, 24);
		pn2.add(rdMale);
		
		rdFemale = new JRadioButton("남자");
		buttonGroup.add(rdFemale);
		rdFemale.setHorizontalAlignment(SwingConstants.CENTER);
		rdFemale.setFont(new Font("굴림", Font.PLAIN, 16));
		rdFemale.setBounds(402, 40, 87, 24);
		pn2.add(rdFemale);
		
		ckHobby1 = new JCheckBox("등산");
		ckHobby1.setBounds(164, 138, 60, 24);
		pn2.add(ckHobby1);
		
		ckHobby2 = new JCheckBox("낚시");
		ckHobby2.setBounds(264, 138, 60, 24);
		pn2.add(ckHobby2);
		
		ckHobby3 = new JCheckBox("수영");
		ckHobby3.setBounds(364, 138, 60, 24);
		pn2.add(ckHobby3);
		
		ckHobby4 = new JCheckBox("바둑");
		ckHobby4.setBounds(464, 138, 68, 24);
		pn2.add(ckHobby4);
		
		lblMessage = new JLabel("메세지 출력");
		lblMessage.setFont(new Font("굴림", Font.PLAIN, 18));
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setBounds(28, 203, 528, 49);
		pn2.add(lblMessage);
		
		pn3 = new JPanel();
		pn3.setBounds(0, 370, 584, 71);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		btnGender = new JButton("성별출력");
		btnGender.setFont(new Font("굴림", Font.PLAIN, 16));
		btnGender.setBounds(12, 10, 170, 51);
		pn3.add(btnGender);
		
		btnHobby = new JButton("취미출력");
		btnHobby.setFont(new Font("굴림", Font.PLAIN, 16));
		btnHobby.setBounds(194, 10, 170, 51);
		pn3.add(btnHobby);
		
		JButton btnExit = new JButton("작업종료");
		btnExit.setFont(new Font("굴림", Font.PLAIN, 16));
		btnExit.setBounds(379, 10, 170, 51);
		pn3.add(btnExit);
		
		//===================================
		setVisible(true);
		//===================================
		
		//작업 종료버튼 클릭
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		//성별버튼
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gender="선택하신 성별은?";
				if(rdMale.isSelected()) gender += rdMale.getText();
				else gender+=rdFemale.getText();
				
				lblMessage.setText(gender);
			}
		});
		//취미버튼
		btnHobby.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hobby="";
				if(ckHobby1.isSelected()) hobby+=ckHobby1.getText()+"/";
				if(ckHobby2.isSelected()) hobby+=ckHobby2.getText()+"/";
				if(ckHobby3.isSelected()) hobby+=ckHobby3.getText()+"/";
				if(ckHobby4.isSelected()) hobby+=ckHobby4.getText()+"/";
				
				hobby=hobby.substring(0,hobby.length()-1);
				
				lblMessage.setText("선택하신 취미는?"+hobby);
			}
		});
	}
	
	public static void main(String[] args) {
		new T5_Radio_CheckBOx();
	}
}
