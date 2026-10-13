import java.util.*;
class ThreeSum19
 {

    static ArrayList<ArrayList<Integer>> a(int ar[], int n, int t) 
   {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n - 2; i++) {
            HashMap<Integer, Integer> h = new HashMap<>();
            for (int j = i + 1; j < n; j++) {
                int x = t - ar[i] - ar[j];
                if (h.containsKey(x)) {
                    ArrayList<Integer> tri = new ArrayList<>();
                    tri.add(i);
                    tri.add(h.get(x));
                    tri.add(j);
                    result.add(tri);
                }
                h.put(ar[j], j);
            }
        }

        return result;
     }
    public static void main(String[] args) 
   {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = s.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) ar[i] = s.nextInt();
        System.out.println("Enter target:");
        int t = s.nextInt();
        ArrayList<ArrayList<Integer>> result = a(ar, n, t);
        System.out.println(result);
    }
       
}