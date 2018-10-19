package com.qa;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class manageUsers {
	
	@FindBy(xpath = "//*[@id=\"main-panel\"]/div[17]/a")
	private WebElement manageUsers;
	
	@FindBy(xpath = "//*[@id=\"j_username\"]")
	private WebElement userName;
	
	@FindBy(xpath = "/html/body/div/div/form/div[2]/input")
	private WebElement passWord;
	
	@FindBy(xpath = "/html/body/div/div/form/div[3]/input")
	private WebElement signIn;
	
	@FindBy(xpath ="//*[@id=\"tasks\"]/div[3]/a[2]")
	private WebElement createUser;
	
	@FindBy(xpath="//*[@id=\"main-panel\"]/form/h1")
	private WebElement confirmUserPage;
	
	@FindBy(name="username")
	private WebElement disUsername;
	
	@FindBy(xpath="//*[@id=\"yui-gen1-button\"]")
	private WebElement post;
	
	
	
	public void goToUsers() {
		manageUsers.click();
	}
	
	public void username(String text) {
		userName.sendKeys(text);
	}
	
	public void password(String text) {
		passWord.sendKeys(text);
	}
	
	public void signIn() {
		signIn.click();
	}
	
	public void createUser() {
		createUser.click();
	}
	
	public WebElement upConfirm() {
		return confirmUserPage;
	}
	
	public WebElement disUsername() {
		return disUsername;
	}
	
	public void postError() {
		post.click();
	}
	
			

}
