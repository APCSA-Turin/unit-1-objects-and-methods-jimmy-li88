public class Main {
    public static boolean check(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != -1){
                sum +=1;
            }
        }
        return sum == 1;
    }
    public static int method (int n){
        int[] myArr = new int[n];
        for (int i = 0; i < n; i++){
            myArr[i] = i + 1;
        }
        int pointer = 1;
        boolean switcher = true;
        while (!check(myArr)){
            if (myArr[pointer] != -1){
                if (switcher == true){
                    myArr[pointer] = -1;
                    switcher = false;
                }
                else{
                    switcher = true;
                }
            }
            pointer = (pointer + 1) % n;
        }
        for (int i = 0; i < myArr.length; i++){
            if (myArr[i] != -1){
                return myArr[i];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(method(24068));
    }
}