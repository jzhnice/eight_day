/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-22 19:24
 */
import java.util.Scanner;
public class CircleTest {
    public static void main(String[] args) {

        Circle secn = new Circle();

        // 对应方式一
        Scanner re = new Scanner(System.in);
       double yu = re.nextDouble();
       secn.radius = yu;
//        double area = secn.findAres();
//        System.out.println(area);

        // 对应方式二
        secn.findAres();
    }
}
class Circle{
    //属性
    double radius;

    // 求圆的面积 方式一
//    public double findAres(){
//        double ares = Math.PI*radius*radius;
//        return ares;
//    }

//    方式二
public  void findAres(){
    double ares = Math.PI*radius*radius;
        System.out.println("面积为："+ares);
    }

}
