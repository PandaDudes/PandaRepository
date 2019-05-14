public class ZooDriver
{
public static void main(String[] args)
 {
Lion lion1 = new Lion();
Lion lion2 = new Lion("Riku", 5, 'm', "Steak");
lion1.setFood("shrimp");
lion1.setAge(8);
lion1.setGender('m');
lion1.setName("Alex");



int age1 = lion1.getAge();
int age2 = lion2.getAge();



Panda panda1 = new Panda();
Panda panda2 = new Panda("Shio", 7,'m',"small rodents");
panda1.setFood("bamboo");
panda1.setAge(14);
panda1.setGender('m');
panda1.setName("Tai Shan");

int pandaAge1 = panda1.getAge();
int pandaAge2 = panda2.getAge();

Giraffe giraffe1 = new Giraffe();
Giraffe giraffe2 = new Giraffe("sven", 14,'m',"apples");
giraffe1.setFood("leaves");
giraffe1.setAge(16);
giraffe1.setGender('f');
giraffe1.setName("April");

int giraffeAge1 = giraffe1.getAge();
int giraffeAge2 = giraffe2.getAge();

if ( pandaAge1 < 10)
  System.out.println(panda1.getName() + " is a young panda");
else if ( pandaAge1 < 20)
  System.out.println(panda1.getName() + " is a middle aged panda");
else
  System.out.println(panda1.getName() + " is an old panda");
  
 System.out.println(panda1.getName() +" likes " + panda1.getFood());
      System.out.println(panda1);
      System.out.println(panda2);
      if ( giraffeAge1 < 8)
  System.out.println(giraffe1.getName() + " is a young giraffe");
else if ( giraffeAge1 < 16)
  System.out.println(giraffe1.getName() + " is a middle aged giraffe");
else
  System.out.println(giraffe1.getName() + " is an old giraffe");
  
 System.out.println(giraffe1.getName() +" likes " + giraffe1.getFood());
      System.out.println(giraffe1);
      System.out.println(giraffe2);
if ( age1 < 10)
  System.out.println(lion1.getName() + " is a young lion");
else if ( age1 < 20)
  System.out.println(lion1.getName() + " is a middle aged lion");
else
  System.out.println(lion1.getName() + " is an old lion");
{
if (age1 > age2 && age1 > pandaAge1 && age1 > pandaAge2 && age1 > giraffeAge1 && age1 > giraffeAge2)
  System.out.println(lion1.getName() + " is the oldest animal in the zoo!");
else if(age2 > age1 && age2 > pandaAge1 && age2 > pandaAge2 && age2 > giraffeAge1 && age2 > giraffeAge2)
  System.out.println(lion2.getName() + " is the oldest animal in the zoo!");
else if(pandaAge1 > age1 && pandaAge1 > age2 && pandaAge1 > pandaAge2 && pandaAge1 > giraffeAge1 && pandaAge1 > giraffeAge2)
  System.out.println(panda1.getName() + " is the oldest animal in the zoo!");
else if(pandaAge2 > age1 && pandaAge2 > age2 && pandaAge2 > pandaAge1 && pandaAge2 > giraffeAge1 && pandaAge2 > giraffeAge2)
  System.out.println(panda2.getName() + " is the oldest animal in the zoo!");
else if(giraffeAge1 > age1 && giraffeAge1 > age2 && giraffeAge1 > pandaAge1 && giraffeAge1 > pandaAge2 && giraffeAge1 > giraffeAge2)
  System.out.println(giraffe1.getName() + " is the oldest animal in the zoo!");
else if(giraffeAge2 > giraffeAge1 && giraffeAge2 > age1 && giraffeAge2 > age2 && giraffeAge2 > pandaAge1 && giraffeAge2 > pandaAge2)
  System.out.println(giraffe2.getName() + " is the oldest animal in the zoo!");
}
 System.out.println(lion1.getName() +" likes " + lion1.getFood());
      System.out.println(lion1);
      System.out.println(lion2);
     
 }
}