package testcases;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class TC003 extends GenericWrappers {
	@Test
	public void IrctcFTRSignup() {
		invokeApp("chrome", "https://www.ftr.irctc.co.in/ftr/");
		waitproperty(3000);
		clickByLink("New User? Signup");
		waitproperty(3000);
	}

}
