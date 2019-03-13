package OOP.task.GUI;

import OOP.task.TransportClasses.Train;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Initialization {
    //Keep a train
    private Train train;
    public void setTrain(Train _train) {
        this.train = _train;
    }
    public Train getTrain() {
        return this.train;
    }

    //Here we're creating our buttons
    public Button createButton = new Button(GUIConstants.FIRST_GAP_TEXT);
    public Button printButton = new Button(GUIConstants.SECOND_GAP_TEXT);
    public Button sortPassengersButton = new Button(GUIConstants.THIRD_GAP_TEXT);
    public Button endProgramButton = new Button(GUIConstants.FIVES_GAP_TEXT);
    public Button findPassengerButton = new Button(GUIConstants.FOURTH_GAP_TEXT);

    //Creating the text that is in the right side of buttons
    private Text textOfCreating = new Text();
    public void setTextOfCreating(String _text) {
        this.textOfCreating.setText(_text);
    }
    public Text getTextOfCreating() {
        return this.textOfCreating;
    }
}
