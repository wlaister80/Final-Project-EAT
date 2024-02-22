package Finalproject;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
public class question7{
    @Test
    public void printfirstvalueofid() {
        Response res = given().baseUri("https://restful-booker.herokuapp.com/")
                .basePath("{resourcePath}")
                .pathParam("resourcePath", "booking")
                .when()
                .get();
        String firstBookingId = res.jsonPath().getString("bookingid[0]");

        System.out.println("First Booking ID: " + firstBookingId);
    }
}