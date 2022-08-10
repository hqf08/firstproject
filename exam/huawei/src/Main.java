/**
 * @author hqf
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cityNum = sc.nextInt(),buildNum = sc.nextInt(),mustBuilderNum = sc.nextInt();
        int[] price_M = new int[cityNum];
        for(int i = 0;i<buildNum;i++){
            int city1 = sc.nextInt(),city2 = sc.nextInt(),price = sc.nextInt();
            price_M[i] = price;
            sc.nextLine();
        }
        for (int i = 0; i < mustBuilderNum; i++) {
            int city1 = sc.nextInt(),city2 = sc.nextInt();
        }
        Arrays.sort(price_M);
        int res = 0;
        for(int i = 0;i<cityNum-1;i++){
            res += price_M[i];
        }
        System.out.println(res);

    }
}
