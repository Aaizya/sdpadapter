public class LegacyGameLobbyAdapter implements GameLobby {
    private LegacyGameLobby legacyGameLobby;

    public LegacyGameLobbyAdapter(LegacyGameLobby legacyGameLobby) {
        this.legacyGameLobby = legacyGameLobby;
    }

    @Override
    public void joinLobby(String playerName) {
        legacyGameLobby.enter(playerName);
    }

    @Override
    public void startGame() {
        legacyGameLobby.commence();
    }
}
