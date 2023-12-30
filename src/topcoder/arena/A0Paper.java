package topcoder.arena;

public class A0Paper{
    public static String canBuild(int[] A){
        double runningSum = 0.0;
        for (int i = 0; i < A.length; i++) {
            runningSum += A[i] /Math.pow(2,i);
            System.out.println(runningSum);
        }
        if (runningSum >= 1.0) return "Possible";
        return "Impossible";
    }
}
