package pageObject;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
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
}
