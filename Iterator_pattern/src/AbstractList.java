public interface AbstractList<E> {
    void add(E e);
    Iterator<E> createIterator();
}
