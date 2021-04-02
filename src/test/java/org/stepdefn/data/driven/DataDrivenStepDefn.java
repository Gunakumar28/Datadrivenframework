package org.stepdefn.data.driven;

import java.io.IOException;

import base.clas.LibGlobal;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.def.AdactinPomClas;

public class DataDrivenStepDefn extends LibGlobal {

	@Given("User is on adactin login page")
	public void user_is_on_adactin_login_page() {

	}

	@When("user should enter username and password by using datadriven")
	public void user_should_enter_username_and_password_by_using_datadriven() throws IOException {
		AdactinPomClas cls = new AdactinPomClas();
		sendKey(cls.getTxtusername(),DataDriven("D:\\photon eclipse\\UsingDatadrivenFrameWorkInAcdactinPage\\workbook\\DataDrivanDAY1.xlsx","LoginPage", 1, 0));
		sendKey(cls.getTxtPassword(),DataDriven("D:\\photon eclipse\\UsingDatadrivenFrameWorkInAcdactinPage\\workbook\\DataDrivanDAY1.xlsx","LoginPage", 1, 1));
	}

	@When("user should enter login button")
	public void user_should_enter_login_button() {
		AdactinPomClas cls = new AdactinPomClas();
		clickBtn(cls.getBtnLogin());
	}

	@Then("user should verify sucess message.")
	public void user_should_verify_sucess_message() {
		AdactinPomClas cls = new AdactinPomClas();
		String cureentUrl = cureentUrl();
		//VerifyAssert("https://adactinhotelapp.com/", cureentUrl);
	}

	@When("user is on the search hotel page")
	public void user_is_on_the_search_hotel_page() {
		}

	@When("user should enter valid credentials")
	public void user_should_enter_valid_credentials() throws IOException {
		AdactinPomClas cls = new AdactinPomClas();
		sendKey(cls.getTxtLocation(),DataDriven("D:\\photon eclipse\\UsingDatadrivenFrameWorkInAcdactinPage\\workbook\\DataDrivanDAY1.xlsx","HotelSerching", 1, 0));
		sendKey(cls.getTxtHotelName(),DataDriven("D:\\photon eclipse\\UsingDatadrivenFrameWorkInAcdactinPage\\workbook\\DataDrivanDAY1.xlsx","HotelSerching", 1, 1));
		sendKey(cls.getTxtRoomType(),DataDriven("D:\\photon eclipse\\UsingDatadrivenFrameWorkInAcdactinPage\\workbook\\DataDrivanDAY1.xlsx","HotelSerching", 1, 2));
		sendKey(cls.getTxtRoomNo(),DataDriven("D:\\photon eclipse\\UsingDatadrivenFrameWorkInAcdactinPage\\workbook\\DataDrivanDAY1.xlsx","HotelSerching", 1, 3));
		sendKey(cls.getTxtDatePick(),DataDriven("D:\\photon eclipse\\UsingDatadrivenFrameWorkInAcdactinPage\\workbook\\DataDrivanDAY1.xlsx","HotelSerching", 1, 4));
		sendKey(cls.getTxtDatePickOut(),DataDriven("D:\\photon eclipse\\UsingDatadrivenFrameWorkInAcdactinPage\\workbook\\DataDrivanDAY1.xlsx","HotelSerching", 1, 5));
		sendKey(cls.getTxtAdultRoom(),DataDriven("D:\\photon eclipse\\UsingDatadrivenFrameWorkInAcdactinPage\\workbook\\DataDrivanDAY1.xlsx","HotelSerching", 1, 6));
		sendKey(cls.getTxtChildRoom(),DataDriven("D:\\photon eclipse\\UsingDatadrivenFrameWorkInAcdactinPage\\workbook\\DataDrivanDAY1.xlsx","HotelSerching", 1, 7));

	}

	@When("user should click on search button")
	public void user_should_click_on_search_button() {
		AdactinPomClas cls = new AdactinPomClas();
		clickBtn(cls.getBtnSubmit());

	}

	@Then("user should verify succes message.")
	public void user_should_verify_succes_message() {
		String cureentUrl = cureentUrl();
		//VerifyAssert("https://adactinhotelapp.com/SelectHotel.php", cureentUrl);
	}

