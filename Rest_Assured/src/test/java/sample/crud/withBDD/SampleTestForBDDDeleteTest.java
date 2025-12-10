package sample.crud.withBDD;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class SampleTestForBDDDeleteTest {
	@Test
	public void DeleteDataFromServerwithBDD()
	{
		
		given()
		 .contentType(ContentType.JSON)
		 
		  
		 .when()
		 .delete("http://49.249.28.218:8091/project/NH_PROJ_2047")
		 
		 .then().log().all()
		 .assertThat().statusCode(204);
	}

}
