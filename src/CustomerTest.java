/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-22 15:33
 */

/**
 * 类中方法的声明和使用
 *
 * 方法：描述类已更改具有的功能。
 * 比如：Math类，sqrt()\random \...
 * Scanner 类： nextxxx()...
 * Arrays类：sort() \ binarySearch() \ toString() \ equals() \ ..
 *
 *
 * 1.举例：
 *  public void eat(){}
 *  public void sleep(int sd){}
 *  public String getName() {}
 *  public String getNation(String nation){}
 *
 *
 *  2.方法的声明：
 *  权限修饰符 返回值类型 方法名（形参列表）{
 *      方法体
 *  }
 *  3、说明：
 *        3.1关于权限修饰符，默认方法的权限修饰符先使用public
 *          java 规定了四种权限修饰符：private、 public 、default、 protected
 *        3.2返回值类型。有返回值 VS没有返回值
 *          3.2.1 如果方法有返回值，则必须在方法声明时，指定返回值的类型，同时。方法中，需要使用
 *                 return 关键字来返回指定类型的变量或常量：“return 数据”
 *               如果方法没有返回值，则方法声明时，使用void来标识。通常，没有返回值的方法中，就不需要使用return
 *                  但是，如果使用的话，只能“return”表示结束此方法的意思。
 *          3.2.2 我们定义方法该不该有返回值？
 *                  ① 题目要求
 *                  ② 凭经验；具体问题具体分析
 *          3.3 方法名：属于标识符，遵循标识符的规则和规范，“见名知意”
            3.4 形参列表：方法可以声明0个，一个，或多个形参
                3.4.1 格式： 数据类型1 形参1 数据类型2 形参2。。。
                3.4.2 我们定义方法时，该不该定义形参
                    ① 题目要求
 *                  ② 凭经验；具体问题具体分析
 *          3.5 方法体：方法功能的实现
 *     4.return 关键字时使用
 *          1.使用范围：使用在方法体中
 *          2.作用：①结束方法
 *                 ② 针对有返回值类型的方法，使用“return 数据”方法返回所要的数据
 *          3、注意点：return关键字后面不可以声明执行语句
 *     5.方法的使用中：可以调用当前类中的属性或方法
 *              特殊的：方法A中又调用了方法A 这叫递归方法
 *              方法中不能定义方法
 *

 * */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.eat();
        customer.sleep(8);

    }


}
class Customer{
    String name;
    int age ;
    boolean isFlags;

    public void eat(){
        System.out.println("客户在睡觉");
    }
    public void sleep(int sd){
        System.out.println("客户睡了" + sd+"个小时");
    }
    public String getName() {
        return  name;
    }
    public String getNation(String nation) {
return "gh";
    }


}
