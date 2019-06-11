package pl.maciejszczesny.JCommerceLibrary.models.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.maciejszczesny.JCommerceLibrary.models.entities.BookEntity;


@Repository
public interface BookRepository extends CrudRepository<BookEntity, Integer> {
    @Query(nativeQuery = true, value = "SELECT * FROM `book` WHERE `id` = ?1")
    BookEntity findBookEntitiesByIdById(int id);
}
