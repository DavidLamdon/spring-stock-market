package telran.spring.stockmarket.data.dto;

import java.time.LocalDate;

import org.springframework.data.repository.CrudRepository;

import telran.spring.stockmarket.data.model.Data;

public interface DataRepository extends CrudRepository<Data, LocalDate> {

}
