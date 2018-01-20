package Start;

import factory.interfaces.AnimalsFactory;
import factoty.impl.PetsAnimalsFactory;
import factoty.impl.WildAnimalsFactory;
import java.io.*;

public class Start {
    private static AnimalsFactory factory;

    public static void main(String[] args) throws IOException {
        int n = 1;
        String s = "11";
        System.out.println("Для начала нажмите 11, а для выхода нажмите 0");

        while (s == "11") {
            for (int i = 0; i < n; i++) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                double t = Double.parseDouble(reader.readLine());

                String animals = "";

                if (t == 1) {
                    animals = "дикие животные";
                    factory = new WildAnimalsFactory();
                    factory.createDogs().play();
                    factory.createDogs().run_fast();
                    factory.createCats().play();
                    factory.createCats().climb_up_trees();


                } else if (t == 2) {
                    animals = "домашние животные";
                    factory = new PetsAnimalsFactory();
                    factory.createDogs().play();
                    factory.createDogs().run_fast();
                    factory.createCats().play();
                    factory.createCats().climb_up_trees();

                } else if (t == 3) {
                    animals = "интерфейс пока не определён";
                    System.out.println("Для окончания программы нажмите 0");
                }
                else if (t == 11) {
                    animals = "Начало";
                    System.out.println("1 - дикие животные; 2 - домашние животные; 3 - интерфейс пока не определён");
                    switch (s = "11") {
                    }
                }
                else if (t == 0) {
                    animals = "Конец";
                    switch (s = "0") {
                    }
                }
                System.out.println(animals);
            }
        }
    }
}

