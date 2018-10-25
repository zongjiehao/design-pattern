package haozj;

public class Reflect {
    private int age;
    private String name;
    private int sex =1;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Reflect(){}
    public Reflect(int age){
        this.age = age;
    }
    private Reflect(int age,String name){
        this.age = age;
        this.name = name;
    }
    public void say(){
        System.out.println("java反射机制");
    }
    public int add(int a, int b){
        return a+b;
    }
    public int add1(int a, int b){
        return a+b;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Reflect(int age, String name, int sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "age:"+age+"name:"+name+"sex:"+sex;
    }
}
