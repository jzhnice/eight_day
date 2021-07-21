/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-21 11:21
 */
/**
 *
 * 一、设计类，其实就是设计类的成员
 *
 * 属性 = 成员变量 = field = 域、字段
 * 方法 = 成员方法 = 函数 = method
 *
 * 创建类的对象  = 类的实例化 = 实例化类
 *
 * 二、类和对象的使用（面向对象思想落地的实现）
 *  1.创建类，设计类的成员
 *  2.创建类的对象
 *
 *  3。通过“对象。属性”或“对象。方法”调用对象的结构
 * 三、如果常见了一个类的多个对象，则每个对象都独立的拥有一整套的属性。（非static）
 *      意味着：如果我们修改一个对象的属性a，则不影响另外一个对象属性a的值
 * 四。内存解析
 *
 * */
public class PersonTest {
    public static void main(String[] args) {
        // 创建Person类的对象
        //2.创建类的对象
        Person p1 = new Person();
        //调用对象的结构： 属性、方法
        //调用属性：“对象.属性”
        //3。通过“对象。属性”或“对象。方法”调用对象的结构
        p1.name = "tom";
        p1.isMalened = true;
        System.out.println(p1.name);

        // 调用方法：“对象。方法”
        p1.eat();
        p1.sleep();
        p1.talk("chinese");


        Person p2 = new Person();
        System.out.println(p2.name);
        System.out.println(p2.isMalened);



//        将p1变量保存的对象地址值赋给p3，导致p1和p3指向堆空间中的同一个对象实体
        Person p3 = p1;
        System.out.println(p3.name);

        p3.age = 10;
        System.out.println(p1.age);

    }




}
// 1.创建类，设计类的成员
class Person{
    // 属性
    String name;
    int age = 1;
    boolean isMalened;

    // 方法
    public void eat(){
        System.out.println("人可以吃饭");
    }
    public void sleep(){
        System.out.println("人可以睡觉");
    }public void talk(String language){
        System.out.println("人可以说话,使用的是:" + language);
    }

}
