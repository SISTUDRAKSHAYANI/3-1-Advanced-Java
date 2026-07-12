import java.util.*;
public class SenderReceiver{
static void sender(){
    System.out.println("Sender:Hi");
}
static void receiver(){
    try{
        Thread.sleep(5000);
    }
    catch(InterruptedException e){
        e.printStackTrace();
    }
    System.out.println("Receiver:Hello");
    System.out.println("Receiver:What do you want?");
}
static void operation(String op,int a,int b){
    switch(op){
        case "+":
            System.out.println("Result="+(a+b));
            break;
        case "-":
            System.out.println("Result="+(a-b));
            break;
        case "*":
            System.out.println("Result="+(a*b));
            break;
        case "/":
            if(b!=0)
                System.out.println("Result="+(a/b));
            else
                System.out.println("Cannot perform division");
                break;
        default:
        System.out.println("Receiver:Invalid operation");
    }
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    sender();
    receiver();
    String choice;
    do{
    System.out.println("Enter operation(+,-,*,/):");
    String op=sc.next();
    if(op.equals("+")||op.equals("-")||op.equals("*")||op.equals("/")){
        System.out.print("Enter first number:");
        int a=sc.nextInt();
        System.out.print("Enter second number:");
        int b=sc.nextInt();
        operation(op,a,b);
    }
    else{
        System.out.println("Receiver:Invalid operation");
    }
    System.out.println("Receiver:Do you want to continue?(y/n):");
    choice=sc.next();
    }while(choice.equalsIgnoreCase("y"));
    System.out.println("Receiver:Bye");
    sc.close();
}
}