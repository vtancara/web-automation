package page.todoly;

import control.Button;
import org.openqa.selenium.By;

public class MenuProjectSection {
    public Button editButton= new Button(By.xpath("//a[text()='Edit']"));
    public Button deleteButton= new Button(By.xpath("//a[text()='Delete']"));
    public Button confirmDeleteButton= new Button(By.xpath("//button[text()='Delete']"));


}
