package patterns.structural.proxy;

public class TimetableElectricTrainsProxy implements TimetableTrains {
    private TimetableTrains timetableTrains = new TimetableElectricTrains();

    private String[] timetableCache = null;


    @Override
    public String[] getTimetable() {
        if (timetableCache == null) timetableCache = timetableTrains.getTimetable();
        return timetableCache;
    }

    @Override
    public String getTrainDepartureTime(String trainId) {
        if (timetableCache == null) {
            timetableCache = timetableTrains.getTimetable();
        }
        for (int i = 0; i < timetableCache.length; i++) {
            if (timetableCache[i].startsWith(trainId + ";")) return timetableCache[i];
        }
        return "";
    }

    public void clearCache() {
        timetableCache = null;
    }

}
