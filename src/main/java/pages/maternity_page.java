package pages;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class maternity_page extends StartupPage {
	
	public By getAnchorTagLocatorByText(String anchorTagName) {
		return null;
	}

	

	public maternity_page(WebDriver driver) {
		super(driver);
	}

	/**
	 * @Test1.1 about this method loginTohealthAppByGivenValidCredetial()
	 * 
	 * @param : Map<String, String>
	 * @description : fill usernameTextbox & passwordTextbox and click on sign in
	 *              button
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public boolean loginToHealthAppByGivenValidCredetial(Map<String, String> expectedData) throws Exception {
		return false;
	}

	/**
	 * @Test1.2 about this method scrollDownAndClickMaternityTab()
	 * 
	 * @param : null
	 * @description : verify the maternity tab, scroll to it, and click it
	 * @return : String
	 * @author : YAKSHA
	 */
	public boolean scrollDownAndClickMaternityTab() throws Exception {
		return false;
	}

	/**
	 * @Test1.3 about this method verifyMaternityPageUrl()
	 * 
	 * @param : null
	 * @description : verify maternity page url
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyMaternityPageUrl() throws Exception {
		return null;
	}

	/**
	 * @Test2 about this method clickMaternityArrowAndVerifySubModules()
	 * 
	 * @param : null
	 * @description : This method clicks on the maternity dropdown arrow and
	 *              verifies the visibility of its sub-modules such as "Maternity
	 *              List", "Payments", and "Reports".
	 * @return : boolean - Returns true if all sub-modules are visible, otherwise
	 *         false.
	 * @throws : Exception - if there is an issue interacting with the dropdown
	 *           arrow or verifying the sub-modules.
	 * @author : YAKSHA
	 */
	public boolean clickMaternityArrowAndVerifySubModules() throws Exception {
		return false;
	}

	/**
	 * @Test3 about this method verifyNavigationBetweenMaternitySubModules()
	 * 
	 * @param : null
	 * @description : This method verifies if the user is able to successfully
	 *              navigate between the "Payments", "Reports", and "Maternity List"
	 *              sub-tabs within the Maternity module.
	 * @return : boolean - Returns true if navigation between all sub-tabs is
	 *         successful, otherwise false.
	 * @throws : Exception - if there is an issue clicking the sub-tab or if the
	 *           expected URL is not found.
	 * @author : YAKSHA
	 */
	public boolean verifyNavigationBetweenMaternitySubModules() throws Exception {
		return false;
	}

	/**
	 * @Test4 about this method verifyMaternityComponentsAreVisible()
	 * @param : null
	 * @description : verifies all the components of maternity list submodule
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public boolean verifyMaternityComponentsAreVisible() throws Exception {

		return false;
	}

	/**
	 * @Test5 about this method editPatientInformationAndVerify()
	 * 
	 * @param : null
	 * @description : This method edits the patient's first name and husband's name,
	 *              and verifies that the updated husband's name is correctly
	 *              reflected in the patient details.
	 * @return : boolean - true if the patient's details are successfully updated
	 *         and verified, false otherwise.
	 * @throws : Exception - if there is an issue finding or updating the patient
	 *           details.
	 * @author : YAKSHA
	 */
	public boolean editPatientInformationAndVerify() throws Exception {
		return false;
	}

	/**
	 * @Test6.1 about this method verifyUrlContains()
	 * 
	 * @param buttonText : String - The partial url text to verify
	 * @description : This method checks whether the current URL contains the
	 *              specified text
	 * @return : boolean
	 * @throws : Exception - if there is an issue getting the URL
	 * @author : YAKSHA
	 */
	public boolean verifyUrlContains(String urlTextToVerify) throws Exception {
		return false;
	}

	/**
	 * @Test6.2 about this method applyDateFilter()
	 * 
	 * @param : String, String
	 * @description : Applies the date filter with date range
	 * @return : void
	 * @throws : Exception - if there is an issue finding or filling the date fields
	 * @author : YAKSHA
	 */
	public boolean applyDateFilter(String fromDate, String toDate) throws Exception {
		
		return false;
	}

	/**
	 * @Test7.1 about this method clickDateRangeDropdownAndSelect()
	 * 
	 * @param valueToSelect : String - Text of the value to select from the dropdown
	 * @description : This method clicks on the date range button and selects a
	 *              value by its text.
	 * @return : boolean - true if the intended value is successfully selected,
	 *         false if not.
	 * @throws : Exception - if there is an issue finding the dropdown or its
	 *           values.
	 * @author : YAKSHA
	 */
	public boolean clickDateRangeDropdownAndSelect(String valueToSelect) throws Exception {
		return false;
	}

	/**
	 * @Test6.3 @Test7.2 about this method verifyResultsAppointmentDateFallsWithin()
	 * 
	 * @param fromDate : String - The start date of the range in "dd-MM-yyyy"
	 *                 format.
	 * @param toDate   : String - The end date of the range in "dd-MM-yyyy" format.
	 * @description : This method applies the specified date range and verifies that
	 *              all appointment dates in the results fall within that range.
	 * @return : boolean - true if all dates are within the specified range, false
	 *         if any date is outside the range.
	 * @throws : Exception - if there is an issue finding the date range fields or
	 *           parsing the dates.
	 * @author : YAKSHA
	 */
	public boolean verifyResultsAppointmentDateFallsWithin(String fromDate, String toDate) throws Exception {
		return false;
	}

	/**
	 * @Test8 about this method verifyViewAllMaternityPatientCheckBoxFunctionality()
	 * 
	 * @param : null
	 * @description : Verifies the records count increases after clicking "View all
	 *              maternity patient" checkbox
	 * @return : boolean - true if the count increased and false if it didn't
	 *         increase
	 * @throws : Exception - if there is an issue finding or clicking the checkbox
	 * @author : YAKSHA
	 */
	public boolean verifyViewAllMaternityPatientCheckBoxFunctionality() throws Exception {
		return false;
	}

	/**
	 * @Test9 about this method searchAndVerifyKeywordInEveryResult()
	 * 
	 * @param keywordToVerify : String - The keyword to search for
	 * @description : This method searches with the provided keyword and verifies if
	 *              every row in the result contains at least one cell that includes
	 *              the keyword.
	 * @return : boolean - True if the keyword is found in every row, false
	 *         otherwise.
	 * @throws : Exception - if there is an issue filling the search bar or
	 *           verifying the rows.
	 * @author : YAKSHA
	 */
	public boolean searchAndVerifyKeywordInEveryResult(String keywordToVerify) throws Exception {
		return false;
	}

	/**
	 * @Test10 about this method verifyTooltipAndtext()
	 * 
	 * @param : null
	 * @description : This method verifies tooltip and the text after hovers
	 * @return : boolean - true if successfully hover and verify the text present
	 * @throws : Exception - if there is an issue while finding star tooltip
	 * @author : YAKSHA
	 * @return
	 */

	public String verifyToolTipText() throws Exception {
		return null;
	}

	/**
	 * @Test11 about this method verifyViewbuttonFunctionality()
	 * 
	 * @param null
	 * @description : This method verifies the functionality of the "View" button by
	 *              navigating to the Maternity List, selecting the last "View"
	 *              button, and updating the patient's husband name. It then checks
	 *              if the success message is displayed.
	 * @return : String - The success message if the update is successful.
	 * @throws : Exception - if there is an issue with viewing or updating the
	 *           patient details.
	 * @author : YAKSHA
	 */
	public String verifyViewbuttonFunctionality() throws Exception {
		return null;
	}

	/**
	 * @Test12 about this method verifyANCbuttonFunctionality()
	 * 
	 * @param null
	 * @description : This method verifies the functionality of the "ANC" button by
	 *              navigating to the Maternity List, selecting the last "ANC"
	 *              button, and updating the ANC details. It then checks if the
	 *              success message is displayed.
	 * @return : String - The success message if the update is successful.
	 * @throws : Exception - if there is an issue with viewing or updating the ANC
	 *           details.
	 * @author : YAKSHA
	 */
	public String verifyANCbuttonFunctionality() throws Exception {
		return null;	
	}

	/**
	 * @Test13 about this method verifyMatRegisterbuttonFunctionality()
	 * 
	 * @param null
	 * @description : This method verifies the functionality of the "Mat-Register"
	 *              button by navigating to the Maternity List, selecting the first
	 *              "..." button, and updating the maternity register details. It
	 *              then checks if the success message is displayed.
	 * @return : String - The success message if the update is successful.
	 * @throws : Exception - if there is an issue with viewing or updating the
	 *           maternity register details.
	 * @author : YAKSHA
	 */
	public String verifyMatRegisterbuttonFunctionality() throws Exception {
		return null;
	}

	/**
	 * @Test14 about this method verifyConcludeButtonFunctionality()
	 * 
	 * @param null
	 * @description : This method verifies the functionality of the "Conclude"
	 *              button by navigating to the Maternity List, selecting the first
	 *              "..." button, and concluding the maternity record. It then
	 *              checks if the success message is displayed.
	 * @return : String - The success message if the conclusion is successful.
	 * @throws : Exception - if there is an issue with concluding the maternity
	 *           record.
	 * @author : YAKSHA
	 */
	public String verifyConcludeButtonFunctionality() throws Exception {
		return null;
	}

	/**
	 * @Test15 about this method verifyMatRegisterbuttonFunctionality()
	 * 
	 * @param null
	 * @description : This method verifies the functionality of the "Mat-Register"
	 *              button by navigating to the Maternity List, selecting the first
	 *              "..." button, and updating the maternity register details. It
	 *              then checks if the success message is displayed.
	 * @return : String - The success message if the update is successful.
	 * @throws : Exception - if there is an issue with viewing or updating the
	 *           maternity register details.
	 * @author : YAKSHA
	 */
	public String verifyRemoveButtonFunctionality() throws Exception {

		return null;
	}

}
