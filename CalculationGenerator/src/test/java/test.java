import jdk.jfr.StackTrace;
import org.junit.Test;

import java.io.FileSystem;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author lmc
 * @ClassName test
 * @date 25/9/2023
 */
public class test {
    //测试整体程序运行结果
    @Test
    public void all() throws IOException {

        String s = AlgoArithmetic.work(100, 10, "..\\..\\..\\Answers.txt" ,"..\\..\\..\\Exercises.txt");
        System.out.println(s);

    }

    //测试不同的表达式计算结果
    @Test
    public void calculate(){
        String re;
        //加法
        String f1 = "4 + 3 * 3/4";
        re = new AlgoCalculate(f1).result;
        System.out.println("加法："+re);

        //减法出现负数
        String f2 = "3 - 4";
        boolean ok = AlgoArithmetic.end(f2);
        if (!ok) System.out.println("结果为负数，请重新输入");

        //乘法
        String f3 = "6 * ( 1/3 * 6 )";
        re = new AlgoCalculate(f3).result;
        System.out.println("乘法："+re);

        //除法
        String f4 = "8/16 ÷ 6/10 ÷ 9/14 ÷ 9";
        re = new AlgoCalculate(f4).result;
        System.out.println("除法："+re);

        //除法分母为0，注：分母为0的条件下自定义结果为0，虽然可能是无穷大
        String f5 = "10 ÷ ( 5 - 5 )";
        re = new AlgoCalculate(f5).result;
        System.out.println("分母为0："+re);

    }

    //学生未完成作业
    @Test
    public void falseWork() throws IOException {
        AlgoArithmetic.check("..\\..\\..\\Exercises.txt","..\\..\\..\\Answers.txt","..\\..\\..\\Grade.txt");
    }
}
