package CreationalPattern.SingletonPattern;

/**
 * Description:
 * 在多线程中使用单例模式是，如果实例为空，可能存在两个线程同时调用getInstance方法的情况
 * 第一个线程会首先使用该方法创建实例，同时第二个线程也会检查这个实例是否为空，由于第一个线程需要进行实例化操作，第二个线程也有可能同时进行实例化操作
 * @date:2022/03/26 18:21
 * @author: lyf
 */
public class SynchronizedSingleton {

    private static SynchronizedSingleton instance;

    private SynchronizedSingleton() {
        System.out.println("Singleton is instantiated.");
    }

    /**
     * 方法1：对于实例化的方法添加synchronized关键字以确保线程安全
     * @return
     */
    public static synchronized SynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }

    /**
     * 方法2：为一个对象提供同步锁
     * @return
     */
    public static SynchronizedSingleton getInstance2() {
        synchronized (SynchronizedSingleton.class) {
            if (instance == null) {
                instance = new SynchronizedSingleton();
            }
            return instance;
        }
    }

    /**
     * 方法3：方法1和方法2虽然可以保证线程安全，但是synchronized控制的代码块在同一时刻只能被一个线程执行
     * 应当在单例实例已经被创建了，那么任何线程都能用非同步的方式获取当前实例
     * 只有在单例对象未实例化的情况下，才能在synchronized代码块前面添加附加条件移动线程安全锁
     * @return
     */
    public static SynchronizedSingleton getInstance3() {
        if (instance == null) {
            synchronized (SynchronizedSingleton.class) {
                if (instance == null) {  // 确保检查实例化
                    instance = new SynchronizedSingleton();
                }
            }
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Something is Done.");
    }

    public void doSomething2() {
        System.out.println("Something is Done 2.");
    }

}
