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
            Application.launch(LaunchApp.class, args);
        } catch (ClassNotFoundException e) {
            logger.warn("Invalide JavaFx");
            JOptionPane.showMessageDialog(null, "Java 8 n'est pas installer ou n'est pas valide veuillez le réinstaller!\nPlease download Java 8 on: https://java.com/fr/download/", "JavaFx Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
