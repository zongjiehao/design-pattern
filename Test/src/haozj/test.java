package haozj;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class test {
    public static void main(String[] args) throws Exception{
        Class clazz = Class.forName("haozj.Reflect");
        Reflect reflect = (Reflect) clazz.newInstance();
        reflect.say();
        Constructor c = clazz.getConstructor(int.class);
        Reflect reflect1 = (Reflect) c.newInstance(5);
        Method adds = clazz.getMethod("add",int.class,int.class);
        Method add2 = clazz.getDeclaredMethod("add1", int.class, int.class);
        //add2.setAccessible(true);
        int sum = (int) adds.invoke(reflect1,4,5);
        int sum2 = (int) add2.invoke(reflect1,45,5);
        System.out.println("sum:"+sum);
        System.out.println("sum2:"+sum2);
        System.out.println(reflect1.getAge());
        Constructor c1 = clazz.getDeclaredConstructor(int.class,String.class);
        c1.setAccessible(true);
        Reflect reflect2 = (Reflect) c1.newInstance(3,"郝宗杰");
        System.out.println(reflect2.getAge()+" "+reflect2.getName());
        Constructor c2 = clazz.getDeclaredConstructor(int.class);
        Reflect reflect13 = (Reflect) c2.newInstance(54);
        System.out.println(reflect13.getAge());
        Constructor [] c4 = clazz.getConstructors();
        System.out.println("c4:"+c4.length);
        Constructor [] c5 = clazz.getDeclaredConstructors();
        System.out.println("c5:"+c5.length);


        Field sex = clazz.getDeclaredField("sex");
        sex.setAccessible(true);
        sex.set(reflect1,5656);
                System.out.println("sex:"+sex.get(reflect1));
                Day day = Day.MONDAY;
        System.out.println(day);

    }


}
enum Day{
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}