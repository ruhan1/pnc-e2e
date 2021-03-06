package ui;

import org.junit.Test;

/**
 * Created by eunderhi on 29/07/15.
 */
public class ReleaseTest extends MilestoneVersionTest {
    private static final String VERSION_NUMBER = "1.15";
    private static final String RELEASE_DATE = "2015/07/04";
    private static final String DOWNLOAD_URL = "http://test";

    @Test
    public void createRelease() {
        tester.clickButton("Create Release");
        tester.textInput("version", VERSION_NUMBER);
        tester.textInput("releaseDate", RELEASE_DATE);
        tester.clickFirstNonEmptySelect("releaseCreateUpdateCtrl.data.supportLevel");
        tester.clickFirstNonEmptySelect("releaseCreateUpdateCtrl.productMilestoneId");
        tester.textInput("downloadurl", DOWNLOAD_URL);
        tester.submit();
        tester.findSpan("1.0.1.15");
    }
}
