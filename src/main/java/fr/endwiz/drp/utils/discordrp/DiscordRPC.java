package fr.endwiz.drp.utils.discordrp;

public class DiscordRPC {

    private static final DiscordRPC INSTANCE = new DiscordRPC();
    private final DiscordRP discordRP = new DiscordRP();
    public static String ClientID;

    public static String getClientID() {
        return ClientID;
    }
    public static void setClientID(String clientID) {
        ClientID = clientID;
    }

    public static DiscordRPC getInstance() {
        return INSTANCE;
    }

    public void init(String ClientID) {
        discordRP.start(ClientID);
        setClientID(ClientID);
    }

    public void shutDown() {
        discordRP.shutDown();
    }

    public DiscordRP getDiscordRP() {
        return discordRP;
    }
}
