package zeromq.csexample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Form {

	private JFrame frame;
	public static JTextArea textArea_1 = new JTextArea();
	
	/**
	 * Launch the application.
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Form window = new Form();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		Server server = new Server();
		//server.CreateServer();
	}

	/**
	 * Create the application.
	 */
	public Form() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textArea_1.setToolTipText("we");
		textArea_1.setBounds(12, 12, 422, 250);
		frame.getContentPane().add(textArea_1);
	}
}
