import java.util.Scanner;
class program10
{public static void main(String args[])
{Scanner scob=new Scanner(System.in);
System.out.println("Enter two numbers:");
int num1=scob.nextInt();//20
int num2=scob.nextInt();//10
System.out.print("1:Addition");
System.out.print("2:Substraction");
System.out.print("3:Multiplition");
System.out.print("4:Division");
System.out.print("5:Modulus Division");
int choice=scob.nextInt();
if (choice==1)System.out.println(num1+"+"+num2+"="+(num1+num2));
else if (choice==2)System.out.println(num1+"-"+num2+"="+(num1-num2));
else if (choice==3)System.out.println(num1+"*"+num2+"="+(num1*num2));
else if (choice==4)System.out.println(num1+"/"+num2+"="+(num1/num2));
else if (choice==5)System.out.println(num1+"%"+num2+"="+(num1%num2));
}//main()
}//program10







