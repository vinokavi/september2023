package org.testng;

import org.allpojo.Pojo3;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.utilities.LibGlobal;

public class ProductParallel1 extends LibGlobal {

	

	@Test

	private void tc1productSearch() {

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
		System.out.println("TC1:" + id);

	}

	@Test

	private void tc2() {

		
		System.out.println("TC2:" + Thread.currentThread().getId());

	}

	@Test

	private void tc3() {

		
		System.out.println("TC3:" + Thread.currentThread().getId());

	}

}
