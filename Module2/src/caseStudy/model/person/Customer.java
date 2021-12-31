package caseStudy.model.person;


public class Customer extends Person implements Comparable<Customer> {

   private String typeCustomer;
   private String addressService;

    public Customer(String id, String name, String dayOfBirth, String idCitizen, String phoneNumber, String email, String typeCustomer, String addressService) {
        super(id, name, dayOfBirth, idCitizen, phoneNumber, email);

        this.typeCustomer = typeCustomer;
        this.addressService = addressService;
    }

    public Customer(String gender, String typeCustomer, String addressService) {

        this.typeCustomer = typeCustomer;
        this.addressService = addressService;
    }




    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddressService() {
        return addressService;
    }

    public void setAddressService(String addressService) {
        this.addressService = addressService;
    }

    @Override
    public String toString() {
        return "Customer{" +super.toString()+
                ", typeCustomer='" + typeCustomer + '\'' +
                ", addressService='" + addressService + '\'' +
                '}';
    }


    @Override
    public int compareTo(Customer o) {
        return this.getId().compareTo(o.getId());
    }
}
