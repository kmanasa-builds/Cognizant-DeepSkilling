public class Main {

    public static void main(String[] args) {

        CustomerRepository repository =
                new CustomerRepositoryImpl();

        CustomerService service =
                new CustomerServiceImpl(repository);

        service.displayCustomer();

    }

}