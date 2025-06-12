package tasks.the_run_time_counter;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationProcessor {
    public static void process(Object obj) throws InvocationTargetException, IllegalAccessException {
        Class<?> clazz = obj.getClass();
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            method.setAccessible(true);
            if (method.isAnnotationPresent(LogExecution.class)) {
                LogExecution logExecution = method.getAnnotation(LogExecution.class);
                long start = System.nanoTime();
                method.invoke(obj);
                long end = System.nanoTime();
                System.out.println(logExecution.message() + " " + (end - start) + "ns");
            }
        }
    }
}
