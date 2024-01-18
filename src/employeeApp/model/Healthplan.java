package employeeApp.model;

import employeeApp.enums.Plan;

public class Healthplan {
    //instance variable
    private int id;
    private String name;
    private Plan plan;

    //CONSTRUCTOR'IM:

    public Healthplan(int id, String name, Plan plan){
        this.id = id;
        this.name = name;
        this.plan = plan;
    }

    //TODO: Asla Getter metodlarinin icerisine logic eklemeyin!

    //GETTER VE SETTER METHODLARIM:
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    //TOSTRING() METHODUM:

    public String toString(){
        return "ID: " + this.id + "Name: " + this.name
                + "Plan Name " + plan.getName()
                + "Plan Price " + plan.getPrice();
    }
}
