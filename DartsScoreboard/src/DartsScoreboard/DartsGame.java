package DartsScoreboard;

public class DartsGame {
	private Player[] players;

	public DartsGame(int points, int numberOfPlayers) {
		players = new Player[numberOfPlayers];
		for (int p = 0; p < numberOfPlayers; p++) {
			new Player("Player " + (p+1), points);
		}
	}

}
