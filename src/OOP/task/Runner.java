package OOP.task;

import javafx.application.Application;
import OOP.task.GUI.ButtonManipulations;
import OOP.task.GUI.GUIConstants;
import OOP.task.GUI.Initialization;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.logging.Logger;

public class Runner extends Application {

    private static final Logger logger = Logger.getLogger(Runner.class.getName());

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        Initialization init = new Initialization();
        init.gridPane.setPadding(new Insets(GUIConstants.INSETS_TOP, GUIConstants.INSETS_RIGHT,
                GUIConstants.INSETS_BOTTOM, GUIConstants.INSETS_LEFT));

        init.gridPane.setVgap(GUIConstants.SET_V_GAP);
        init.gridPane.setHgap(GUIConstants.SET_H_GAP);
        init.gridPane.add(init.getTextOfCreating(), GUIConstants.CR_TEXT_COR_X, GUIConstants.CR_TEXT_COR_Y);
        init.gridPane.add(init.findText, GUIConstants.FND_TEXT_COOR_X, GUIConstants.FND_TEXT_COOR_Y);
        init.gridPane.add(init.findField, GUIConstants.FND_FLD_COOR_X, GUIConstants.FND_FLD_COOR_Y);
        init.gridPane.add(init.createButton, GUIConstants.CR_BUT_COOR_X, GUIConstants.CR_BUT_COOR_Y);
        init.gridPane.add(init.printButton, GUIConstants.PR_BUT_COOR_X, GUIConstants.PR_BUT_COOR_Y);
        init.gridPane.add(init.sortPassengersButton, GUIConstants.SORT_BUT_COOR_X, GUIConstants.SORT_BUT_COOR_Y);
        init.gridPane.add(init.findPassengerButton, GUIConstants.FIND_BUT_COOR_X, GUIConstants.FIND_BUT_COOR_Y);
        init.gridPane.add(init.endProgramButton, GUIConstants.END_BUT_COOR_X, GUIConstants.END_BUT_COOR_Y);

        init.createButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                ButtonManipulations.createATrain(init);
            }
        });

        init.printButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                ButtonManipulations.printInformation(init.getTrain());
            }
        });

        init.sortPassengersButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                //  We should write a sort method here
            }
        });

        init.findPassengerButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                ButtonManipulations.findAnElement(init);
            }
        });

        init.endProgramButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                //   ButtonManipulations.makeClearMethod(init);
            }
        });

        Scene scene = new Scene(init.gridPane, 400, 200);
        stage.setScene(scene);
        stage.show();
    }
}
