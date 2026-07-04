package JsonUtilityData;

import Pojoclass.ApplyloanRequest;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ApplyLoanJsonData {



    public static ApplyloanRequest[] getApplyloandata() throws IOException {
        ApplyloanRequest [] data=null;


        ObjectMapper mapper=new ObjectMapper();

        data= new ApplyloanRequest[]{mapper.readValue(new File("src/test/resource/Loanapplydata.json"), ApplyloanRequest.class)};

        return data;


    }



}
