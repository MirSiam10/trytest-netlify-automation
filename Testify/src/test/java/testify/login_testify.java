package testify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login_testify {
	
	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		
		WebElement radioButton = driver.findElement(By.id("male"));
		radioButton.click();
		assert radioButton.isSelected();
		System.out.println(radioButton.isSelected());
		
		WebElement testdropdown = driver.findElement(By.id("option"));
		Select dropdown = new Select(testdropdown);
		dropdown.selectByIndex(3);
		
	}

}
