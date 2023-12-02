import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Homework {

    WebDriver wd;

    @BeforeClass

    public void Setup(){
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/home");
    }

    @Test
    public void cssLocators(){
        //by tag name
        WebElement tag_a = wd.findElement(By.cssSelector("a"));
        WebElement tag_div = wd.findElement(By.cssSelector("div"));


        //by class
        WebElement navbar = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement container = wd.findElement(By.cssSelector(".container"));
        WebElement active = wd.findElement(By.cssSelector(".active"));


        //by id
        WebElement root = wd.findElement(By.cssSelector("#root"));


        //by attribute
        WebElement home = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement about = wd.findElement(By.cssSelector("[href='/about']"));
        WebElement login = wd.findElement(By.cssSelector("[href='/login']"));
    }



}





