package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.java.stepDefinition.makeScreenshots;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class keyboardBot extends makeScreenshots {
    @Given("Opening the browser {string}")
    public void openingTheBrowser(String src) throws Exception {
        try {
            driver.manage().window().maximize();
            driver.get("https://10fastfingers.com/typing-test/russian");
            Thread.sleep(2000);
            ////button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']
            WebElement cookies = driver.findElement(By.xpath(""));
            cookies.click();

        } catch (Exception e) {
            Screenshots("first");
        }
    }

    @When("input the marked letter")
    public void inputLetter() throws Exception {
        System.out.println("Need to wait 13123 minute...");
        while (true) {
            try {
                //
                WebElement letter = driver.findElement(By.xpath("//span[@class='highlight']"));
                String stringWord = letter.getText();
                ////input[@id='inputfield']
                WebElement inputField = driver.findElement(By.xpath(""));
                inputField.sendKeys(stringWord);
                inputField.sendKeys(Keys.SPACE);
                WebElement Timer = driver.findElement(By.xpath("//div[@id='timer']"));
                String checkTimer = Timer.getText();
                System.out.println(checkTimer);
                if (checkTimer.equals("0:00")) {
                    break;
                }
            } catch (Exception e) {
                Screenshots("second");

            }
        }
    }

    @Then("check the game is done")
    public void checkTheGameIsDone() throws Exception {
        try {
            System.out.println("Test is done!");

            WebElement WbmResult = driver.findElement(By.cssSelector("td[id='wpm'] strong"));
            System.out.println("Words per minute: " + WbmResult.getText());

            WebElement CorrectWords = driver.findElement(By.cssSelector("tr[id='correct'] strong"));
            System.out.println("Quantity of correct words: " + CorrectWords.getText());

            WebElement Accuracy = driver.findElement(By.cssSelector("tr[id='accuracy'] strong"));
            System.out.println("Accuracy: " + Accuracy.getText());
            driver.close();

        } catch (Exception e) {
            Screenshots("third");

        }
    }
}
