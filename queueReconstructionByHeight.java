/**
 * Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers (h, k),
 *  where h is the height of the person and k is the number of people in front of this person who have a height 
 * greater than or equal to h. Write an algorithm to reconstruct the queue.
 * Input:
[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]

Output:
[[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
 */

public class queueReconstructionByHeight {
 
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new compare());
        
   List<int[]> res = new ArrayList<>(6);
        
        for(int[] p : people){
            res.add(p[1], p);
        }
        int n = people.length;      
       return res.toArray(new int[n][2]);
      //  return people;
    }
}

class compare implements Comparator<int[]> 
{

    public int compare(int[] a, int[] b)
    {
     if(a[0] == b[0])
     return a[1]-b[1];
     else
     return b[0]- a[0];
    }

}