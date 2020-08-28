package by.htp.les004.datetime.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
	private int hours;
	private int minutes;
	private int seconds;

	public DateTime(int hours, int minutes, int seconds) {
		this.setHour(hours);
		this.setMinut(minutes);
		this.setSecond(seconds);
	}

	public void currentTime(int h, int m, int s) {

		SimpleDateFormat dateFormate = new SimpleDateFormat("HH.mm.ss");
		Date date = new Date();
		setHour(date.getHours() + h);
		setMinut(date.getMinutes() + m);
		setSecond(date.getSeconds() + s);

		System.out.println("current time: " + dateFormate.format(date));
		System.out.println("modified time: " + getHour() + "." + getMinut() + "." + getSecond());

	}

	public int getHour() {

		return hours;
	}

	public void setHour(int hours) {

		if (hours > 24 || hours < -1) {

			hours = 0;
		} else
			this.hours = hours;
	}

	public int getMinut() {
		return minutes;
	}

	public void setMinut(int minutes) {

		if (minutes > 60 || minutes < -1) {
			minutes = 0;
		} else
			this.minutes = minutes;
	}

	public int getSecond() {
		return seconds;
	}

	public void setSecond(int seconds) {
		if (seconds > 60 || seconds < -1) {
			seconds = 0;
		} else
			this.seconds = seconds;
	}

	@Override
	public String toString() {
		return "DateTime [hours=" + hours + ", minutes=" + minutes + ", seconds=" + seconds + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hours;
		result = prime * result + minutes;
		result = prime * result + seconds;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DateTime other = (DateTime) obj;
		if (hours != other.hours)
			return false;
		if (minutes != other.minutes)
			return false;
		if (seconds != other.seconds)
			return false;
		return true;
	}

}
