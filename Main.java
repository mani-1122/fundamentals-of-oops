package oop;

public class Main
{
    // object
    public static void main(String[] args) {

        Customer customer;  // reference variable
        customer = new Customer(); // new customer object will created in Heap
        customer.id=11;
        customer.name="manikanta";
        customer.email="manikanta123@gmail.com";
        customer.salary=25000;

        System.out.println("Customer id :"+customer.id);
        System.out.println("Customer Name :"+customer.name);
        System.out.println("Customer email :"+customer.email);
        System.out.println("Customer salary :"+customer.salary);

        Customer customer2;
        customer2 = new Customer();
        customer2.id=12;
        customer2.name="sai";
        customer2.email="saia123@gmail.com";
        customer2.salary=45000;

        System.out.println("Customer id :"+customer2.id);
        System.out.println("Customer Name :"+customer2.name);
        System.out.println("Customer email :"+customer2.email);
        System.out.println("Customer salary :"+customer2.salary);



    }




}
