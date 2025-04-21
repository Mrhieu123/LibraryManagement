package model.payload;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookRequest {
    @NotBlank(message = "Title can not be blank")
    private String title;
    @NotBlank(message = "author can not be blank")
    private String author;
    @Min(value = 1, message = "Quantity must be at least 1")
    private int quantity;
}
