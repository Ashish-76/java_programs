// marker ques2.
interface PermissionAllowed {
}
class chatore implements PermissionAllowed{
    void sabji(){
        System.out.println("Paneer lababdaar, Paneer Tikka, Shahi Paneer, Paneer Butter Masala, Mushroom Masala, Mushroom Butter Fry");
    }
    void Bread()
    {
        System.out.println("Naan, Butter Naan, Roti, Laccha Paratha, Mughalai Paratha, Rumali Roti");
    }
}
class Padhai{
    void read()
    {
        System.out.println("Nhi samajh aa raha ye koonsa subject hai");
    }
    void write()
    {
        System.out.println("kaise padhe ye bekaar subject bata do.");
    }
}
class Student extends Padhai implements PermissionAllowed{
    void read()
    {
        System.out.println("Padhaai karni hai to kar le, warna baad me mat rona.");
    }
    void write()
    {
        System.out.println("Padhaai karni hai to kar le, warna baad me mat rona.");
    }
}
class Grant{
    void permit(PermissionAllowed p)
    {
        if(p instanceof chatore)
        {
            chatore c = (chatore)p;
            c.sabji();
            c.Bread();
        }
        else if(p instanceof Student)
        {
            Student s = (Student)p;
            s.read();
            s.write();
        }
        else
        {
            System.out.println("Permission Denied");
        }
    }
}
class merabhai
{
    public static void main(String[] args)
    {
        Grant g = new Grant();
        chatore c = new chatore();
        Student s = new Student();
        g.permit(c);
        g.permit(s);
    }
}