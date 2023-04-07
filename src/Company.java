public class Company {
    String brandName;
    Company(){
        brandName = "Apple";
    }
    public static void main(String[] args) {
        Company company = new Company();
        System.out.println(company.brandName);
    }
}
