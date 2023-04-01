package pl.sda.pol141.day4.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println("Wątek " + Thread.currentThread().getName() + " " + i);
        }
    }
}

public class ExecutorsSingleThreadDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        System.out.println("Nazwa wątku głównego " + Thread.currentThread().getName());
        executorService.submit(new Task());
        executorService.submit(new Task());
        System.out.println("Uruchomiono task");
    }
}
