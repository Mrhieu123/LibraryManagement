package entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "borrow")

public class Borrow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long borrowId;

    @ManyToOne
    @JoinColumn(name = "reader_id")
    Reader reader;

    @ManyToOne
    @JoinColumn(name = "book_id")
    Book book;

    LocalDate borrowDate; // ngày bắt đầu mượn

    LocalDate returnDate; // ngày hẹn trả

    LocalDate actualReturnDate; // ngày người dùng thực sự trả

    String status; // VD: "Đang mượn", "Đã trả"
}
