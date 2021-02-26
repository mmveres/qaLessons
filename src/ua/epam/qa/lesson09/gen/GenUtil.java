package ua.epam.qa.lesson09.gen;


public class GenUtil {
    static class TwoTuple<A, B> {
        public final A first;
        public final B second;

        public TwoTuple(A first, B second) {
            this.first = first;
            this.second = second;
        }
    }

    public static <T> TwoTuple<T, T> twice(T value) {
        return new TwoTuple<T, T>(value, value);
    }

    public static <T> T[] toArray(T... elements) {
        return elements;
    }

    public static void main(String[] args) {
        TwoTuple<Integer, Integer> tuple1 = twice(5);
        TwoTuple<String, String> tuple2 = GenUtil.<String>twice("five");
        Integer[] arr = toArray(1, 2, 3, 5);
        //Integer[] arr1 = toArray(1, 2, 3, "5");
        Object[] arr2 = toArray(1, 2, 3, "5");
    }
}
