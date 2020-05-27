import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;


public class apitest {


    @Test (priority = 1)
    public static void rest() {
        //Get request with get//
      given().get("http://www.mocky.io/v2/5ebdc2473100004c00c5cd40").then().log().all();
    }

    @Test (priority = 2)
    public static void rest2() {
        //Get request with header//
        given().header("clientId" ,"215").get("http://localhost:8080/api/v1/").then().log().all();
    }

    @Test (priority = 3)
    public static void rest3(){
        //Get request with multiple header//
        given()
                .header("id", "110")
                .header("email", "arsal243@gmail.com")
                .get("http://www.mocky.io/v2/5ece8af03000005b00ea12f3").then().log().all();
    }

    @Test (priority = 4)
    public static void  rest4(){
        //Get request with expected with assertion statuscode //
        given()
                .header("id" , "110")
                .header("email" ,  "arsal243@gmail.com")
                .get("http://www.mocky.io/v2/5ece93c43000004f00ea1349").then().assertThat().statusCode(200).log().all();

    }

    @Test (priority = 5)
    public static void rest5(){
        //Get request with expected without assertion statuscode //
        given()
                .header("id" , "110")
                .header("email" , "admin@gmail.com")
                .get("http://www.mocky.io/v2/5ece93c43000004f00ea1349").then().statusCode(400).log().all();
    }
}
