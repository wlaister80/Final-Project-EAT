package Finalproject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class question5 {
@Test
public void index5() {
    RestAssured.baseURI = "https://geocoding-api.open-meteo.com";
    Response response = given().queryParam("name", "Delhi").header("Content-Type", "application/json")
            .when().get("/v1/search");
String name1 =response.jsonPath().getString("results[5].name");
System.out.println("name1 = " + name1);
}
}


