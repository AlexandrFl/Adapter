public class Main {

    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println("Результат умножения");
        System.out.println(intsCalc.mult(2, 2));

        System.out.println("\nРезультат сложения");
        System.out.println(intsCalc.sum(10, 22));

        System.out.println("\nРезультат возведения в степень");
        System.out.println(intsCalc.pow(2, 10));
    }
}
