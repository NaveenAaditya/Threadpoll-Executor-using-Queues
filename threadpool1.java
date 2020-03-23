import java.util.*;
import java.io.*;
import java.lang.*;
public class threadpool implements Runnable{
    static boolean exit;
    static ArrayList<Integer> arr;
    static ArrayList<String> str;
    public threadpool(ArrayList<Integer> arr,ArrayList<String> str){
        this.arr=arr;
        this.str=str;
    }
    public void run(){
        //ArrayList<String> arr=new ArrayList<String>();
        while(!exit){
        System.out.println("running");
        if(arr.get(0)==1){
            add();
        }
        if(arr.get(0)==2){
            subtract();
        }
        if(arr.get(0)==3){
            Multiplication();
        }
        if(arr.get(0)==4){
            Division();
        }
        dequeue();
        if(arr.size()==0){
            stop1();
        }
        }
        //System.out.println(arr);
        //stop1();
     
}
    public static void stop1(){
        exit = true;
    }
    public static void enqueue(int s){
        arr.add(s);
        
        //return arr;
        
    }
    public static void dequeue(){
        //str.remove(str.get(0));
        arr.remove(arr.get(0));
        //return arr;
        
    }
    public static void add(){
        int a=10;
        int b=5;
        int c=a+b;
        System.out.println("addition of "+a+" and "+b+"="+c);
    }
    public static void subtract(){
        int a=10;
        int b=5;
        int c=a-b;
        System.out.println("Subtraction of "+a+" and "+b+"="+c);
    }
    public static void Multiplication(){
        int a=10;
        int b=5;
        int c=a*b;
        System.out.println("Multiplication of "+a+" and "+b+"="+c);
    }
    public static void Division(){
        int a=10;
        int b=5;
        int c=a/b;
        System.out.println("Division of "+a+" and "+b+"="+c);
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of threads");
        int x=sc.nextInt();
        
        ArrayList<Integer> arr=new ArrayList<Integer>();
        ArrayList<String> str=new ArrayList<String>();
        threadpool[] m1=new threadpool[x];
        Thread[] t1=new Thread[x];
        for(int i=0;i<x;i++){
        m1[i]=new threadpool(arr,str);
        //threadpool m2=new threadpool(arr,str);
        t1[i] =new Thread(m1[i]);  
        }
        
        //Thread t2 =new Thread(m2);  
        
        System.out.println("Enter the task numbers to be performed from the following:");
        System.out.println("1.Addition");
        System.out.println("2.Subtract");
        System.out.println("3.Multipllication");
        System.out.println("4.Division");
        System.out.println("Enter the number of tasks:");
        int n=sc.nextInt();
        
        if(n>4){
            System.out.println("The highest number of tasks can be performed is 4.Enter the number of tasks less than 4");
            int n1=sc.nextInt();
            System.out.println("Enter the task numbers:");
        for(int i=0;i<n1;i++){
            enqueue(sc.nextInt()); 
        }
        }
        else{
        System.out.println("Enter the task numbers:");
        for(int i=0;i<n;i++){
            enqueue(sc.nextInt()); 
        }
        }
        
        //System.out.println("Enter the number of threads:");
        //int t=sc.nextInt();
        
        
        //threadpool[] t3=new threadpool[t];
        for(int i=0;i<x;i++){
        t1[i].start();
        try{
        Thread.sleep(500);
    }
    catch(InterruptedException e){
        System.out.println(e);
    }
        }   //t2.start();
        
    }
    
}
