package oop.task.gui;

import oop.task.transportclasses.Train;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
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

    //Creating the text that is in the right side of buttons
    private Text textOfCreating = new Text();
    public Text getTextOfCreating() {
        return this.textOfCreating;
    }

    //Here we're creating our buttons
    public Button createButton = new Button(GUIConstants.FIRST_GAP_TEXT);
    public Button printButton = new Button(GUIConstants.SECOND_GAP_TEXT);
    public Button sortPassengersButton = new Button(GUIConstants.THIRD_GAP_TEXT);
    public Button endProgramButton = new Button(GUIConstants.FIVES_GAP_TEXT);
    public Button findPassengerButton = new Button(GUIConstants.FOURTH_GAP_TEXT);

    //Creating a find field
    public Text findText = new Text(GUIConstants.FIND_FIELD_TEXT);
    public TextField findField = new TextField();

    //Here we keep our gridPane
    public GridPane gridPane = new GridPane();
    public Insets insets = new Insets(GUIConstants.INSETS_TOP, GUIConstants.INSETS_RIGHT,
               GUIConstants.INSETS_BOTTOM, GUIConstants.INSETS_LEFT);
    public Image image = new Image("file:C:\\Users\\Admin\\IdeaProjects\\TheLastTask\\MenuImage.jpg",
            GUIConstants.IMAGE_WIDTH,GUIConstants.IMAGE_HEIGHT, true, true);
    public ImageView imageView = new ImageView(image);
    public Scene scene = new Scene(gridPane, GUIConstants.APPLICATION_WIDTH, GUIConstants.APPLICATION_HEIGHT);
}
