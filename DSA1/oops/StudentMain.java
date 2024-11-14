package oops;

import collections.Enums;
import java.util.Arrays;

public class StudentMain {
    public static void main(String[] args) throws CloneNotSupportedException {
            Enums obj=new Enums();
            obj.main(new String[]{"ruir,","rtet"});
        {
            Student s1=new Student("kunal",10);
            Student s2=new Student("ravi",11);
            Student s3=new Student("sailu",13);
            Student s4=new Student("preethi",15);
            Student s5=new Student("siri",5);
            Student sp=(Student)s1.clone();
            Student arr[]={s1,s2,s3,s4,s5};
            System.out.println(sp);
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));

        }
    }
}
