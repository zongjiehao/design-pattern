public class Client {
    public static void main(String[] args) {
        AbstractList<String> list = new MusicList();
        list.add("my heart will go on");
        list.add("一百万个理由");
        list.add("res");
        Iterator<String> iterator = list.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
