package tasks.the_run_time_counter;

public class Pig implements tasks.the_run_time_counter.Animal {
    @Override
    @LogExecution(message = "Dog spoke!")
    public void speak() {
        System.out.println("хрю!");
    }
    @LogExecution(message = "Run")
    public void run() {
        System.out.println("run");
    }
}
