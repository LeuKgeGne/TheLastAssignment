package OOP.task.GUI;

import OOP.task.Manipulations;
import OOP.task.MyTinyTrainFactory;
import OOP.task.TransportClasses.Train;

public class ButtonManipulations {
    public static void findAnElement(Initialization init) {
        Manipulations.findAPassengerByNumberOfTicket(init);
    }

    public static void createATrain(Initialization init) {
        Train train;
        boolean flagOfTheCreate = false;
        init.setTrain(MyTinyTrainFactory.createTheTrain());
        if(init.getTrain() != null) {
            init.setTextOfCreating(GUIConstants.CREATING_TEXT);
        }
    }

    public static void printInfromation(Train train) {
        Manipulations.printInfromation(train);
    }

    public static void sortPassengers(Train train) {
        Manipulations.completePassengerSorting(train);
    }

//    public static void makeTryCatch(Initialization init) {
//        int a, b, c;
//        try {
//            a = Integer.parseInt(init.textField1.getText());
//            b = Integer.parseInt(init.textField2.getText());
//            c = Integer.parseInt(init.textField3.getText());
//
//            if (Manipulations.isEquilateralTriangle(a, b, c)) {
//                init.aboveText1.setText(Constants.YEP);
//            } else {
//                init.aboveText1.setText(Constants.NOPE);
//            }
//            if (Manipulations.isIsoscelesTriangle(a, b, c)) {
//                init.aboveText2.setText(Constants.YEP);
//            } else {
//                init.aboveText2.setText(Constants.NOPE);
//            }
//            if (Manipulations.isRightTriangle(a, b, c)) {
//                init.aboveText3.setText(Constants.YEP);
//            } else {
//                init.aboveText3.setText(Constants.NOPE);
//            }
//        } catch (Exception e) {
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setHeaderText(Constants.IF_ERROR);
//            alert.show();
//        }
}
