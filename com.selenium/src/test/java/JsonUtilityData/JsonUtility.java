package JsonUtilityData;

import Pojoclass.RegisterData;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JsonUtility {


    public static RegisterData[] getRegisterData() {

        RegisterData[] data = null;

        try {
            ObjectMapper mapper = new ObjectMapper();

            data = mapper.readValue(new File("src/test/resource/RgisterData.json"),
                    RegisterData[].class);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }
}
