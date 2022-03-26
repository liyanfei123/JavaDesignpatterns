package CreationalPattern.SingletonPattern;

/**
 * Description:
 * 单例模式
 * 保证一个对象只能创建一个实例
 * 为确保单例实例的唯一性，所有的单例构造器都要被声明为私有的，再通过静态方法实现全局访问获得该单例实例
 * 按照实例对象被创建的时机，如果在应用开始时创建单例实例，就称作提前加载单例模式；如果在getInstance方法首次被调用时才调用单例构造器，则称作延迟加载单例模式
 * @date:2022/03/26 12:20
 * @author: lyf
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton is instantiated.");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Something is Done.");
    }

    public void doSomething2() {
        System.out.println("Something is Done 2.");
    }

    public static void main(String[] args) {
        Singleton.getInstance().doSomething();
        Singleton.getInstance().doSomething2();
    }
}
