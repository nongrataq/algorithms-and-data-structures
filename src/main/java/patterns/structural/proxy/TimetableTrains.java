package patterns.structural.proxy;

public interface TimetableTrains {
    String[] getTimetable();
    String getTrainDepartureTime(String trainId);
}
