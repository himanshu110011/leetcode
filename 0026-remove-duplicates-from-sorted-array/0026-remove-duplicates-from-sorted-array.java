import java.util.HashSet;

class Solution {
    public int removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }
}
