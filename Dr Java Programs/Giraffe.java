public class Giraffe
{
private int age;
private String name;
private char gender;
private String food;

public Giraffe()
{
   name = "April";
   age = 16;
   gender = 'f';
   food = "leaves";
}
public Giraffe(String giraffeName, int a, char g, String f)
{
   name = giraffeName;
   age = a;
   gender = g;
   food = f;
} 
 public String getName()
  {
    return name;
  }
   public int getAge()
  {
    return age;
  }
   public int getGender()
  {
    return gender;
  }
  public String getFood()
  {
    return food;
  }
    public void setName(String giraffeName)
  {
    name = giraffeName;
  }
    public void setAge(int a)
  {
    age = a;
  }
      public void setGender(char g)
  {
    gender = g;
  }
  public void setFood(String f)
  {
    food = f;
  }
  
 public String toString()
  {
    if (gender == 'm')
        return name + " is a male who likes " + food + " and is " + age + " years old"; 
    else
        return name + " is a female who likes " + food + " and is " + age + " years old"; 
  }


}