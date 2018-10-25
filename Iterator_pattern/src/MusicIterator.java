public class MusicIterator<E> implements Iterator<E> {
    private E[] es;
    private int position = 0;

    public MusicIterator(E[] es) {
        this.es = es;
    }

    @Override
    public boolean hasNext() {
        return position != es.length;
    }

    @Override
    public E next() {
        E e = es[position];
        position+=1;
        return e;
    }
}
