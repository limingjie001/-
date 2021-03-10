package cn.itcast.jvm.t1.stringtable;

/**
 * 演示字符串相关面试题
 */
public class Demo1_21 {

    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        String s3 = "a" + "b"; // ab   常量拼接，编译期完成
        String s4 = s1 + s2;   // new String("ab")  变量拼接，通过StringBuilder拼接，最后返回新的字符串，在堆中
        String s5 = "ab";   //ab已经有了，不再产生
        String s6 = s4.intern();   //ab已经有了，返回串池的对象（即s3）

// 问
        System.out.println(s3 == s4); // false
        System.out.println(s3 == s5); // true
        System.out.println(s3 == s6); // true

        String x2 = new String("c") + new String("d"); // new String("cd") 堆中
        x2.intern();
        String x1 = "cd";   //常量池中cd

// 问，如果调换了【最后两行代码】的位置呢，如果是jdk1.6呢
        System.out.println(x1 == x2);
    }
}
