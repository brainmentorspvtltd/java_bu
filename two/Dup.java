import java.util.HashMap;

public class Dup {
    public static void main(String[] args) {
        HashMap<String, Integer> m = new HashMap<>();
        m.put("Amit",1111);
        System.out.println(m.get("Amit"));

       int arr[] = {1,2,3,4,7,1};
        //HashMap<Integer, Boolean> map = new HashMap<>();
        int map []= new int[100]; // fill with 0
        for(int ele : arr){
            if(map[ele]!=0){
                System.out.println("Boys Party");
                return ;
            }
            map[ele] = 1;
            // if(map.get(ele)!=null){
            //     System.out.println("Boys Party");
            //     return ;
            // }
            // map.put(ele, true);

        }
        System.out.println("Girls Party");

        //int temp [] ={22, 8, 35, 32, 31, 34, 10, 21, 31,5};
        // HashMap<String, Integer> map = new HashMap<>();
        // map.put("delhi",22);
        // map.put("pune",32);
        // map.put("mumbai",34);
        // int e = map.get("delhi");

        /*int arr[] = {1,2,3,4,7,1};
        for(int i = 0; i<arr.length; i++){
            for(int j = i + 1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println("Boys Party");
                    return ; // exit from the function
                }

            }
        }
        System.out.println("Girls Party");*/


    }
}
