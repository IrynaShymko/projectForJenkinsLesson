import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class MainPageTest extends TestBase{
    private static Logger logger = LoggerFactory.getLogger("MainPageTest.class");

    @Test
    public void shouldCompareWindowTitle(){
        logger.info("<<<<<<<<<< Actual window Title is: "+mainPage.getWindowTitle());
        logger.info("<<<<<<<<<< Expected window Title is: "+System.getProperty("expectedMessage"));
        assertThat("WindowTitle is incorrect", mainPage.getWindowTitle(), equalTo(System.getProperty("expectedMessage")));

    }
}
