package fr.endwiz.drp.ui.panels;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXToggleButton;
import fr.endwiz.drp.DiscordRichPresenceManager;
import fr.endwiz.drp.Main;
import fr.endwiz.drp.ui.PanelManager;
import fr.endwiz.drp.utils.discordrp.DiscordRP;
import fr.endwiz.drp.utils.discordrp.DiscordRPC;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Paint;

public class MainPanel extends fr.endwiz.drp.ui.panel.Panel {

    public static String ID;
    public static String Details;
    public static String State;
    public static String Big;
    public static String BigText;
    public static String Small;
    public static String SmallText;
    public static boolean Timer = false;
    public static boolean canClose = false;

    public static String getID() {
        return ID;
    }

    public static void setID(String id) {
        ID = id;
    }

    public static boolean haveTimer() {
        return Timer;
    }

    public static void setTimer(Boolean timer) {
        Timer = timer;
    }

    public static String getDetails() {
        return Details;
    }

    public static void setDetails(String details) {
        Details = details;
    }

    public static String getState() {
        return State;
    }

    public static void setState(String state) {
        State = state;
    }

    public static String getBig() {
        return Big;
    }

    public static void setBig(String big) {
        Big = big;
    }

    public static String getBigText() {
        return BigText;
    }

    public static void setBigText(String bigText) {
        BigText = bigText;
    }

    public static String getSmall() {
        return Small;
    }

    public static void setSmall(String small) {
        Small = small;
    }

    public static String getSmallText() {
        return SmallText;
    }

    public static void setSmallText(String smallText) {
        SmallText = smallText;
    }

    public static boolean CanClose() {
        return canClose;
    }

    public static void setCanClose(boolean canClose) {
        MainPanel.canClose = canClose;
    }

