package sideproject.sideproject;

import org.apache.commons.collections.map.LinkedMap;
import org.apache.commons.collections.map.MultiKeyMap;
import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {

	private Logger logger = Logger.getLogger(App.class);

	public static void main(String[] args) {
		App a = new App();
		a.proeces();
	}

	private void proeces() {
		MultiKeyMap prnMap = MultiKeyMap.decorate(new LinkedMap());

		prnMap.put("0", "1", "2");

		logger.debug(prnMap);

	}
}
