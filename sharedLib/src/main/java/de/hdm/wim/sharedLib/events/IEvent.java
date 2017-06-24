package de.hdm.wim.sharedLib.events;

import com.google.gson.Gson;
import de.hdm.wim.sharedLib.Constants.PubSub.AttributeKey;
import de.hdm.wim.sharedLib.helper.Helper;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ben
 */
public abstract class IEvent {

	protected String data = "";
	protected String id = "";
	protected String publishTime = "";
	protected Map<String, String> attributes = new HashMap<String, String>();
	private Gson gson = new Gson();

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id= id;
	}

	public String getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}

	public String getEventType() {
		return attributes.get(AttributeKey.EVENT_TYPE).toString();
	}

	/*
	public void setEventType(String EventType){
		this.attributes.put(AttributeKey.EVENT_TYPE, EventType);
	}
	*/

	public String getEventSource() {
		return attributes.get(AttributeKey.EVENT_SOURCE).toString();
	}

	public void setEventSource(String EventSource) {
		this.attributes.put(AttributeKey.EVENT_SOURCE, EventSource);
	}

	public Map<String, String> getAttributes() {
		return this.attributes;
	}

	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}

	public void setAttributes(String attributes) {
		this.attributes = new Helper().convertJsonToMap(attributes);
	}

	public String getAttributesAsString() {
		return gson.toJson(this.attributes);
	}

	@Override
	public String toString() {
		return gson.toJson(this);
	}
}
