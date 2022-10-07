public class Main {
    public static void main(String[] args) {
      /*  System.out.println("Hello world!");
        int[] sayilar1 = new int[] {1,2,3};
        int[] sayilar2 = new int[] {10,20,30};

        sayilar1=sayilar2;
        sayilar2[0]=1000;
        System.out.println(sayilar1[0]);*/

        Customer customer = new Customer();
        customer.id=1;
        customer.sehir="Ankara";

        Company company = new Company();
        company.id=2;
        company.companyName="Arçelik";
        company.taxNumber="10000";

        CustomerManager customerManager = new CustomerManager(new Person(),new MilitaryCreditManager());
        customerManager.save();


    }
}