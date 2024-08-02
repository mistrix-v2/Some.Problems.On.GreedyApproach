import java.util.Arrays;

public class min_abs_diff {
    public static void main(String[] args) {
        int a[]={2,1,3};
        int b[]={3,1,2};
        Arrays.sort(a);
        Arrays.sort(b);
        int mindiff=0;
        for(int i=0;i<a.length;i++){
            mindiff += Math.abs(a[i]-b[i]);
        }
        System.out.println(mindiff);
    }
}
