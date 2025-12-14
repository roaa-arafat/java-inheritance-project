
package w9;


public class employee extends person{

    private int Id;
    private double Salary;
    
    public employee() {
    }

    public employee(int Id, double Salary) {
        this.Id = Id;
        this.Salary = Salary;
    }

    public employee(int Id, double Salary, int Age, String Name) {
        super(Age, Name);
        this.Id = Id;
        this.Salary = Salary;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    @Override
    public String toString() {
        return "employee{" + "Id=" + Id + ", Salary=" + Salary + '}';
    }
    
    
    
    
}
