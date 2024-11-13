package CommonProblem;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr={9,7,6,5,4,2,10};
        quickSort(arr,0,arr.length-1);
        for(int j:arr){
            System.out.print(j+" ");
        }
    }

    // quick sort moves smaller elements the left of the pivot and recursively divide array into partition
    // the best case take o(n log(n) ) time complixity

    public static void quickSort(int [] arr, int start,int end){

        if(end<=start) return ;// base case

        int pivot=portion(arr,start,end);
        quickSort(arr,start,pivot-1);
        quickSort(arr,pivot+1,end);
    }

    private static int portion(int[] arr, int start, int end) {
        int pivot =arr[end];
        int i=start-1;
        for( int j =start;j<=end;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[end];
        arr[end]=temp;

        return i;
    }
}
