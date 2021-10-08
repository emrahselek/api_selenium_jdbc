package api._postMethod;

import api.baseurl.BaseUrl_HerOkuApp;
import api.myPojo.InnerPojo;
import api.myPojo.OuterPojo;
import org.junit.Test;

public class Post01 extends BaseUrl_HerOkuApp {

    /**

     Given
     https://restful-booker.herokuapp.com/booking
             {
                 "firstname": "Adil",
                 "lastname": "Demirleng",
                 "totalprice": 10000,
                 "depositpaid": true,
                 "bookingdates": {
                         "checkin": "2021-10-01",
                         "checkout": "2021-10-05"
                         }
                 "additionalneeds": "Dinner, smoothie"
             }
     When
        I send POST Request to the Url
     Then
         Status code is 200
     And
        response body should be like;
             {
                 "firstname": "Adil",
                 "lastname": "Demirleng",
                 "totalprice": 10000,
                 "depositpaid": true,
                 "bookingdates": {
                         "checkin": "2021-10-01",
                         "checkout": "2021-10-05"
                         },
                "additionalneeds": "Dinner, smoothie"
             }
     */


    @Test
    public void posttest(){

        //1.step: set the url
        spec.pathParam("first","booking");

        //2.step: expected data
        InnerPojo bookingdates = new InnerPojo("2021-10-01","2021-10-05");

        OuterPojo requestBody = new OuterPojo("Adil","Demirleng",10000,true,bookingdates,"Dinner, smoothie");

        System.out.println("requestBody :  " + requestBody);

        //---------------------









    }


}
