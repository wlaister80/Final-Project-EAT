package Finalproject;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class question8{
    @Test
public void validatecontenttype(){
        int bookingId = 123;
        Response res = given().when().get("https://restful-booker.herokuapp.com/");
    System.out.println(res.getBody().prettyPrint());
    res.then().statusCode(200).header("Content-Type", ("application/json; charset=utf-8"));
}
}
