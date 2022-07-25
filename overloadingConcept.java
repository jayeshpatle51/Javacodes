class Animal{
    
    public void m2(int a)
    {
        System.out.println("Animal version A2");
    }
}
class Monkey extends Animal{
    public void m2(int a)
    {
        System.out.println("Monkey version M2");
    }
}
class Test1{
    public void m1(Animal a)
    {
        System.out.println("Animal version");
    }
    public void m1(Monkey m)
    {
        System.out.println("Monkey version");
    }
}
public class overloadingConcept {

    public static void main(String[] args) {
        
        Test1 t=new Test1();
        Animal a=new Animal();
        t.m1(a);
        a.m2(0);
        System.out.println("---");
        
        Monkey m=new Monkey();
        t.m1(m);
        m.m2(0);
        System.out.println("---");
        
        Animal a1=new Monkey();
        t.m1(a1);
        a1.m2(0);
        System.out.println("---");
    }
}