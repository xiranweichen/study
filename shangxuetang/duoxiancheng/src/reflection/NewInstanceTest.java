package reflection;

import org.junit.Test;

/**
 * @author lizhenhong
 * @Description: 通过反射创建对应的运行时类的对象
 * @date 2020/5/10 20:22
 */
public class NewInstanceTest {

    @Test
    public void test() throws IllegalAccessException, InstantiationException {
        Class<Person> personClass = Person.class;
        /**
         * 调用newInstance()方法，创建对应的运行时类的对象(本质上调用的时空参的构造器)
         * 要想此方法能正常的创建运行时类的对象，需要满足以下条件：
         *      1. 运行时类必须有空参构造器
         *      2. 空参构造器的访问权限足够被这里的方法访问到(通常设置成public)
         *  在javaBean中要求提供一个public的空参构造器，原因：
         *      1. 便于通过反射创建运行时类的对象
         *      2. 便于子类继承此运行时类时，默认调用super()时，保证父类有此构造器。
         */
        Person person = personClass.newInstance();
        System.out.println(person);  //Person{name='null', age=0}
    }

}
