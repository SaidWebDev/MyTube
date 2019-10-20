package com.mytube;

import com.google.common.flogger.FluentLogger;

public class Main {
    private static final org.apache.log4j.Logger LOG4J_LOGGER = org.apache.log4j.Logger.getLogger(Main.class.getName());
    private static final java.util.logging.Logger JDK_LOGGER = java.util.logging.Logger.getLogger(Main.class.getName());
    private static final FluentLogger FLUENT_LOGGER = FluentLogger.forEnclosingClass();


    public static void main(String[] args) {
        Video video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Jennifer's birthday");
        video.setUser(new User("john@domain.com"));

        VideoProcessor processor = new VideoProcessor(new TheVideoEncoder(), new TheVideoDatabase(), new TheEmailService());
        processor.process(video);

        // Log4j
        LOG4J_LOGGER.debug("Hello *** DEBUG *** (log4j)...");
        LOG4J_LOGGER.info("Hello *** INFO *** (log4j)...");
        LOG4J_LOGGER.error("Hello *** ERROR *** (log4j)...");

        // JDK

        JDK_LOGGER.info("Hello ### INFO ### (jdk)...");
        JDK_LOGGER.severe("Hello ### SEVERE ### (jdk)...");
        JDK_LOGGER.fine("Hello ### FINE ### (jdk)...");

        // Flogger
        FLUENT_LOGGER.atFine().log("Hello --- FINE ---  (Flogger)...");
        FLUENT_LOGGER.atInfo().log("Hello --- INFO --- %s(Flogger)...", video.getTitle());
        FLUENT_LOGGER.atSevere().log("Hello --- SEVERE --- (Flogger)...");

    }
}
