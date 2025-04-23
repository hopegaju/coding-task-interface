public class Main {
    public static void main(String[] args) {
        EmailNotification email= new EmailNotification();
        SmsNotification sms = new SmsNotification();
        PushNotification notify = new PushNotification();
        notify.sendNotification("from Whatsapp");
        sms.sendNotification("Hello");
        email.sendNotification("From SheCanCode");
    }
}