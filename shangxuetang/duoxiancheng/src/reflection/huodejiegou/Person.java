package reflection.huodejiegou;

/**
 * @author lizhenhong
 * @Description: 被获得相关结构的运行时类
 * @date 2020/5/16 14:52
 */
@MyAnnotation(value = "Person")
public class Person extends Creature<String> implements Comparable<String>, MyInterface {

    private String name;
    int age;
    public int id;

    public Person() {
    }

    @MyAnnotation(value = "abc")
    private Person(String name) {
        this.name = name;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @MyAnnotation
    private String show(String nation) {
        System.out.println("这里是Person1类的show()方法，入参:" + nation);
        return nation;
    }

    public String display(String interest, int age) throws NullPointerException, ClassCastException {
        return interest + age;
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }

    @Override
    public void info() {
        System.out.println("这里是实现的MyInterface的info()方法");
    }

    //调用静态方法的时候后加的
    private static void showDesc() {
        System.out.println("调用静态方法的时候后加的");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
