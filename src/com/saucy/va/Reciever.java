package com.saucy.va;

public class Reciever {
	
	private Twillio api;
	
	public Reciever() {
		api = new Twillio() {
			@Override
			public void recieveSms(String text) {
				Reciever.this.receiveSms(text);
			}
		};
	}
	
	/** This method represents the action that will be performed when
	 * a text message is received from anyone. */
	public void receiveSms(String text) {
		
	}
	
	
}