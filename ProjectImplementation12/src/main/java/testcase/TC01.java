package testcase;




import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.DP;
import wrappers.GenericWrappers;

public class TC01 extends GenericWrappers{
	@Test(dataProvider="fetchdata", dataProviderClass=DP.class)
	public void irctcSignUp(String uname, String pwd, String cpwd, String secans, String fname, String mname, String lname, String dob, String country, String mail, String mobile, String nation, String resadd1, String resadd2, String resad3, String resadd4, String resstae, String rescity, String respo, String phone ){
		invokeApp("chrome", "https://www.irctc.co.in/nget/train-search");		
		clickByLink("REGISTER");
		waitproperty(4000);
		enterById("userName", uname);
		enterById("usrPwd", pwd);
		enterById("cnfUsrPwd", cpwd);
		clickByXpath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[4]/div[2]/p-dropdown/div/label");
		waitproperty(3000);
		clickByXpath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[4]/div[2]/p-dropdown/div/div[4]/div/ul/li[3]");
		waitproperty(3000);
		enterByXpath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[4]/div[4]/input", secans);
		clickByXpath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[5]/div[2]/p-dropdown/div/label");
		waitproperty(3000);
		clickByXpath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[5]/div[2]/p-dropdown/div/div[4]/div/ul/li[1]/span");
		waitproperty(3000);
		enterById("firstName", fname);
		enterById("middleName", mname);
		enterById("lastname", lname);
		clickById("F");
		enterByXpath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[9]/div[2]/p-calendar/span/input", dob);
		waitproperty(3000);
		clickByXpath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[9]/div[4]/p-dropdown/div/label");
		waitproperty(3000);
		clickByXpath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[9]/div[4]/p-dropdown/div/div[4]/div/ul/li[4]/span");
		waitproperty(3000);
		clickByXpath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[10]/div[2]/label[1]/input");
		selectVisibileTextByxpath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[11]/div[2]/select", country);
		enterById("email", mail);
		enterById("mobile", mobile);
		selectVisibileTextByxpath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[12]/div[5]/select", nation);
		waitproperty(3000);
		enterByName("resAddress1", resadd1);
		enterByName("resAddress2", resadd2);
		enterByName("resAddress3", resad3);
		enterByName("resPinCode", resadd4);
		keyboadoperations("html/body", "tab");
		waitproperty(3000);
		verifyTextById("resState", resstae);
		keyboadoperations("html/body", "tab");
		selectVisibileTextByxpath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[16]/div[4]/select", rescity);
		waitproperty(3000);
		selectVisibileTextByxpath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[17]/div[2]/select", respo);
		waitproperty(3000);
		enterById("resPhone", phone);
		clickByXpath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[18]/div[2]/input");
		closeAllBrowsers();

}


}
