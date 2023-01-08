package testSuite.todoly;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;
import org.openqa.selenium.Keys;



public class CRUDProjectTest extends TestBase{

    @Test
    public void verifyCRUDProject(){
        String projectCreated="PJ-CREADO-"+new Date().getTime();
        String projectUpdated="PJ-EDITADO-"+new Date().getTime();

        // iniciar session
        mainPage.signUpFreeButton.click();
        signUpSection.goToSignin();
        loginSection.emailTxtBox.setText(user);
        loginSection.passwordTxtBox.setText(password);
        loginSection.loginButton.click();
        menuSection.settingButton.click();
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),"ERROR! the login was faield");

        // create project
        projectSection.addNewProjecButton.click();
        projectSection.nameProjectTxtBox.setText(projectCreated);
        projectSection.addButton.click();
        Assertions.assertTrue(projectSection.isProjectDisplayedInList(projectCreated),"ERROR! the project was not created");

        // update project
        projectSection.clickOnProject(projectCreated);
        projectSection.menuProjectSection.editButton.click();
        projectSection.editProjectTxtBox.sendKeys(Keys.chord(Keys.CONTROL, "a"), projectUpdated);
        projectSection.editProjectTxtBox.sendKeys(Keys.chord(Keys.COMMAND, "a"), projectUpdated);
        projectSection.saveButton.click();
        Assertions.assertTrue(projectSection.isProjectDisplayedInList(projectUpdated),"ERROR! the project was not updated");

        // delete project
        projectSection.clickOnProject(projectUpdated);
        projectSection.menuProjectSection.deleteButton.click();
        projectSection.menuProjectSection.confirmDeleteButton.click();
        projectSection.getProject(projectUpdated).waitControlIsNotInThePage();
        Assertions.assertFalse(projectSection.isProjectDisplayedInList(projectUpdated),"ERROR! the project was not deleted");

    }


}
