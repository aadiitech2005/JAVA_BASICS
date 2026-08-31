import java.util.*;
public class studentGrade{
    void student_id(){
        byte math,science,english ,hindi,marks;
        float  percentage;
        short total;
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the math marks:");
       math=sc.nextByte();
       System.out.println("Enter the science marks:");
       science=sc.nextByte();
       System.out.println("Enter the english :");
       english=sc.nextByte();
       System.out.println("Enter the hindi marks");
       hindi=sc.nextByte();
       total=(short)(math+science+english+hindi);
       System.out.println("total marks:"+total);
       percentage=total/4;
       System.out.println("total percentge:"+percentage);
       if(percentage>=90)
       {
        System.out.print("grade A");
       }
       else if(percentage>=70)
       {
        System.out.print("grade B");
       }
        else if(percentage>=60)
        {
            System.out.print("grade C");
        }
        else if(percentage>=40)
        {
        System.out.print("grade D");
        }
        else{
        System.out.print("grade E");
        }
        }
        public static void main(String[] args)
        {
        studentGrade obj=new studentGrade();
        obj.student_id();
       }
    }