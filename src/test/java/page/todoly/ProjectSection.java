package page.todoly;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class ProjectSection {
    public MenuProjectSection menuProjectSection= new MenuProjectSection();
    public Button addNewProjecButton = new Button(By.xpath("//button[contains(@class, 'add-icon')]"));
    public TextBox nameProjectTxtBox= new TextBox(By.id("edit-project-name"));
    public Button addButton = new Button(By.xpath("//button[contains(@class, 'ap-button ap-button-middle ap-button-primary')]"));
    public TextBox editProjectTxtBox= new TextBox(By.id("edit-project-name"));
    public Button saveButton= new Button(By.xpath("//button[contains(@class, 'ap-button-primary')]"));

    public ProjectSection(){}

    public void clickOnProject(String nameProject){
        Label projectCreated = new Label(By.xpath("//button[contains(@class,'bg-primary-10')]//div[contains(@class,'peer')]"));
        projectCreated.click();
    }

    public boolean isProjectDisplayedInList(String nameProject){
        Label projectCreated = new Label(By.xpath("//p[text()='"+nameProject+"']"));
        return projectCreated.isControlDisplayed();
    }

    public Label getProject(String nameProject){
        Label projectCreated = new Label(By.xpath("//td[text()='"+nameProject+"']"));
        return projectCreated;
    }

}
