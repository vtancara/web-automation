package page.todoist;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;
import page.todoist.MenuProjectSection;

public class ProjectSection {
    public MenuProjectSection menuProjectSection= new MenuProjectSection();
    public Button menuButtom = new Button(By.id("burger-menu-toggle"));
    public Button addNewProjecButton = new Button(By.xpath("//button[contains(@aria-label,'Add project')]"));
    public TextBox nameProjectTxtBox= new TextBox(By.id("edit_project_modal_field_name"));
    public TextBox colorProjectDropDown= new TextBox(By.xpath("//button[contains(@aria-labelledby, 'edit_project_modal_field_color_label')]"));
    public TextBox favoriteProjectCheckBox= new TextBox(By.xpath("//input[contains(@name, 'is_favorite')]"));
    public Button addButton= new Button(By.xpath("//button[text()='Add']"));

    public ProjectSection(){}

    public void clickOnProject(String nameProject){
        Label projectCreated = new Label(By.xpath("//td[text()='"+nameProject+"']"));
        projectCreated.click();
    }

    public boolean isProjectDisplayedInList(String nameProject){
        Label projectCreated = new Label(By.xpath("//td[text()='"+nameProject+"']"));
        return projectCreated.isControlDisplayed();
    }

    public Label getProject(String nameProject){
        Label projectCreated = new Label(By.xpath("//td[text()='"+nameProject+"']"));
        return projectCreated;
    }

}
