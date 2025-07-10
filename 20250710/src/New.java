/*class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int i = 0, j = 0;

        StringBuilder ans = new StringBuilder();
        while (i < m || j < n) {
            if (i < m) {
                ans.append(word1.charAt(i));
                ++i;
            }
            if (j < n) {
                ans.append(word2.charAt(j));
                ++j;
            }
        }
        return ans.toString();
    }
}*/

import java.sql.SQLOutput;

public class New {
    public static void main(String[] args) {
       /* Solution solution = new Solution();
        System.out.println(solution.mergeAlternately("abc","pqr"));
        System.out.println(solution.mergeAlternately("ab","pqrs"));
        System.out.println(solution.mergeAlternately("abcd","pq"));*/
        //System.out.println("Hello,World!");
      /*  int a = 10;//将10 赋值给整型变量a
        double b = 3.14;//将3.14赋值给浮点型变量b
        String name = "Alice";//将Alice赋值给字符串变量name

        int sum = a + 5;//整形变量a+5后赋值给整形变量sum
        double area = b * a * a;//b*a*a赋值给浮点型变量area
        System.out.println("Name： " + name);//输出字符串变量name的值
        System.out.println("Sum： " + sum);//输出整型变量Sum的值
        System.out.println("Area of circle: " + area);//输出浮点型变量area的值*/
        //定义年龄的变量
        /*int age =17 ;

        //用if语句判断年龄是否大于18岁
        if(age >=18){
            System.out.println("You are an adult. "); //条件成立执行
        }else{
            System.out.println("You are a minor. "); //条件不成立执行
        }*/
        //使用for循环判断i的大小,小于5时自增1，然后赋值给整形变量b
        /*for(int i = 1;i <= 5;i++){
            int b = i;
            System.out.println("count : " + b);
        }
        //定义两个整形变量，给其中一个变量值初始化。
        int sum = 0 ;
        int j = 1 ;
        //进入while循环判断变量j是否小于等于10，小于等于10 时进入循环
        while(j <= 10){
            System.out.println("loop : " + j);
            sum += j;//sum = sum + j
            j++;//j 自增 1
//            System.out.println("loop : " + j);
            System.out.println("Sum of 1 to 10: " + sum);
        }*/
        //通过索引遍历数组
        int[] numbers = {1,2,3,4,5};
        //进入for循环初始化一个整形变量，判断条件是这个整形变量是否小于这个数组的长度//通过索引遍历数组
        for(int i = 0;i < numbers.length; i++){
            //输出下标为i值的，数组中的值
            System.out.println("Element at index " + i + ":" + numbers[i]);
        }
        double total = 0;
        for(int num : numbers){
            total += num;//通过 total = total + num;来累加每个元素
        }
        double average = total / numbers.length;//计算平均值
        System.out.println("Average: " + average);//输出计算的平均值
    }
}
