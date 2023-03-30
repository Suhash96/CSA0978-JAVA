import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

 class DateTimeExample {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatDateTime = now.format(formatter);
        System.out.println("Current date and time: " + formatDateTime);
    }
}