public class RecursionTest {
    //100以内的整数和
    public static void main(String[] args) {

        //方法一
        int sum=0;
        for (int i=1;i<=100;i++){
            sum += i;
        }
        System.out.println(sum);

        //方法二
        RecursionTest test = new RecursionTest();
        int sum1 = test.getSum(100);
        System.out.println(sum1);
    }

    //1 - n以内的整数和【例一】
    public int getSum(int n){
        if (n ==1){
            return 1;
        }else {
            return n + getSum(n - 1);
        }
    }

    //1 - n以内的乘积【例二】n!
    public int getSum1(int n){
        if (n ==1){
            return 1;
        }else {
            return n * getSum1(n - 1);
        }
    }
}
