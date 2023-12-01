package playing.around.with.travis;

import com.googlecode.*;

import java.util.logging.Logger;

public class App {
    private static Logger logger = Logger.getLogger(App.class.getName());
    public static void main(String[] args) {
        logger.info("Testing");
        logger.fine("Testing in fine");
        logger.finer("Testing in finer");
        logger.finest("Testing in finest");
    }

}

