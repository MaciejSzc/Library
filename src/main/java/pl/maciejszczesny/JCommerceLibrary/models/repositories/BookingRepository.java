package pl.maciejszczesny.JCommerceLibrary.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.maciejszczesny.JCommerceLibrary.models.entities.BookingEntity;

public interface BookingRepository extends CrudRepository<BookingEntity, Integer> {
}
