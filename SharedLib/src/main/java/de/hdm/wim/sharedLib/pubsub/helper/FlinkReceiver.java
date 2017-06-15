package de.hdm.wim.sharedLib.pubsub.helper;

import com.google.cloud.pubsub.spi.v1.AckReplyConsumer;
import com.google.cloud.pubsub.spi.v1.MessageReceiver;
import com.google.gson.Gson;
import com.google.pubsub.v1.PubsubMessage;
import org.apache.log4j.Logger;

/**
 * Created by ben on 13/06/2017.
 */
public class FlinkReceiver implements MessageReceiver {
	private static final Logger LOGGER 	= Logger.getLogger(FlinkReceiver.class);

	@Override
	public void receiveMessage(PubsubMessage message, AckReplyConsumer consumer) {
		// handle incoming message, then ack/nack the received message
		LOGGER.info("FlinkReceiver");

		LOGGER.info("Id : " 		+ message.getMessageId());
		LOGGER.info("Data : " 		+ message.getData().toStringUtf8());
		LOGGER.info("Attributes: "  + new Gson().toJson(message.getAttributesMap()).toString());

		consumer.ack();
	}
}
