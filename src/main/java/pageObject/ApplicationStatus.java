package pageObject;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import payload.Employee;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

public class ApplicationStatus {

	String baseUrl = "http://dummy.restapiexample.com/api/v1";
	String responseString;
	static Response res;

	public void getRequestForEmployee(String resourcePath) {

		try {
			String endpoint=baseUrl + resourcePath;
			res = SerenityRest.given().when().get(endpoint);

			responseString = res.asString();
			System.out.println(responseString);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public void verifyStatusCode() {
		
		assertEquals("Status Check Failed!", 300, res.getStatusCode());
		// res.then().statusCode(200);
	}
	
	public void postRequestForEmployee(String resourcePath) {

		try {
			Employee emp=new Employee("25","sk","2000","18","");
			String endpoint=baseUrl + resourcePath;
			
			res = SerenityRest.given().body(emp).when().post(endpoint);

			responseString = res.asString();
			System.out.println(responseString);
			
			System.out.println("Post Status code:-"+res.getStatusCode());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	

	public void verifyPOSTStatusCode() {
		
		assertEquals("Status Check Failed!", 200, res.getStatusCode());
		// res.then().statusCode(200);
	}
}
