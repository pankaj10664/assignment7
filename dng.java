import java.util.*;
interface Animals
{
void speak();
default void eat()
{
System.out.println("this is the  animal class method");
}
}
class  Dog implements Animals
{
 public void speak()
{
System.out.println("this is the  dog class method");
}
 public void eat()
{

System.out.println("this is for  dog food");
}
}
class  Cat implements Animals
{
 public void speak()
{
System.out.println("this is the  cat class method");
}
public void eat()
{

System.out.println("this is for cat food");
}
}
class Cow extends Cat
{
 public void speak()
{
System.out.println("this is cow class method");
}
}
class Anml
{
public static void main(String args[])
{
Cow c1=new Cow();
c1.speak();
c1.eat();
Cat c2=new Cow();
Cat c3=new Cat();
c3.speak();
c3.eat();
c2.speak();
c2.eat();
}
}