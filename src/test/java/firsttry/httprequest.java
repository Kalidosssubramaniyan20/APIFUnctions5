package firsttry;

import jdk.internal.org.jline.terminal.TerminalBuilder;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class httprequest {
	@Test
	void getUser()
	{
	 given()
	 
	 .when()
	        .get("https://reqres.in/api/users?page=2")
	 
	 .then()
	        .statusCode(200)
	        .body("page",equalTo(2))
	        .log().all();
	}
	System.out.Println("This is get request");
	
	}


