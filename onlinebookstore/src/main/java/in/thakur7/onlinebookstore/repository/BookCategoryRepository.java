package in.thakur7.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.thakur7.onlinebookstore.entity.BookCategory;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
