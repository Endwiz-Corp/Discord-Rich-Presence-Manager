package fr.endwiz.drp.utils.discordrp;

import fr.endwiz.drp.Main;
import fr.endwiz.drp.ui.panels.MainPanel;
import net.arikia.dev.drpc.DiscordEventHandlers;
import net.arikia.dev.drpc.DiscordRPC;
import net.arikia.dev.drpc.DiscordRichPresence;
import net.arikia.dev.drpc.DiscordUser;
import net.arikia.dev.drpc.callbacks.ReadyCallback;

public class DiscordRP {
    public static boolean running;
    private long created = 0;

    public static boolean isRunning() {
        return running;
    }

    public static void setRunning(boolean run) {
        running = run;
    }

    public void start(String ClientId) {
        setRunning(true);
        if (MainPanel.haveTimer()) {
            this.created = System.currentTimeMillis();
        }
        DiscordEventHandlers handlers = new DiscordEventHandlers.Builder().setReadyEventHandler(new ReadyCallback() {
            @Override
            public void apply(DiscordUser discordUser) {
                Main.logger.log("DiscordRP is start!");
                Main.logger.log(discordUser.username + "#" + discordUser.discriminator);
            }
        }).build();

        DiscordRPC.discordInitialize(ClientId, handlers, true);

        new Thread("DiscordRP Callback") {

            @Override
            public void run() {
                while (running) {
                    DiscordRPC.discordRunCallbacks();
                }
            }
        }.start();
    }

    public void shutDown() {
        setRunning(false);
        DiscordRPC.discordShutdown();
    }

    public void update(String details, String state, String BigImage, String BigImageText, String SmallImage, String SmallImageText) {
        DiscordRichPresence.Builder b = new DiscordRichPresence.Builder(state);
        b.setBigImage(BigImage, BigImageText);
        b.setSmallImage(SmallImage, SmallImageText);
        b.setDetails(details);
        b.setStartTimestamps(created);

        DiscordRPC.discordUpdatePresence(b.build());
    }
}
