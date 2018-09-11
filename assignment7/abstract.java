abstract class Animal
{
String colour;
String breed;
String name;
abstract public void eat();
public void speak()
{
System.out.println("cat do meow");
}
}
class Cat extends Animal
{
public void eat()
{
System.out.println("cat eats food");
}
}
class Abstract
{
public static void main(String args[])
{
Animal d = new Cat();
d.speak();
d.eat();
}
}