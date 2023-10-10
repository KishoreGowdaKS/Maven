package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String readDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/data/commondata.property");
		Properties pobj = new Properties();
		pobj.load(fis);
		String keys = pobj.getProperty(key);
		return keys;

	}

	public String readDataFromExcel(String sheetname, int row, int cell)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}

	public void writeDataToExcel(String sheetname, int row, int cell, String value) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(value);
		FileOutputStream fis1 = new FileOutputStream("./src/test/resources/data/testscript.xlsx");
		wb.write(fis1);

	}
}
