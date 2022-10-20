import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        int arr[] = {1,2,5,2,2,5,4,4};
        int N = 8;


        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<N;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }else {
                hm.put(arr[i],1);
            }
        }
        for(int i=0;i<N;i++){
            arr[i] = N-hm.get(arr[i]);
        }


        for(int i=0;i<N;i++){
            System.out.println(arr[i]);
        }
    }
}
