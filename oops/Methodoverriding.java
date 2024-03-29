//A method defined in the superclass is inherited by its subclass and is used by the objects created by the subclass

class Shape 
{
 void draw()
 {
  System.out.println("Mention shape here");
 }

 void  numberOfSides()
 {
  System.out.println("side = 0");
 }
}

class Circle extends Shape 
{
 void draw()
 {
  System.out.println("CIRCLE ");
 }

 void numberOfSides()
 {
  System.out.println("side = 0 "); 
 }
}

class Box extends Shape 
{
 void draw()
 {
  System.out.println("BOX ");
 }

 void numberOfSides()
 {
  System.out.println("side= 6"); 
 }
}

class Triangle extends Shape 
{
 void draw()
 {
  System.out.println("TRIANGLE ");
 }

 void numberOfSides()
 {
  System.out.println("side = 3 ");
 }
}

class Overriding 
{
 public static void main (String args[])
 {
  Circle c = new Circle();
  c.draw();
  c.numberOfSides();

  Box b = new Box();
  b.draw();
  b.numberOfSides();

  Triangle t = new Triangle();
  t.draw();
  t.numberOfSides();
 }
}
