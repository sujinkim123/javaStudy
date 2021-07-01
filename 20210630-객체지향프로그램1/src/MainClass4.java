import javax.swing.*;
// 상속이 안되는 클래스 : final class => 그대로 사용 (String, System, Math, Scanner)
public class MainClass4 extends JFrame {
	
	public MainClass4() {
		setSize(640, 480);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MainClass4();
	}
}
