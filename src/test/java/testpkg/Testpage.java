package testpkg;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import projectpkg.Alert;
import projectpkg.Datadriven;
import projectpkg.Datepicker;
import projectpkg.Draganddrop;
import projectpkg.Fileupload;
import projectpkg.Register;
import projectpkg.Windowhandle;



public class Testpage {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	   driver=new ChromeDriver(options);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@BeforeMethod
	public void url()
	{
		
		driver.get("https://demo.automationtesting.in/Register.html");
	}

	@Test
	public void testlogin() throws Exception  
	{
		Register ob=new Register(driver);
		ob.setvalues("tina", "varghese", "areekattu house ", "tinaelsa97@gmail.com", "9754333322");
		ob.radio();
		ob.hobbies();
		ob.dropdown();
		ob.passw("kkkk", "kkkk");
		ob.submit();
	    Fileupload ob2=new Fileupload(driver);
	    ob2.as();
	    
	   // ob2.fileUploadd("C:\\Users\\User\\Desktop\\jj.jpg");
		Alert ob3=new Alert(driver);
		ob3.ss();
		
	    Draganddrop ob5=new Draganddrop(driver);
		ob5.tt();
		
		
		Windowhandle ob4=new Windowhandle(driver);
		ob4.kk();
		Datepicker ob8=new Datepicker(driver);
		ob8.date();
		Datadriven ob9=new Datadriven(driver);
		ob9.dataclick();
		ob9.datadriven();
		
	}
	
	
	
}