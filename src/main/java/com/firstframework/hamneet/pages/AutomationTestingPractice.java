package com.firstframework.hamneet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;

import com.firstframework.hamneet.base.TestBase;

public class AutomationTestingPractice extends TestBase {
	public AutomationTestingPractice() {
		PageFactory.initElements(wd, this);
	}

	@BeforeMethod
	public void setUp() {
		intialisation();
	}

	@FindBy(css = "#name")
	private WebElement inputfirstNameTextfield;

	@FindBy(css = "#email")
	private WebElement inputemailTextfield;

	@FindBy(css = "#phone")
	private WebElement inputphoneTextfield;

	@FindBy(css = "#textarea")
	private WebElement inputtextareaTetxfield;

	@FindBy(xpath = "(//div[@class=\"form-check form-check-inline\"])[1]//child::input")
	private WebElement maleRadioBtn;

	@FindBy(xpath = "((//div[@class=\"form-group\"])[4]//child::div//child::input)[1]")
	private WebElement sunday;

	@FindBy(xpath = "((//div[@class=\"form-group\"])[4]//child::div//child::input)[2]")
	private WebElement monday;

	@FindBy(css = "#country")
	private WebElement selectCountry;

	@FindBy(css = "#country>option:nth-of-type(6)")
	private WebElement selectFrance;

	@FindBy(xpath = "//a[text()=\"orange HRM\"]")
	private WebElement orangeHRMLink;

	@FindBy(css = "#datepicker")
	private WebElement popPicker;

	@FindBy(css = "ui-datepicker-month")
	private WebElement pickMonth;

	@FindBy(css = "ui-datepicker-year")
	private WebElement pickYear;

	@FindBy(xpath = "//a[@data-handler=\"next\"]")
	private WebElement nextdateButton;

	@FindBy(css = "//td[@data-handler=\"selectDay\"]/a[text()=\"28\"]")
	private WebElement pickDate;
	
	@FindBy(css="#draggable")
	private WebElement drag;
	
	@FindBy(css="#droppable")
	private WebElement drop;

	private void enterName() {
		inputfirstNameTextfield.sendKeys("First User");
	}

	private void enterEmail() {
		inputemailTextfield.sendKeys("user123@gamil.com");
	}

	private void enterPhone() {
		inputphoneTextfield.sendKeys("1112223334");
	}

	private void enterAddress() {
		inputtextareaTetxfield.sendKeys("dil hai ke manta nahi");
	}

	private void selectRadioBtn() {
		maleRadioBtn.click();
	}

	private void selectDays() {
		sunday.click();
		monday.click();
	}

	private void selectStates() {
		try {
			Select sc = new Select(selectCountry);
			selectCountry.click();
			sc.selectByVisibleText("France");
		} catch (Exception e) {
			System.out.println("select nahi ho reha: " + e.getMessage());
		}
	}

	private OrangeHRM orangeHRMLinK() {
		orangeHRMLink.click();
		return new OrangeHRM();

	}

	public void popCalender() {
		popPicker.click();
	}

	public String selectMonth() {
		return pickMonth.getText();

	}

	public String selectYear() {
		return pickMonth.getText();

	}

	public void selectDate() {
		 pickDate.click();
	}

	public void clickonNextDateButton() {
		nextdateButton.click();
	}

//	public void dragElement() {
//		drag.click();
//		
//	}
//	public void DropElement() {
//		drop.click();
//	}
	public void selectDatefromCalender() {
		popCalender();
		//select month may
		//select year 2024
		while (!(selectMonth().equals("August") && selectYear().equals("2024"))) {
			clickonNextDateButton();
			selectMonth();
			selectYear();
		}
		clickonNextDateButton();
	}
	
	public void DragAndDrop() {
		Actions actions = new Actions(wd);
        actions.dragAndDrop(drag,drop).perform();
	}

	public OrangeHRM practicePortal() {
		enterName();
		enterEmail();
		enterPhone();
		enterAddress();
		selectRadioBtn();
		selectDays();
		selectStates();
		return orangeHRMLinK();
	}
}
