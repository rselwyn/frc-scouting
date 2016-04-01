package app.windowcontainers;

import javax.swing.JFrame;

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
		this.setVisible(true);
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
			
		}
		else if (myView == WindowState.RECEIVE_STATUS_DATA) {
			
		}
		else if (myView == WindowState.MATCH) {
			
		}
		else if (myView == WindowState.MATCH_COMPLETE) {
			
		}
	}
}