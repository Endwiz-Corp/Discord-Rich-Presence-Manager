package fr.endwiz.drp;

import javafx.stage.StageStyle;

public class Constants {
    public static final String VERSION = "1.0";
    public static final String WINDOW_NAME = "Discord Rich Presence Manager - " + VERSION;
    public static final String WINDOW_ICON = "/icon.png";
    public static final int WIDTH = 398;
    public static final int HEIGHT = 620;
    public static final boolean RESIZABLE = false;
    public static final StageStyle STAGE_STYLE = StageStyle.DECORATED;

    public static boolean DARK_THEME = true;

    public static boolean isDarkTheme() {
        return DARK_THEME;
    }

    public static void setDarkTheme(boolean darkTheme) {
        DARK_THEME = darkTheme;
    }
}
