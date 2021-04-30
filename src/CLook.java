import java.util.ArrayList;
import java.util.Collections;

public class CLook {
    public static int position;

    public static void seekTime(ArrayList<Integer> seek,int headPosition)
    {
        int totalSeek = 0, tempPosition = 0;
        Collections.sort(seek);
        for(int i = 0; i < seek.size(); i++) {
            if(seek.get(i) > headPosition) {
                // get position to start execute
                tempPosition = i;
                break;
            }
        }

        position = tempPosition - 1;

        if(tempPosition > seek.size() || tempPosition < 0)
            return;

        // store first latency
        totalSeek += seek.get(tempPosition)-headPosition;
        System.out.print("Seek Sequence: ");
        for(int i = tempPosition; i < seek.size() -1; i++)
        {
            System.out.print(seek.get(i)+" ");
            totalSeek += (seek.get(i + 1)-seek.get(i));
        }

        //jump to first seek
        totalSeek += (seek.get(seek.size()-1)-seek.get(0));
        System.out.print(seek.get(seek.size()-1)+" "+seek.get(0)+" ");

        for(int i = 0; i < position; i++) {
            System.out.print(seek.get(i + 1)+" ");
            totalSeek +=  Math.abs(seek.get(i) - seek.get(i + 1));
        }

        System.out.print("\nTotal seek: "+totalSeek);
    }
}
/*
8

176 79 34 60 92 11 41 114

50
*/
