public class BuilderDemo {

    public static void main(String[] args) {
        Summoner monkey = new Summoner.Builder().name("齐天大圣 - 孙悟空").type("上单 - AD").innate("基石天赋 - 战争雷霆").build();
        System.out.println(monkey.toString());

        Summoner mouse = new Summoner.Builder().name("瘟疫之源 - 图奇").type("下路 - ADC").innate("基石天赋 - 战阵热诚").build();
        System.out.println(mouse.toString());

        Summoner diann = new Summoner.Builder().name("皎月女神 - 戴安娜").type("中单 - AP").build();
        System.out.println(diann.toString());
    }
}