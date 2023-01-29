class Kalkulator {
    public static void main(String[] args) {
        calculator suma = new calculator();
        suma.sum();
        suma.substraction() ;
    }
        private  void sum() {
            int a = 5;
            int b=10;
            int wynik= a+b;
            System.out.println( wynik);

        }
private void substraction() {
    double c = 10.5;
    double d = 15.0;
    double wynik2 = d - c;
    System.out.println(wynik2);
}
}



