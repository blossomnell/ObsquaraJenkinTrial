package excelReader;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Parent_Excel {

	static FileInputStream f; //to enter into an external file
	static XSSFWorkbook wb;   //to read details/data from workbook
	static XSSFSheet   sh;    //to read details from sheets
	
	
	public static String getStringData(int a,int b) throws IOException  
	{
		f=new FileInputStream("C:\\Users\\bloss\\javaexcel\\Book1.xlsx");
		wb= new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1");       //wb means workbook; method to get details from the sheet
		XSSFRow r =sh.getRow(a);        //apache inbuilt method to read details from row
		XSSFCell c = r.getCell(b);      //apache inbuilt method to read details from cell
		return c.getStringCellValue();  //method to get string from the cell
		
	}
	
	public static String getIntegerData(int a,int b) throws IOException
	{
		f=new FileInputStream("C:\\Users\\bloss\\javaexcel\\Book1.xlsx");
		wb= new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1");       
		XSSFRow r =sh.getRow(a);       
		XSSFCell c = r.getCell(b);  
		int var = (int) c.getNumericCellValue(); //typecasting
		return String.valueOf(var);        //used for convert any type of data to a string
		
	}
	
	public static String getFloatData(int a,int b) throws IOException
	{
		f=new FileInputStream("C:\\Users\\bloss\\javaexcel\\Book1.xlsx");
		wb= new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1");       
		XSSFRow r =sh.getRow(a);       
		XSSFCell c = r.getCell(b);  
		float var = (float) c.getNumericCellValue(); //typecasting
		return String.valueOf(var);        //used for convert any type of data to a string
		
	}
}




