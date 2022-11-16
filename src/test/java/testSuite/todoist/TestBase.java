package testSuite.todoist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import page.todoist.*;
import session.Session;
import util.GetPropertiesTodoist;

public class TestBase {
     MainPage mainPage= new MainPage();
     LoginSection loginSection = new LoginSection();
     ProjectSection projectSection= new ProjectSection();
     SignUpSection signUpSection= new SignUpSection();
     // todo property file
     String user=GetPropertiesTodoist.getInstance().getUser();
     String password =GetPropertiesTodoist.getInstance().getPwd();


     @BeforeEach
     public void openBrowser(){
          // todo create property file
          Session.getInstance().getBrowser().get(GetPropertiesTodoist.getInstance().getHost());
     }

     @AfterEach
     public void closeBrowser(){
          Session.getInstance().closeSession();
     }

}
