package Sorting;

public class Bubblesort {
  static  void sort(int a[]){
         for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1;){
                if(a[j] > a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
                j++;
               
            }
            
        }
        for(int arr:a){
            System.out.println(arr);
        }
        
        
    }
    public static void main(String[] args) {
        int a[]={2,5,8,7,3,20};

Bubblesort.sort(a);

    }
    
    
}
