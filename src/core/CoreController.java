package core;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class CoreController {

    public Pane panLocation, panTemplate;
    public Button btnNavLocation, btnNavTemplate;

    public void handleNavButtonAction(ActionEvent actionEvent) {
        if (actionEvent.getSource() == btnNavLocation) {
            panLocation.toFront();
        } else if (actionEvent.getSource() == btnNavTemplate) {
            panTemplate.toFront();
        }
    }
}
