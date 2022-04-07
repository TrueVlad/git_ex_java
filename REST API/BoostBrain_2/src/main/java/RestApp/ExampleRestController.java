package RestApp;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleRestController {

    public static class RestResponse{
        private String param1;
        private String param2;

        public String getParam1() {
            return param1;
        }

        public void setParam1(String param1) {
            this.param1 = param1;
        }

        public String getParam2() {
            return param2;
        }

        public void setParam2(String param2) {
            this.param2 = param2;
        }
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE) //http://localhost:8080/hello?name2=ww&&name=w или http://localhost:8080/hello?name=ww
    public RestResponse restMethod (String name /*,String name2*/){
        RestResponse result = new RestResponse();
//        result.setParam1(name2);
        result.setParam1("par1");
        result.setParam2(name);

        return result;



    }

}
