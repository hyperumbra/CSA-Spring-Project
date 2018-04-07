package application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

public class CreateProjectController {

	private Main mainApp;
	
	public void setMainApp(Main mainApp) {
		this.mainApp = mainApp;
	}
	
	//Constructor
	public CreateProjectController() {
		
	}
	
	//Fields for the scene
	//Buttons
	@FXML
	private Button backButton;
	@FXML
	private Button nextButton;
	@FXML
	private Button dismissButton;
	
	//TextFields
	@FXML
	private TextField projectNameTextbox;
	@FXML
	private TextField manufacturerTextbox;
	@FXML
	private TextField modelTextbox;
	@FXML
	private TextField chassisTextbox;
	@FXML
	private TextField modelYearTextbox;
	
	//Labels
	@FXML
	private Label titleLabel;
	@FXML
	private Label projectNameLabel;
	@FXML
	private Label manufacturerLabel;
	@FXML
	private Label modelLabel;
	@FXML
	private Label chassisLabel;
	@FXML
	private Label modelYearLabel;
	@FXML
	private Label warningLabel;
	
	//Initializing the GUI
	@FXML
	private void initialize() {
		
		//Sets the initial text of the Labels that may be changed
		projectNameLabel.setText("Project Name");
		manufacturerLabel.setText("Manufacturer");
		modelLabel.setText("Label");
		
		//Sets the initial color for the warning
		warningLabel.setTextFill(javafx.scene.paint.Color.RED);
		
		//Sets the initial colors of the Labels of the Required Fields
		projectNameLabel.setTextFill(javafx.scene.paint.Color.BLACK);
		manufacturerLabel.setTextFill(javafx.scene.paint.Color.BLACK);
		modelLabel.setTextFill(javafx.scene.paint.Color.BLACK);
		
		//Sets a warning for the user to be invisible until necessary
		warningLabel.setVisible(false);
		dismissButton.setVisible(false);
	}
	
	//Adds the new Project Details to the Database
	@FXML
	private void newProject() {
		//Do Your Database Magic Here
	}
	
	//Flashes the warning label while it's visible
	@FXML
	private void flashWarning() {
		while(warningLabel.isVisible() == true) {
			//Checks if the Label is Red
			if(warningLabel.getTextFill() == javafx.scene.paint.Color.RED) {
				//Set the Label color to Yellow
				warningLabel.setTextFill(javafx.scene.paint.Color.YELLOW);
				//Makes the function temporarily sleep so is does not cause epileptic flashing
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			//Checks if the Label is Yellow
			if(warningLabel.getTextFill() == javafx.scene.paint.Color.YELLOW) {
				//Set the Label Color to Red
				warningLabel.setTextFill(javafx.scene.paint.Color.RED);
				//Makes the function temporarily sleep so is does not cause epileptic flashing
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//Hides the warning and button until necessary
	@FXML
	private void dismissWarning() {
		warningLabel.setVisible(false);
		dismissButton.setVisible(false);
	}
	
	@FXML
	private void backToSelection() throws IOException {
		Stage stage = (Stage)backButton.getScene().getWindow();
		Scene selectProjectScene = new Scene(FXMLLoader.load(getClass().getResource("/CreateProject.fxml")));
		stage.setScene(selectProjectScene);
	}
	
}
