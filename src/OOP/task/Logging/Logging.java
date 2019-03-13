package OOP.task.Logging;

import java.io.IOException;
import java.util.Formatter;
import java.util.logging.*;

public class Logging {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getGlobal();
        logger.setLevel(Level.INFO);
        logger.info("Info massage");

        Logger logger1 = Logger.getLogger("logging");
        logger1.warning("warning");
        logger1.fine("Fine");
        logger1.setLevel(Level.ALL);
        logger1.throwing("Logging", "main", new Throwable());
        logger1.log(Level.WARNING, "Something went wrong", new Throwable());

        Logger currentClassLogger = Logger.getLogger(Logging.class.getName());
        currentClassLogger.setLevel(Level.FINE);
        currentClassLogger.setUseParentHandlers(false);
        Handler handler = new ConsoleHandler();
        handler.setLevel(Level.INFO);
        currentClassLogger.addHandler(handler);
        Handler fileHandler = new FileHandler("%h/java%u.log");
/*        fileHandler.setFormatter(new MyFormatter);*/

    }

/*    public static class MyFormatter implements Formatter {

    }*/


}
