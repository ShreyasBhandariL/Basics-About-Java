public class ConstructorOverloading {
    String name;
    int age;
    int usn;
    ConstructorOverloading()
    {
        name="Shreyas Bhandari L";
        age = 20;
        usn = 202;
    }
    ConstructorOverloading(String name1)
    {
        name=name1;
    }
    void display()
    {
        System.out.println(name+" "+age+" "+usn);
    }

    public static void main(String[] args) {
        ConstructorOverloading s=new ConstructorOverloading();
        ConstructorOverloading s1=new ConstructorOverloading("Shreyas");
        s.display();
        s1.display();
    }
}
