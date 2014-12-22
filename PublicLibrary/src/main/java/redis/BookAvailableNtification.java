package redis;

public interface BookAvailableNtification {
	
	 void handleMessage(String message);

}
