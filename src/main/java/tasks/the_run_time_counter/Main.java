package tasks.the_run_time_counter;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Pig pig = new Pig();
        AnnotationProcessor.process(pig);
    }
}
