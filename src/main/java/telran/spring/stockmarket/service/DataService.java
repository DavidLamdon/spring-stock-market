package telran.spring.stockmarket.service;

import java.time.LocalDate;

import telran.spring.stockmarket.dto.DataDto;

public interface DataService {
	DataDto addDataDto(DataDto dataDto);

	DataDto getDataDto(LocalDate date);

	DataDto updateDataDto(Double last, Integer volume);

	DataDto removeDataDto(LocalDate date);
}
