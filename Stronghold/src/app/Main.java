package app;

import app.windowcontainers.MainWindow;

public class Main {

	public static MainWindow window;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		window = new MainWindow(MainWindow.WindowState.RECEIVE_STATUS_DATA);
	}

}
