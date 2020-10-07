package fr.endwiz.drp;

import fr.endwiz.drp.ui.PanelManager;
import fr.endwiz.drp.ui.panels.MainPanel;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class DiscordRichPresenceManager {


    public static void OpenURI(String uri) {
        try {
            Desktop.getDesktop().browse(new URI(uri));
        } catch (IOException | URISyntaxException e) {
            Main.logger.warn(e.getMessage());
        }
    }

    public void init(Stage stage) {
        PanelManager panelManager = new PanelManager(stage);
        panelManager.init();
        panelManager.showPanel(new MainPanel());
    }
}
