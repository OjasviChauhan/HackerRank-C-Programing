import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

            for(int i=0;i<n-1;i++){
                for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
                }
            }

        int r = sockMerchant(n,arr);
        System.out.println(r);
    }
    static int sockMerchant(int n,int arr[]){
        int i=0,count=0;
        for (i=0;i<n-1;i++){
            if (arr[i] == arr[i+1]){
                count++;
                i=i+1;
            }
        }
        return count;
    }
}
