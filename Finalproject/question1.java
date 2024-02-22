package Finalproject;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import java.util.HashMap;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;
public class question1{
   @Test(priority = 1)
    public void createuserwithmapbody(){
       HashMap<String, String> reqBody = new HashMap<String, String>();
       reqBody.put("name", "EAT");
       reqBody.put("job", "Learn");
       Response res = given().contentType(ContentType.JSON).body(reqBody).when().post("https://reqres.in/api/users");
       System.out.println("post map body = " + res.getBody().asString());
       System.out.println("content-Type = " + res.contentType());
}
}
