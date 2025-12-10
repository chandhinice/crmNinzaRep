package sample.crud.withBDD;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class SampleTestForBDDSmallUpdateTest {
	@Test
	public void patchDataForServerwithBDD()
	{
		JSONObject jsonobj=new JSONObject();
		jsonobj.put("projectName","Apple");
		jsonobj.put("createdBY", "TestEng");
		
		given()
		 .contentType(ContentType.JSON)
		 .body(jsonobj.toJSONString())
		  
		 .when()
		 .patch("http://49.249.28.218:8091/project/NH_PROJ_2047")
		 
		 .then().log().all()
		 .assertThat().statusCode(200);
	}
}
