// Class with method overloading
class Printer {
    // Method to print an integer
    void printNumber(int num) {
        System.out.println("Printing integer: " + num);
    }

    // Overloaded method to print a double
    void printNumber(double num) {
        System.out.println("Printing double: " + num);
    }

    // Overloaded method to print a string
    void printNumber(String text) {
        System.out.println("Printing string: " + text);
    }
}

