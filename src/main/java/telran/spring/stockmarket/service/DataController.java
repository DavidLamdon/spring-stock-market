package telran.spring.stockmarket.service;

import java.time.LocalDate;

import telran.spring.stockmarket.dto.DataDto;

public class DataController {
	DataService dataService;

	public DataDto addDataDto(DataDto dataDto) {
		return dataService.addDataDto(dataDto);
	}

	public DataDto getDataDto(LocalDate date) {
		return dataService.getDataDto(date);
	}

	public DataDto updateDataDto(Double last, Integer volume) {
		return dataService.updateDataDto(last, volume);
	}

	public DataDto removeDataDto(LocalDate date) {
		return dataService.removeDataDto(date);
	}

}
