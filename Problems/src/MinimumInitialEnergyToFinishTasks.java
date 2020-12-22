import java.util.Arrays;

public class MinimumInitialEnergyToFinishTasks {

    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,4},{10,11},{10,12},{8,9}};
        int res = minimumEffort(arr);
    }

    public static int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks, (t1, t2) -> {return (t2[1]-t2[0]) - (t1[1]-t1[0]);});
//         for(int[] task: tasks) {
//             System.out.println(Arrays.toString(task));

//         }
        int res = tasks[0][1];
        int enegyLeft = tasks[0][1] - tasks[0][0];
        for(int i=1; i<tasks.length; i++) {
            if(tasks[i][1] > enegyLeft) {
                res += tasks[i][1]-enegyLeft;
                enegyLeft = tasks[i][1] - tasks[i][0];
            } else {
                enegyLeft -= tasks[i][0];
            }
        }
        return res;
    }

}
