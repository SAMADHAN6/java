class student {
    static int roll ;
    String name ;
    static String clg="MIT";
    static int count =0 ;

    student(){
        roll = -1 ;
        System.out.println("prn" + prn);
    }
    student(int r, String n,String nn){
        roll=r;
        name=n;
        clg=nn;
        count++;

    }
     static void display(){
        // System.out.println("Roll: "+roll);
        // System.out.println("Name: "+name);
        // System.out.println("College: "+clg);
        System.out.print("hey");



    }

    static class div {
        int batch_no;
        static int prn=243;

        div(){
            System.out.println("hey a=called it !!!" + count);
            System.out.println(roll);
        }
    }

}
public class Run{
    public static void main(String[] args){
        student s1=new student(1,"Sam","MITaoe");
        student s2=new student(2,"abd","mitwpu");
        System.out.println(student.count);
        // s1.display();
        // s2.display();

        // student.display();                       // static member access kre 

        student.div d1 = new student.div();

        

    }
}