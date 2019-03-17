package oop.task.source;

import javafx.application.Application;
import oop.task.gui.ButtonManipulations;
import oop.task.gui.GUIConstants;
import oop.task.gui.Initialization;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.util.logging.Logger;

public class Runner extends Application {
    Initialization init = new Initialization();
    private static final Logger logger = Logger.getLogger(Runner.class.getName());

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) {
        init.gridPane.setPadding(init.insets);

        init.gridPane.setVgap(GUIConstants.SET_V_GAP);
        init.gridPane.setHgap(GUIConstants.SET_H_GAP);
        init.gridPane.add(init.imageView, GUIConstants.IMAGE_COOR_X, GUIConstants.IMAGE_COOR_Y);
        init.gridPane.add(init.getTextOfCreating(), GUIConstants.CR_TEXT_COR_X, GUIConstants.CR_TEXT_COR_Y);
        init.gridPane.add(init.findText, GUIConstants.FND_TEXT_COOR_X, GUIConstants.FND_TEXT_COOR_Y);
        init.gridPane.add(init.findField, GUIConstants.FND_FLD_COOR_X, GUIConstants.FND_FLD_COOR_Y);
        init.gridPane.add(init.createButton, GUIConstants.CR_BUT_COOR_X, GUIConstants.CR_BUT_COOR_Y);
        init.gridPane.add(init.printButton, GUIConstants.PR_BUT_COOR_X, GUIConstants.PR_BUT_COOR_Y);
        init.gridPane.add(init.readFromFile, GUIConstants.READ_BUT_COOR_X, GUIConstants.READ_BUT_COOR_Y);
        init.gridPane.add(init.writeIntoFile, GUIConstants.WRITE_BUT_COOR_X, GUIConstants.WRITE_BUT_COOR_Y);
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

        init.readFromFile.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                //  We should write a sort method here
            }
        });

        init.writeIntoFile.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                ButtonManipulations.callWriter(init.getTrain());
            }
        });

        init.findPassengerButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                ButtonManipulations.findAnElement(init);
            }
        });

        init.endProgramButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                stage.close();
            }
        });

        stage.setScene(init.scene);
        stage.setTitle(GUIConstants.APP_NAME);
        stage.show();
    }
}
