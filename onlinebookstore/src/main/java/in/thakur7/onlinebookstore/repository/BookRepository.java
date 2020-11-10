package in.thakur7.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.thakur7.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
