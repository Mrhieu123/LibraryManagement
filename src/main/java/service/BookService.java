package service;

import entity.Book;
import entity.ResponseMessage;

public interface BookService {
    public ResponseMessage addBook(Book book);
    public ResponseMessage deleteBook(Book book);
    public ResponseMessage updateBook(Book book);
    public ResponseMessage getAllBooks();
}
