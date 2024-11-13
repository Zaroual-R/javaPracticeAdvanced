package CommonProblem;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,3};
        mergeSort(arr);
        for(int j:arr){
            System.out.print(j+" ");
        }

    }

    // merge sort is a dividing concurent algorithm
    //split our array in half and create two subarrays
    // firstly we have to divide our araay to two subarrays
    public static void mergeSort(int[] arr) {
        int length = arr.length;
        if(length<=1)
            return;// this the base case
        int leftSize = length / 2;
        int rightSize=length-leftSize;
        int[] leftArr = new int[leftSize];
        int[] rightArr = new int[rightSize];

        int i=0,j=0;
        for(;i<arr.length;i++){
            if(i<leftSize){
                leftArr[i]=arr[i];

            }
            else{
                arr[j]=arr[i];
                j++;
            }
        }
        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(leftArr,rightArr,arr);

    }

    public static void merge(int[] leftArr, int[] rightArr, int[] arr){
        int lenght = arr.length;
        int leftSize=leftArr.length;
        int rightSize=rightArr.length;
        // i is to keep tracking in the position of original array
        // l will be incharge for left array
        // r will be incharge for right arrray
        int i=0,l=0,r=0;
        while(l<leftSize && r<rightSize ){

            if(leftArr[l]<rightArr[r]){
                arr[i]=leftArr[l];
                l++;
                i++;
            }
            else{
                arr[i]=rightArr[r];
                r++;
                i++;
            }
        }
        while(l<leftSize){
            arr[i]=leftArr[l];
            l++;
            i++;
        }
        while(r<rightSize){
            arr[i]=rightArr[r];
            i++;
            r++;
        }
    }
}
