package ch18;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class GUI extends JFrame{
	GUI(String title){
		//Frame
		super(title);
		setBounds(100,100,330,310);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Panel
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		//Component
		JTextArea area1 = new JTextArea();
		
		
		JScrollPane scroll1 = new JScrollPane(area1);
		scroll1.setBounds(10,10,180,200);
		
		JButton btn1 = new JButton("파일로 저장");
		btn1.setBounds(200,10,100,35);
		
		JButton btn2 = new JButton("1:1 요청");
		btn2.setBounds(200,60,100,35);
		
		JButton btn3 = new JButton("대화기록보기");
		btn3.setBounds(200,110,100,35);
		
		JButton input = new JButton("입력");
		input.setBounds(200,220,100,35);
		
		JTextField txt1 = new JTextField();
		txt1.setBounds(10,220,180,35);
		
		Font font1 = new Font("맑은 고딕", Font.BOLD, 11);
		
		//panel(component)
		panel.add(scroll1);	
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(input);
		panel.add(txt1);
		btn3.setFont(font1);
		
		
		
		//Frame(Panel)
		add(panel);
		
		
		//Frame
		setVisible(true);
	}
}


public class C05Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Component 참조변수명
		//textarea = area1
		//textarea's scroll = scroll1
		//파일로저장 : btn1
		//1:1요청 : btn2
		//대화기록보기 : btn3
		//입력 : input
		//textfield : txt1
		new GUI("Chatting Server");
	}

}
