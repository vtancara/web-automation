package page.todoly;

import control.Button;
import control.CheckBox;
import control.TextBox;
import org.openqa.selenium.By;

public class SignUpSection {
    public TextBox fullNameTextBox = new TextBox(By.id("name"));
    public TextBox emailTextBox = new TextBox(By.xpath("//input[contains(@autocomplete, 'username')]"));
    public TextBox pwdTextBox = new TextBox(By.id("password"));
    public Button signupButton = new Button(By.xpath("//button[contains(@class,'button__3eXSs')]"));
    public Button signinButton = new Button(By.xpath("//a[contains(@href,'/signin')]"));

    public SignUpSection(){

    }

    public void goToSignin(){
        signinButton.click();
    }

    public void createNewAccount(String fullName,String email,String pwd){
        fullNameTextBox.setText(fullName);
        emailTextBox.setText(email);
        pwdTextBox.setText(pwd);
        signupButton.click();
    }


}

