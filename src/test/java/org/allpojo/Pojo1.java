package org.allpojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.LibGlobal;

public class Pojo1 extends LibGlobal {

	
	public Pojo1() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "wx-headerSearch")
	private WebElement txtbox;

	@FindBy(id = "wx-button-header-search-find")
	private WebElement search;

	public WebElement getTxtbox() {
		return txtbox;
	}

	public WebElement getSearch() {
		return search;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
