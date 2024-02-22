package Finalproject;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class question11 {
@Test
    public void conditonlogstatuscode(){
    Response res = given().when().get("https://reqres.in/api/users?page=2");
    res.then().log().ifStatusCodeIsEqualTo(200);
}
}
