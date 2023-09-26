import javax.sound.midi.Soundbank;
import java.io.*;
import java.util.*;
/**
 * @author gpp
 * @ClassName AlgoArithmetic
 * @Description 四则运算题目生成器，
 *              1.真分数；
 *              2.运算符个数不超过3个；
 *              3.题目不能重复（理解起来有点问题）；
 *              4.生产题目文件存在当前目录下的Exercises.txt；
 *              5.计算出所有题目的答案并存到当前目录下的Answers.txt中；
 *              6.能够支持10000道题目的生成；
 *              7.判断答案的对错并进行数量统计
 *              8.运算结果不能是负数；
 *              9.除法的输出结果是真分数。
 * @param -n: the number of generating problems
 * @param -r: the range of value
 * @date 2023/9/25 9:35
 * @Version 1.0
 */
public class Arithmetic {
    //题目数
    private static int NUMBER_PROBLEMS = 0;
    //生成值范围
    private static int RANGEVALUE = 0;

    //每一道formula 中的运算符不能超过3个
    private static int OPERATORNUMBER = 3;

    //保存题目,即输出到题目文件
    public static List<String> FORMULA = new ArrayList<>();
    //输出到答案文件,key：result，value: formula
    public static Map<String,String> out = new HashMap<>();

    private static String[] BRACKETS = {"(",")"};

//     public AlgoArithmetic(int n, int r){
//         this.NUMBER_PROBLEMS = n;
//         this.RANGEVALUE = r;
//     }

    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        long end;
       // work(100, 10, "Answers.txt", "Exercises.txt");
        end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
