package StepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
WebDriver driver= null;
@Given("browser is open")
public void browser_is_open() throws IOException {
		System.out.println("User opens URL");
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.indiamart.com");
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshots/Screen.png"));
		System.out.println("the Screenshot is taken");
	
}
@When("User opens URL {string}")
public void user_opens_url(String string) {
	System.out.println("browser is opend");
}

@When("clicks on Food, Agriculture & Farming")
public void clicks_on_food_agriculture_farming() throws InterruptedException, IOException {
	WebElement FoodAgricultureFarming=driver.findElement(By.xpath("//a[normalize-space()='Food, Agriculture & Farming']"));
	if(FoodAgricultureFarming.isDisplayed())
	{

	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	jsExecutor.executeScript("arguments[0].style.border='2px solid red'",FoodAgricultureFarming);

	System.out.println("progress image is displayed");
	}
	else {
	System.out.println("progress image is not displayed");
	}
	Thread.sleep(2000);
	 driver.findElement(By.xpath("//a[normalize-space()='Food, Agriculture & Farming']")).click();
	 JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)", "");
			driver.navigate().back();
			driver.findElement(By.xpath("//div[@class='product-meta']//a[normalize-space()='Rice']")).click();
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./Screenshots/Test1.png"));
			System.out.println("the Screenshot is taken");
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='product-meta']//a[normalize-space()='Pulses']")).click();
			TakesScreenshot tsa = (TakesScreenshot)driver;
			File sourcea = tsa.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(sourcea, new File("./Screenshots/Test2.png"));
			System.out.println("the Screenshot is taken");
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='product-meta']//a[normalize-space()='Wheat']")).click();
			TakesScreenshot tsb = (TakesScreenshot)driver;
			File sourceb = tsb.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(sourceb, new File("./Screenshots/Test3.png"));
			System.out.println("the Screenshot is taken");
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[normalize-space()='Seeds']")).click();
			TakesScreenshot tsc = (TakesScreenshot)driver;
			File sourcec = tsc.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(sourcec, new File("./Screenshots/Test4.png"));
			System.out.println("the Screenshot is taken");
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[normalize-space()='Whole Spices']")).click();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
}

@Then("user is navigated to the Food, Agriculture & Farming")
public void user_is_navigated_to_the_food_agriculture_farming() throws InterruptedException {
	System.out.println("user is navigated to the Food, Agriculture & Farming");
	
}

@When("user clicks on Apparel, Clothing & Garments")
public void user_clicks_on_apparel_clothing_garments() throws InterruptedException, IOException {
	WebElement ApparelClothingGarments=driver.findElement(By.xpath("//a[normalize-space()='Apparel, Clothing & Garments']"));
	if(ApparelClothingGarments.isDisplayed())
	{

	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	jsExecutor.executeScript("arguments[0].style.border='2px solid green'",ApparelClothingGarments);

	System.out.println("progress image is displayed");
	}
	else {
	System.out.println("progress image is not displayed");
	}
	driver.findElement(By.xpath("//a[normalize-space()='Apparel, Clothing & Garments']")).click();
	
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[normalize-space()='Ladies Kurtis']")).click();
	TakesScreenshot tsg = (TakesScreenshot)driver;
	File sourceg = tsg.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(sourceg, new File("./Screenshots/Test7.png"));
	System.out.println("the Screenshot is taken");
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[normalize-space()='Cotton Kurti']")).click();
	TakesScreenshot tsi = (TakesScreenshot)driver;
	File sourcei = tsi.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(sourcei, new File("./Screenshots/Test8.png"));
	System.out.println("the Screenshot is taken");
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[normalize-space()='Synthetic Fabric']")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[normalize-space()='Rayon Fabrics']")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[normalize-space()='Viscose Fabrics']")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
}

@When("user clicks on Packaging Material, Supplies & Machines")
public void user_clicks_on_packaging_material_supplies_machines() throws InterruptedException {
	WebElement PackagingMaterialSuppliesMachines=driver.findElement(By.xpath("//a[normalize-space()='Packaging Material, Supplies & Machines']"));
	if(PackagingMaterialSuppliesMachines.isDisplayed())
	{

	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	jsExecutor.executeScript("arguments[0].style.border='2px solid blue'",PackagingMaterialSuppliesMachines);

	System.out.println("progress image is displayed");
	}
	else {
	System.out.println("progress image is not displayed");
	}
	driver.findElement(By.xpath("//a[normalize-space()='Packaging Material, Supplies & Machines']")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[normalize-space()='Corrugated Packaging Boxes']")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[normalize-space()='Plastic Bottles']")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[normalize-space()='Transparent Plastic Bottles']")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[normalize-space()='Cap Closures']")).click();
	Thread.sleep(1000);
	Thread.sleep(1000);
	driver.navigate().back();
	driver.findElement(By.xpath("//a[normalize-space()='Packaging Machines']")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
}

@When("user clicks on Chemicals, Dyes, Solvents & Allied Products")
public void user_clicks_on_chemicals_dyes_solvents_allied_products() throws InterruptedException {
	WebElement ChemicalsDyesSolventsAlliedProducts=driver.findElement(By.xpath("//a[normalize-space()='Chemicals, Dyes, Solvents & Allied Products']"));
	if(ChemicalsDyesSolventsAlliedProducts.isDisplayed())
	{

	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	jsExecutor.executeScript("arguments[0].style.border='2px solid blue'",ChemicalsDyesSolventsAlliedProducts);

	System.out.println("progress image is displayed");
	}
	else {
	System.out.println("progress image is not displayed");
	}
	driver.findElement(By.xpath("//a[normalize-space()='Chemicals, Dyes, Solvents & Allied Products']")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[normalize-space()='Industrial Alcohol']")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[normalize-space()='Neutral Ethanol']")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[normalize-space()='Chemical Compound']")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[normalize-space()='Speciality Chemicals']")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[normalize-space()='Industrial Dyes']")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[normalize-space()='Resin']")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	
	
}

@When("user clicks on Transportation & Logistics")
public void user_clicks_on_transportation_logistics() throws InterruptedException {
	WebElement TransportationLogistics=driver.findElement(By.xpath("//a[normalize-space()='Transportation & Logistics']"));
	if(TransportationLogistics.isDisplayed())
	{

	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	jsExecutor.executeScript("arguments[0].style.border='2px solid blue'",TransportationLogistics);

	System.out.println("progress image is displayed");
	}
	else {
	System.out.println("progress image is not displayed");
	}
	driver.findElement(By.xpath("//a[normalize-space()='Transportation & Logistics']")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[normalize-space()='Transportation Services']")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[normalize-space()='Liquid Transportation Service']")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[normalize-space()='Contract Logistics Service']")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[normalize-space()='Air Cargo Service']")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[normalize-space()='Surface Transportation']")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
}

}
