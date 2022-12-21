public class Calculator {
    public int add(int... arr){
        int sum=0;
        for(int num : arr){
            sum+=num;
        }
        return sum;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public long multiply(int... arr){
        long res=1;
        for(int num : arr){
            res*=num;
        }
        return res;
    }
    public int div(int a, int b){
        return a/b;
    }
}
