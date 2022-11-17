package testSuite.todoist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

import java.util.Date;

public class CRUDProjectTest extends TestBase {

    @Test
    public void verifyCRUDProject(){
        String projectCreated="CREATED_PROJECT"+new Date().getTime();
        String projectUpdated="UPDATED_PROJECT"+new Date().getTime();

        mainPage.loginLabel.click();
        loginSection.emailTxtBox.setText(user);
        loginSection.passwordTxtBox.setText(password);
        loginSection.loginButton.click();
        //Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),"ERROR! the login was faield");

        projectSection.addNewProjecButton.click();
        projectSection.nameProjectTxtBox.setText(projectCreated);
        projectSection.colorProjectDropDown.click();
        projectSection.selectBlueColorProjectDropDown.click();
        projectSection.favoriteProjectCheckBox.click();
        projectSection.addButton.click();
        Assertions.assertTrue(projectSection.isProjectDisplayedInList(projectCreated),"ERROR! the project was not created");

        // updating project
        projectSection.menuProjectSection.menuIconButton.click();
        projectSection.menuProjectSection.editButton.click();
        projectSection.nameProjectTxtBox.cleanSetText("");
        projectSection.nameProjectTxtBox.setText(projectUpdated);
        projectSection.colorProjectDropDown.click();
        projectSection.selectOrangeColorProjectDropDown.click();
        projectSection.favoriteProjectCheckBox.click();
        projectSection.saveButton.click();
        Assertions.assertTrue(projectSection.isProjectDisplayedInList(projectUpdated),"ERROR! the project was not updated");

        // deleting project
        projectSection.menuProjectSection.menuIconButton.click();
        projectSection.menuProjectSection.deleteButton.click();
        projectSection.deleteConfirmButton.click();
        projectSection.getProject(projectUpdated).waitControlIsNotInThePage();
        Assertions.assertFalse(projectSection.isProjectDisplayedInList(projectUpdated),"ERROR! the project was not deleted");

    }


}
