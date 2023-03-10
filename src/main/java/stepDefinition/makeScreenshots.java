package main.java.stepDefinition;

import com.aspose.words.Document;
import com.aspose.words.DocumentBuilder;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
public class makeScreenshots extends baseClass   {
    public void Screenshots(String filename) throws Exception {

        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File target = new File("ReportScreenshots/" + filename + ".png");
        FileUtils.copyFile(src, target);

        Document doc = new Document();
        DocumentBuilder builder = new DocumentBuilder(doc);
        builder.insertImage("ReportScreenshots/" + filename + ".png");
        doc.save("ReportScreenshots/" + filename + ".pdf");



    }

}