	@When("user should enter valid credentials by using datadriven")
	public void user_should_enter_valid_credentials_by_using_datadriven() throws IOException {
		AdactinPomClas cls = new AdactinPomClas();
		sendKey(cls.getTxtLocation(),DataDriven("D:\\photon eclipse\\UsingDatadrivenFrameWorkInAcdactinPage\\workbook\\DataDrivanDAY1.xlsx","HotelSerching", 1, 0));
		sendKey(cls.getTxtHotelName(),DataDriven("D:\\photon eclipse\\UsingDatadrivenFrameWorkInAcdactinPage\\workbook\\DataDrivanDAY1.xlsx","HotelSerching", 1, 1));
		sendKey(cls.getTxtRoomType(),DataDriven("D:\\photon eclipse\\UsingDatadrivenFrameWorkInAcdactinPage\\workbook\\DataDrivanDAY1.xlsx","HotelSerching", 1, 2));
		sendKey(cls.getTxtRoomNo(),DataDriven("D:\\photon eclipse\\UsingDatadrivenFrameWorkInAcdactinPage\\workbook\\DataDrivanDAY1.xlsx","HotelSerching", 1, 3));
		sendKey(cls.getTxtDatePick(),DataDriven("D:\\photon eclipse\\UsingDatadrivenFrameWorkInAcdactinPage\\workbook\\DataDrivanDAY1.xlsx","HotelSerching", 1, 4));
		sendKey(cls.getTxtDatePickOut(),DataDriven("D:\\photon eclipse\\UsingDatadrivenFrameWorkInAcdactinPage\\workbook\\DataDrivanDAY1.xlsx","HotelSerching", 1, 5));
		sendKey(cls.getTxtAdultRoom(),DataDriven("D:\\photon eclipse\\UsingDatadrivenFrameWorkInAcdactinPage\\workbook\\DataDrivanDAY1.xlsx","HotelSerching", 1, 6));
		sendKey(cls.getTxtChildRoom(),DataDriven("D:\\photon eclipse\\UsingDatadrivenFrameWorkInAcdactinPage\\workbook\\DataDrivanDAY1.xlsx","HotelSerching", 1, 7));


	}

	@When("user should click on radio button or hotel select button")
	public void user_should_click_on_radio_button_or_hotel_select_button() {
		AdactinPomClas cls = new AdactinPomClas();
		clickBtn(cls.getRdnBtn());
	}

	@When("user should click on continue button")
	public void user_should_click_on_continue_button() {
		AdactinPomClas cls = new AdactinPomClas();
		clickBtn(cls.getBtnContinue());
	}

	@Then("user verify the succes message and navigate to next page.")
	public void user_verify_the_succes_message_and_navigate_to_next_page() {
		AdactinPomClas cls = new AdactinPomClas();
		String cureentUrl = cureentUrl();
		//VerifyAssert("https://adactinhotelapp.com/BookHotel.php", cureentUrl);
	}

	@When("user should be enter firstname,Lastname,billing address,Creditcard number,Creditcard type,Expirydate,Cvv number by using Datadriven")
	public void user_should_be_enter_firstname_Lastname_billing_address_Creditcard_number_Creditcard_type_Expirydate_Cvv_number_by_using_Datadriven()
			throws IOException {
		AdactinPomClas cls = new AdactinPomClas();
		sendKey(cls.getTxtFirstname(),DataDriven("D:\\photon eclipse\\UsingDatadrivenFrameWorkInAcdactinPage\\workbook\\DataDrivanDAY1.xlsx","BookHotel", 1, 0));
		sendKey(cls.getTxtLastName(),DataDriven("D:\\photon eclipse\\UsingDatadrivenFrameWorkInAcdactinPage\\workbook\\DataDrivanDAY1.xlsx","BookHotel", 1, 1));
		sendKey(cls.getTxtAddress(),DataDriven("D:\\photon eclipse\\UsingDatadrivenFrameWorkInAcdactinPage\\workbook\\DataDrivanDAY1.xlsx","BookHotel", 1, 2));
		sendKey(cls.getTxtCcNum(),DataDriven("D:\\photon eclipse\\UsingDatadrivenFrameWorkInAcdactinPage\\workbook\\DataDrivanDAY1.xlsx","BookHotel", 1, 3));
		sendKey(cls.getTxtType(),DataDriven("D:\\photon eclipse\\UsingDatadrivenFrameWorkInAcdactinPage\\workbook\\DataDrivanDAY1.xlsx","BookHotel", 1, 4));
		sendKey(cls.getTxtMonth(),DataDriven("D:\\photon eclipse\\UsingDatadrivenFrameWorkInAcdactinPage\\workbook\\DataDrivanDAY1.xlsx","BookHotel", 1, 5));
		sendKey(cls.getTxtExpireYear(),DataDriven("D:\\photon eclipse\\UsingDatadrivenFrameWorkInAcdactinPage\\workbook\\DataDrivanDAY1.xlsx","BookHotel", 1, 6));
		sendKey(cls.getTxtCvvNumber(),DataDriven("D:\\photon eclipse\\UsingDatadrivenFrameWorkInAcdactinPage\\workbook\\DataDrivanDAY1.xlsx","BookHotel", 1, 7));
	}

	@Then("user should verify the sucess message.")
	public void user_should_verify_the_sucess_message() {
		String cureentUrl = cureentUrl();
		//VerifyAssert("https://adactinhotelapp.com/BookHotel.php", cureentUrl);
	}

}
