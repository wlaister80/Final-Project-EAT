package APIautomationproject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class apiautomation {

    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = "https://fakerestapi.azurewebsites.net";
    }

    @Test
    public void GetListOfUsers() {
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("/api/v1/Users");
        Assert.assertEquals(response.getStatusCode(), 200);
    }
    @Test
    public void GetAuthorDetailsByUserID() {
        String userId = "1";
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("/api/v1/Users/" + userId);
        Assert.assertEquals(response.getStatusCode(), 200);
    }
    @Test
    public void CreateNewUser() {
        String requestBody = "{\"ID\": 101, \"UserName\": \"testUser\", \"Password\": \"password\"}";
        Response response = given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/api/v1/Users");
        Assert.assertEquals(response.getStatusCode(), 200);
    }
    @Test
    public void UpdateExistingUser() {
        String userId = "101";
        String updatedName = "updatedName";
        String requestBody = "{\"ID\": " + userId + ", \"UserName\": \"" + updatedName + "\", \"Password\": \"password\"}";
        Response response = given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .put("/api/v1/Users/" + userId);
        Assert.assertEquals(response.getStatusCode(), 200);
    }
    @Test
    public void DeleteAuthor() {
        String userId = "101";
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .delete("/api/v1/Users/" + userId);
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
