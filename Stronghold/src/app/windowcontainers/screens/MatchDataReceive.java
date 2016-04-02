package app.windowcontainers.screens;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import app.Main;
import app.globals.Constants;
import app.globals.Globals;
import app.windowcontainers.MainWindow;

public class MatchDataReceive extends JPanel {

	public MatchDataReceive() {
		this.setLayout(new BorderLayout());
		JLabel label = new JLabel("                   Enter Team Information");
		label.setFont(Constants.STARTUP_FONT);
		this.add(label, BorderLayout.NORTH);
		label.setVisible(true);
		
		//Main Window Container
		JPanel main = new JPanel();
		main.setLayout(new GridLayout(12,1));
		
		//The Labels
		JLabel teamLabel = new JLabel(" Enter a Team:");
		JLabel matchLabel = new JLabel(" Enter a Match:");
		JLabel scouter = new JLabel(" Scouter Name");
		//The TextFields to enter in
		JTextField entryTeam = new JTextField();
		JTextField entryMatch = new JTextField();
		JTextField entryScouter = new JTextField();
		//set the example texts
		entryMatch.setText("");
		entryTeam.setText("");
		entryScouter.setText("");
		//add all the components
		main.add(teamLabel);
		main.add(entryTeam);
		main.add(matchLabel);
		main.add(entryMatch);
		main.add(scouter);
		main.add(entryScouter);
		//make them all visible
		entryTeam.setVisible(true);
		entryMatch.setVisible(true);
		teamLabel.setVisible(true);
		matchLabel.setVisible(true);
		scouter.setVisible(true);
		entryScouter.setVisible(true);
		
		JButton submit = new JButton("Start Scouting");
		main.add(submit);
		submit.setVisible(true);
		submit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try{
					Globals.currentMatch = Integer.parseInt(entryMatch.getText());
					Globals.teamWatching = Integer.parseInt(entryTeam.getText());
					Globals.scouter = entryScouter.getText();
					System.out.println("Good");
					Main.window.updateView(MainWindow.WindowState.MATCH);
				}
				catch (Exception exception) {
					System.out.println("Error");
				}
			}
			
		});
		
		this.add(main, BorderLayout.CENTER);
		main.setVisible(true);
	}
}
