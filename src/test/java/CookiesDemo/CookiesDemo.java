package CookiesDemo;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.openqa.selenium.remote.Response;
import org.testng.annotations.Test;

public class CookiesDemo {



	@Test
	void testcookies()
	{
	
	 given()
	
	.when()
	   .get("https://www.google.com/")
	
	.then()
	
	    .cookie("AEC","AVYB7cop8tqvX9j6LxqVbcHhz5Zd66iHw-g8KZ001hjsGvHfyfeRdsjhTuo")
         .log().all();
}
}

