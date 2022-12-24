package telran.spring.stockmarket.controller;

import java.time.LocalDate;

import telran.spring.stockmarket.dto.DataDto;
import telran.spring.stockmarket.service.DataService;

public class DataController {
	DataService dataService;
	
	//пример из сайта
//	@PostMapping("excel")
//	public String excelReader(@RequestParam("file") MultipartFile excel) {
//		
//		try {
//			XSSFWorkbook workbook = new XSSFWorkbook(excel.getInputStream());
//			XSSFSheet sheet = workbook.getSheetAt(0);
//			
//			for(int i=0; i<sheet.getPhysicalNumberOfRows();i++) {
//				XSSFRow row = sheet.getRow(i);
//				for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
//					System.out.print(row.getCell(j) +" ");
//				}
//				System.out.println("");
//			}
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		return "Success";
//	}

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
