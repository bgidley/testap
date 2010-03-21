package uk.co.gidley.test.pages;

import org.apache.tapestry5.annotations.Property;

/**
 * Created by IntelliJ IDEA. User: ben Date: Mar 21, 2010 Time: 7:53:28 AM
 */
public class PageWithAnError {

	@Property
	private String name;

	public void onActivate(){
		name = "Mr Blobby";
	}


}
