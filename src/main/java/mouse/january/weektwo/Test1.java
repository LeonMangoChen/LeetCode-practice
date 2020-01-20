package mouse.january.weektwo;

/**
 * 1.hotspot 根类加载器是null
 * 2.类加载器的层级关系： 根类加载器(bootstrapClassLoader)->扩展类加载器->系统类/应用类加载器->自定义加载器
 */

public class Test1 {

    public static void main(String[] args) {

        ClassLoader classLoader = ClassLoader.getSystemClassLoader();

//        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        System.out.println(classLoader);

        while (null != classLoader) {
            classLoader = classLoader.getParent();
            System.out.println(classLoader);
        }
    }
}
