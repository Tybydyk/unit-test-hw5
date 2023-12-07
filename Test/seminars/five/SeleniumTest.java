package seminars.five;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeleniumTest {

//    Напишите автоматизированный тест, который выполнит следующие шаги:
//            1. Открывает главную страницу Google.
//            2. Вводит "Selenium" в поисковую строку и нажимает кнопку "Поиск в Google".
//            3. В результатах поиска ищет ссылку на официальный сайт Selenium
//            (https://www.selenium.dev) и проверяет, что ссылка действительно присутствует среди результатов поиска.
    @Test
    public void testSeleniumGind(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement webElement = driver.findElement(By.name("q"));
        webElement.sendKeys("Selenium");
        webElement.submit();
        webElement = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/div/div/div/cite"));

        assertThat(webElement.getText()).isEqualTo("https://www.selenium.dev");
        driver.quit();
        }
//Нужно написать сквозной тест с использованием Selenium,
// который авторизует пользователя на сайте https://www.saucedemo.com/.
//        Данные для входа - логин: "standard_user", пароль: "secret_sauce".
//        Проверить, что авторизация прошла успешно и отображаются товары.
//        Вам необходимо использовать WebDriver для открытия страницы и
//        методы sendKeys() для ввода данных в поля формы, и submit() для отправки формы.
//        После этого, проверьте, что на странице отображаются продукты (productsLabel.getText() = "Products").
    @Test
    public void testAuthorization(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.saucedemo.com/");
        WebElement webElement = webDriver.findElement(By.name("user-name"));
        webElement.sendKeys("standard_user");
        webElement = webDriver.findElement(By.name("password"));
        webElement.sendKeys("secret_sauce");
        webElement = webDriver.findElement(By.name("login-button"));
        webElement.submit();
        WebElement product = webDriver.findElement(By.className("title"));

        assertThat(product.getText()).isEqualTo("Products");
        webDriver.quit();
    }

}