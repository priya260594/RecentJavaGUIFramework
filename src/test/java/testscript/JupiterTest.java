package testscript;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import ObjectRepositories.CartPage;
import ObjectRepositories.ContactPage;
import ObjectRepositories.ContactVerificationPage;
import ObjectRepositories.HomePage;
import ObjectRepositories.ShopPage;

@Listeners(GenericUtility.ListenerImpClass.class)
public class JupiterTest extends BaseClass {

	@Test
	public void onlySubmitBtn() throws Throwable {
		String errMsgTxt=eUtil.readDataFromExcel("Sheet1", 1, 0);
		String forename=eUtil.readDataFromExcel("Sheet1", 1, 1);
		String email=eUtil.readDataFromExcel("Sheet1", 1, 2);
		String message=eUtil.readDataFromExcel("Sheet1", 1, 3);
		
		HomePage hp = new HomePage(driver);
		hp.getContactBtn().click();
		ContactPage cp = new ContactPage(driver);
		cp.getsubmitBtn().click();
		ContactVerificationPage cvp = new ContactVerificationPage(driver);
		String actualTxt=cvp.geterrorTxt().getText();
		Assert.assertEquals(errMsgTxt, actualTxt);
		cp.fillMandatoryFields(forename,email,message);
		String displayedTxt=cvp.getconfirmedTxt().getText();
		Assert.assertNotEquals(actualTxt,displayedTxt);
		System.out.println("Valid");
	}

	@Test(retryAnalyzer = GenericUtility.RetryAnalyserClass.class)
	public void fillMandatoryFields() throws Throwable {
		
		String forename=eUtil.readDataFromExcel("Sheet1", 2, 1);
		String expTxt="Thanks "+forename+", we appreciate your feedback.";
		String email=eUtil.readDataFromExcel("Sheet1", 2, 2);
		String message=eUtil.readDataFromExcel("Sheet1", 2, 3);
		
		HomePage hp = new HomePage(driver);
		hp.getContactBtn().click();
		
		ContactPage cp = new ContactPage(driver);
		cp.fillMandatoryFields(forename, email, message);
		
		ContactVerificationPage cvp = new ContactVerificationPage(driver);
		String displayedTxt=cvp.getconfirmedTxt().getText();
		Assert.assertEquals(displayedTxt,expTxt);
		System.out.println("Message Verified");
	}
	
	@Test
	public void shopCart() throws Throwable{
		
		HomePage hp = new HomePage(driver);
		hp.getshopBtn().click();
		
		ShopPage sp=new ShopPage(driver);
		
		float actfrogPrice=Float.parseFloat(sp.getfrogPrice().getText().replace("$", ""));
		float actBunnyPrice=Float.parseFloat(sp.getbunnyPrice().getText().replace("$", ""));
		float actValentineBearPrice=Float.parseFloat(sp.getbearPrice().getText().replace("$", ""));
		sp.productToBuy();
		
		hp.getcartBtn().click();
		
		CartPage cp=new CartPage(driver);
		float displayedFrogPrice=Float.parseFloat(cp.getfrogProductPrice().getText().replace("$", ""));
		float displayedBunnyPrice=Float.parseFloat(cp.getbunnyProductPrice().getText().replace("$", ""));
		float displayedValentinePrice=Float.parseFloat(cp.getbearProductPrice().getText().replace("$", ""));
		
		//Each Price Verification
		Assert.assertEquals(actfrogPrice,displayedFrogPrice);
		System.out.println("Frog Price confirmed");
		Assert.assertEquals(actBunnyPrice,displayedBunnyPrice);
		System.out.println("Bunny Price confirmed");
		Assert.assertEquals(actValentineBearPrice,displayedValentinePrice);
		System.out.println("Valentine Price confirmed");
		System.out.println("=====================Each Price verified==============================");

		float FrogQuantityPrice=Float.parseFloat(fUtil.readDataFromPropertyFile("frogQty"));
		float bunnyQuantityPrice=Float.parseFloat(fUtil.readDataFromPropertyFile("bunnyQty"));
		float bearQuantityPrice=Float.parseFloat(fUtil.readDataFromPropertyFile("teddyQty"));
		float displayedFrogSubTotal=Float.parseFloat(cp.getfrogSubtotal().getText().replace("$", ""));
		float displayedBunnySubTotal=Float.parseFloat(cp.getbunnySubtotal().getText().replace("$", ""));
		float displayedBearSubTotal=Float.parseFloat(cp.getbearSubtotal().getText().replace("$", ""));
		
		//SubTotal verification
		float expectedFrogSubtotal=displayedFrogPrice*FrogQuantityPrice;
		float expectedBunnySubtotal=displayedBunnyPrice*bunnyQuantityPrice;
		float expectedBearSubtotal=displayedValentinePrice*bearQuantityPrice;
		
		Assert.assertEquals(wUtil.roundOfNumberMath(displayedFrogSubTotal),wUtil.roundOfNumberMath(expectedFrogSubtotal));
		System.out.println("First Subtotal verified");
		
		Assert.assertEquals(wUtil.roundOfNumberMath(displayedBunnySubTotal),wUtil.roundOfNumberMath(expectedBunnySubtotal));
		System.out.println("Second Subtotal verified");
		
		Assert.assertEquals(wUtil.roundOfNumberMath(displayedBearSubTotal),wUtil.roundOfNumberMath(expectedBearSubtotal));
		System.out.println("third Subtotal verified");
		System.out.println("=====================Each SubTotal verified==============================");
		
		//Total and subtotal verification
		
		float ExpectedTotal=wUtil.roundOfNumberMath(expectedFrogSubtotal+expectedBunnySubtotal+expectedBearSubtotal);
		float displayedTotal=Float.parseFloat(cp.getTotal().getText().replace("Total: ", ""));
		Assert.assertEquals(ExpectedTotal, displayedTotal);
		System.out.println("===========================Sub Total verified===========================");
		
		
		
		
		
		
	}
}
