package org.sample.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class C {

	public static void main(String[] args) throws IOException {
		// in particular ,to find how many cells are there
		File loc=new File("C:\\Users\\VIJILA\\eclipse-workspace\\MavenPrograms\\ExcelPro\\data.xlsx");
		FileInputStream stream =new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(stream);
		Sheet s=w.getSheet("sheet 1");
		
		int rows = s.getPhysicalNumberOfRows();
		System.out.println("Available rows: "+rows);
		Row r=s.getRow(1);
		
		int cells =r.getPhysicalNumberOfCells();
		System.out.println("Availabke cells : "+cells);	


	}

}
