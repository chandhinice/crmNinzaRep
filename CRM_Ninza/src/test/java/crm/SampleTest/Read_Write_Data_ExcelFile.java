package crm.SampleTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import crm.generic.fileutility.Excel_utility;

public class Read_Write_Data_ExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Create Object for Excel_Utitlity
		Excel_utility  Elib= new Excel_utility();
		/*
		 * //method call to read the data from excel String CAMPNAME =
		 * Elib.getDataFromEXcel("CreateCamp", 1 , 1); System.out.println(CAMPNAME);
		 * //method call to write the data to excel
		 * Elib.writeDataToExcel("CreateCamp",2,3,"contact");
		 * System.out.println("Writing Data Successfull"); //Method call to get
		 * lastRowNumber 
		 * system.out.println(Elib.getLastRowNumber("Createcamp"));
		 */
		
		 
		//Method call to read multiple data from Excel
	    Elib.readMultipleDataFromExcel("Createcamp");

	}
}
