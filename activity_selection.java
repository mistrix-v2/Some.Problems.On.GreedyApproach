import java.util.*;
public class activity_selection {
    public static void main(String[] args) {
        int start[]={0,1,1,3,0,5,8,5};
        int end[]  ={1,1,2,4,6,7,9,9};
        int activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        Arrays.sort(activities, (a, b) -> Integer.compare(a[2], b[2]));
        int max=1; 
        ArrayList<Integer> ans=new ArrayList<>();
        
        ans.add(activities[0][0]);
        int last=activities[0][2];
        for(int i=1;i<end.length;i++){
            if(activities[i][1]>=last){
                max++;
                ans.add(activities[i][0]);
                last=activities[i][2];
            }
        }
        System.out.println(max);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i));
        }
    }
}
