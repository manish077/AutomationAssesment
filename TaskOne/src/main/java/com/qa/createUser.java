package com.qa;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class createUser {
	
	@FindBy(name="username")
	private WebElement userName;

	@FindBy(name="password1")
	private WebElement passWord1;
	
	@FindBy(name="password2")
	private WebElement passWord2;
	
	@FindBy(name="fullname")
	private WebElement fullName;
	
	@FindBy(name="email")
	private WebElement emailI;
	
	@FindBy(xpath="//*[@id=\"yui-gen1\"]/span")
	private WebElement createButton;
	
	@FindBy(xpath="//*[@id=\"people\"]/tbody/tr[1]/th[2]/a")
	private WebElement sortTable;
	
	@FindBy(xpath="//*[@id=\"people\"]/tbody/tr[2]/td[2]/a")
	private WebElement users;
	
	@FindBy(xpath="//*[@id=\"main-panel\"]/div[2]")
	private WebElement findUser;
	
	@FindBy(xpath="//*[@id=\"people\"]")
	private WebElement findPeople;
	
	
	
	public WebElement findPeople() {
		return findPeople;
	}
	
	public void username(String text) {
		userName.sendKeys(text);
	}
	
	public void password1(String text) {
		passWord1.sendKeys(text);
	}
	
	public void password2(String text) {
		passWord2.sendKeys(text);
	}
	
	public void fullname(String text) {
		fullName.sendKeys(text);
	}
	
	public void email(String text) {
		emailI.sendKeys(text);
	}
	
	public void createButton() {
		createButton.click();
	}
	
	public void sortTable() {
		sortTable.click();
	}
	
	public  WebElement users() {
		return users;
	}
	
	public void clickUser() {
		users.click();
	}
	
	public WebElement findUser() {
		return findUser;
	}
	
	
	
	
	
	

}
