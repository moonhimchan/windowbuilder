package t22_Swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class T6_Combo_ListBox extends JFrame {
	JPanel pn1, pn2, pn3, pn4;
	JLabel lblTitle, lblMessage;
	JComboBox comboJob;
	JList listJob1, listJob2;
	JButton btnCombo, btnList1, btnList2, btnExit;
	JTextArea textArea;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public T6_Combo_ListBox() {
		setTitle("콤보상자/리스트박스 연습");
		setSize(600, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		pn1 = new JPanel();
		pn1.setBounds(0, 0, 290, 270);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		lblTitle = new JLabel("직업을 선택하세요");
		lblTitle.setFont(new Font("굴림", Font.BOLD, 16));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(12, 10, 253, 36);
		pn1.add(lblTitle);
		
		comboJob = new JComboBox();
		comboJob.setFont(new Font("굴림", Font.BOLD, 16));
		comboJob.setModel(new DefaultComboBoxModel(new String[] {"학   생", "군   인", "회사원", "변호사", "프리랜서", "공무원", "기   타"}));
		comboJob.setBounds(12, 56, 266, 36);
		pn1.add(comboJob);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 102, 266, 158);
		pn1.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		pn2 = new JPanel();
		pn2.setBounds(294, 0, 290, 270);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		listJob1 = new JList();
		listJob1.setModel(new AbstractListModel() {
			String[] values = new String[] {"학    생", "군    인", "회사원", "공무원", "자영업", "변호사", "의   사", "판   사", "기   타"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listJob1.setBounds(12, 10, 266, 119);
		pn2.add(listJob1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 139, 266, 121);
		pn2.add(scrollPane_1);
		
		listJob2 = new JList();
		listJob2.setModel(new AbstractListModel() {
			String[] values = new String[] {"학    생", "군    인", "회사원", "공무원", "자영업", "변호사", "의   사", "판   사", "기   타"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listJob2.setToolTipText("");
		scrollPane_1.setViewportView(listJob2);
		
		pn3 = new JPanel();
		pn3.setBounds(0, 272, 584, 80);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		btnCombo = new JButton("콤보출력");
		btnCombo.setFont(new Font("굴림", Font.BOLD, 16));
		btnCombo.setBounds(0, 21, 145, 49);
		pn3.add(btnCombo);
		
		btnList1 = new JButton("리스트출력1");
		btnList1.setFont(new Font("굴림", Font.BOLD, 16));
		btnList1.setBounds(145, 21, 145, 49);
		pn3.add(btnList1);
		
		btnList2 = new JButton("리스트출력2");
		btnList2.setFont(new Font("굴림", Font.BOLD, 16));
		btnList2.setBounds(290, 21, 145, 49);
		pn3.add(btnList2);
		
		btnExit = new JButton("작업종료");
		btnExit.setFont(new Font("굴림", Font.BOLD, 16));
		btnExit.setBounds(435, 21, 145, 49);
		pn3.add(btnExit);
		
		pn4 = new JPanel();
		pn4.setBounds(0, 352, 584, 89);
		getContentPane().add(pn4);
		pn4.setLayout(null);
		
		lblMessage = new JLabel("출력 메세지");
		lblMessage.setFont(new Font("굴림", Font.BOLD, 18));
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setBounds(12, 10, 560, 69);
		pn4.add(lblMessage);
		
		//==================================================
		setVisible(true);
		//==================================================
		
		// 콤보버튼클릭
		btnCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = comboJob.getSelectedItem().toString() + "("+comboJob.getSelectedIndex()+")";
				lblMessage.setText(msg);
				JOptionPane.showMessageDialog(null, msg);
				textArea.setText(msg);
			}
		});
		
		// 리스트버튼1 클릭
		btnList1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Object[] jobs = listJob1.getSelectedValues();
				List<String> jobs = listJob1.getSelectedValuesList();
				String msg = "";
				for(String job : jobs) {
					msg += job + "/";
				}
				msg = msg.substring(0, msg.length()-1);
				
				lblMessage.setText(msg);
			}
		});
		
		// 리스트버튼2 클릭
		btnList2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<String> jobs = listJob2.getSelectedValuesList();
				String msg = "";
				for(String job : jobs) {
					msg += job + "/";
				}
				msg = msg.substring(0, msg.length()-1);
				
				lblMessage.setText(msg);
			}
		});
		
		// 종료버튼클릭
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new T6_Combo_ListBox();
	}
}
