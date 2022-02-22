package sideproject.sideproject;

import java.util.Date;

public class CustomChild {
	private Date date;
	private int number;

	public CustomChild(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "CustomChild [date=" + date + ", number=" + number + "]";
	}

}
