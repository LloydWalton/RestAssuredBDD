import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetCallBDD {
	
	@Test
	public void firstRequest()
	{
		given().
		when().
		get("https://reqres.in/api/users?page=2").
		then().
		assertThat().
		body("page", equalTo(Integer.parseInt("2"))).
		and().
		body("per_page", equalTo(Integer.parseInt("6"))).
		and().
		body("total", equalTo(Integer.parseInt("12"))).
		and().
		body("total_pages", equalTo(Integer.parseInt("2"))).
		statusCode(200).and().body("data.id[1]", equalTo(Integer.parseInt("8")));
		
	}
	
	

}
