package fr.endwiz.drp;

import fr.endwiz.drp.ui.PanelManager;
import fr.endwiz.drp.ui.panels.closePanel;
import fr.endwiz.drp.utils.discordrp.DiscordRPC;
import javafx.application.Application;
import javafx.stage.Stage;

public class LaunchApp extends Application {
    @Override
    public void start(Stage stage) {
        new DiscordRichPresenceManager().init(stage);

        stage.setOnCloseRequest(e -> {
                    DiscordRPC.getInstance().shutDown();
                    e.consume();
                    PanelManager panelManager = new PanelManager(stage);
                    panelManager.showPanel(new closePanel());
                }
        );
    }
}
