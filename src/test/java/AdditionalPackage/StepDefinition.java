package AdditionalPackage;
import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefinition {
	@Given("I want create an account")
	public void Createaccount() {
	   System.out.println("Create Account");

	}
	
	@When("I Enter my data")
	public void enteringdata(io.cucumber.datatable.DataTable dt) {
	 List<Map<String, String>>  list = dt.asMaps(String.class, String.class);
	 
	 for (int i =0; i< list.size(); i++) {

	System.out.println(list.get(i).get("name"));
	System.out.println(list.get(i).get("password"));
	}

	}
	}



