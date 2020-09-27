package com.saucy.va.commands;

import static com.saucy.va.Properties.*;

import java.util.Random;

public class ReminderCommand implements Command {
	
	private static final String[] selfHeads = {
		"Hey, just wanted to remind you",
		"Hi! Just texting you to remind you",
		"Hey, you wanted me to remind you",
		"Just wanted to remind you",
	};
	private static final String[] otherHeads = {
		"Hello! This is Jon's virtual assistant, " + NAME + ". He wanted me to text you to remind you",
	};
	
	private String message;
	private Random rand;
	
	public ReminderCommand(String content, boolean toSelf) {
		this.rand = new Random();
		this.message = chooseRandom(toSelf? selfHeads : otherHeads) + " " + content + ".";
	}
	
	public String getMessage() {
		return message;
	}
	
	private String chooseRandom(String[] array) {
		return array[rand.nextInt(array.length)];
	}
	
	
}
