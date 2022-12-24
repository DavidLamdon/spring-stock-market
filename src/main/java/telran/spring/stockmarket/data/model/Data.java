package telran.spring.stockmarket.data.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
@Getter
@EqualsAndHashCode(of = {"date"})
@Document(collection = "marketData")
public class Data {
	@Id
	LocalDate date;
	@Setter
	Double last;
	@Setter
	Integer volume;
	Double open;
	Double high;
	Double low;
}
