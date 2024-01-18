package employeeApp.model;

import java.util.Arrays;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }

    //NOT: Array'in size'i benim beklediğimin ötesinde oldugunda
    // ArrayIndexOutOfBoundsException hatası alırım. Bu senaryoya hazırlıklı
    // olabilmek icin try-catch blogu kullandık.

    //new String[4] => healthPlans = [BASIC, MEDIUM, null, null]

    public void addHealthPlan(int index, String name){
        //guarding(negatif durumdan kurtulmak)
        if(index < 0){
            System.out.println("Index degeri 0'dan kücük olamaz");
        }else{
            try{
                //name => A Sigorta
                //healthPlans => A Sigorta, B Sigorta

                boolean isExist = false;
                for(String healthPlan: healthPlans){
                    if(healthPlan != null && healthPlan.equals(name)){
                        isExist = true;
                        System.out.println(name + " HealthPlans içerisinde vardır. ");
                        break;
                    }
                }
                if(!isExist){
                    if(healthPlans[index] == null){
                        healthPlans[index] = name;
                    } else {
                        System.out.println("İlgili index doludur. " + index);
                    }
                }

            }catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("Invalid index: " + index);
            } catch (Exception exception){
                System.out.println("Error occured: " + exception.getMessage());
            }
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthPlans=" + Arrays.toString(healthPlans) +
                '}';
    }
}



