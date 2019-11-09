import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObejectMapper;


public class App {

    public static void main(String[] args) {
        ObejectMapper mapper = new ObejectMapper();

        try {
            String jsonString ="{\"id\": 1,\"name\": \"A green door\",\"price\": 12.50,\"tags\": [\"home\",\"green\"]}";
            MyPojo myPojo = mapper.readValue(jsonString, MyPojo.class);
            System.out.println(myPojo.getTags()[1]);



        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
