import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class BookStore {

    private static final HashMap<Integer, Double> DISCOUNT_RATES = new HashMap<>();

    static {
        // DISCOUNT_RATES.put(1, 1.00);
        // DISCOUNT_RATES.put(2, 0.95);
        // DISCOUNT_RATES.put(3, 0.90);
        // DISCOUNT_RATES.put(4, 0.80);
        // DISCOUNT_RATES.put(5, 0.75);
        DISCOUNT_RATES.put(1, 8.0000);
        DISCOUNT_RATES.put(2, 7.6000);
        DISCOUNT_RATES.put(3, 7.2000);
        DISCOUNT_RATES.put(4, 6.4000);
        DISCOUNT_RATES.put(5, 6.0000);
    }

    public BookStore() {

    }

    public double calculateBasketCost(List<Integer> bookList) {
        double cost = 0.0000;
        List<Integer> booksReaminingToCheckout = new ArrayList<>();
        for (Integer book : bookList) {
            booksReaminingToCheckout.add(book);
        }

            while (booksReaminingToCheckout.size() > 0) {
                double uniqueBookCount = 0.0000;
                if (booksReaminingToCheckout.contains(1)) {
                    booksReaminingToCheckout.remove(Integer.valueOf(1));
                    uniqueBookCount++;
                }
                if (booksReaminingToCheckout.contains(2)) {
                    booksReaminingToCheckout.remove(Integer.valueOf(2));
                    uniqueBookCount++;
                }
                if (booksReaminingToCheckout.contains(3)) {
                    booksReaminingToCheckout.remove(Integer.valueOf(3));
                    uniqueBookCount++;
                }
                if (booksReaminingToCheckout.contains(4)) {
                    booksReaminingToCheckout.remove(Integer.valueOf(4));
                    uniqueBookCount++;
                }
                if (booksReaminingToCheckout.contains(5)) {
                    booksReaminingToCheckout.remove(Integer.valueOf(5));
                    uniqueBookCount++;
                }
                // cost = cost + (uniqueBookCount * (8 * DISCOUNT_RATES.get(uniqueBookCount)));
                cost = cost + uniqueBookCount * DISCOUNT_RATES.get((int) uniqueBookCount);
            }
        return cost;
    }

    public static void main(String[] args) {
        BookStore test = new BookStore();
        // List<Integer> books = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 5, 1, 1, 2, 2, 3, 3, 4, 5);
        List<Integer> books = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 5);
        System.out.println(test.calculateBasketCost(books));
    }
}