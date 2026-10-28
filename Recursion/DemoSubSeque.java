import java.util.ArrayList;
import java.util.List;
class DemoSubSeque
{
    public void sequence(int[] a,int index,List<Integer>list)
    {
        if(index >= a.length)
        {
          System.out.println(list); // Take or not take all elements, then print the list.
           return;
        }

          list.add(a[index]); // Add the current element to the list.
          sequence(a, index + 1, list); // Take the current element and check the next element.

          list.remove(list.size() - 1); // Remove the last element to undo the previous choice.
          sequence(a, index + 1, list); // Do not take the current element and check the next element.
    }
    public static void main(String args[])
    {
        DemoSubSeque obj=new DemoSubSeque();
        int [] a={3,1,2};
        List<Integer> list=new ArrayList<>();
        obj.sequence(a,0,list);

    }   
}