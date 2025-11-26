package Practice.file3.Abstraction;

class employee
{
    private int id;
    private String name;

    public employee()
    {
        id = 0;
        name = "sahil";

    }
    public employee(String myname , int myid)
    {
        id = myid;
        name = myname;

    }
    public employee(String myname)
    {

        name = myname;

    }
    public void display()
    {
        System.out.println(name);
        System.out.println(id);
    }
}
public class constructor
{
    public static void main(String[] args)
    {
        employee S = new employee();
        S.display();
    }
}
