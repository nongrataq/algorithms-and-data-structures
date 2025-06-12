package patterns.structural.proxy;

public class Main {
    public static DisplayTimetable displayTimetable = new DisplayTimetable();
    public static TimetableTrains timetableTrains = new TimetableElectricTrains();
    public static void main(String[] args) {
        displayTimetable.printTimetable();

    }
}
