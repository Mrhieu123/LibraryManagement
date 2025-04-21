package exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ErrorMessage {
    private LocalDate timestamp;
    private int code;
    private String error;
    private String message;
    private String path;
}
