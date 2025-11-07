public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		int addHours = Integer.parseInt(args[1]) / 60;
		int addMins = Integer.parseInt(args[1]) % 60;

        int newHours = (hours + addHours + (minutes + addMins) / 60) % 24;
        int newMinutes = (minutes + addMins) % 60;

        Boolean isHoursLessThen10 = newHours < 10;
        Boolean isMinutesLessThen10 = newMinutes < 10;
		System.out.println(String.format("%s:%s",  isHoursLessThen10 ? "0" + newHours : newHours, isMinutesLessThen10 ? "0" + newMinutes : newMinutes));
    }
}
