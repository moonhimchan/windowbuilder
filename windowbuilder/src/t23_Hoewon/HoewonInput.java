package t23_Hoewon;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Pattern;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings({"serial", "rawtypes"})
public class HoewonInput extends JFrame {
	JPanel pn1, pn2, pn3;
	private JTextField txtName;
	private JTextField txtAge;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtAddress;
	JLabel lblTitle, lblName, lblAge, lblGender, lblJoinday, lblAddress, lblYY, lblMM, lblDD;
	JRadioButton rdMale, rdFemale;
	JComboBox cbYY, cbMM, cbDD;
	JButton btnInput, btnReset, btnClose;
	
	HoewonVO vo = new HoewonVO();
	HoewonDAO dao = new HoewonDAO();
	int res = 0;
	
	@SuppressWarnings("unchecked")
	public HoewonInput() {
		setTitle("회원등록");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		pn1 = new JPanel();
		pn1.setBounds(0, 0, 784, 81);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		lblTitle = new JLabel("회 원 가 입 폼");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("굴림체", Font.BOLD, 24));
		lblTitle.setBounds(12, 10, 760, 61);
		pn1.add(lblTitle);
		
		pn2 = new JPanel();
		pn2.setBounds(0, 91, 784, 371);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		lblName = new JLabel("성    명");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("굴림체", Font.BOLD, 22));
		lblName.setBounds(108, 29, 138, 39);
		pn2.add(lblName);
		
		lblAge = new JLabel("나    이");
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setFont(new Font("굴림체", Font.BOLD, 22));
		lblAge.setBounds(108, 97, 138, 39);
		pn2.add(lblAge);
		
		lblGender = new JLabel("성    별");
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setFont(new Font("굴림체", Font.BOLD, 22));
		lblGender.setBounds(108, 165, 138, 39);
		pn2.add(lblGender);
		
		lblJoinday = new JLabel("가 입 일");
		lblJoinday.setHorizontalAlignment(SwingConstants.CENTER);
		lblJoinday.setFont(new Font("굴림체", Font.BOLD, 22));
		lblJoinday.setBounds(108, 233, 138, 39);
		pn2.add(lblJoinday);
		
		lblAddress = new JLabel("주    소");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setFont(new Font("굴림체", Font.BOLD, 22));
		lblAddress.setBounds(108, 301, 138, 39);
		pn2.add(lblAddress);
		
		txtName = new JTextField();
		txtName.setFont(new Font("굴림체", Font.BOLD, 22));
		txtName.setBounds(301, 29, 312, 32);
		pn2.add(txtName);
		txtName.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setFont(new Font("굴림체", Font.BOLD, 22));
		txtAge.setColumns(10);
		txtAge.setBounds(301, 97, 312, 32);
		pn2.add(txtAge);
		
		rdMale = new JRadioButton("남  자");
		buttonGroup.add(rdMale);
		rdMale.setFont(new Font("굴림체", Font.BOLD, 21));
		rdMale.setBounds(298, 165, 138, 32);
		pn2.add(rdMale);
		
		rdFemale = new JRadioButton("여  자");
		rdFemale.setSelected(true);
		buttonGroup.add(rdFemale);
		rdFemale.setFont(new Font("굴림체", Font.BOLD, 21));
		rdFemale.setBounds(483, 165, 138, 32);
		pn2.add(rdFemale);
		
		// 년도/월/일 초기값 생성하기
		String[] yy = new String[20];
		String[] mm = new String[12];
		String[] dd = new String[31];
		
		int imsi = 0;
		for(int i=0; i<yy.length; i++) {
			imsi = 2024 - i;
			yy[i] = imsi + "";
		}
		for(int i=0; i<mm.length; i++) {
			mm[i] = (i+1) + "";
		}
		for(int i=0; i<dd.length; i++) {
			dd[i] = (i+1) + "";
		}
		
		cbYY = new JComboBox(yy);
		cbYY.setBounds(301, 233, 117, 32);
		pn2.add(cbYY);
		
		lblYY = new JLabel("년");
		lblYY.setFont(new Font("굴림체", Font.BOLD, 22));
		lblYY.setBounds(430, 233, 42, 32);
		pn2.add(lblYY);
		
		cbMM = new JComboBox(mm);
		cbMM.setBounds(483, 233, 70, 32);
		pn2.add(cbMM);
		
		lblMM = new JLabel("월");
		lblMM.setFont(new Font("굴림체", Font.BOLD, 22));
		lblMM.setBounds(565, 233, 42, 32);
		pn2.add(lblMM);
		
		cbDD = new JComboBox(dd);
		cbDD.setBounds(619, 233, 70, 32);
		pn2.add(cbDD);
		
		lblDD = new JLabel("일");
		lblDD.setFont(new Font("굴림체", Font.BOLD, 22));
		lblDD.setBounds(701, 233, 42, 32);
		pn2.add(lblDD);
		
		txtAddress = new JTextField();
		txtAddress.setFont(new Font("굴림체", Font.BOLD, 22));
		txtAddress.setBounds(301, 301, 312, 32);
		pn2.add(txtAddress);
		txtAddress.setColumns(10);
		
		pn3 = new JPanel();
		pn3.setBounds(0, 480, 784, 81);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		btnInput = new JButton("가입하기");
		btnInput.setFont(new Font("굴림체", Font.BOLD, 22));
		btnInput.setBounds(50, 10, 194, 61);
		pn3.add(btnInput);
		
		btnReset = new JButton("다시입력");
		btnReset.setFont(new Font("굴림체", Font.BOLD, 22));
		btnReset.setBounds(294, 10, 194, 61);
		pn3.add(btnReset);
		
		btnClose = new JButton("창닫기");
		btnClose.setFont(new Font("굴림체", Font.BOLD, 22));
		btnClose.setBounds(538, 10, 194, 61);
		pn3.add(btnClose);
		
		// ===============================================
		setVisible(true);
		// ===============================================
		
		// 회원가입버튼을 키보드 엔터키로 쳤을때 수행처리
		btnInput.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				setHoewonInput();
			}
		});
		
		
		// 회원가입 버튼 클릭(마우스로 클릭시에 수행된다.)
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setHoewonInput();
			}
		});
		
		// 다시입력 버튼 클릭
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		// 창닫기 버튼 클릭
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new HoewonMain();
			}
		});
		
	}

	// 회원 가입 처리 메소드
	protected void setHoewonInput() {
		String name = txtName.getText().trim();
		String age = txtAge.getText().trim();
		String gender = "";
		String joinday = cbYY.getSelectedItem() + "-" + cbMM.getSelectedItem() + "-" + cbDD.getSelectedItem();
		String address = txtAddress.getText().trim();
		
		// 유효성 검사
		if(name.equals("")) {
			JOptionPane.showMessageDialog(null, "성명을 입력하세요.");
			txtName.requestFocus();
		}
		else if(!Pattern.matches("^[0-9]+$", age)) {
			JOptionPane.showMessageDialog(null, "나이를 숫자로 입력하세요.");
			txtAge.requestFocus();
		}
		else {
			if(rdMale.isSelected()) gender = "남자";
			else gender = "여자";
			
			// 모든 체크가 정상적으로 끝나면 DB에 새로운 회원을 저장한다.
			// 회원 중복처리 할것......
			
			
			// 회원 중복처리가 끝난 정상적인 자료는 DB에 저장처리한다.
			vo.setName(name);
			vo.setAge(Integer.parseInt(age));
			vo.setGender(gender);
			vo.setJoinday(joinday);
			vo.setAddress(address);
			
			res = dao.setHoewonInput(vo);
			
			if(res != 0) {
				JOptionPane.showMessageDialog(null, "회원에 가입되셨습니다.");
				dispose();
				new HoewonMain();
			}
			else {
				JOptionPane.showMessageDialog(null, "회원 가입실패~~");
				txtName.requestFocus();
			}
		}
	}
	
//	public static void main(String[] args) {
//		new HoewonInput();
//	}
}
