package mouse.january.weektwo;

public class Test3 {
    public static void main(String[] args) {
        String[] strings = new String[2]; // 根类加载器
        System.out.println(strings.getClass());
        System.out.println(strings.getClass().getClassLoader());

        System.out.println("----------");

        Test3[] test3s = new Test3[2];
        System.out.println(test3s.getClass().getClassLoader());

        int[] ints = new int[2]; //原生类型没有类加载器
        System.out.println(ints.getClass().getClassLoader());
    }
}
