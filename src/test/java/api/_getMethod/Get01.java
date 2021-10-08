package api._getMethod;

import api.baseurl.BaseUrl_HerOkuApp;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Get01 extends BaseUrl_HerOkuApp {

    /** ---> Test case:

     Given
        https://restful-booker.herokuapp.com/booking/1001
     When
        User send a GET Request to the url


     Then
                1) HTTP Status code should be 404
     And
                2) Status Line should be HTTP/1.1 404 Not Found
     And
                3) Response body contains "Not Found"
     And
                4) Response body does not contain "TechProEd"
     And
                5) Server is "Cowboy"
     */


    @Test
    public void test(){

        spec.pathParams("first","booking","second",1001);

        Response response = given().spec(spec).when().get("/{first}/{second}");
        response.prettyPrint();

        //assertion
        response.then().assertThat().statusCode(404).statusLine("HTTP/1.1 404 Not Found");

        Assert.assertTrue(response.asString().contains("Not Found"));

        Assert.assertFalse(response.asString().contains("TechProEd"));

        Assert.assertEquals("Cowboy",response.getHeader("Server"));













    }


}
