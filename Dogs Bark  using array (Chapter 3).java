public class Dog {
    String name;
    public static void main (String[] args) {
        Dog Pet1 = new Dog ();
        Pet1.bark();
        Pet1.name="Jimmy";
        
        
        Dog [] mypets = new Dog[3];
        
        mypets[0]=new Dog();
        mypets[1]=new Dog();
        mypets[2]=Pet1;
        
        mypets[0].name = "Tom";
        mypets[1].name = "Criuse";
        
        System.out.print("last Dog name is ");
        System.out.println(mypets[2].name);
        
        int x=0;
        while (x < mypets.length) {
            mypets[x].bark();
            x=x+1;
        }
        
    }
    public void bark () {
        System.out.println(name + " says RAFF!");
    }
    public void eat() { }
    public void chaseCat() { }
}
