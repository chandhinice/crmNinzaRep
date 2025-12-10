package practice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleRequest {
	@Test

	public void sampleGetRequest()
	{
	     Response resp =RestAssured.get("https://reqres.in/api/users");
	     System.out.println(resp.prettyPrint());
	}

}
