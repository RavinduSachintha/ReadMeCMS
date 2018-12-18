package core;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class CoreController {

    /* Declaration of panes for navigation */
    public Pane panLocation;
    public Pane panTemplate;
    public Pane panProject;
    public Pane panDevelopers;
    public Pane panContributions;
    public Pane panLicense;
    public Pane panMiscellaneous;
    public Pane panFinish;

    /* Declaration of buttons for navigational panes */
    public Button btnNavLocation;
    public Button btnNavTemplate;
    public Button btnNavProject;
    public Button btnNavDevelopers;
    public Button btnNavContributions;
    public Button btnNavLicense;
    public Button btnNavMiscellaneous;
    public Button btnNavFinish;


    /* Function for handle button actions on navigation */
    public void handleNavButtonAction(ActionEvent actionEvent) {
        if (actionEvent.getSource() == btnNavLocation) {
            panLocation.toFront();
        } else if (actionEvent.getSource() == btnNavTemplate) {
            panTemplate.toFront();
        } else if (actionEvent.getSource() == btnNavProject) {
            panProject.toFront();
        } else if (actionEvent.getSource() == btnNavDevelopers) {
            panDevelopers.toFront();
        } else if (actionEvent.getSource() == btnNavContributions) {
            panContributions.toFront();
        } else if (actionEvent.getSource() == btnNavLicense) {
            panLicense.toFront();
        } else if (actionEvent.getSource() == btnNavMiscellaneous) {
            panMiscellaneous.toFront();
        } else if (actionEvent.getSource() == btnNavFinish) {
            panFinish.toFront();
        } else {
            System.err.println("Error on navigation button action event");
        }
    }
}
