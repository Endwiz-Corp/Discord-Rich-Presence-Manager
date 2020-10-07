package fr.endwiz.drp.ui.panels;

import com.jfoenix.animation.alert.JFXAlertAnimation;
import com.jfoenix.controls.JFXAlert;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialogLayout;
import fr.endwiz.drp.Constants;
import fr.endwiz.drp.ui.PanelManager;
import fr.endwiz.drp.ui.panel.Panel;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Modality;

public class closePanel extends Panel {
    public void init(PanelManager panelManager) {
        super.init(panelManager);

        JFXDialogLayout layout = new JFXDialogLayout();

        Label text = new Label("Do you want to close Discord Rich Presence Manager?");
        GridPane.setVgrow(text, Priority.ALWAYS);
        GridPane.setHgrow(text, Priority.ALWAYS);
        GridPane.setValignment(text, VPos.TOP);
        GridPane.setHalignment(text, HPos.LEFT);
        text.setTranslateX(15);
        text.setTranslateY(-30);

        JFXAlert alert = new JFXAlert(panelManager.getStage());
        alert.setOverlayClose(true);
        alert.setAnimation(JFXAlertAnimation.CENTER_ANIMATION);
        alert.setContent(layout);
        alert.initModality(Modality.APPLICATION_MODAL);

        JFXButton yes = new JFXButton("YES!");
        yes.setPrefSize(100.0D, 50.0D);
        yes.setMinSize(100.0D, 50.0D);
        yes.setMaxSize(100.0D, 50.0D);
        yes.setTranslateY(25);
        yes.setTranslateX(10);
        yes.setOnMouseClicked(e -> System.exit(0));
        yes.setOnMouseEntered(e -> panelManager.getLayout().setCursor(Cursor.HAND));
        yes.setOnMouseExited(e -> panelManager.getLayout().setCursor(Cursor.DEFAULT));

        JFXButton no = new JFXButton("NO!");
        no.setPrefSize(100.0D, 50.0D);
        no.setMinSize(100.0D, 50.0D);
        no.setMaxSize(100.0D, 50.0D);
        no.setTranslateY(25);
        no.setTranslateX(130);
        no.setOnMouseClicked(e -> alert.close());
        no.setOnMouseEntered(e -> panelManager.getLayout().setCursor(Cursor.HAND));
        no.setOnMouseExited(e -> panelManager.getLayout().setCursor(Cursor.DEFAULT));
        alert.setSize(Constants.WIDTH - 30, 150);

        if (Constants.isDarkTheme()) {
            no.setStyle("-fx-padding: 0.7em 0.57em; -fx-text-fill: #dbdbdb; -fx-border-color: #2a46dd");
            yes.setStyle("-fx-padding: 0.7em 0.57em; -fx-text-fill: #dbdbdb; -fx-border-color: #2a46dd");
            layout.setStyle("-fx-background-color: #333; -fx-border-color: #3954b7");
        } else {
            no.setStyle("-fx-padding: 0.7em 0.57em; -fx-text-fill: #333; -fx-border-color: #2a46dd");
            yes.setStyle("-fx-padding: 0.7em 0.57em; -fx-text-fill: #333; -fx-border-color: #2a46dd");
            layout.setStyle("-fx-background-color: #d6d6d6; -fx-border-color: #3954b7");
        }

        layout.setBody(text, yes, no);

        alert.show();
    }
}
