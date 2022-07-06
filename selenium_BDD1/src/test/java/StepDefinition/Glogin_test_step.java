package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Glogin_test_step {
	public WebDriver driver;

	@Given("^user is on login page$")
    public void user_is_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Swara\\eclipse-workspace\\selenium_BDD1\\Binary\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.gmail.com");		
		driver.manage().window().maximize();
    }

    @When("^user enters an email_id$")
    public void user_enters_an_emailid() throws Throwable {
    	driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("abdare.dhan2017@gmail.com");
    }

    @When("^user enters an password$")
    public void user_enters_an_password() throws Throwable {
    	WebElement pword = driver.findElement(By.xpath("//input[@name='password']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(pword));
		pword.sendKeys("Kaju@2022");
    }

    @When("^user click on compose button$")
    public void user_click_on_compose_button() throws Throwable {
    	driver.findElement(By.xpath("//div[text()='Compose']")).click();
    }

    @When("^user enters the recipient mail_id and subject to mail$")
    public void user_enters_the_recipient_mailid_and_subject_to_mail() throws Throwable {
    	driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("swaraabdare@gmail.com");
    	driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Selenium_Java script");
    }

    @Then("^user should successfully navigate to password page$")
    public void user_should_successfully_navigate_to_password_page() throws Throwable {
        System.out.println("user should successfully navigate to password page");
    }

    @Then("^user should be successfully login into the gmail account$")
    public void user_should_be_successfully_login_into_the_gmail_account() throws Throwable {
    	System.out.println("user should be successfully login into the gmail account");
    }

    @Then("^compose message box should be opened$")
    public void compose_message_box_should_be_opened() throws Throwable {
    	System.out.println("compose message box should be opened");
    }

    @Then("^user should successfully send an email to the recipient$")
    public void user_should_successfully_send_an_email_to_the_recipient() throws Throwable {
    	System.out.println("user should successfully send an email to the recipient");
    }

    @And("^click on next button$")
    public void click_on_next_button() throws Throwable {
    	driver.findElement(By.xpath("//span[text()='Next']")).click();
    }

    @And("^user attch file and click on send button$")
    public void user_attch_file_and_click_on_send_button() throws Throwable {
    	driver.findElement(By.xpath("//input[@name='Filedata']")).sendKeys("C:\\Users\\Swara\\Downloads\\TestCase.docx");
		driver.findElement(By.xpath("//div[text()='Send']")).click();
    }
}
