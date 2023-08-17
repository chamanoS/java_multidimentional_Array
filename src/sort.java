public class sort {
    public static void main(String[] args) {
        int[] arr = {37, 12, 29, 17, 5, 23, 42};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length -1; j++) {
                
                if(arr[j] < arr[j +1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;

                }
            }
            
        }
        System.out.println("Sorted array in descending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
