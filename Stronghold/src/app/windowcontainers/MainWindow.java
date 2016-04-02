package app.windowcontainers;

import javax.swing.JFrame;
import javax.swing.JLabel;

import app.windowcontainers.screens.MatchDataReceive;
import app.windowcontainers.screens.MatchView;
import app.windowcontainers.screens.StartPage;
import app.windowcontainers.screens.SubmitView;

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
		this.setTitle("Stronghold Scouter");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(WIDTH, HEIGHT);
		this.setResizable(false);
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
		this.getContentPane().removeAll();
		if (myView == WindowState.START) {
			StartPage p = new StartPage();
			add(p);
			this.setVisible(true);
		}
		
		else if (myView == WindowState.RECEIVE_STATUS_DATA) {
			System.out.println("HIT");
			MatchDataReceive page = new MatchDataReceive();
			add(page);
			this.setVisible(true);
		}
		else if (myView == WindowState.MATCH) {
			MatchView view = new MatchView();
			add(view);
			this.setVisible(true);
		}
		else if (myView == WindowState.MATCH_COMPLETE) {
			SubmitView view = new SubmitView();
			add(view);
			this.setVisible(true);
		}
	}
}