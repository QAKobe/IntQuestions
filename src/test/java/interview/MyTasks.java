package interview;

public class MyTasks {

   static int solution(int [] A){
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < A.length; i++) {
            if (ans > A[i]){
                ans = A[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {

       int array [] = {-2,2,3,5,1,6,-3};
      int newArray = MyTasks.solution(array);
        System.out.println(newArray);

    }


}
