public class test {
    public static void main(String[] args) {
        Day test1 = new Day("Wednesday", true);
        System.out.println(test1.alarm());

        Day test2 = new Day("Monday", true);
        System.out.println(test2.alarm());

        Day test3 = new Day("Monday", false);
        System.out.println(test3.alarm());

        Day test4 = new Day("Wednesday", false);
        System.out.println(test4.alarm());

        Day test5 = new Day("Saturday", true);
        System.out.println(test5.alarm());

        Day test6 = new Day("Saturday", false);
        System.out.println(test6.alarm());

        Day test7 = new Day("Friday", false);
        System.out.println(test7.alarm());

        Day test8 = new Day("Thursday", false);
        System.out.println(test8.alarm());

        Day test9 = new Day("Thursday", true);
        System.out.println(test9.alarm());
    }
}
