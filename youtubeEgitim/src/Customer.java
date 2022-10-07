public class Customer {
    int id;
    String sehir;

    public Customer(){
        System.out.println("Musteri nesnesi baslatildi");
    }
   public int getId(){
        return id;
   }

    public void setId(int id) {
        this.id = id;
    }
    public String getSehir(){
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }
}
