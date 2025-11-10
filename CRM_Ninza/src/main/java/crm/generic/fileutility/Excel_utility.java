package crm.generic.fileutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
// This class is used to fetch the data from the Excel file
public class Excel_utility {
	//This method is used to read the data from excel file
		public String getDataFromEXcel(String sheet_name,int row_no,int cell_no) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis=new FileInputStream("./src/test/resources/testdata.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh= wb.getSheet(sheet_name);
			Row row=sh.getRow(row_no);
			Cell cell=row.getCell(cell_no);
			if(cell==null)
			{
				System.out.println("Null");
			}
			String value= cell.getStringCellValue();
		
			wb.close();
			return value;
		}
		//This method will write the data to the excel file 
		public void writeDataToExcel(String Sheet_name,int row_no, int cell_no, String value) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis=new FileInputStream("./src/test/resources/TestData.xlsc.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet(Sheet_name);
			Row row=sh.getRow(row_no);
			if(row==null)
			{
				row=sh.createRow(row_no);
			}
			Cell cell=row.createCell(cell_no, CellType.STRING);
			cell.setCellValue(value);
			FileOutputStream fos=new FileOutputStream("./src/test/resources/TestData.xlsc.xlsx");
			wb.write(fos);
			wb.close();
		}
		//This Method will return the last row number
		public int getLastRowNumber( String sheet_name) throws EncryptedDocumentException, IOException
		{ 
			FileInputStream fis=new FileInputStream("./src/test/resources/TestData.xlsc.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh= wb.getSheet(sheet_name);
			int rowNO=sh.getLastRowNum();
			return rowNO;
		}
		//This method will read multiple data from the  excel file
		public void readMultipleDataFromExcel(String sheet_name) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis=new FileInputStream("./src/test/resources/TestData.xlsc.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh= wb.getSheet(sheet_name);
			int lastrow=sh.getLastRowNum();
			System.out.println(lastrow);
			
			int lastcell=sh.getRow(lastrow).getLastCellNum();
			System.out.println(lastcell);
			
			for ( int i=0;i<=lastrow;i++)
			{
				 Row row = sh.getRow(i);
				 if(row==null)
					 continue;
				for(int j=0;j<=lastcell;j++)
				{
					Cell cell = row.getCell(j);
					if(cell==null)
					{
						continue;
					}
	                String value = cell.getStringCellValue(); 
	                System.out.print(value + "\t");
				}
					
			}
		}
}
			
			
			 



