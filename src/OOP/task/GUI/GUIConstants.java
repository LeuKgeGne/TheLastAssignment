package oop.task.gui;

public final class GUIConstants {
    private GUIConstants() {}

    public static final byte SET_V_GAP = 10;
    public static final byte SET_H_GAP = 10;
    public static final byte INSETS_TOP = 10;
    public static final byte INSETS_RIGHT = 10;
    public static final byte INSETS_BOTTOM = 10;
    public static final byte INSETS_LEFT = 10;

    //Menu gaps
    public static final int APPLICATION_WIDTH = 340;
    public static final int APPLICATION_HEIGHT = 370;
    public static final int IMAGE_WIDTH = 200;
    public static final int IMAGE_HEIGHT = 200;

    public static final String APP_NAME = "Train is here";
    public static final String FIRST_GAP_TEXT = "Create a train";
    public static final String SECOND_GAP_TEXT = "Print piece of Info";
    public static final String THIRD_GAP_TEXT = "Sort passengers";
    public static final String FOURTH_GAP_TEXT = "Find a passenger";
    public static final String FIVES_GAP_TEXT = "End the program";

    //Text coordinates and strings
    public static final byte CR_TEXT_COR_X = 1;
    public static final byte CR_TEXT_COR_Y = 0;
    public static final String CREATING_TITLE = "Information of creating process";
    public static final String CREATING_TEXT = "Train is created!";
    public static final String UNCREATING_TEXT = "We're not able to create anything";
    public static final String FIND_FIELD_TEXT = "Field to enter a tickets' number";

    //Menu coordinates
    public static final byte IMAGE_COOR_X = 0;
    public static final byte IMAGE_COOR_Y = 0;
    public static final byte CR_BUT_COOR_X = 0;
    public static final byte CR_BUT_COOR_Y = 1;
    public static final byte PR_BUT_COOR_X = 0;
    public static final byte PR_BUT_COOR_Y = 2;
    public static final byte SORT_BUT_COOR_X = 0;
    public static final byte SORT_BUT_COOR_Y = 3;
    public static final byte FIND_BUT_COOR_X = 1;
    public static final byte FIND_BUT_COOR_Y = 5;
    public static final byte END_BUT_COOR_X = 0;
    public static final byte END_BUT_COOR_Y = 6;
    public static final byte FND_FLD_COOR_X = 0;
    public static final byte FND_FLD_COOR_Y = 5;
    public static final byte FND_TEXT_COOR_X = 0;
    public static final byte FND_TEXT_COOR_Y = 4;

    //Try-catch-finally text:
    public static final String NUMBER_ER_TEXT = "Wrong number!It should have 4 digits";
    public static final String NUMBER_IF_DONT_HAVE = "We don't have this number of ticket:(";
    public static final String NUMBER_IF_HAVE = "Check your console!";
    public static final String IF_DONT_HAVE_A_TRAIN = "A train doesn't exist!";
    public static final String PRINT_INFORM_TITLE = "Cannot to print at all..";
    public static final String PRINT_INFORM_TEXT = "Have you got anything to print?";
    public static final String CHECK_WHERE_IS_RESULT = "Output is in your console.";
}
