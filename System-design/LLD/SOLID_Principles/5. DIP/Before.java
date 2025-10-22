class GmailService {
    public void sendEmail(String message) {
        System.out.println("Sending email via Gmail: " + message);
    }
}

class OutlookService {
    public void sendOutlookEmail(String message) {
        System.out.println("Sending email via Outlook: " + message);
    }
}

class EmailNotification {
    private GmailService gmailService = new GmailService();

    public void send(String message, boolean useOutlook) {
        if (useOutlook) {
            OutlookService outlook = new OutlookService();
            outlook.sendOutlookEmail(message);
        } else {
            gmailService.sendEmail(message);
        }
    }
}

public class Before {
    public static void main(String[] args) {
        EmailNotification notification = new EmailNotification();
        notification.send("Invoice sent successfully!", false); // Gmail
        notification.send("Invoice sent successfully!", true);  // Outlook
    }
}
