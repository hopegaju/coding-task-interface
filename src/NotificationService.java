public interface NotificationService {
    void sendNotification(String message);
}
class EmailNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Email Notification: " + message);
    }
}
class SmsNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS Notification: " + message);
    }
}
