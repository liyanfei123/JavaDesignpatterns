package CreationalPattern.SingletonPattern;

/**
 * Description:
 * 无锁的线程安全单例模式
 * 通过在声明时直接实例化静态成员的方式来保证一个类只有一个实例
 * @date:2022/03/26 18:34
 * @author: lyf
 */
public class LockFreeSingleton {

    private static final LockFreeSingleton instance = new LockFreeSingleton();

    private LockFreeSingleton() {
        System.out.println("Singleton is instantiated.");
    }

    private static synchronized LockFreeSingleton getInstance() {
        return instance;
    }

    public void doSomething() {
        System.out.println("Something is Done.");
    }

}
