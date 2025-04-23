public class PushNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Push Notification: " + message);
    }

    @Override
    public void setDefaultPriority(String priority) {
        NotificationService.super.setDefaultPriority(priority);
    }
}
