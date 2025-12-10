package sample.crud.withoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampletestForCreateTest {
   @Test

	public void  postdatatoServer() {
	   JSONObject jsonobj= new JSONObject();
	   jsonobj.put("createdBy", "TestENg");
	   jsonobj.put("status", "created");
	   jsonobj.put("projectName", "Fruit_01");
	   jsonobj.put("teamSize", 0);
	   
	   
	  RequestSpecification req = RestAssured.given();
	  req.contentType(ContentType.JSON);
	  req.body(jsonobj.toJSONString());
	  
	  Response res = req.post("http://49.249.28.218:8091/addProject");
	  res.then().log().all();
	  res.then().assertThat().statusCode(201);
		
	}
}
