package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {


    Properties prop;

    public ConfigReader(Properties prop) {
        prop = new Properties();

        try {
            FileInputStream file = new FileInputStream("src/test/resource/Config.properties");
            prop.load(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public String getbrowser()
    {
       return prop.getProperty("browser");
    }


    public String geturl()
    {
        return prop.getProperty("url");
    }






}

