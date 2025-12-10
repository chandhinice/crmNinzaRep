package sample.crud.withBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

public class SampleTestForBDDCreateTest {
	@Test
	public void PostDataForServerwithBDD()
	{
		JSONObject jsonobj= new JSONObject();
		   jsonobj.put("createdBy", "TestENg");
		   jsonobj.put("status", "created");
		   jsonobj.put("projectName", "Fruits_01");
		   jsonobj.put("teamSize", 0);
		   
		   
		  given()
		  .contentType(ContentType.JSON)
		  .body(jsonobj.toJSONString())
		  
		 .when()
		 	.post("http://49.249.28.218:8091/addProject")
		 
		 .then()
		 	.log().all()
		 	.assertThat().statusCode(201);
			
	}
}
