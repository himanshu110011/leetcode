import java.util.HashSet;

class Solution {
    public int removeDuplicates(int[] arr) {
        int k=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                arr[k]=arr[i];
                k++;
            }
        }
        return k;
    }
}
