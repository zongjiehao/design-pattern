package lazy;

public class NotSharedObject {

    private static volatile int COUNTER = 0;
    private static final int MAX_LIMIT = 5;

    public static void main(String[] args) {
        new Thread(() -> {
            int localValue = COUNTER;
            while (localValue < MAX_LIMIT) {
                if (localValue != COUNTER) {
                    System.out.printf("[线程] - [%s] - [%d]\n", Thread.currentThread().getName(), COUNTER);
                    localValue = COUNTER;
                }
            }
        }, "READER").start();

        new Thread(() -> {
            int localValue = COUNTER;
            while (COUNTER < MAX_LIMIT) {
               // System.out.printf("[线程] - [%s] - [%d]\n", Thread.currentThread().getName(), ++localValue);
                ++localValue;
                COUNTER = localValue;
                System.out.printf("[线程] - [%s] - [%d]\n", Thread.currentThread().getName(), COUNTER);
            }
        }, "UPDATER").start();


    }
}
