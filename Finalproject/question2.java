package Finalproject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class question2{
    @Test(priority = 1)

    public void valueofid(){
    RestAssured.baseURI = "https://reqres.in/api/users";
    Response res = given().queryParam("id","id").header("Content-Type","application/json").when().post("/v1/search");
System.out.println("res string = " + res.getBody().asString());
}
}
