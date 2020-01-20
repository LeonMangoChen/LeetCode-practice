package mouse.january.weektwo;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * 如何通过一个给定的字节码路径，把相应的资源信息打印出来
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        // 返回提供该线程的应用类加载器
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        String resourceName = "mouse/january/weektwo/Test2.class";

        Enumeration<URL> urls = classLoader.getResources(resourceName);

        while (urls.hasMoreElements()){
            URL url = urls.nextElement();
            System.out.println(url);
        }

        System.out.println("--------------");

        Class<?> clazz = Test2.class;
        System.out.println(clazz.getClassLoader());

        System.out.println("---------");

        Class<?> clazz2 = String.class; //根类加载器加载rt.jar包中的类
        System.out.println(clazz2.getClassLoader());
    }
}
