package sideproject.sideproject;

import java.util.Date;

import org.apache.commons.collections.map.LinkedMap;
import org.apache.commons.collections.map.MultiKeyMap;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

/**
 * Hello world!
 *
 */
public class App {

	private Logger logger = Logger.getLogger(App.class);

	private MultiKeyMap prnMap = MultiKeyMap.decorate(new LinkedMap());

	@Before
	public void setup() throws Exception{
		for (int i = 0; i < 5; i++) {
			prnMap.put(new Date(), String.valueOf(i), new CustomObject(i));
		}
	}

	@Test
	public void testLog() {
		logger.info("======== START testLog ========");
		try {
			logger.debug(prnMap);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		logger.info("=======================\n\n");

	}

	@Test
	public void testSystemOut() {
		logger.info("======== START testSystemOut ========");
		try {
			System.out.println(prnMap);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		logger.info("=======================\n\n");

	}
}
