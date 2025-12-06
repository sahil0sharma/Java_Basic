package Inheritance.practice;
//Create a base class University with:
//name (String)
//location (String)
//Method:
//showInfo() prints both fields
//Derived class Department:
//deptName (String)
//facultyCount (int)
//Constructor must call super(...) to set base data.
//Override showInfo() to display base info then department info.
class university{
    String name;
    String location;

    university(String n, String l){
        this.name = n;
        this.location = l;
    }

    public void showInfo(){
        System.out.println(name + " " + location);
    }
}
class Department extends university{
    String deptname;
    int Facultycount;

    Department(String uniname, String uniloacation,String d, int f){
        super(uniname,uniloacation);
        this.deptname = d;
        this.Facultycount = f;
    }
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println(deptname + " " + Facultycount);
    }
}
public class Question1 {
    public static void main(String[] args) {
        Department d = new Department("sahil","pune","prince",13);
        d.showInfo();



    }
}
