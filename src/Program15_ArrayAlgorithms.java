import java.util.Arrays;
public class Program15_ArrayAlgorithms {
    public static void main(String[] args){
        int[] data = {45,12,78,34,89,23,56,67,11,90};
        System.out.println("Input Array: " + Arrays.toString(data));
        System.out.println();

        //ALGORITHm-1 :-Find Maximum

        System.out.println("======ALGORITHM 1:-Find Maximum======");
        int max = data[0];
        for(int i = 0;i<data.length;i++){
            if(max < data[i]){
                max = data[i];
            }
        }
        System.out.println("Maximum: " + max);

        //ALGORITHM-2 :-FIND MINIMUM
        System.out.println("====Algorithm-2 :-Find Minimum");
        int min = data[0];
        for(int i = 0;i<data.length;i++){
            if(min>data[i]){
                min = data[i];
            }
        }
        System.out.println("Minimum: " + min);

        //Algorithm-3 :-Sum and Average
        System.out.println("====Algorithm-3 :-Find Minimum====");
        int sum = data[0];
        double average;
        for(int i = 0;i<data.length;i++){
            sum+=data[i];
        }
        average =(double) sum / data.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        //ALGORITHM 4:-REVERSE AN ARRAY
        System.out.println("====Algorithm-4 :-Reverse of an array====");
        int[] arr ={1,2,3,4,5,6,7};
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reverse of an array: "+Arrays.toString(arr));

        //Algorithm 5:-Linear Search
        System.out.println("====Algorithm-5 :-Linear Search====");
        int[] searchData = {45,12,78,34,89,23,56,67,11,90};
        int target = 89;
        int foundTarget = -1;
        for(int i = 0 ;i<searchData.length;i++) {
            if (searchData[i] == target) {
                foundTarget = i;
                break;

            }

        }
        if (foundTarget != -1) {
            System.out.println("Found " + target + " at index " + foundTarget);
        } else {
            System.out.println(target + " not found in array");
        }

        // Test with a value that doesn't exist
        int missing = 100;
        int missingIndex = -1;
        for (int i = 0; i < searchData.length; i++) {
            if (searchData[i] == missing) {
                missingIndex = i;
                break;
            }
        }
        System.out.println(missing + (missingIndex != -1
                ? " found at index " + missingIndex
                : " not found in array"));
        // =============================================
        // BONUS: COUNT OCCURRENCES
        // =============================================
        System.out.println("\n=== BONUS: COUNT OCCURRENCES ===");
        int[] grades = {85, 92, 78, 85, 90, 78, 85, 88, 78, 92};
        int searchScore = 85;
        int count = 0;

        for (int grade : grades) {
            if (grade == searchScore) {
                count++;
            }
        }
        System.out.println("Score " + searchScore + " appears " + count + " times in: "
                + Arrays.toString(grades));

        // =============================================
        // BONUS: ARRAYS.SORT() — BUILT-IN SORTING
        // =============================================
        System.out.println("\n=== BUILT-IN SORT ===");
        int[] unsorted = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Before sort: " + Arrays.toString(unsorted));
        Arrays.sort(unsorted);  // sorts in-place, ascending order
        System.out.println("After sort:  " + Arrays.toString(unsorted));

        // Sort descending — requires Integer[] (object array), not int[]
        Integer[] descData = {64, 34, 25, 12, 22, 11, 90};
        Arrays.sort(descData, (a, b) -> b - a);  // lambda comparator — descending
        System.out.println("Descending:  " + Arrays.toString(descData));

    }




}
