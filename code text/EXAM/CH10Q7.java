package EXAM;

public class CH10Q7 {
    public static void main(String[] args) {
        Product product = new Product();
        int n = 10;
        System.out.println(product.calculate(n));
    }
}

class Product {
    public long calculate(int n) {
        if (n == 0) {
            return 1;
        }
        return n * calculate(n - 1);
    }
}
