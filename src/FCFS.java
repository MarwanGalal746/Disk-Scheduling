import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FCFS {
    public void exec(int head, ArrayList<Integer> requests){
        int tot=0;
        int temp=head;
        for(int i=0 ; i<requests.size();i++) {
            tot+=Math.abs(temp - requests.get(i));
            temp = requests.get(i);
        }
        System.out.print("sequence of head movement: ");
        System.out.print(head + " ");
        for(int i=0 ; i<requests.size();i++){
            System.out.print(requests.get(i) + " ");
        }
        System.out.println();
        System.out.print("total head movement: ");
        System.out.println(tot);
    }
}

/*8
98 183 37 122 14 124 65 67
53
correct output: 53 98 183 37 122 14 124 65 67
640*/
