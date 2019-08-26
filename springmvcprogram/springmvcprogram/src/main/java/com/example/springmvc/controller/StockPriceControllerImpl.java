package com.example.springmvc.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.example.springmvc.model.StockPrice;
import com.example.springmvc.service.StockPriceService;
@Controller
public class StockPriceControllerImpl implements StockPriceController {
@Autowired
private StockPriceService stockPriceService;

	@Override
	public StockPrice updateStock(StockPrice stock) {
		// TODO Auto-generated method stub
		
		return null;
	}
	
	
	@Override
	@RequestMapping(value="/updateStock")
	public List<StockPrice> getStockPrice() throws SQLException {
		// TODO Auto-generated method stub
		ModelAndView mv=new ModelAndView();
		mv.setViewName("updateStock");
		return stockPriceService.getStockPrice();
	}

	@Override
	public StockPrice insertStock(StockPrice stock) {
		// TODO Auto-generated method stub
		stockPriceService.insertStock(stock);
		return null;
	}
	
	/*@PostMapping("/import")
	public void mapReapExcelDatatoDB(@RequestParam("file") MultipartFile reapExcelDataFile) throws IOException {

	   List<StockPrice> stockPriceList = new ArrayList<StockPrice>();
	    XSSFWorkbook workbook = new XSSFWorkbook(reapExcelDataFile.getInputStream());
	    XSSFSheet worksheet = workbook.getSheetAt(0);

	    for(int i=1;i<worksheet.getPhysicalNumberOfRows() ;i++) {
	        StockPrice stockPrice = new StockPrice();

	         XSSFRow row = worksheet.getRow(i);
	         stockPrice.setStock_code((int) row.getCell(0).getNumericCellValue());
	        stockPrice.setCompanyCode((int) row.getCell(1).getNumericCellValue());
	        stockPrice.setCurrentPrice((double)row.getCell(2).getNumericCellValue());
	        stockPrice.setStock_date((Date) row.getCell(3).getDateCellValue());
	        stockPrice.setTime((Time) row.getCell(4).getDateCellValue());
	        
	            stockPriceList.add(stockPrice);   
	    }
	}*/

}
