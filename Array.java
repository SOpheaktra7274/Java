package main;
import java.util.Scanner;
public class Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input array element: "); int n = sc.nextInt();
        float[] a = new float[n];
        System.out.println("<< input >>");
        Input(a,n);
        System.out.println("<< output >>");
        Output(a,n);
        System.out.println("\n<< after sort >>");
        Sort(a,n); Output(a,n);
        System.out.println("\n<< search >>");
        Search(a,n);
        System.out.println("<< update >>");
        Update(a,n); Output(a,n);
        System.out.println("\n<< delete >>");
        Delete(a,n); Output(a,n);
        
    }
    
    //all array function
    static void Input(float a[],int n){
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"] = "); a[i] = sc.nextFloat();
        }
    }
    static void Output(float a[],int n){
        int i;
        for(i=0;i<n;i++){
            System.out.print("a["+i+"]="+a[i]+", ");
        }
        System.out.print("\b");
        
    }
    static void Sort(float a[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                float tmp;
                if(a[i]>a[j]){
                    tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }
    }
    static void Search(float a[],int n){
        int i=0;
        float search;
        boolean found=false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Search: "); search = sc.nextFloat();
        while(i<n){
            if(search == a[i]){
                System.out.println("Found: " + search);
                found = true;
                break;
            }
            i++;
        }
        if (!found) {
        System.out.println("Not found");
    }
    }
    
    static void Update(float a[],int n){
        int i=0;
        float search;
        boolean found=false,update=false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Search: "); search = sc.nextFloat();
        while(i<n){
            if(search == a[i]){
                found = true;
                System.out.print("Do you want to update?(Y/N):"); char answer = sc.next().charAt(0);
                if(answer == 'y' || answer == 'Y'){
                    System.out.print("Enter new value: ");
                    float newValue = sc.nextFloat();
                    a[i] = newValue;
                    System.out.println("Value updated successfully");
                    update=true;
                    break;
                }
                if(answer == 'n' || answer == 'N'){
                    System.out.println("Update cancelled");
                    break;
                }
            }
            i++;
        }
        if (!found) {
             System.out.println("Not found");
        }
        if (!update) {
             System.out.println("Update failed");
        }
    }
    
    static void Delete(float a[],int n){
        int i=0;
        float search;
        boolean found=false,delete=false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Search: "); search = sc.nextFloat();
        while(i<n){
            if(search == a[i]){
                found = true;
                System.out.print("Do you want to delete?(Y/N):"); char answer = sc.next().charAt(0);
                if(answer == 'y' || answer == 'Y'){
                    a[i]=0;
                    System.out.println("Value deleted successfully");
                    delete=true;
                    break;
                }
                if(answer == 'n' || answer == 'N'){
                    System.out.println("Deleted cancelled");
                    break;
                }
            }
            i++;
        }
        if (!found) {
             System.out.println("Not found");
        }
        if (!delete) {
             System.out.println("Update failed");
        }
    }
}