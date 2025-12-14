

package w9;

public class person{
  private int Age;
  private String Name;

    public person() {
    }

    public person(int Age, String Name) {
        this.Age = Age;
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public String toString() {
        return "person{" + "Age=" + Age + ", Name=" + Name + '}';
    }
  
  
  
  
  
  
    }
