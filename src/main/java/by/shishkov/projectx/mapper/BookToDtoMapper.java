package by.shishkov.demoApplication.mapper;

import com.example.bookstore.model.Book;
import com.example.bookstore.model.BookRequest;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface BookToDtoMapper {
    Book AddBookRequestToBook(BookRequest bookRequest);
    Book EditBookRequestToBook(Long id, BookRequest bookRequest);
}
