package DartsScoreboard;

import DartsScoreboard.consoleUi.TextUi; 

public class MainApp {

	public static void main(String[] args) {

	DartsGame game = new DartsGame(501, 2);
	TextUi ui = new TextUi(game); 
	}
}