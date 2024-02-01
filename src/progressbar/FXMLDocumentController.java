package progressbar;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

/**
 * FXML Controller class
 *
 * @author Md Saiful Islam
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button btn_progress;

    @FXML
    private Label label;

    @FXML
    private ProgressBar progressbar;

    @FXML
    void progresss(ActionEvent event) {
        double currentProgress = progressbar.getProgress();
        double newProgress = currentProgress + 0.1;

     
        if (newProgress <= 1.0) {
            progressbar.setProgress(newProgress);
            label.setText("Progress: " + (int) (newProgress * 100) + "%");
        } else {
            label.setText("Progress is already at 100% ");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialization code goes here if needed
    }
}
