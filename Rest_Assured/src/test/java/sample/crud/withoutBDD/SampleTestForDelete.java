package sample.crud.withoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleTestForDelete {
	@Test
	public void deleteDataFromServer()
	{
		RequestSpecification req = RestAssured.given();
		
		
		Response res = req.delete("http://49.249.28.218:8091/project/NH_PROJ_2013");
		res.then().log().all();
		res.then().assertThat().statusCode(204);
		
	}

}
