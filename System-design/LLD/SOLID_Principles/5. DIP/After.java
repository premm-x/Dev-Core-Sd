interface EmailService {
    void sendEmail(String message);
}

class GmailService implements EmailService {
    public void sendEmail(String message) {
        System.out.println("Sending email via Gmail: " + message);
    }
}

class OutlookService implements EmailService {
    public void sendEmail(String message) {
        System.out.println("Sending email via Outlook: " + message);
    }
}

class EmailNotification {
    private EmailService emailService;

    public EmailNotification(EmailService emailService) {
        this.emailService = emailService;
    }

    public void send(String message) {
        emailService.sendEmail(message);
    }
}

public class After {
    public static void main(String[] args) {
        EmailService gmail = new GmailService();
        EmailService outlook = new OutlookService();

        EmailNotification gmailNotif = new EmailNotification(gmail);
        gmailNotif.send("Invoice sent via Gmail!");

        EmailNotification outlookNotif = new EmailNotification(outlook);
        outlookNotif.send("Invoice sent via Outlook!");
    }
}
