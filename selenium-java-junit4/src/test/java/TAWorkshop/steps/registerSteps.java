package TAWorkshop.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class registerSteps {

//    The step definition file stores the mapping between
//    each step of the scenario defined in the feature file
//    with a code of function to be executed.

    public static WebDriver driver;

    @Given("user is on the demo sign in page")
    public void user_is_on_the_demo_sign_in_page()  {

        //Navigate to website
        driver.navigate().to("http://automationpractice.com/index.php");

        //Click sign in button
        driver.findElement(By.className("login")).click();
    }

    @When("user enters {word} and creates account")
    public void user_enters_email_address_and_creates_account(String emailAddress) throws InterruptedException {

        //Fill out email address
        driver.findElement(By.id("email_create")).sendKeys(emailAddress);


        //Click register button
//        driver.findElement(By.className("SubmitCreate")).click();
        driver.findElement(By.xpath("//*[@id='SubmitCreate']")).click();


        //Wait for next page to be present before proceeding


        //Then wait until an expected condition is visible

    }

    @And("user enters personal information")
    public void user_enters_personal_information() {

        //Fill out personal information (random american address)


        // Create object of the Select class


        // Select the option by index from the drop box


        //Continuing to fill out personal information

    }

    @Then("register should be successful")
    public void Register_should_be_successful() {

        //Wait for next page to be present before proceeding


        //Then wait until an expected condition is visible


        //Assert that we have successfully registered

    }

}
