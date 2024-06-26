package ryanmcgrandle.bookservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ryanmcgrandle.bookservice.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>
{
    Book findByTitleIgnoreCase(String title);
}