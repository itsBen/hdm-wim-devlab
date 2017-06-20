package de.hdm.wim.sharedLib.events;

import de.hdm.wim.sharedLib.Constants.PubSub.AttributeKey;
import de.hdm.wim.sharedLib.Constants.PubSub.EventType;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by GezimKrasniqi on 20.06.17.
 */
public class UserContextEvent implements IEvent{
	private String data;
	private String id;
	private String publishTime;
	private Map<String, String> attributes = new HashMap<String, String>();


	// TODO: Update Event Type
	public UserContextEvent(){
		this.attributes.put(AttributeKey.EVENT_TYPE, EventType.USER_CONTEXT);
	}

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

	public String getUserName(){
		return this.attributes.get(AttributeKey.USER_ID).toString();
	}

	public void setUserName(String userName){
		this.attributes.put(AttributeKey.USER_ID, userName);
	}

	public String getProjectId(){
		return this.attributes.get(AttributeKey.PROJECT_ID).toString();
	}

	public void setProjectId(String projectId){
		this.attributes.put(AttributeKey.PROJECT_ID, projectId);
	}



}
