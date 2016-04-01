package app.windowcontainers.screens;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import static app.globals.Constants.*;

public class StartPage extends JPanel {


	
	public StartPage() {
		JLabel label = new JLabel("FRC TEAM #8: STRONGHOLD Scouter");
		label.setFont(STARTUP_FONT);
		this.add(label);
		label.setVisible(true);
	}
	
}
