package JsonMapper;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import pojo.Adress;
import pojo.Result;
import pojo.TestApp;

import java.util.List;

public class JsonReader {

    public static Result getResult(String json){
        Gson gson = new Gson();

        return gson.fromJson(json, new TypeToken<List<Result>>(){}.getType());
    }


    public static List<Adress> getAdresses(String json){
        Gson gson = new Gson();

        return gson.fromJson(json, new TypeToken<List<Adress>>(){}.getType());
    }

    public static List<TestApp> oldGetTest(String json){
        Gson gson = new Gson();

        return gson.fromJson(json, new TypeToken<List<TestApp>>(){}.getType());
    }
}
