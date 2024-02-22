package Finalproject;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class question6 {
@Test()
    public void responsebodypathparameter(){
    Response res = given().baseUri("https://restful-booker.herokuapp.com/")
            .basePath("{resourcePath}")
            .pathParam("resourcePath","booking")
            .when()
            .get();
    System.out.println("responsebodypathparameter = " + res.getBody().asString());
}
}
