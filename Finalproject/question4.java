package Finalproject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class question4 {
@Test
    public void printallvalues(){
    RestAssured.baseURI = "https://geocoding-api.open-meteo.com";
    Response response = given().queryParam("name", "Delhi").header("Content-Type", "application/json")
            .when().get("/v1/search");
    String id = response.jsonPath().getString("results.id");
    System.out.println("id = " + id);
}
}

