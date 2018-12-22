package core;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;
import javafx.stage.DirectoryChooser;

import java.io.File;

public class CoreController {

    /* Declaration of panes for navigation */
    @FXML
    private Pane panLocation;
    @FXML
    private Pane panTemplate;
    @FXML
    private Pane panProject;
    @FXML
    private Pane panDevelopers;
    @FXML
    private Pane panContributions;
    @FXML
    private Pane panLicense;
    @FXML
    private Pane panMiscellaneous;
    @FXML
    private Pane panFinish;

    /* Declaration of buttons for navigational panes */
    @FXML
    private Button btnNavLocation;
    @FXML
    private Button btnNavTemplate;
    @FXML
    private Button btnNavProject;
    @FXML
    private Button btnNavDevelopers;
    @FXML
    private Button btnNavContributions;
    @FXML
    private Button btnNavLicense;
    @FXML
    private Button btnNavMiscellaneous;
    @FXML
    private Button btnNavFinish;

    /* Declarations related to location pane */
    @FXML
    private ComboBox cmbFileLocation;
    @FXML
    private Button btnSetNewLocation;
    @FXML
    private ComboBox cmbFileName;
    @FXML
    private Button btnSaveLocationPane;


    /*
     * Functions' definitions related to Main Window and all Panes
     */

    /* FXML file initializing function */
    public void initialize() {
        initializeFileLocations();
    }


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



    /*
     * Functions' definitions related to Location Pane
     */

    /* Initialize file location choice box values */
    private void initializeFileLocations() {
        // Add the recent location list
        cmbFileLocation.getItems().addAll("Location 01", "Location 02", "Location 03");

        // Set the default location
        cmbFileLocation.getSelectionModel().selectFirst();
    }

    /* Function for handle button actions on set new location button */
    public void handleSetNewLocationButtonAction(ActionEvent actionEvent) {
        DirectoryChooser directoryChooser = new DirectoryChooser();
        File selectedDirectory = directoryChooser.showDialog(panLocation.getScene().getWindow());

        if (selectedDirectory == null) {
            //No Directory selected
        } else {
            System.out.println(selectedDirectory.getAbsolutePath());
        }


    }

}
