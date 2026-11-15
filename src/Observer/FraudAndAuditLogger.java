package Observer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class FraudAndAuditLogger implements Observer {

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Override
    public void update(String message) {

        Objects.requireNonNull(
                message,
                "Audit message cannot be null"
        );

        String timestamp = LocalDateTime.now().format(FORMATTER);

        System.out.println(
                "[Audit Log] [" + timestamp + "] " + message
        );
    }
}