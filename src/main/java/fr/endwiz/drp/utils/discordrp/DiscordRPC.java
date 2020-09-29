package fr.endwiz.drp.utils.discordrp;

public class DiscordRPC {

    private static final DiscordRPC INSTANCE = new DiscordRPC();
    private final DiscordRP discordRP = new DiscordRP();

    public static DiscordRPC getInstance() {
        return INSTANCE;
    }

    public void init(String ClientID) {
        discordRP.start(ClientID);
    }

    public void shutDown() {
        discordRP.shutDown();
    }

    public DiscordRP getDiscordRP() {
        return discordRP;
    }
}
