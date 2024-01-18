package employeeApp;

import employeeApp.enums.Plan;
import employeeApp.model.Company;
import employeeApp.model.Employee;
import employeeApp.model.Healthplan;

import java.util.Arrays;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        Healthplan h1 = new Healthplan(1, "A Sigorta", Plan.BASIC);
        Healthplan h2 = new Healthplan(2, "B Sigorta", Plan.ADVANCE);

        System.out.println(h1);
        System.out.println(h2);

        //["A Sigorta", "B Sigorta", null]

        String[] healthPlans = new String[3];
        healthPlans[0] = h1.getName();
        healthPlans[1] = h2.getName();


        Employee employee = new Employee(1, "Sevval Yurtseven",
                "sevvalyurtseven@hotmail.com", "1234", healthPlans);

        Employee employee1 = new Employee(2, "Ozge Dogru",
                "ozgeozge@hotmail.com", "1234", healthPlans);

        employee.addHealthPlan(0, "C Sigorta");
        employee.addHealthPlan(2, "A Sigorta");
        employee.addHealthPlan(2, "X Sigorta");
        employee.addHealthPlan(3, "Y Sigorta");

        System.out.println(Arrays.toString(employee.getHealthPlans()));


        System.out.println(employee);
        System.out.println(employee1);

        //["Sevval Yurtseven", "Ozge Dogru", null]

        String[] developerNames = new String[3];
        developerNames[0] = employee.getFullName();
        developerNames[1] = employee1.getFullName();



        Company company = new Company(1, "Workintech",
                10000, developerNames);

        company.addEmployee(0, "Sevval Yurtseven");
        company.addEmployee(1, "Ozge Dogru");
        company.addEmployee(2, "Fatih");
        company.addEmployee(3, "Alptug");


        System.out.println(Arrays.toString(company.getDeveloperNames()));
        System.out.println(company);


    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
