package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SighUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField signUpLastName;

    @FXML
    private PasswordField password_field;

    @FXML
    private Button singUpButton;

    @FXML
    private PasswordField login_field;

    @FXML
    private PasswordField signUpName;

    @FXML
    private TextField signUpCountry;

    @FXML
    private CheckBox signUpCheckBoxMale;

    @FXML
    private CheckBox signUpCheckBoxFemale;

    @FXML
    void initialize() {
        singUpButton.setOnAction(event -> {

            signUpNewUser();


        });
    }

    private void signUpNewUser() {

        DatabaseHandler dbHandler = new DatabaseHandler();

        String firstName = signUpName.getText();
        String lastName = signUpLastName.getText();
        String userName = login_field.getText();
        String password = password_field.getText();
        String location = signUpCountry.getText();
        String gender = "";
        if(signUpCheckBoxMale.isSelected())
            gender = "Музской";
        else gender = "Жунский";

        User user = new User(firstName, lastName, userName, password, location, gender);

        dbHandler.signUpUser(user);

    }
}
