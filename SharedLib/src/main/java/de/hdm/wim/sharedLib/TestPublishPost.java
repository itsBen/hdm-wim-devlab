package de.hdm.wim.sharedLib;

import de.hdm.wim.sharedLib.Constants.Topic;
import de.hdm.wim.sharedLib.classes.Message;
import de.hdm.wim.sharedLib.helper.PublishHelper;
import java.util.concurrent.TimeUnit;

/**
 * Created by ben on 5/06/2017.
 */
public class TestPublishPost {
	private static final long _messagePeriodSeconds = 1;

	public static void main(String[] args) throws Exception {
		int id 				= 0;
		PublishHelper ph 	= new PublishHelper();

		while (id <= 1) {
			Message message   = Message.generate("blubb_"+id, Topic.pushTest);

			ph.Publish(message);

			Thread.sleep(TimeUnit.SECONDS.toMillis(_messagePeriodSeconds));

			id++;
		}
	}
}
