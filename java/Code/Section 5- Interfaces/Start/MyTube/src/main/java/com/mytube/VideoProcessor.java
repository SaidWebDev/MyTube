package com.mytube;

public class VideoProcessor {
    private VideoEncoder encoder = new TheVideoEncoder();
    private VideoDatabase database = new TheVideoDatabase();
    private EmailService emailService = new TheEmailService();

    public VideoProcessor(VideoEncoder encoder, VideoDatabase database, EmailService emailService) {
        this.encoder = encoder;
        this.database = database;
        this.emailService = emailService;
    }

    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        emailService.sendEmail(video.getUser());
    }
}

