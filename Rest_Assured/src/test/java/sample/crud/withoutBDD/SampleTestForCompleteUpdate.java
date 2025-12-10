package sample.crud.withoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleTestForCompleteUpdate {

	@Test
	public void putDataForserver()
	{
		JSONObject jsonobj=new JSONObject();
		jsonobj.put("projectName", "Apple");
		
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(jsonobj.toJSONString());
		Response res = req.put("http://49.249.28.218:8091/project/NH_PROJ_2013");
		res.then().log().all();
		res.then().assertThat().statusCode(200);
		
		
	}
}
