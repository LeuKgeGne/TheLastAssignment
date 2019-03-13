package OOP.task;

import javafx.application.Application;
import OOP.task.GUI.ButtonManipulations;
import OOP.task.GUI.GUIConstants;
import OOP.task.GUI.Initialization;
import OOP.task.TransportClasses.Train;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Runner extends Application {

    private static final Logger logger = Logger.getLogger(Runner.class.getName());

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        Initialization init = new Initialization();
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(GUIConstants.INSETS_TOP, GUIConstants.INSETS_RIGHT,
                GUIConstants.INSETS_BOTTOM, GUIConstants.INSETS_LEFT));

        gridPane.setVgap(GUIConstants.SET_V_GAP);
        gridPane.setHgap(GUIConstants.SET_H_GAP);
        gridPane.add(init.getTextOfCreating(), GUIConstants.CR_TEXT_COR_X, GUIConstants.CR_TEXT_COR_Y);
//        gridPane.add(init.text2, Constants.TEXT_2_COR_X, Constants.TEXT_2_COR_Y);
//        gridPane.add(init.text3, Constants.TEXT_3_COR_X, Constants.TEXT_3_COR_Y);
//        gridPane.add(init.underText1, Constants.UNDER_TEXT_1_COR_X, Constants.UNDER_TEXT_1_COR_Y);
//        gridPane.add(init.underText2, Constants.UNDER_TEXT_2_COR_X, Constants.UNDER_TEXT_2_COR_Y);
//        gridPane.add(init.underText3, Constants.UNDER_TEXT_3_COR_X, Constants.UNDER_TEXT_3_COR_Y);
//        gridPane.add(init.textField1, Constants.TEXT_FIELD_1_COR_X, Constants.TEXT_FIELD_1_COR_Y);
//        gridPane.add(init.textField2, Constants.TEXT_FIELD_2_COR_X, Constants.TEXT_FIELD_2_COR_Y);
//        gridPane.add(init.textField3, Constants.TEXT_FIELD_3_COR_X, Constants.TEXT_FIELD_3_COR_Y);
        gridPane.add(init.createButton, GUIConstants.CR_BUT_COOR_X, GUIConstants.CR_BUT_COOR_Y);
        gridPane.add(init.printButton, GUIConstants.PR_BUT_COOR_X, GUIConstants.PR_BUT_COOR_Y);
        gridPane.add(init.sortPassengersButton, GUIConstants.SORT_BUT_COOR_X, GUIConstants.SORT_BUT_COOR_Y);
        gridPane.add(init.endProgramButton, GUIConstants.END_BUT_COOR_X, GUIConstants.END_BUT_COOR_Y);
//        gridPane.add(init.aboveText1, Constants.ABOVE_TEXT__1_COR_X, Constants.ABOVE_TEXT__1_COR_Y);
//        gridPane.add(init.aboveText2, Constants.ABOVE_TEXT__2_COR_X, Constants.ABOVE_TEXT__2_COR_Y);
//        gridPane.add(init.aboveText3, Constants.ABOVE_TEXT__3_COR_X, Constants.ABOVE_TEXT__3_COR_Y);

        init.createButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                ButtonManipulations.createATrain(init);
            }
        });

        init.printButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                ButtonManipulations.printInfromation(init.getTrain());
            }
        });
        init.sortPassengersButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                //  ButtonManipulations.makeTryCatch(init);
            }
        });

        init.endProgramButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                //   ButtonManipulations.makeClearMethod(init);
            }
        });

        Scene scene = new Scene(gridPane);
        stage.setScene(scene);
        stage.show();
    }

//    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        Train train = null;
//        boolean process = true;
//
//        while(process) {
//            switch (JustMenu.variants(scanner)) {
//                case 1: {
//                    train = MyTinyTrainFactory.createTheTrain();
//                    logger.info(Constants.CREAT_TEXT);
//                } break;
//                case 2: {
//                    if(train != null) {
//                        Manipulations.printInfromation(train);
//                        logger.info(Constants.PRINT_TEXT);
//                    }
//                    else {
//                        System.out.println(Constants.TRAIN_IS_EMPTY);
//                        logger.warning(Constants.PRINT_E_TEXT);
//                    }
//                } break;
//                case 3: {
//                    if(train != null) {
//                        Manipulations.completePassengerSorting(train);
//                        logger.info(Constants.SORT_TEXT);
//                        ;
//                    }
//                    else {
//                        System.out.println(Constants.TRAIN_IS_EMPTY);
//                        logger.info(Constants.SORT_E_TEXT);
//                    }
//                } break;
//                case 0: {
//                    process = false;
//                    logger.info(Constants.END_TEXT);
//                } break;
//            }
//        }
//        scanner.close();
//    }
}
