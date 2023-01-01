package page.todoly;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class MainPage {
    public Button signUpFreeButton = new Button(By.xpath("//a[contains(@href,'signup')]"));
}
