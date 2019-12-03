package method_parameters;

import org.openqa.selenium.By;

public class UploadFile_USing_keywords {

	public static void main(String[] args) throws Exception {
	
		Repository obj=new Repository();
		obj.launch_browser("chrome");
		obj.load_webpage("https://www.naukri.com/account/register/basicdetails");
		obj.set_timeout(30);
		

		obj.click_element("//button[@value='exp']");
		Thread.sleep(3000);
		
		//Identify UploadCV button
		obj.mousehover(By.name("uploadCV"));
		Thread.sleep(2000);
		obj.Click_using_mouse("//input[@name='uploadCV']");
		Thread.sleep(3000);
		
		
		String text="C:\\Users\\Administrator\\Downloads\\Sunil.docx";
		
		obj.FileUploading(text);

	}

}
