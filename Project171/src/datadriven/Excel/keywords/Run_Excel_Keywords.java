package datadriven.Excel.keywords;

public class Run_Excel_Keywords 
{

	public static void main(String[] args)
	{
		
		ExcelKeywords.getExcel_connection("InputData.xlsx", "Sheet4");
		for (int i = 5; i <=ExcelKeywords.sht.getLastRowNum(); i++)
		{
				String UID=ExcelKeywords.GetCellData(i, 0);
				System.out.println(UID);
				
				ExcelKeywords.write_celldata(i, 4, "Testpass");
		}
		ExcelKeywords.Create_excel_output("OP1.xlsx");
		

	}

}
