package telran.spring.stockmarket.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DataDto {
	LocalDate date;
	Double last;
	Integer volume;
	Double open;
	Double high;
	Double low;
}