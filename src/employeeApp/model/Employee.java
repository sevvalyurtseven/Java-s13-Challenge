package employeeApp.model;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    //NOT: 2 adet constructor olusturdugum icin burada constructor overloading
    // yapmis olduk.

    public Employee(int id, String fullName){
        this.id = id;
        this.fullName = fullName;
    }

    public Employee(int id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }
}
