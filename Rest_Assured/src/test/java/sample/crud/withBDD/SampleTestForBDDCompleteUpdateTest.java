package sample.crud.withBDD;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class SampleTestForBDDCompleteUpdateTest {
	@Test
	public void putDataFromServerwithBDD()
	{
		JSONObject jsonobj=new JSONObject();
		jsonobj.put("projectName", "Apple_01");

	
		 given()
		  .contentType(ContentType.JSON)
		  .body(jsonobj.toJSONString())
		  
		 .when()
		 	.put("http://49.249.28.218:8091/project/NH_PROJ_2047")
		 
		 .then()
		 	.log().all()
		 	.assertThat().statusCode(200);



	}





}
