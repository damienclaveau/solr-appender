package com.mzule.log.solr.appender;

import org.apache.log4j.spi.OptionHandler;

/**
 * <p>
 * Solr schema field mapping to log elements.
 * </p>
 * 
 * @author mzule
 * 
 */
public class Field implements OptionHandler {

	/**
	 * Level of log
	 */
	protected String level = "level";
	/**
	 * Message of log
	 */
	protected String message = "message";
	/**
	 * Exception class of log
	 */
	protected String exceptionClass = "exception_class";
	/**
	 * Stack trace of log
	 */
	protected String stacktrace = "stacktrace";
	/**
	 * Tag of log
	 */
	protected String tag = "tag";
	/**
	 * Thread of log
	 */
	protected String thread = "thread";
	/**
	 * Time stamp of log
	 */
	protected String timestamp = "timestamp";

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getExceptionClass() {
		return exceptionClass;
	}

	public void setExceptionClass(String exceptionClass) {
		this.exceptionClass = exceptionClass;
	}

	public String getStacktrace() {
		return stacktrace;
	}

	public void setStacktrace(String stacktrace) {
		this.stacktrace = stacktrace;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getThread() {
		return thread;
	}

	public void setThread(String thread) {
		this.thread = thread;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public void activateOptions() {

	}

}