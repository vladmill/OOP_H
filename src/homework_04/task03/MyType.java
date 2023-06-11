package homework_04.task03;

public class MyType {
    <T extends Comparable<T>> T getMax(T o1, T o2) {
        int rc = o1.compareTo(o2);
        return (rc > 0)?o1:(rc < 0)?o2:o1;
    }
}
