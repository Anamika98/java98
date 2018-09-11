interface Animal
{
public void speak();
public void eat();
}
class cat implements Animal
{
public void speak()
{
System.out.println("cat do meow");
}
public void eat()
{
System.out.println("cat eats food");
}
}
class Dog implements Animal
{
public void speak()
{
System.out.println("dog barks");
}
public void eat()
{
  System.out.println("dog eats food");
}
}
class Interface
{
  public static void main(String args[])
  {
    Animal c = new cat();
    c.speak();
    c.eat();
    Animal d = new Dog(); 
    d.speak();
    d.eat();
 }
}