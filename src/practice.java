public class practice {

    public static void main(String[] args) {
        System.out.println(powerof(5, 4));

    }

    public static int powerof(int base, int exp) {
        if (exp == 2) return base * base;
        else return powerof(base, exp-1);
    }
}
