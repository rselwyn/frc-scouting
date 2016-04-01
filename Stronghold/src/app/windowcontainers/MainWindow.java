package app.windowcontainers;

import javax.swing.JFrame;
import javax.swing.JLabel;

import app.windowcontainers.screens.StartPage;

public class MainWindow extends JFrame{
	
	private final int WIDTH = 600;
	private final int HEIGHT = 500;
	private WindowState myView;
	
	public MainWindow(WindowState view) {
		this.myView = view;
		setup();
		updateMyView();
	}
	
	public MainWindow() {
		this.myView = WindowState.START;
		setup();
		updateMyView();
	}
	
	private void setup() {
		this.setTitle("Stronhold Scouter");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(WIDTH, HEIGHT);
		this.setResizable(false);
//		this.setVisible(true);
	}
	
	public static enum WindowState{
		START,
		RECEIVE_STATUS_DATA,
		MATCH,
		MATCH_COMPLETE
	}
	
	public void updateView(WindowState view) {
		this.myView = view;
		updateMyView();
	}
	
	private void updateMyView() {
		if (myView == WindowState.START) {
			StartPage p = new StartPage();
			add(p);
			this.setVisible(true);
		}
		
		else if (myView == WindowState.RECEIVE_STATUS_DATA) {
			System.out.println("HIT");
		}
		else if (myView == WindowState.MATCH) {
			
		}
		else if (myView == WindowState.MATCH_COMPLETE) {
			
		}
	}
}