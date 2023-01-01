package page.todoly;

import control.Button;
import org.openqa.selenium.By;

public class MenuSection {
    public Button logoutButton = new Button(By.xpath("//a/span[text()='Sign Out']"));
    public Button settingButton= new Button(By.xpath("//img[contains(@src,'data:image')]"));

}
