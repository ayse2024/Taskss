package JD07;

public class EmployeeClients {
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();

        e1.name="Ahmet";
        e1.age=16;
        e1.gender='m';
        e1.jobTitle="Senior Developer";
        e1.salary=130_000;

        e2.name="Ayse";
        e2.age=42;
        e2.gender='f';
        e2.jobTitle="SDET";
        e2.salary=160_000;

        e3.name="Erkan";
        e3.age=12;
        e3.gender='m';
        e3.jobTitle="Student";
        e3.salary=10_000;

        e1.work();
        e2.work();
        e3.work();

        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());

    }
}
