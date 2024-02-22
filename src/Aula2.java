import java.util.Arrays;

public class Aula2 {
    public static void main(String[] args) {
        String[] cars = {"BMW", "tesla", "Jeep", "Fiat"};
        cars[2] = "Ferrari";
        System.out.println(Arrays.toString(cars));
        System.out.println(cars[2]);;
    }
}
