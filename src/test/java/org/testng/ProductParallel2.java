package org.testng;

import org.allpojo.Pojo3;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.utilities.LibGlobal;

public class ProductParallel2 extends LibGlobal {

	

	@Test

	private void tc11productSearch() {

		Pojo3 l = new Pojo3();
		
		launchUrl("https://www.woolworths.com.au/");
		
		maxWindow();
		
		toImplicitWait(20);

		WebElement txtbox = l.getTxtbox();

		fillTextBox(txtbox, "Apple");

		WebElement search = l.getSearch();

		toClick(search);

		toImplicitWait(20);

		WebElement txtapple = l.getTxtapple();

		toClick(txtapple);

		toImplicitWait(20);

		WebElement addcart = l.getAddcart();

		toClick(addcart);
		
		closeBrowser();

		long id = Thread.currentThread().getId();
		System.out.println("TC11:" + id);

	}

	@Test

	private void tc22() {

		System.out.println("TC22:" + Thread.currentThread().getId());

	}

	@Test

	private void tc33AddCart() {

		System.out.println("TC33:" + Thread.currentThread().getId());

	}


}
