package uk.co.gidley.test.components;

import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Zone;

public class PersonalArea {
	@Property
	@Persist
	private int clickCount;

	@InjectComponent
	private Zone counterZone;

	Object onActionFromClicker() {
		clickCount++;

		return counterZone.getBody();
	}
}
