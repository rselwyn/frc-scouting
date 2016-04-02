package app.windowcontainers.screens;

import static app.globals.Constants.*;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import app.Main;
import app.globals.Globals;
import app.windowcontainers.MainWindow.WindowState;

public class SubmitView extends JPanel{

	public SubmitView() {
		this.setLayout(new BorderLayout());
		JLabel label = new JLabel("         Thank You For Completing Your Scouting of Match #"+Globals.currentMatch);
		label.setFont(EXIT_FONT);
		this.add(label, BorderLayout.NORTH);
		label.setVisible(true);
		
		JPanel main = new JPanel();
		main.setLayout(new FlowLayout());
		
		JButton go = new JButton("Submit Data");
		go.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Click");
				Main.window.updateView(WindowState.START);
			}
			
		});
		main.add(go);
		this.add(main, BorderLayout.CENTER);
		main.setVisible(true);
		go.setVisible(true);
	}
}
