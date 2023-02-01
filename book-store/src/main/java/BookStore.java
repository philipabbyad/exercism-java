import java.util.List;

public class BookStore {

    public BookStore() {

    }

    public int calculateBasketCost(List<Integer> bookList) {
        int cost = 0;
        List<Integer> booksRemainingToCheckout = bookList;

            while (booksRemainingToCheckout.size() > 0) {
                int uniqueBookCount = 0;
                if (booksRemainingToCheckout.contains(1)) {
                    booksRemainingToCheckout.remove(1);
                    uniqueBookCount++;
                }
                if (booksRemainingToCheckout.contains(2)) {
                    booksRemainingToCheckout.remove(2);
                    uniqueBookCount++;
                }
                if (booksRemainingToCheckout.contains(3)) {
                    booksRemainingToCheckout.remove(3);
                    uniqueBookCount++;
                }
                if (booksRemainingToCheckout.contains(4)) {
                    booksRemainingToCheckout.remove(4);
                    uniqueBookCount++;
                }
                if (booksRemainingToCheckout.contains(5)) {
                    booksRemainingToCheckout.remove(5);
                    uniqueBookCount++;
                }
            }

        return cost;
    }

}