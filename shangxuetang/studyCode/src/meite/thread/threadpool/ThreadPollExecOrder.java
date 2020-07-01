package meite.thread.threadpool;

import org.junit.Test;
import shangguigu.basic.duotai.Person;
import shangguigu.basic.reflection.exer.Student1;
import shangguigu.basic.reflection.exer.Student2;
import shangguigu.basic.reflection.exer.Student3;
import sun.nio.ch.ThreadPool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @description: 测试一下自定义线程池中核心线程、最大线程、阻塞队列中的线程的执行顺序
 * @date: 2020/7/1 13:44
 * @author: lizhenhong
 */
public class ThreadPollExecOrder {

    @Test
    public void test() {

        ThreadPoolExecutor executor = creatExecutor();
        executor.execute(new PersonList());
        executor.execute(new StudentList());
        executor.execute(new stuList());
        executor.execute(new Student());
//        executor.shutdown();
    }

    private ThreadPoolExecutor creatExecutor() {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1,
                4,
                0L,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingDeque<>(1),
                new ThreadPoolExecutor.AbortPolicy());
        return executor;
    }
    
}

class PersonList implements Runnable/*<List<Person>>*/ {

//    @Override
//    public List<Person> call() throws Exception {
//        Thread.sleep(1000);
//        System.out.println("=====>线程一PersonList线程开始执行");
//        List<Person> personList = new ArrayList<>();
//        Person p1 = new Person();
//        p1.setAge(1);
//        personList.add(p1);
//        return personList;
//    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("=====>线程一PersonList线程开始执行");
    }
}

class StudentList implements/* Callable<List<Student1>>*/ Runnable {

//    @Override
//    public List<Student1> call() throws Exception {
//        Thread.sleep(1000);
//        System.out.println("=====>线程二StudentList线程开始执行");
//        List<Student1> student1s = new ArrayList<>();
//        student1s.add(new Student1());
//        return student1s;
//    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("=====>线程二StudentList线程开始执行");
    }
}

class stuList implements /*Callable<List<Student2>>*/Runnable {

//    @Override
//    public List<Student2> call() throws Exception {
//        Thread.sleep(1000);
//        System.out.println("=====>线程三StudentList线程开始执行");
//        
//        return null;
//    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("=====>线程三StudentList线程开始执行");
    }
}

class Student implements /*Callable<Student3>*/Runnable {

//    @Override
//    public Student3 call() throws Exception {
//        Thread.sleep(1000);
//        System.out.println("=====>线程四Student线程开始执行");
//        return null;
//    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("=====>线程四Student线程开始执行");
    }
}