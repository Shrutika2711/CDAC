package com.assignment5;

class Logger{
	private static Logger instance;
	
	private StringBuilder logMessage;
	private Logger() {
		logMessage = new StringBuilder();
	}
	static {
		instance = new Logger();
	}
	public static Logger getInstance() {
		return instance;
	}
	public void log(String message) {
		logMessage.append(message).append("\n");
	}
	public String getLog() {
		return logMessage.toString();
	}
	public void clearLog() {
		logMessage.setLength(0);
		
	}
}


