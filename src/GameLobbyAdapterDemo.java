public class GameLobbyAdapterDemo {
    public static void main(String[] args) {
        GameLobby gameLobby = new GameLobby() {
            @Override
            public void joinLobby(String playerName) {
                System.out.println(playerName + " joined the new lobby.");
            }

            @Override
            public void startGame() {
                System.out.println("New lobby: Game started.");
            }
        };

        // Using the LegacyGameLobby with an adapter
        LegacyGameLobby legacyGameLobby = new LegacyGameLobby();
        GameLobby legacyLobbyAdapter = new LegacyGameLobbyAdapter(legacyGameLobby);

        // Demonstrate using the new lobby
        gameLobby.joinLobby("Player 1");
        gameLobby.startGame();

        // Demonstrate using the legacy lobby with the adapter
        legacyLobbyAdapter.joinLobby("Player 2");
        legacyLobbyAdapter.startGame();
    }
}
