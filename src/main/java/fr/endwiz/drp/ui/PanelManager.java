package fr.endwiz.drp.ui;

import fr.endwiz.drp.Constants;
import fr.endwiz.drp.ui.panel.IPanel;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class PanelManager {
    private final Stage stage;
    private final GridPane centerPanel = new GridPane();

    public PanelManager(Stage stage) {
        this.stage = stage;
    }

    public void init() {

        // Initialize the window
        this.stage.getIcons().add(new Image(Constants.WINDOW_ICON));
        this.stage.setTitle(Constants.WINDOW_NAME);
        this.stage.setWidth(Constants.WIDTH);
        this.stage.setHeight(Constants.HEIGHT);
        this.stage.setResizable(Constants.RESIZABLE);
        this.stage.initStyle(Constants.STAGE_STYLE);
        this.stage.show();

        GridPane layout = new GridPane();
        layout.setStyle("-fx-background-color: #282828;");
        layout.setTranslateY(-30);
        this.stage.setScene(new Scene(layout));


        RowConstraints topPanelConstraints = new RowConstraints();
        topPanelConstraints.setValignment(VPos.TOP);
        topPanelConstraints.setMinHeight(25);
        topPanelConstraints.setMaxHeight(25);
        layout.getRowConstraints().addAll(topPanelConstraints, new RowConstraints());

        layout.add(centerPanel, 0, 1);
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
    public GridPane getLayout() {
        return this.centerPanel;
    }
}
