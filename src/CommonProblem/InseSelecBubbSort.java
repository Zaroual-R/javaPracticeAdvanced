package CommonProblem;

public class InseSelecBubbSort {

    public static void main(String[] args) {
        int[] arr={1,2,4,5,3};
        int[] array=insertionSort(arr);
        for(int j:array){
            System.out.print(j+" ");
        }
    }


    public static int[] insertionSort(int[] array) {

        for(int i=1;i<array.length; i++){
            //we take the current value and move  it into some temporory storage
            int temp = array[i];
            //then we examin elements to the left
            int j=i-1;
            // if any element is greater than temp we shift it to the right
            while(j>=0 && array[j]>temp){
                array[j+1]=array[j];
                j--;
            }
            // if it is less than current element of < than 0 we stop
            //WE take the value in temp and place in stop index
            array[j+1]=temp;
        }
        return array;
    }

    // sort an array using selection sort with time comlexity =O(n2)
    //we iterate through our array and for each element we iterate for the next to the last
    // ech time we found an element that less than our element we swap the values
    // and continue this process until our array is sorted
    public static int[] selectionSort(int[] array) {
        int temp;
        for(int i=1;i<array.length;i++){
            for(int j=i+1; j<array.length;j++){
                if(array[j]<array[i]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }


    // bubble sort
    // BUUble sort iterate through array from second element to the befor brevious element and
    // and for ech iteration it used a nested loop to iterate another time our array from the firest ellement
    // to the element at n-1-i and compare the adjacent element if they are in order if they are not swaps them
    // with tha assistance of variable temp
    //and continur the same proccess until our array is sorted

    public static int[] bubbleSort(int[] arr){
        boolean swaped;
        int n=arr.length;

        for(int i=1;i<n-1;i++){
            swaped=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaped = true;
                }
            }
            if(!swaped){
                break;
            }
        }
        return arr;
    }
}
