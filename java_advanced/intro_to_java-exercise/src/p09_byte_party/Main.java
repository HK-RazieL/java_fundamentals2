package p09_byte_party;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(reader.readLine());

        }

        while(true) {
            String[] command = reader.readLine().split("\\s+");
            if (command[0].equals("party")) break;
            int position = Integer.parseInt(command[1]);

            switch(command[0]){

                case "-1":
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = arr[i] ^ (1 << position);
                    }
                    break;
                case "0":
                    for (int i = 0; i < arr.length; i++) {
                        int mask = ~(1 << position);
                        arr[i] = arr[i] & mask;

                    }
                    break;
                case "1":
                    for (int i = 0; i < arr.length; i++) {
                        int mask = 1 << position;
                        arr[i] = arr[i] | mask;

                    }
                    break;
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
