package homework17;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class SimpleCalculator {
    public int squareSum(int first, int second) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            return first * first;
        });
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> {
            return second * second;
        });
        return future.get() + future2.get();
    }

    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        try {
            System.out.println(simpleCalculator.squareSum(2, 4));
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
