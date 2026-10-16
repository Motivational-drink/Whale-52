//Done,might have errors hope not <3 how to make it run?
import java.util.*;
class CloverMaths{
int a,b,c;
int ch;
void accept()
{Scanner sc= new Scanner(Sytem.in);
System.out.println("Enter two values");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("Enter choice /n Menu /n 1.Add /n 2.Subtract /n 3.Multiply /n 4.Divide");
ch=sc.nextInt();}

void Menu()
{ switch(ch){
case 1: c=a+b;
break;
case 2: c=a-b:
break;
case 3: c=a*b;
break;
case 4: c=a/b;
break;
default:System.out.println("Enter valid value");
} 
}
void display(){
System.out.println("1st Number:"+a);
System.out.println("2nd Number:"+b);
System.out.println("Result:"+c);

}
public static void main(String args[]){

CloverMaths calculation=new CloverMaths();
calculation.accept();
calculation.Menu();
calculation.display();


}
}

}
