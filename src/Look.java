import java.util.ArrayList;
import java.util.Collections;

public class Look {
    public static int position;
    public static void seekTime(ArrayList<Integer> seek,int val)
    {
        int totalSeek =0,pos=0;
        Collections.sort(seek);
        for(int i=0; i<seek.size(); i++)
        {
            if(seek.get(i) > val)
            {
                pos = i;
                position=i;
                break;
            }
        }
        if(pos>seek.size() || pos < 0)
            return;
        totalSeek += seek.get(pos)-val;
        System.out.print("Seek Sequence: ");
        for(int i=pos; i<seek.size()-1; i++)
        {
            System.out.print(seek.get(i)+" ");
            totalSeek += (seek.get(i+1)-seek.get(i));
        }
        totalSeek += (seek.get(seek.size()-1)-seek.get(position-1));
        System.out.print(seek.get(seek.size()-1)+" "+seek.get(position-1)+" ");
        for(int i=position-1; i>0; i--) {
            System.out.print(seek.get(i-1)+" ");
            totalSeek += (seek.get(i) - seek.get(i - 1));
        }
        System.out.print("\nTotal seek: "+totalSeek);
    }
}