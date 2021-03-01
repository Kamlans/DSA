package DivideAndConquer;

public class BinarySearch {

    public  int BinarySearch( int[] arr , int num){

        int low = 0 ;
        int high = arr.length;
        int mid = low + ( high - low )/2;

        while (low <= high){

            if (arr[mid] ==  num) return  mid;
            else if(arr[mid] < num) high = mid-1;
            else low = mid+1;
        }

        return -1;
    }
}
