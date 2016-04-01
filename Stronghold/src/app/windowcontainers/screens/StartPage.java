package app.windowcontainers.screens;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import app.Main;
import app.windowcontainers.MainWindow.WindowState;

import static app.globals.Constants.*;

public class StartPage extends JPanel {

	public StartPage() {
		this.setLayout(new BorderLayout());
		JLabel label = new JLabel("       FRC TEAM #8: STRONGHOLD Scouter");
		label.setFont(STARTUP_FONT);
		this.add(label, BorderLayout.NORTH);
		label.setVisible(true);
		
		JPanel main = new JPanel();
		main.setLayout(new FlowLayout());
		
		JButton go = new JButton("Start");
		go.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Click");
				Main.window.updateView(WindowState.RECEIVE_STATUS_DATA);
			}
			
		});
		main.add(go);
		this.add(main, BorderLayout.CENTER);
		main.setVisible(true);
		go.setVisible(true);
	}
	
}
