package de.hdm.wim.sharedLib.events;

import de.hdm.wim.sharedLib.Constants.PubSub.AttributeKey;
import de.hdm.wim.sharedLib.Constants.PubSub.EventType;

/**
 * The type User left session event.
 *
 * @author Gezim Krasniqi
 * @see <a href="https://github.com/Purii/hdm-wim-devlab/blob/master/docs/Events.md#userleftsessionevent">UserLeftSessionEvent</a>
 */
public class UserLeftSessionEvent extends IEvent {

	/**
	 * Instantiates a new User left session event.
	 */
	public UserLeftSessionEvent(){
		this.attributes.put(AttributeKey.EVENT_TYPE, EventType.USER_LEFT_SESSION);
	}

	/**
	 * Get user id string.
	 *
	 * @return the string
	 */
	public String getUserId(){
		return this.attributes.get(AttributeKey.USER_ID).toString();
	}

	/**
	 * Set user id.
	 *
	 * @param userId the user id
	 */
	public void setUserId(String userId){
		this.attributes.put(AttributeKey.USER_ID, userId);
	}

	/**
	 * Get session id string.
	 *
	 * @return the string
	 */
	public String getSessionId(){
		return this.attributes.get(AttributeKey.SESSION_ID).toString();
	}

	/**
	 * Set session id.
	 *
	 * @param sessionId the session id
	 */
	public void setSessionId(String sessionId){
		this.attributes.put(AttributeKey.SESSION_ID, sessionId);
	}



}
