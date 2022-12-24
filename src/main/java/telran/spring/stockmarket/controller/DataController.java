package telran.spring.stockmarket.controller;

import java.time.LocalDate;

import telran.spring.stockmarket.dto.DataDto;
import telran.spring.stockmarket.service.DataService;

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