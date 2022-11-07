package com.studies.switchexample;

public class SwitchMain {

	private enum WEEK_DAY {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	};

	public static void main(String[] args) {
		System.out.println(checkWeekDayWithTraditionalSwitch(WEEK_DAY.FRIDAY));
		System.out.println(checkWeekDayWithTraditionalSwitch(WEEK_DAY.SUNDAY));

		System.out.println(checkWeekDayWithJava12Switch(WEEK_DAY.TUESDAY));
		System.out.println(checkWeekDayWithJava12Switch(WEEK_DAY.SATURDAY));
	}

	private static String checkWeekDayWithJava12Switch(WEEK_DAY day) {
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

	private static String checkWeekDayWithTraditionalSwitch(WEEK_DAY day) {
		String output = "";
		return switch (day) {
		case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> output = day + " is a week day.";
		case SATURDAY, SUNDAY -> output = day + " is a weekend day.";
		default -> output = "Invalid day.";
		};
	}

}
