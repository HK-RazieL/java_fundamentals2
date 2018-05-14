package p05_transport_price;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int kilometers = Integer.parseInt(reader.readLine());
        String timeOfDay = reader.readLine();
        double result = 0.0;

        if (kilometers < 20) {
            double initialTax = 0.7;
            if (timeOfDay.equals("day")) {
                result = initialTax + (kilometers * 0.79);
            } else {
                result = initialTax + (kilometers * 0.90);
            }
        } else if (kilometers >= 20 && kilometers < 100) {
            result = kilometers * 0.09;
        } else {
            result = kilometers * 0.06;
        }

        System.out.printf("%.2f", result);

    }
}
