package JsonUtilityData;

import Pojoclass.LoginData;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class LoginJsonData {


    public static LoginData[] getLoginData() throws IOException {

        LoginData[] data=null;
     try
     {
         ObjectMapper Mapper=new ObjectMapper();

         data=Mapper.readValue(new File("src/test/resource/LoginData.json"),LoginData[].class);


     } catch (Exception e) {
         e.printStackTrace();
     }


        return data;
    }




}
