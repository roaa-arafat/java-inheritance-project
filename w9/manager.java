
package w9;
public class manager extends employee{
    
private String department;
    
    public manager() {
    }

    public manager(String department) {
        this.department = department;
    }

    public manager(String department, int Id, double Salary) {
        super(Id, Salary);
        this.department = department;
    }

    public manager(String department, int Id, double Salary, int Age, String Name) {
        super(Id, Salary, Age, Name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "manager{" + "department=" + department + '}';
    }
    
    
    
    

    }
