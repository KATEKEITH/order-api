package dev.practice.order.domain.notification;

public interface NotificationService {
    void sendEmail(String email, String title, String description);
    void sendKakao(String email, String title, String description);
    void sendSms(String email, String title, String description);
}
