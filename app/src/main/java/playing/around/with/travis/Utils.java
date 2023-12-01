package playing.around.with.travis;

import java.util.logging.Logger;
import java.util.logging.*;

public class Utils {
    public static void error(Exception e,Logger logger) {
        logger.warning("An error has occurred on line "+e.getStackTrace()[0].getLineNumber()+" of class "+e.getStackTrace()[0].getClassName()+". Here is the stack trace: ");
        for (StackTraceElement element : e.getStackTrace()) {
            logger.severe(element.toString());
        }
    }
}