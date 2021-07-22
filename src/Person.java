/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-22 18:28
 */
public class Person {
    String name;
    int age;
    int sex;

    public  void study(){
        System.out.println("studying");
    }
    public void showAge() {
        System.out.println("age" + age);
    }

    public int addAge(int i) {
        age += i;
        return age;
    }
}
