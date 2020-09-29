package fr.endwiz.drp.ui;

import fr.endwiz.drp.Constants;
import fr.endwiz.drp.DiscordRichPresenceManager;
import fr.endwiz.drp.ui.panel.IPanel;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class PanelManager {

    private final DiscordRichPresenceManager konamiaLauncher;
    private final Stage stage;
    private GridPane layout;
    private GridPane centerPanel = new GridPane();

    public PanelManager(DiscordRichPresenceManager konamiaLauncher, Stage stage) {
        this.konamiaLauncher = konamiaLauncher;
        this.stage = stage;
    }

    public void init() {
        this.stage.getIcons().add(new Image(Constants.WINDOW_ICON));
        this.stage.setTitle(Constants.WINDOW_NAME);
        this.stage.setWidth(Constants.WIDTH);
        this.stage.setHeight(Constants.HEIGHT);
        this.stage.setResizable(Constants.RESIZABLE);
        this.stage.initStyle(Constants.STAGE_STYLE);
        this.stage.show();

        this.layout = new GridPane();
        this.stage.setScene(new Scene(this.layout));
        this.layout.setStyle("-fx-background-color: rgb(40,40,40);");

        RowConstraints topPanelConstraints = new RowConstraints();
        topPanelConstraints.setValignment(VPos.TOP);
        topPanelConstraints.setMinHeight(25);
        topPanelConstraints.setMaxHeight(25);
        this.layout.getRowConstraints().addAll(topPanelConstraints, new RowConstraints());

        this.layout.add(centerPanel, 0, 1);
        GridPane.setVgrow(this.centerPanel, Priority.ALWAYS);
        GridPane.setHgrow(this.centerPanel, Priority.ALWAYS);
    }

    public void showPanel(IPanel panel) {
        this.centerPanel.getChildren().clear();
        this.centerPanel.getChildren().add(panel.getLayout());
        panel.init(this);
        panel.onShow();
    }

    public Stage getStage() {
        return stage;
    }
    public DiscordRichPresenceManager getKonamiaLauncher() {
        return konamiaLauncher;
    }
    public GridPane getLayout() {
        return this.centerPanel;
    }
}
