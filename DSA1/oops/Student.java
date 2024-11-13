package oops;
public class Student implements Comparable<Student>,Cloneable
{
    int rno;
    String name;

    public Student(String name, int rno) {
        this.name = name;
        this.rno = rno;
    }

    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        return this.name.compareTo(o.name);
       
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name+" "+rno;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        
        return super.clone();
    }
    
    
    
    
}