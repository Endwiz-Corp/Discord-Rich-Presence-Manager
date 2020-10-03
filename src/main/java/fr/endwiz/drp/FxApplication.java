package fr.endwiz.drp;

import fr.endwiz.drp.utils.discordrp.DiscordRPC;
import javafx.application.Application;
import javafx.stage.Stage;

public class FxApplication extends Application {
    @Override
    public void start(Stage stage) {
        new DiscordRichPresenceManager().init(stage);

        stage.setOnCloseRequest(e -> {
            DiscordRPC.getInstance().shutDown();
            System.exit(0);
        });
    }


}
