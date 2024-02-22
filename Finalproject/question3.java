package Finalproject;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class question3{
    @Test
    public void statuscode201(){
        Response res = given().when().post("https://reqres.in/api/users");
        System.out.println(res.getBody().prettyPrint());
        res.then().statusCode(201);
    }
}
