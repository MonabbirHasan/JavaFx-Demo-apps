package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ScreenController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	
	public void switchToScren1(ActionEvent event) throws IOException {
		Parent root=FXMLLoader.load(getClass().getResource("Screen1.fxml"));
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToScren2(ActionEvent event) throws IOException {
		Parent root=FXMLLoader.load(getClass().getResource("Screen2.fxml"));
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void switchToScren3(ActionEvent event) throws IOException {
		Parent root=FXMLLoader.load(getClass().getResource("Screen3.fxml"));
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	
	
}
