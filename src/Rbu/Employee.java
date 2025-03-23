package Rbu;



class Employee {
    String name ;
    int empid;
    Double Salary ;



// constructor



    public Employee(String name) {
        this.name = name;
    }
    public Employee(int empid) {
        this.empid = empid;
    }

    public Employee(Double salary) {
        Salary = salary;
    }
    public void displayDetails(){
        System.out.println("Empolyee id"+empid);
        System.out.println("name"+name);
        System.out.println("Salary"+Salary);
    }

}


 class Manager  extends Employee{
    String Department;

    public Manager(String name , int empid ,double Salary,String Deparrtment);
}




class Devloper extends Employee{
    String progrsammingLanguage;
    public Devloper(String name ,int empid ,double Salary,String progrsammingLanguage){
        Super(name,empid,salary);

    }

}


