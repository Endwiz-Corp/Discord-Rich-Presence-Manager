package fr.endwiz.drp.ui.panel;

import fr.endwiz.drp.ui.PanelManager;
import javafx.scene.layout.GridPane;

public interface IPanel {

    void init(PanelManager panelManager);

    GridPane getLayout();

    void onShow();

    void onShowTransition();
}
