package payroll;

class OrderNotFoundException extends RuntimeException {
    OrderNotFoundException(Long id) {super("Could not find order with id "+ id);}
}
