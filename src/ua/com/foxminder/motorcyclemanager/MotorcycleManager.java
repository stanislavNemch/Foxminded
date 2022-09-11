package ua.com.foxminder.motorcyclemanager;

import java.util.ArrayList;
import java.util.List;

public class MotorcycleManager {
    public static void main(String[] args) {

        Motorcycle suzuki = new Motorcycle("Suzuki GSX-R1000", 2021, 16000, 600,
                Color.BLACK, "diesel", true);

        Motorcycle yamaha = new Motorcycle("Yamaha FZ1", 2007, 9000, 700, Color.YELLOW,
                "gas", false);

//        Motorcycle yamah = new Motorcycle("Yamaha FZ1",2007,9000,700, Color.YELLOW,
//                "gas",false);

        List<Motorcycle> motorcycles = new ArrayList<>();

        motorcycles.add(suzuki);
        motorcycles.add(yamaha);

        System.out.println(motorcycles + "\n");

        System.out.println(suzuki);
        System.out.println(yamaha);

        System.out.println(suzuki.equals(yamaha)); // Проверка одинаковы ли поля в объектах Motorcycle

        suzuki.setDistance(10000); //Установка пробега
        yamaha.setDistance(5000); //Установка пробега

        //yamaha.painting("yellow");

        suzuki.destroy(); // Не готовы к выезду isReadyToDrive
        yamaha.destroy(); // Не готовы к выезду isReadyToDrive

        System.out.println(suzuki);
        System.out.println(yamaha);

        System.out.println(suzuki.equals(yamaha));

        suzuki.repair(); // Восстановлены, готовы к выезду isReadyToDrive
        yamaha.repair(); // Восстановлены, готовы к выезду isReadyToDrive

        yamaha.painting("black"); // Установка, перекраска цвета

        suzuki.setDistance(11.5);
//        yamaha.setDistance(-11.5); // Проверка на отрицательное число Exception throw

        System.out.println(suzuki);
        System.out.println(yamaha);

        System.out.println(suzuki.isReadyToService()); // Проверка на прохождение сервиса больше 8000
        System.out.println(yamaha.isReadyToService()); // Проверка на прохождение сервиса больше 8000
    }
}