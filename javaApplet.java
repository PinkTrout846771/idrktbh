import java.applet.Applet;
import javax.swing.JFrame;


public class igAppletFirst extends Applet {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(100,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Example Frame");
		frame.setVisible(true);
	}
}
