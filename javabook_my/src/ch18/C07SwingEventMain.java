package ch18;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


class C07GUI extends JFrame implements ActionListener, KeyListener, MouseListener {
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton input;
	JTextField txt1;
	JTextArea area1;

	C07GUI(String title) {
		// Frame
		super(title);
		setBounds(100, 100, 330, 310);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Panel
		JPanel panel = new JPanel();
		panel.setLayout(null);

		// Component
		area1 = new JTextArea();

		JScrollPane scroll1 = new JScrollPane(area1);
		scroll1.setBounds(10, 10, 180, 200);

		btn1 = new JButton("파일로 저장");
		btn1.setBounds(200, 10, 100, 35);

		btn2 = new JButton("1:1 요청");
		btn2.setBounds(200, 60, 100, 35);

		btn3 = new JButton("대화기록보기");
		btn3.setBounds(200, 110, 100, 35);

		input = new JButton("입력");
		input.setBounds(200, 220, 100, 35);

		txt1 = new JTextField();
		txt1.setBounds(10, 220, 180, 35);

		Font font1 = new Font("맑은 고딕", Font.BOLD, 11);

		// eventListener add
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		input.addActionListener(this);
		txt1.addKeyListener(this);
		area1.addMouseListener(this);

		// panel(component)
		//panel.add(scroll1);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(input);
		panel.add(txt1);
		btn3.setFont(font1);

		// Frame(Panel)
		add(panel);

		// Frame
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("클릭!");
		if (e.getSource() == btn1) {
			System.out.println("파일로 저장 클릭");
		} else if (e.getSource() == btn2) {
			System.out.println("1:1 요청 클릭");
		} else if (e.getSource() == btn3) {
			System.out.println("대화기록보기");
		} else if (e.getSource() == input)
			System.out.println("입력");

	}

	public class C06SwingEventMain {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			// Component 참조변수명
			// textarea = area1
			// textarea's scroll = scroll1
			// 파일로저장 : btn1
			// 1:1요청 : btn2
			// 대화기록보기 : btn3
			// 입력 : input
			// textfield : txt1
			new C07GUI("Chatting Server");
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// System.out.println("key typed..."+e.getKeyChar());
		// System.out.println("key typed..."+e.getKeyCode());
		if (e.getSource() == txt1) {
			if (e.getKeyCode() == 10) {
				String message = txt1.getText();
				System.out.println(message);
				area1.append(message+"\n");
				txt1.setText("");
			}
		}
	}
	
	//KeyListener
	@Override
	public void keyPressed(KeyEvent e) {
		// System.out.println("KeyPressed..."+e.getKeyChar());
		// System.out.println("KeyPressed..."+e.getKeyCode());

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// System.out.println("keyReleased.."+e.getKeyChar());
		// System.out.println("keyReleased.."+e.getKeyCode());
	}
	
	
	//MouseListener
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseCliked..."+e.getPoint()); //x,y축에 대한 상대적 정보 제공
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
