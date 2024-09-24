package PostRequst;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;

import groovy.transform.Undefined.EXCEPTION;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

@Test
public class PostRequstHashMap {
	//@SuppressWarnings("rawtypes")
	void PostusingHashMap()
	
	{
		
		HashMap data=new HashMap();
		
		data.put("name", "scott");
		data.put("location", "France");
		data.put("Phone", "123456");
		
		
		String coursesArr[]= {"c","c++"};
	
		data.put("courses", coursesArr);
	
		
		given()
		     
		    .contentType("application/json")
		    .body(data)
		.when()
		    .post("http://localhost:3000")
		    
		.then()
		     .statusCode(201)
		     .body("name",equalTo("scott"))
		     .body("location",equalTo("France"))
		     .body("Phonr",equalTo("123456"))
		     .body("courses[0]",equalTo("c"))
		     .body("courses[1]",equalTo("c++"))
		     .header("Content-Type","application/json:charset=utf-8")
		     .log().all();
		
		
    
		
	}
	
	
	

}
