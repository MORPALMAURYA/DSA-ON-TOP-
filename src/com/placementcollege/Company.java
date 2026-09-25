package com.placementcollege;

 class Employee {
     String name;
     String profile;
     double salary;


     public Employee(String name, String profile, double salary) {
        this.name = name;
        this.profile = profile;
        this.salary = salary;
     }

     public String getName() {
         return name;
     }

     public String getProfile() {
         return profile;
     }

     public double getSalary() {
         return salary;
     }

     void showDetails() {
         System.out.println("Name: " + name);
         System.out.println("Profile: " + profile);
         System.out.println("Salary: " + salary);
     }
 }

 class Developer extends Employee {
     String loginID;
     String password;

     public Developer(String name, String profile, double salary, String loginID, String password) {
         super(name,profile,salary);
         this.loginID=loginID;
         this.password=password;
     }
 }

class HR extends Employee {
    String loginID;
    String password;

    public HR(String name, String profile, double salary, String loginID, String password) {
        super(name,profile,salary);
        this.loginID=loginID;
        this.password=password;
    }

    public String getLoginID() {
        return loginID;
    }
    public String getPassword() {
        return password;
    }

    void   showDetails() {
        IO.print("Name: " + name);
        IO.println("Profile: " + profile);
        IO.println("Salary: " + salary);
        IO.println("Login ID: " + loginID);
        IO.println("Password: " + password);
    }
}



public class Company {
    static void main() {
         Developer d1 = new Developer("morpal","Full stack",23000,"qwe1234","123456");
         d1.showDetails();
        System.out.println();
         HR H1 = new HR("HR","HR",23000,"hr12","123456");
         H1.showDetails();
    }
}
