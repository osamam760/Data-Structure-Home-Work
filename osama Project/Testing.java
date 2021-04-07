package src;

import javax.swing.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Testing {
//    Doublylinkedlist salary=new Doublylinkedlist();
//    public boolean rmove1( int ee)
//    { boolean ll=false;
//        if(salary.isempty())return ll;
//        else {
//            Doublylinkedlist<SalariedEmpolyee> list2=new Doublylinkedlist<>();
//            for (int i = 0; i <salary.getSize() ; i++) {
//                list2.Addlast(salary.renovefirst());
//                if(list2.first().getIdNumber()==ee)
//                {
//
//                }
//            }
////            for (int j = 0; j <list2.size() ; j++) {
////                employee.addLast(list2.removeFirst());
////            }
//        }
//        return ll;
//    }


    public static void main(String[] args) {

//        Account a =new Account();
//        a.Addmoney(350,1000,1);
//       // System.out.println(a.count());
//        a.Addmoney(350,100,1);
//        //System.out.println(a.count());
//        a.Show_Your_Account(350);
         Scanner s=new Scanner(System.in);
          Manager m=new Manager();
//        System.out.println(m.Count_Employees());
//        m.Add_Employees("Hasan","Sharhan","Sana'a",9090);
//       // m.Add_Employees("Ali","ali","Adan",8080);
//        System.out.println(m.Count_Employees());
//        System.out.println("Enter the id");
//        int id;
//        id=s.nextInt();
//        if(m.rmove1(id)==true)
//        {
//            System.out.println("YES");
//        }else System.out.println("NO");
//        System.out.println(m.Count_Employees());

//        System.out.println(m.Count_Customer());
//        m.Add_Customers("Hasan","Sharhan","Sana'a",9090);
//        System.out.println(m.Count_Customer());
//        System.out.println("Enter account number");
//        int ac;
//        ac=s.nextInt();
//        m.rmove2(ac);
//
//        System.out.println(m.Count_Customer());
         Account a=new Account();
         a.Addmoney(350,1000,1);
         a.Addmoney(351,444,1);
         a.Show_Your_Account(350);

//        Customer c =new Customer("Hasan","Shara","DDD",9090);
//        System.out.println(c.getAccountNumber());
//        Customer c = new Customer();
//        c.get_Account();
//        Account a = new Account();
//       a.getQuentity();
//        Manager m=new Manager();
//        m.AddSalariedEmployee("Hassa","Shrhan","Sana'a",7676);
//        m.DisplayEmployees();
//        double mo[]=new double[3];
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter the money of YEmeni");
//        mo[0]=s.nextInt();
//        System.out.println("Enter the money of KSA");
//        mo[1]=s.nextInt();
//        System.out.println("Enter the money of Dolar");
//        mo[2]=s.nextInt();
//      KLJ k =new KLJ();
//








//        Account a=new Account();
//        a.Addmoney(350,1000,1);
//        int aa=s.nextInt();
//        a.Show_Your_Account(aa);
//          Account a=new Account();
//        System.out.println(a.count());
//        a.Addmoney(350,1000,1);
//        System.out.println(a.count());
//        System.out.println("Enter Account number");
//        int n=s.nextInt();
//        a.Show_Your_Account(n);
//        System.out.println(a.count());
//        Account a =new Account();
//        a.Addmoney(350,1000,1);
//        System.out.println(a.count());
//        a.Show_Your_Account(350);
        SalariedEmpolyee sa = new SalariedEmpolyee();








//        Manager m=new Manager();
//        System.out.println(m.Count_Employees());
//        m.Add_Employees("Hasan","Shahan","Sana'a",90000);
//        m.Add_Employees("Hasan","Shahan","Sana'a",90000);
//        //m.Add_Employees("Hasan","Shahan","Sana'a",90000);
//        //m.Add_Employees("Hasan","Shahan","Sana'a",90000);
//       // m.Add_Employees("Hasan","Shahan","Sana'a",90000);
//        System.out.println(m.Count_Employees());
//       // m.Display_E();
//        Scanner s =new Scanner(System.in);
//        int l=s.nextInt();
//        m.RemoveEmployee(l);
//        System.out.println(m.Count_Employees());
//       // m.Display_E();

//        System.out.println(k.hassan(mo,mo[0],mo[1],mo[2]));
//        Account a = new Account();
//        System.out.println(a.getType());
//        SalariedEmpolyee sa = new SalariedEmpolyee();
//        ArrayList<Customer> customers = new ArrayList<>();
//        Customer c1 = new Customer("Anwer", "Sharhan", "Sana'a", 32325);
//        Customer c2 = new Customer("Hassan", "Sharhan", "Sana'a", 65464);
//        Customer c3 = new Customer("Ali", "Sharhan", "Sana'a", 543233);
//        customers.add(c1);
//        customers.add(c2);
//        customers.add(c3);
//        for (int i = 0; i < customers.size(); i++) {
//            customers.get(i).Display();
//        }
//
//            System.out.println("Enter (1) if you want to add one type of money or (2) if they are two or " +
//                    "(3) if they are three");
//            Scanner s = new Scanner(System.in);
//            int an = s.nextInt();
//            if (an == 1) {
//                System.out.println("Enter your Account number ");
//                int ac = s.nextInt();
//                for (int i = 0; i < customers.size(); i++) {
//
//                    if (customers.get(i).getAccountNumber() == ac) {
//                        System.out.println("Wellcome " + customers.get(i).Fname + " " + customers.get(i).Lname);
//                        System.out.println(" Add  [  Yemeni (0) KSA (1) Dolar (2) ]");
//                        int t = s.nextInt();
//                        System.out.println("How much is it");
//                        double mo = s.nextDouble();
//                        if (sa.AddMoney(customers.get(i), ac, mo, t) == true) {
//                            System.out.println("The Opreation is Did");
//                        }
//
//                    }
//                   // customers.get(i).Display();
//                    break;
//                }
//            }
//
//            if (an == 2) {
//                System.out.println("Enter your Account number ");
//                int ac = s.nextInt();
//                for (int i = 0; i < customers.size(); i++) {
//                    if (customers.get(i).getAccountNumber() == ac) {
//                        System.out.println("Wellcome " + customers.get(i).Fname + " " + customers.get(i).Lname);
//                        System.out.println(" The firest  to Add  [  Yemeni (0) KSA (1) Dolar (2) ]");
//                        int t1 = s.nextInt();
//                        System.out.println("How much is it");
//                        double mo1 = s.nextDouble();
//                        System.out.println(" The Second  to Add  [  Yemeni (0) KSA (1) Dolar (2) ]");
//                        int t2 = s.nextInt();
//                        System.out.println("How much is it");
//                        double mo2 = s.nextDouble();
//                        if (customers.get(i).AddMoney(ac, mo1, t1, mo2, t2) == true) {
//                            System.out.println("The Opration is Did");
//                        }
//
//                    }
//                    customers.get(i).Display();
//                    break;
//                }
//            }
//            if (an == 3) {
//                System.out.println("Enter your Account number ");
//                int ac = s.nextInt();
//                for (int i = 0; i < customers.size(); i++) {
//                    if (customers.get(i).getAccountNumber() == ac) {
//                        System.out.println("Wellcome " + customers.get(i).Fname + " " + customers.get(i).Lname);
//                        System.out.println(" The firest  to Add Should be Yemeni  [  Yemeni (0) KSA (1) Dolar (2) ]");
//                        int t1 = s.nextInt();
//                        System.out.println("How much is it");
//                        double mo1 = s.nextDouble();
//                        System.out.println(" The Second  to Add Should be KSA  [  Yemeni (0) KSA (1) Dolar (2) ]");
//                        int t2 = s.nextInt();
//                        System.out.println("How much is it");
//                        double mo2 = s.nextDouble();
//                        System.out.println(" The Thired  to Add Should be Dolar  [  Yemeni (0) KSA (1) Dolar (2) ]");
//                        int t3 = s.nextInt();
//                        System.out.println("How much is it ");
//                        double mo3 = s.nextDouble();
//                        if (customers.get(i).AddMoney(ac, mo1, t1, mo2, t2, mo3, t3) == true) {
//                            System.out.println("The Opration is Did");
//                        }
//
//                    }
//                    customers.get(i).Display();
//                    break;
//                }
//            }
//        String f,l,a;  int ph,k;
//        Scanner s =new Scanner(System.in);
//        Account aa=new Account();
//        SalariedEmpolyee ss=new SalariedEmpolyee();
//        Manager m=new Manager();
//        System.out.println(aa.Count_Of_Operation());
//        ss.AddMoney(350,90000,3);
//        ss.AddMoney(350,90000,2,90000,3);
//        aa.AddMoney(350,90000,1,90000,2,90000,3);
//        aa.ShabMoney(350,1000,1);
//        aa.ShabMoney(350,1000,2,1000,3);
//        aa.ShabMoney(350,1000,1,1000,2,1000,3);
//        System.out.println(aa.Count_Of_Operation());
//        aa.Show_Operations();



//        System.out.println(m.Count_Employees());
//        m.Add_Employees("Hassan","Sharhan","Sana'a",9000);
//        System.out.println(m.Count_Employees());
//        m.Add_Employees("Hasan","Sharhan","Sana'a",9009);
//        m.Add_Employees("Hasan","Sharhan","Sana'a",9009);
//        System.out.println(m.Count_Employees());
//        k=s.nextInt();
//        m.RemoveEmployee(k);
//        System.out.println(m.Count_Employees());



//        System.out.println(m.Count_Employees());
//        System.out.println("Enter the number");
//        k=s.nextInt();
//        m.RemoveEmployee(k);
//        System.out.println(m.Count_Employees());
       // System.out.println(m.Count_Customer());
       //  m.Add_Customers("Hasan","Sharhan","Aden",90);
      //  System.out.println(m.Count_Customer());
       // k=s.nextInt();
       // m.RemoveCustomer(k);
       // System.out.println(m.Count_Customer());

//        HourlyEmpolyee h=new HourlyEmpolyee();
//        SingleLinkedlist s = new SingleLinkedlist();
//        System.out.println(m.Count_Sal_Employees());
//        m.Add_Employees("ALLLLL","AAAA","WWWww",99999);
//        System.out.println(m.Count_Sal_Employees());
//        System.out.println(s.getSize());
//        for (int i = 0; i <s.getSize() ; i++) {
//
//            System.out.println();
//        }
//        Doublylinkedlist salary= new Doublylinkedlist();
//        salary.Addfirst(m.Add_Employees("ALl","ALL","Asss",99999));
       // salary.Display();
      //  m.Add_Employees();
//        m.Add_Employees("Ali","ALLL","Sana'a",909090000);
//        m.Add_Employees("Ali","AAA","Adan",87654322);
       // Scanner s =new Scanner(System.in);
        // m.Display_Customers();
    // m.Add_Customers("Ali","Ali","Aden",808080);
        //m.RemoveEmployee(2002);
        //m.RemoveCustomer(354);

//        s.AddMoney(350,9000,2);
//        s.AddMoney(351,9000,1,900,2);
//        s.AddMoney(351,9000,1,90000,2,90000,3);
        //aa.AddMoney(351,10000,3,10000,2);
       // aa.AddMoney(350,1000,1,1000,2,1000,3);
      //  aa.ShabMoney(350,8000,3);
     //   aa.ShabMoney(350,10000,1,3000,2,13000,3);
    //    aa.ShabMoney(350,1000,3,2000,2);
        //aa.AddMoney(350,9000,3);
//        System.out.println("Enter F name");
//        f=s.next();
//        System.out.println("Enter l name");
//        l=s.next();
//        System.out.println("Enter address");
//        a=s.next();
//        System.out.println("Enter number ");
//          ph=s.nextInt();
      //  m.Add_Employees(f,l,a,ph);
//        m.Add_Customers(f,l,a,ph);
//        m.Display_Customers();
//        System.out.print("Customer\t\t\t");
//        m.Display_Customer(350);
//        System.out.print("Employees\t\t\t");
//        m.Display_Employees();
//        System.out.print("Employee");
//        m.Display_Employee(1000);
    //    System.out.println(h.ChangeMoney(1,3,600000));
//        int mm=10;
//        mm+=2;
//        System.out.println(mm);
//        mm=+2;
//        System.out.println(mm);
        }
    }
