package fr.endwiz.drp;

import fr.endwiz.drp.utils.Logger;
import javafx.application.Application;

import javax.swing.*;

public class Main {

    public static Logger logger;

    public static void main(String[] args) {
        logger = new Logger("DiscordRP Manager Logger");
        try {
            Class.forName("javafx.application.Application");
            Application.launch(FxApplication.class, args);
        } catch (ClassNotFoundException e) {
            logger.warn("JavaFX not found");
            JOptionPane.showMessageDialog(null, "Java 8 n'est pas installer ou n'est pas valide veuillez le réinstaller!\n" + e.getMessage() + " not found\nPlease download Java 8 on: https://java.com/fr/download/", "JavaFx Error :sad:", JOptionPane.ERROR_MESSAGE);
        }
    }
}
