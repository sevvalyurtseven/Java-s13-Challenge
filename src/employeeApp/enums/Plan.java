package employeeApp.enums;

public enum Plan {
    BASIC("BASIC", 3000),
    MEDIUM("MEDIUM", 5000),
    ADVANCE("ADVANCE", 8000);

    private String name;
    private int price;

    // NOT: Enum'larin Constructor'larina Access Modifier yazilmaz.

    //CONSTRUCTOR'IM:

    Plan(String name, int price){
        this.name = name;
        this.price = price;
    }
    // GETTER METHODLARIM:
    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }
}