    @Override
    public void init(PanelManager panelManager) {
        super.init(panelManager);
        GridPane mainPanel = new GridPane();
        mainPanel.setMaxWidth(400);
        mainPanel.setMinWidth(400);
        mainPanel.setMaxHeight(580);
        mainPanel.setMinHeight(580);
        GridPane.setVgrow(mainPanel, Priority.ALWAYS);
        GridPane.setHgrow(mainPanel, Priority.ALWAYS);
        this.layout.getChildren().add(mainPanel);

        Label Id = new Label("Client ID:");
        GridPane.setVgrow(Id, Priority.ALWAYS);
        GridPane.setHgrow(Id, Priority.ALWAYS);
        GridPane.setValignment(Id, VPos.TOP);
        GridPane.setHalignment(Id, HPos.LEFT);
        Id.setStyle("-fx-font-size: 24px; -fx-text-fill: #dbdbdb;");
        Id.setMaxWidth(325);
        Id.setMaxHeight(40);
        Id.setTranslateX(15);
        Id.setTranslateY(-30);

        TextField IdField = new TextField();
        GridPane.setVgrow(IdField, Priority.ALWAYS);
        GridPane.setHgrow(IdField, Priority.ALWAYS);
        GridPane.setValignment(IdField, VPos.TOP);
        GridPane.setHalignment(IdField, HPos.LEFT);
        IdField.setStyle("-fx-background-color: #fff; -fx-opacity: 40%; -fx-font-size: 16px; -fx-text-fill: #393939;");
        IdField.setMaxWidth(346);
        IdField.setMaxHeight(40);
        IdField.setTranslateX(12);
        IdField.setTranslateY(5);

        Label Detail = new Label("Detail:");
        GridPane.setVgrow(Detail, Priority.ALWAYS);
        GridPane.setHgrow(Detail, Priority.ALWAYS);
        GridPane.setValignment(Detail, VPos.TOP);
        GridPane.setHalignment(Detail, HPos.LEFT);
        Detail.setStyle("-fx-font-size: 24px; -fx-text-fill: #dbdbdb;");
        Detail.setMaxWidth(325);
        Detail.setMaxHeight(40);
        Detail.setTranslateX(15);
        Detail.setTranslateY(40);

        TextField DetailField = new TextField();
        GridPane.setVgrow(DetailField, Priority.ALWAYS);
        GridPane.setHgrow(DetailField, Priority.ALWAYS);
        GridPane.setValignment(DetailField, VPos.TOP);
        GridPane.setHalignment(DetailField, HPos.LEFT);
        DetailField.setStyle("-fx-background-color: #fff; -fx-opacity: 40%; -fx-font-size: 16px; -fx-text-fill: #393939;");
        DetailField.setMaxWidth(346);
        DetailField.setMaxHeight(40);
        DetailField.setTranslateX(12);
        DetailField.setTranslateY(75);

        Label State = new Label("State:");
        GridPane.setVgrow(State, Priority.ALWAYS);
        GridPane.setHgrow(State, Priority.ALWAYS);
        GridPane.setValignment(State, VPos.TOP);
        GridPane.setHalignment(State, HPos.LEFT);
        State.setStyle("-fx-font-size: 24px; -fx-text-fill: #dbdbdb;");
        State.setMaxWidth(325);
        State.setMaxHeight(40);
        State.setTranslateX(15);
        State.setTranslateY(110);

        TextField StateField = new TextField();
        GridPane.setVgrow(StateField, Priority.ALWAYS);
        GridPane.setHgrow(StateField, Priority.ALWAYS);
        GridPane.setValignment(StateField, VPos.TOP);
        GridPane.setHalignment(StateField, HPos.LEFT);
        StateField.setStyle("-fx-background-color: #fff; -fx-opacity: 40%; -fx-font-size: 16px; -fx-text-fill: #393939;");
        StateField.setMaxWidth(346);
        StateField.setMaxHeight(40);
        StateField.setTranslateX(12);
        StateField.setTranslateY(145);

        Label bigImage = new Label("Big Image:");
        GridPane.setVgrow(bigImage, Priority.ALWAYS);
        GridPane.setHgrow(bigImage, Priority.ALWAYS);
        GridPane.setValignment(bigImage, VPos.TOP);
        GridPane.setHalignment(bigImage, HPos.LEFT);
        bigImage.setStyle("-fx-font-size: 24px; -fx-text-fill: #dbdbdb;");
        bigImage.setMaxWidth(325);
        bigImage.setMaxHeight(40);
        bigImage.setTranslateX(15);
        bigImage.setTranslateY(185);

        TextField bigImageField = new TextField();
        GridPane.setVgrow(bigImageField, Priority.ALWAYS);
        GridPane.setHgrow(bigImageField, Priority.ALWAYS);
        GridPane.setValignment(bigImageField, VPos.TOP);
        GridPane.setHalignment(bigImageField, HPos.LEFT);
        bigImageField.setStyle("-fx-background-color: #fff; -fx-opacity: 40%; -fx-font-size: 16px; -fx-text-fill: #393939;");
        bigImageField.setMaxWidth(162);
        bigImageField.setMaxHeight(40);
        bigImageField.setTranslateX(12);
        bigImageField.setTranslateY(225);

        Label bigImageText = new Label("Big Image Text:");
        GridPane.setVgrow(bigImageText, Priority.ALWAYS);
        GridPane.setHgrow(bigImageText, Priority.ALWAYS);
        GridPane.setValignment(bigImageText, VPos.TOP);
        GridPane.setHalignment(bigImageText, HPos.LEFT);
        bigImageText.setStyle("-fx-font-size: 24px; -fx-text-fill: #dbdbdb;");
        bigImageText.setMaxWidth(325);
        bigImageText.setMaxHeight(40);
        bigImageText.setTranslateX(194);
        bigImageText.setTranslateY(185);

        TextField bigImageTextField = new TextField();
        GridPane.setVgrow(bigImageTextField, Priority.ALWAYS);
        GridPane.setHgrow(bigImageTextField, Priority.ALWAYS);
        GridPane.setValignment(bigImageTextField, VPos.TOP);
        GridPane.setHalignment(bigImageTextField, HPos.LEFT);
        bigImageTextField.setStyle("-fx-background-color: #fff; -fx-opacity: 40%; -fx-font-size: 16px; -fx-text-fill: #393939;");
        bigImageTextField.setMaxWidth(162);
        bigImageTextField.setMaxHeight(40);
        bigImageTextField.setTranslateX(194);
        bigImageTextField.setTranslateY(225);

        Label smallImage = new Label("Small Image:");
        GridPane.setVgrow(smallImage, Priority.ALWAYS);
        GridPane.setHgrow(smallImage, Priority.ALWAYS);
        GridPane.setValignment(smallImage, VPos.TOP);
        GridPane.setHalignment(smallImage, HPos.LEFT);
        smallImage.setStyle("-fx-font-size: 24px; -fx-text-fill: #dbdbdb;");
        smallImage.setMaxWidth(325);
        smallImage.setMaxHeight(40);
        smallImage.setTranslateX(15);
        smallImage.setTranslateY(265);

        TextField smallImageField = new TextField();
        GridPane.setVgrow(smallImageField, Priority.ALWAYS);
        GridPane.setHgrow(smallImageField, Priority.ALWAYS);
        GridPane.setValignment(smallImageField, VPos.TOP);
        GridPane.setHalignment(smallImageField, HPos.LEFT);
        smallImageField.setStyle("-fx-background-color: #fff; -fx-opacity: 40%; -fx-font-size: 16px; -fx-text-fill: #393939;");
        smallImageField.setMaxWidth(162);
        smallImageField.setMaxHeight(40);
        smallImageField.setTranslateX(12);
        smallImageField.setTranslateY(300);

        Label smallImageText = new Label("Small Image Text:");
        GridPane.setVgrow(smallImageText, Priority.ALWAYS);
        GridPane.setHgrow(smallImageText, Priority.ALWAYS);
        GridPane.setValignment(smallImageText, VPos.TOP);
        GridPane.setHalignment(smallImageText, HPos.LEFT);
        smallImageText.setStyle("-fx-font-size: 24px; -fx-text-fill: #dbdbdb;");
        smallImageText.setMaxWidth(325);
        smallImageText.setMaxHeight(40);
        smallImageText.setTranslateX(190);
        smallImageText.setTranslateY(265);

        TextField smallImageTextField = new TextField();
        GridPane.setVgrow(smallImageTextField, Priority.ALWAYS);
        GridPane.setHgrow(smallImageTextField, Priority.ALWAYS);
        GridPane.setValignment(smallImageTextField, VPos.TOP);
        GridPane.setHalignment(smallImageTextField, HPos.LEFT);
        smallImageTextField.setStyle("-fx-background-color: #fff; -fx-opacity: 40%; -fx-font-size: 16px; -fx-text-fill: #393939;");
        smallImageTextField.setMaxWidth(162);
        smallImageTextField.setMaxHeight(40);
        smallImageTextField.setTranslateX(194);
        smallImageTextField.setTranslateY(300);

        JFXToggleButton timer = new JFXToggleButton();
        GridPane.setVgrow(timer, Priority.ALWAYS);
        GridPane.setHgrow(timer, Priority.ALWAYS);
        GridPane.setValignment(timer, VPos.TOP);
        GridPane.setHalignment(timer, HPos.LEFT);
        timer.setStyle("-fx-font-size: 24px; -fx-text-fill: #dbdbdb;");
        timer.setToggleLineColor(Paint.valueOf("c8872f"));
        timer.setToggleColor(Paint.valueOf("c8652f"));
        timer.setTranslateX(15);
        timer.setTranslateY(335);
        timer.setText("Timer");
        timer.setOnMouseClicked(e -> setTimer(!haveTimer()));

        JFXToggleButton close = new JFXToggleButton();
        GridPane.setVgrow(close, Priority.ALWAYS);
        GridPane.setHgrow(close, Priority.ALWAYS);
        GridPane.setValignment(close, VPos.TOP);
        GridPane.setHalignment(close, HPos.LEFT);
        close.setStyle("-fx-font-size: 24px; -fx-text-fill: #dbdbdb;");
        close.setToggleLineColor(Paint.valueOf("c8872f"));
        close.setToggleColor(Paint.valueOf("c8652f"));
        close.setTranslateX(200);
        close.setTranslateY(335);
        close.setText("Close");
        close.setOnMouseClicked(e -> setCanClose(!CanClose()));

        JFXButton start = new JFXButton("Launch!");
        GridPane.setValignment(start, VPos.BOTTOM);
        GridPane.setHalignment(start, HPos.CENTER);
        GridPane.setHgrow(start, Priority.ALWAYS);
        GridPane.setVgrow(start, Priority.ALWAYS);
        start.setPrefSize(200.0D, 50.0D);
        start.setMinSize(200.0D, 50.0D);
        start.setMaxSize(200.0D, 50.0D);
        start.setTranslateY(-70);
        start.setStyle("-fx-padding: 0.7em 0.57em; -fx-text-fill: #fff; -fx-border-color: #2a46dd");
        start.setOnMouseClicked((e) -> {
            setID(IdField.getText());
            System.out.println("");
            System.out.println("");
            if (!DiscordRP.isRunning()) {
                DiscordRPC.getInstance().init(getID());
            } else {
                Main.logger.log("Discord Rich Presence is already started!");
                Main.logger.log("Discord Rich Presence is update!");
                System.out.println("");
            }
            Main.logger.log("Client ID: " + getID());

            setDetails(DetailField.getText());
            Main.logger.log("Details: " + getDetails());

            setState(StateField.getText());
            Main.logger.log("State: " + getState());

            setBig(bigImageField.getText());
            Main.logger.log("BigImage: " + getBig());

            setBigText(bigImageTextField.getText());
            Main.logger.log("BigText: " + getBigText());

            setSmall(smallImageField.getText());
            Main.logger.log("SmallImage: " + getSmall());

            setSmallText(smallImageTextField.getText());
            Main.logger.log("SmallText: " + getSmallText());

            Main.logger.log("Timer: " + haveTimer());

            Main.logger.log("Close: " + CanClose());

            DiscordRPC.getInstance().getDiscordRP().update(getDetails(), getState(), getBig(), getBigText(), getSmall(), getSmallText());
        });
        start.setOnMouseEntered((e) -> panelManager.getLayout().setCursor(Cursor.HAND));
        start.setOnMouseExited((e) -> panelManager.getLayout().setCursor(Cursor.DEFAULT));

        Label help = new Label("Need help?");
        GridPane.setVgrow(help, Priority.ALWAYS);
        GridPane.setHgrow(help, Priority.ALWAYS);
        GridPane.setValignment(help, VPos.BOTTOM);
        GridPane.setHalignment(help, HPos.RIGHT);
        help.setStyle("-fx-font-size: 12px; -fx-text-fill: #3954b7; -fx-underline: true;");
        help.setTranslateX(-20);
        help.setTranslateY(-35);
        help.setOnMouseEntered((e) -> panelManager.getLayout().setCursor(Cursor.HAND));
        help.setOnMouseExited((e) -> panelManager.getLayout().setCursor(Cursor.DEFAULT));
        help.setOnMouseClicked((e) -> DiscordRichPresenceManager.OpenURI("https://github.com/Endwiz/Discord-Rich-Presence-Manager"));

        mainPanel.getChildren().addAll(help, close, Id, IdField, Detail, DetailField, State, StateField, bigImage, bigImageField, bigImageText, bigImageTextField, smallImage, smallImageField, smallImageText, smallImageTextField, timer, start);
    }
}
