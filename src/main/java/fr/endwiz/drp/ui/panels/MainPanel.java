package fr.endwiz.drp.ui.panels;

import com.jfoenix.animation.alert.JFXAlertAnimation;
import com.jfoenix.controls.JFXAlert;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialogLayout;
import com.jfoenix.controls.JFXToggleButton;
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIcon;
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIconView;
import fr.endwiz.drp.Constants;
import fr.endwiz.drp.DiscordRichPresenceManager;
import fr.endwiz.drp.Main;
import fr.endwiz.drp.ui.PanelManager;
import fr.endwiz.drp.ui.panel.Panel;
import fr.endwiz.drp.utils.discordrp.DiscordRP;
import fr.endwiz.drp.utils.discordrp.DiscordRPC;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Modality;

public class MainPanel extends Panel {
    public static String ID;
    public static String Details;
    public static String State;
    public static String Big;
    public static String BigText;
    public static String Small;
    public static String SmallText;
    public static boolean Timer = false;

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

    @Override
    public void init(PanelManager panelManager) {
        super.init(panelManager);
        GridPane mainPanel = new GridPane();
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

        TextField IdField = new TextField();
        GridPane.setVgrow(IdField, Priority.ALWAYS);
        GridPane.setHgrow(IdField, Priority.ALWAYS);
        GridPane.setValignment(IdField, VPos.TOP);
        GridPane.setHalignment(IdField, HPos.LEFT);
        IdField.setStyle("-fx-background-color: #fff; -fx-opacity: 40%; -fx-font-size: 16px; -fx-text-fill: #393939;");
        IdField.setMaxWidth(346);
        IdField.setMaxHeight(40);
        IdField.setTranslateX(12);
        IdField.setTranslateY(35);

        Label Detail = new Label("Detail:");
        GridPane.setVgrow(Detail, Priority.ALWAYS);
        GridPane.setHgrow(Detail, Priority.ALWAYS);
        GridPane.setValignment(Detail, VPos.TOP);
        GridPane.setHalignment(Detail, HPos.LEFT);
        Detail.setStyle("-fx-font-size: 24px; -fx-text-fill: #dbdbdb;");
        Detail.setMaxWidth(325);
        Detail.setMaxHeight(40);
        Detail.setTranslateX(15);
        Detail.setTranslateY(70);

        TextField DetailField = new TextField();
        GridPane.setVgrow(DetailField, Priority.ALWAYS);
        GridPane.setHgrow(DetailField, Priority.ALWAYS);
        GridPane.setValignment(DetailField, VPos.TOP);
        GridPane.setHalignment(DetailField, HPos.LEFT);
        DetailField.setStyle("-fx-background-color: #fff; -fx-opacity: 40%; -fx-font-size: 16px; -fx-text-fill: #393939;");
        DetailField.setMaxWidth(346);
        DetailField.setMaxHeight(40);
        DetailField.setTranslateX(12);
        DetailField.setTranslateY(105);

        Label State = new Label("State:");
        GridPane.setVgrow(State, Priority.ALWAYS);
        GridPane.setHgrow(State, Priority.ALWAYS);
        GridPane.setValignment(State, VPos.TOP);
        GridPane.setHalignment(State, HPos.LEFT);
        State.setStyle("-fx-font-size: 24px; -fx-text-fill: #dbdbdb;");
        State.setMaxWidth(325);
        State.setMaxHeight(40);
        State.setTranslateX(15);
        State.setTranslateY(140);

        TextField StateField = new TextField();
        GridPane.setVgrow(StateField, Priority.ALWAYS);
        GridPane.setHgrow(StateField, Priority.ALWAYS);
        GridPane.setValignment(StateField, VPos.TOP);
        GridPane.setHalignment(StateField, HPos.LEFT);
        StateField.setStyle("-fx-background-color: #fff; -fx-opacity: 40%; -fx-font-size: 16px; -fx-text-fill: #393939;");
        StateField.setMaxWidth(346);
        StateField.setMaxHeight(40);
        StateField.setTranslateX(12);
        StateField.setTranslateY(175);

        Label bigImage = new Label("Big Image:");
        GridPane.setVgrow(bigImage, Priority.ALWAYS);
        GridPane.setHgrow(bigImage, Priority.ALWAYS);
        GridPane.setValignment(bigImage, VPos.TOP);
        GridPane.setHalignment(bigImage, HPos.LEFT);
        bigImage.setStyle("-fx-font-size: 24px; -fx-text-fill: #dbdbdb;");
        bigImage.setMaxWidth(325);
        bigImage.setMaxHeight(40);
        bigImage.setTranslateX(15);
        bigImage.setTranslateY(210);

        TextField bigImageField = new TextField();
        GridPane.setVgrow(bigImageField, Priority.ALWAYS);
        GridPane.setHgrow(bigImageField, Priority.ALWAYS);
        GridPane.setValignment(bigImageField, VPos.TOP);
        GridPane.setHalignment(bigImageField, HPos.LEFT);
        bigImageField.setStyle("-fx-background-color: #fff; -fx-opacity: 40%; -fx-font-size: 16px; -fx-text-fill: #393939;");
        bigImageField.setMaxWidth(162);
        bigImageField.setMaxHeight(40);
        bigImageField.setTranslateX(12);
        bigImageField.setTranslateY(245);

        Label bigImageText = new Label("Big Image Text:");
        GridPane.setVgrow(bigImageText, Priority.ALWAYS);
        GridPane.setHgrow(bigImageText, Priority.ALWAYS);
        GridPane.setValignment(bigImageText, VPos.TOP);
        GridPane.setHalignment(bigImageText, HPos.LEFT);
        bigImageText.setStyle("-fx-font-size: 24px; -fx-text-fill: #dbdbdb;");
        bigImageText.setMaxWidth(325);
        bigImageText.setMaxHeight(40);
        bigImageText.setTranslateX(194);
        bigImageText.setTranslateY(210);

        TextField bigImageTextField = new TextField();
        GridPane.setVgrow(bigImageTextField, Priority.ALWAYS);
        GridPane.setHgrow(bigImageTextField, Priority.ALWAYS);
        GridPane.setValignment(bigImageTextField, VPos.TOP);
        GridPane.setHalignment(bigImageTextField, HPos.LEFT);
        bigImageTextField.setStyle("-fx-background-color: #fff; -fx-opacity: 40%; -fx-font-size: 16px; -fx-text-fill: #393939;");
        bigImageTextField.setMaxWidth(162);
        bigImageTextField.setMaxHeight(40);
        bigImageTextField.setTranslateX(194);
        bigImageTextField.setTranslateY(245);

        Label smallImage = new Label("Small Image:");
        GridPane.setVgrow(smallImage, Priority.ALWAYS);
        GridPane.setHgrow(smallImage, Priority.ALWAYS);
        GridPane.setValignment(smallImage, VPos.TOP);
        GridPane.setHalignment(smallImage, HPos.LEFT);
        smallImage.setStyle("-fx-font-size: 24px; -fx-text-fill: #dbdbdb;");
        smallImage.setMaxWidth(325);
        smallImage.setMaxHeight(40);
        smallImage.setTranslateX(15);
        smallImage.setTranslateY(280);

        TextField smallImageField = new TextField();
        GridPane.setVgrow(smallImageField, Priority.ALWAYS);
        GridPane.setHgrow(smallImageField, Priority.ALWAYS);
        GridPane.setValignment(smallImageField, VPos.TOP);
        GridPane.setHalignment(smallImageField, HPos.LEFT);
        smallImageField.setStyle("-fx-background-color: #fff; -fx-opacity: 40%; -fx-font-size: 16px; -fx-text-fill: #393939;");
        smallImageField.setMaxWidth(162);
        smallImageField.setMaxHeight(40);
        smallImageField.setTranslateX(12);
        smallImageField.setTranslateY(315);

        Label smallImageText = new Label("Small Image Text:");
        GridPane.setVgrow(smallImageText, Priority.ALWAYS);
        GridPane.setHgrow(smallImageText, Priority.ALWAYS);
        GridPane.setValignment(smallImageText, VPos.TOP);
        GridPane.setHalignment(smallImageText, HPos.LEFT);
        smallImageText.setStyle("-fx-font-size: 24px; -fx-text-fill: #dbdbdb;");
        smallImageText.setMaxWidth(325);
        smallImageText.setMaxHeight(40);
        smallImageText.setTranslateX(190);
        smallImageText.setTranslateY(280);

        TextField smallImageTextField = new TextField();
        GridPane.setVgrow(smallImageTextField, Priority.ALWAYS);
        GridPane.setHgrow(smallImageTextField, Priority.ALWAYS);
        GridPane.setValignment(smallImageTextField, VPos.TOP);
        GridPane.setHalignment(smallImageTextField, HPos.LEFT);
        smallImageTextField.setStyle("-fx-background-color: #fff; -fx-opacity: 40%; -fx-font-size: 16px; -fx-text-fill: #393939;");
        smallImageTextField.setMaxWidth(162);
        smallImageTextField.setMaxHeight(40);
        smallImageTextField.setTranslateX(194);
        smallImageTextField.setTranslateY(315);

        JFXToggleButton timer = new JFXToggleButton();
        GridPane.setVgrow(timer, Priority.ALWAYS);
        GridPane.setHgrow(timer, Priority.ALWAYS);
        GridPane.setValignment(timer, VPos.CENTER);
        GridPane.setHalignment(timer, HPos.CENTER);
        timer.setStyle("-fx-font-size: 24px; -fx-text-fill: #dbdbdb;");
        timer.setToggleLineColor(Paint.valueOf("c8872f"));
        timer.setToggleColor(Paint.valueOf("c8652f"));
        timer.setTranslateY(100);
        timer.setTranslateX(-3);
        timer.setText("Timer");
        timer.setOnMouseClicked(e -> setTimer(!haveTimer()));

        JFXButton start = new JFXButton("Launch!");
        GridPane.setValignment(start, VPos.BOTTOM);
        GridPane.setHalignment(start, HPos.LEFT);
        GridPane.setHgrow(start, Priority.ALWAYS);
        GridPane.setVgrow(start, Priority.ALWAYS);
        start.setPrefSize(100.0D, 50.0D);
        start.setMinSize(100.0D, 50.0D);
        start.setMaxSize(100.0D, 50.0D);
        start.setTranslateY(-80);
        start.setTranslateX(70);
        start.setStyle("-fx-padding: 0.7em 0.57em; -fx-text-fill: #fff; -fx-border-color: #2a46dd");
        start.setOnMouseClicked(e -> {
            setID(IdField.getText());
            System.out.println("");
            System.out.println("");
            if (!DiscordRP.isRunning()) {
                DiscordRPC.getInstance().init(getID());
            } else if (!DiscordRPC.getClientID().equalsIgnoreCase(getID())) {
                DiscordRPC.getInstance().shutDown();
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

            DiscordRPC.getInstance().getDiscordRP().update(haveTimer(), getDetails(), getState(), getBig(), getBigText(),
                    getSmall(), getSmallText());
        });
        start.setOnMouseEntered(e -> panelManager.getLayout().setCursor(Cursor.HAND));
        start.setOnMouseExited(e -> panelManager.getLayout().setCursor(Cursor.DEFAULT));

        JFXButton stop = new JFXButton("Stop!");
        GridPane.setValignment(stop, VPos.BOTTOM);
        GridPane.setHalignment(stop, HPos.RIGHT);
        GridPane.setHgrow(stop, Priority.ALWAYS);
        GridPane.setVgrow(stop, Priority.ALWAYS);
        stop.setPrefSize(100.0D, 50.0D);
        stop.setMinSize(100.0D, 50.0D);
        stop.setMaxSize(100.0D, 50.0D);
        stop.setTranslateY(-80);
        stop.setTranslateX(-80);
        stop.setStyle("-fx-padding: 0.7em 0.57em; -fx-text-fill: #fff; -fx-border-color: #2a46dd");
        stop.setOnMouseClicked(e -> {
            if (DiscordRP.isRunning()) {
                DiscordRPC.getInstance().shutDown();
                Main.logger.log("");
                setTimer(false);
            }
        });
        stop.setOnMouseEntered(e -> panelManager.getLayout().setCursor(Cursor.HAND));
        stop.setOnMouseExited(e -> panelManager.getLayout().setCursor(Cursor.DEFAULT));

        Label help = new Label("Need help?");
        GridPane.setVgrow(help, Priority.ALWAYS);
        GridPane.setHgrow(help, Priority.ALWAYS);
        GridPane.setValignment(help, VPos.BOTTOM);
        GridPane.setHalignment(help, HPos.RIGHT);
        help.setStyle("-fx-font-size: 12px; -fx-text-fill: #3954b7; -fx-underline: true;");
        help.setTranslateY(-20);
        help.setTranslateX(-50);
        help.setOnMouseEntered(e -> panelManager.getLayout().setCursor(Cursor.HAND));
        help.setOnMouseExited(e -> panelManager.getLayout().setCursor(Cursor.DEFAULT));
        help.setOnMouseClicked(e -> DiscordRichPresenceManager.OpenURI("https://github.com/Endwiz/Discord-Rich-Presence-Manager"));

        Label copyright = new Label("©Developed by Endwiz");
        GridPane.setValignment(copyright, VPos.BOTTOM);
        GridPane.setHalignment(copyright, HPos.RIGHT);
        GridPane.setHgrow(copyright, Priority.ALWAYS);
        GridPane.setVgrow(copyright, Priority.ALWAYS);
        copyright.setTranslateX(-50);
        copyright.setStyle("-fx-text-fill: #3954b7; -fx-underline: true;");
        copyright.setOnMouseEntered(e -> panelManager.getLayout().setCursor(Cursor.HAND));
        copyright.setOnMouseExited(e -> panelManager.getLayout().setCursor(Cursor.DEFAULT));
        copyright.setOnMouseClicked(e -> DiscordRichPresenceManager.OpenURI("https://github.com/Endwiz/"));

        MaterialDesignIconView moneyIcon = new MaterialDesignIconView(MaterialDesignIcon.CASH_MULTIPLE);
        moneyIcon.setSize("18px");
        moneyIcon.setFill(Color.rgb(57, 84, 183));
        JFXButton money = new JFXButton();
        GridPane.setValignment(money, VPos.BOTTOM);
        GridPane.setHalignment(money, HPos.RIGHT);
        GridPane.setHgrow(money, Priority.ALWAYS);
        GridPane.setVgrow(money, Priority.ALWAYS);
        money.setMinSize(50.0D, 50.0D);
        money.setMaxSize(50.0D, 50.0D);
        money.setStyle("-fx-padding: 0.7em 0.57em; -fx-font-size: 18px; -fx-border-color: #3954b7;");
        money.setGraphic(moneyIcon);
        money.setOnMouseEntered(e -> panelManager.getLayout().setCursor(Cursor.HAND));
        money.setOnMouseExited(e -> panelManager.getLayout().setCursor(Cursor.DEFAULT));
        money.setOnMouseClicked(e -> {
            JFXDialogLayout layout = new JFXDialogLayout();
            layout.setBody(new Label("I'm sorry but this option is disabled for the\nmoment:/ If you want help me go on paypal:\nalexlink2005@gmail.com"));
            JFXAlert alert = new JFXAlert(panelManager.getStage());
            alert.setOverlayClose(true);
            alert.setSize(Constants.WIDTH - 20, 175);
            alert.setAnimation(JFXAlertAnimation.CENTER_ANIMATION);
            alert.setContent(layout);
            alert.initModality(Modality.APPLICATION_MODAL);
            alert.getDialogPane().setStyle("-fx-background-color: rgba(12,12,12,0.3)");
            if(Constants.isDarkTheme()){
                layout.setStyle("-fx-background-color: #333; -fx-border-color: #3954b7");
            } else {
                layout.setStyle("-fx-background-color: #d6d6d6; -fx-border-color: #3954b7");
            }
            alert.show();
        });

        MaterialDesignIconView themeIcon = new MaterialDesignIconView(MaterialDesignIcon.WEATHER_NIGHT);
        GridPane.setVgrow(themeIcon, Priority.ALWAYS);
        GridPane.setHgrow(themeIcon, Priority.ALWAYS);
        GridPane.setValignment(themeIcon, VPos.BOTTOM);
        GridPane.setHalignment(themeIcon, HPos.LEFT);
        themeIcon.setSize("22px");
        themeIcon.setFill(Color.rgb(255, 255, 255));
        themeIcon.setTranslateY(-17);

        JFXToggleButton theme = new JFXToggleButton();
        GridPane.setValignment(theme, VPos.BOTTOM);
        GridPane.setHalignment(theme, HPos.LEFT);
        GridPane.setHgrow(theme, Priority.ALWAYS);
        GridPane.setVgrow(theme, Priority.ALWAYS);
        theme.setTranslateX(10);
        theme.setToggleLineColor(Paint.valueOf("32abdb"));
        theme.setToggleColor(Paint.valueOf("3276db"));
        theme.setOnMouseClicked(e -> {
            Constants.setDarkTheme(!Constants.DARK_THEME);
            if(Constants.isDarkTheme()){
                themeIcon.setFill(Color.rgb(255, 255, 255));
                start.setStyle("-fx-padding: 0.7em 0.57em; -fx-text-fill: #dbdbdb; -fx-border-color: #2a46dd");
                stop.setStyle("-fx-padding: 0.7em 0.57em; -fx-text-fill: #dbdbdb; -fx-border-color: #2a46dd");

                Id.setStyle("-fx-font-size: 24px; -fx-text-fill: #dbdbdb;");
                Detail.setStyle("-fx-font-size: 24px; -fx-text-fill: #dbdbdb;");
                State.setStyle("-fx-font-size: 24px; -fx-text-fill: #dbdbdb;");
                bigImage.setStyle("-fx-font-size: 24px; -fx-text-fill: #dbdbdb;");
                bigImageText.setStyle("-fx-font-size: 24px; -fx-text-fill: #dbdbdb;");
                smallImage.setStyle("-fx-font-size: 24px; -fx-text-fill: #dbdbdb;");
                smallImageText.setStyle("-fx-font-size: 24px; -fx-text-fill: #dbdbdb;");

                IdField.setStyle("-fx-background-color: #fff; -fx-opacity: 40%; -fx-font-size: 16px; -fx-text-fill: #393939;");
                DetailField.setStyle("-fx-background-color: #fff; -fx-opacity: 40%; -fx-font-size: 16px; -fx-text-fill: #393939;");
                StateField.setStyle("-fx-background-color: #fff; -fx-opacity: 40%; -fx-font-size: 16px; -fx-text-fill: #393939;");
                bigImageField.setStyle("-fx-background-color: #fff; -fx-opacity: 40%; -fx-font-size: 16px; -fx-text-fill: #393939;");
                bigImageTextField.setStyle("-fx-background-color: #fff; -fx-opacity: 40%; -fx-font-size: 16px; -fx-text-fill: #393939;");
                smallImageField.setStyle("-fx-background-color: #fff; -fx-opacity: 40%; -fx-font-size: 16px; -fx-text-fill: #393939;");
                smallImageTextField.setStyle("-fx-background-color: #fff; -fx-opacity: 40%; -fx-font-size: 16px; -fx-text-fill: #393939;");

                timer.setToggleLineColor(Paint.valueOf("c8872f"));
                timer.setToggleColor(Paint.valueOf("c8652f"));
                timer.setStyle("-fx-font-size: 24px; -fx-text-fill: #dbdbdb;");
                this.layout.setStyle("-fx-background-color: #282828");
            } else {
                themeIcon.setFill(Color.rgb(49, 49, 49));
                start.setStyle("-fx-padding: 0.7em 0.57em; -fx-text-fill: #343434; -fx-border-color: #2a46dd");
                stop.setStyle("-fx-padding: 0.7em 0.57em; -fx-text-fill: #343434; -fx-border-color: #2a46dd");

                Id.setStyle("-fx-font-size: 24px; -fx-text-fill: #626262;");
                Detail.setStyle("-fx-font-size: 24px; -fx-text-fill: #626262;");
                State.setStyle("-fx-font-size: 24px; -fx-text-fill: #626262;");
                bigImage.setStyle("-fx-font-size: 24px; -fx-text-fill: #626262;");
                bigImageText.setStyle("-fx-font-size: 24px; -fx-text-fill: #626262;");
                smallImage.setStyle("-fx-font-size: 24px; -fx-text-fill: #626262;");
                smallImageText.setStyle("-fx-font-size: 24px; -fx-text-fill: #626262;");

                IdField.setStyle("-fx-background-color: #393939; -fx-opacity: 40%; -fx-font-size: 16px; -fx-text-fill: #fff;");
                DetailField.setStyle("-fx-background-color: #393939; -fx-opacity: 40%; -fx-font-size: 16px; -fx-text-fill: #fff;");
                StateField.setStyle("-fx-background-color: #393939; -fx-opacity: 40%; -fx-font-size: 16px; -fx-text-fill: #fff;");
                bigImageField.setStyle("-fx-background-color: #393939; -fx-opacity: 40%; -fx-font-size: 16px; -fx-text-fill: #fff;");
                bigImageTextField.setStyle("-fx-background-color: #393939; -fx-opacity: 40%; -fx-font-size: 16px; -fx-text-fill: #fff;");
                smallImageField.setStyle("-fx-background-color: #393939; -fx-opacity: 40%; -fx-font-size: 16px; -fx-text-fill: #fff;");
                smallImageTextField.setStyle("-fx-background-color: #393939; -fx-opacity: 40%; -fx-font-size: 16px; -fx-text-fill: #fff;");

                timer.setToggleLineColor(Paint.valueOf("32abdb"));
                timer.setToggleColor(Paint.valueOf("3276db"));
                timer.setStyle("-fx-font-size: 24px; -fx-text-fill: #626262;");
                this.layout.setStyle("-fx-background-color: #d6d6d6");
            }
        });

        mainPanel.getChildren().addAll(help, Id, IdField, Detail, DetailField, State, StateField, bigImage,
                bigImageField, bigImageText, bigImageTextField, smallImage, smallImageField, smallImageText,
                smallImageTextField, timer, start, stop, copyright, money, theme, themeIcon);
    }
}
