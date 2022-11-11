package rest;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestPost 
{
	public static void main(String args[]) 
	{
		RestAssured.baseURI = "https://reqres.in";
		
		RequestSpecification request1 = RestAssured.given();
		
		
		
//		request1.header("Content-Type", "application/json");
		
//		JSONObject jo = new JSONObject();
//		
//		jo.put("name","kishore");
//		
//		jo.put("job","TeamLead");
//		
//		request1.body(jo.toJSONString());
		
//		Response resp = request1.put("/api/users/2");
		
//		Response resp = request1.post("/api/users");
		
		
		
//		System.out.println(resp.getBody().asString());
//		
//		System.out.println(resp.getStatusCode());
		
		
	}
	
}
