package com.studies.switchexample;

public class SwitchMain {

	private enum WEEK_DAY {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	};

	public static void main(String[] args) {
		System.out.println(checkWeekDayWithTraditionalSwitch(WEEK_DAY.FRIDAY));
		System.out.println(checkWeekDayWithTraditionalSwitch(WEEK_DAY.SUNDAY));
	}

	private static String checkWeekDayWithTraditionalSwitch(WEEK_DAY day) {
		switch (day) {
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
		case FRIDAY:
			return day + " is a week day.";
		case SATURDAY:
		case SUNDAY:
			return day + " is a weekend day.";
		default:
			return "Invalid day.";
		}
	}

}
