package SampleTest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class SampleTestForCreate {
	@Test
	public void postDataToServer() 
	{	 JSONObject Jsonobject=new JSONObject();
			
		
          RequestSpecification req = RestAssured.given();
          req.contentType(ContentType.JSON);
          req.body(Jsonobject);
          
	}

}
