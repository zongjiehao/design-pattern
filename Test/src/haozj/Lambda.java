package haozj;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda {
    public static void main(String[] args) {
//        String[] array = {"a", "b", "c"};
//        for(Integer i : Lists.newArrayList(1,2,3)){
//            Stream.of(array).map(item -> Strings.padEnd(item, i, '@')).forEach(System.out::println);
//            System.out.println(i);
//        }
//        String[] array = {"a", "b", "c"};
//        for(int i = 1; i < 4; i++){
//            Stream.of(array).map(item ->
//                    //这里编译报错
//                    Strings.padEnd(item, i, '@')).forEach(System.out::println);
//        }
//        List<String> names = Lists.newArrayList("hao","zong","jie",null);
//        System.out.println(names.stream().filter(num -> num != null).filter(num -> num.equals("hao")).count());
//        Stream.iterate(2,item -> item + 1).limit(10).forEach(System.out::println);
        List<Integer> nums = Lists.newArrayList(1,1,null,2,3,4,null,5,6,7,8,9,10);
        System.out.println("sum is:"+nums.stream().filter(num -> num != null).
                distinct().mapToInt(num -> num * 2).
                peek(System.out::println).skip(2).limit(4).sum());//.skip(2).limit(4).sum());
        Stream.of(2,4,6,9).peek(e -> System.out.println("Filtered value: " + e)).skip(2).limit(2).count();
        //2 4 6 8 10 12 14 16 18 20
//        String poetry = "Where, before me, are the ages that have gone?\n" +
//                "And where, behind me, are the coming generations?\n" +
//                "I think of heaven and earth, without limit, without end,\n" +
//                "And I am all alone and my tears fall down.";
//        Stream<String> lines = Arrays.stream(poetry.split("\n"));
//        Stream<String> words = lines.flatMap(line -> Arrays.stream(line.split(" ")));
//        List<String> list = words.map(w -> {
//            if (w.endsWith(",") || w.endsWith("?") || w.endsWith(".")) {
//                return w.substring(0,w.length()-1).trim().toUpperCase();
//            }else {
//                return  w.trim().toUpperCase();
//            }
//        }).distinct().sorted().collect(Collectors.toList());
//        System.out.println(list);
//        lines.forEach(System.out::println);

   }

}
