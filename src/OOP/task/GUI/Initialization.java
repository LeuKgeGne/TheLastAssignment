package OOP.task.GUI;

import OOP.task.TransportClasses.Train;
import javafx.scene.control.Button;

public class Initialization {
    //Keep a train
    private Train train;
    public void setTrain(Train _train) {
        this.train = _train;
    }
    public Train getTrain() {
        return this.train;
    }

    public Button createButton = new Button(GUIConstants.FIRST_GAP_TEXT);
    public Button printButton = new Button(GUIConstants.SECOND_GAP_TEXT);
    public Button sortPassengersButton = new Button(GUIConstants.THIRD_GAP_TEXT);
    public Button endProgramButton = new Button(GUIConstants.FOURTH_GAP_TEXT);
}
