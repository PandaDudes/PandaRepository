
public class Lion
{
private int age;
private String name;
private char gender;
private String food;


public Lion()
{
   name = "Leo";
   age = 12;
   gender = 'm';
   food = "zebra";
} 

public Lion(String lionName, int a, char g, String f)
{
   name = lionName;
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
    public void setName(String lionName)
  {
    name = lionName;
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