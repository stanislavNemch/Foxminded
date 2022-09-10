package ua.com.foxminder.carmanager;

public class CarManager {
    public static void main(String[] args) {

        Car prius = new Car("Toyota Prius", Color.GREEN, 2008, 1200, 1500);
        Bus renault = new Bus("Renault Laguna", Color.WHITE, 2000, 1600, 9700);
        Bus renault2 = new Bus("Renault Laguna", Color.WHITE, 2000, 1600, 9700);

        prius.addDistance(1000);
        prius.addDistance(2000);
        prius.addDistance(20.5);

        prius.addDistance(15000);
        renault.addDistance(15000);

        //prius.addDistance(-20.5);// Проверка на отрицательное число Exception throw

        System.out.println(prius);
        System.out.println(renault);

//        System.out.println(prius.equals(renault2));
//        System.out.println(renault.equals(renault2));

        System.out.println(prius.isReadyToService());
        System.out.println(renault.isReadyToService());

        //prius.service(); //Обнуление сервисного значения ноль
        //System.out.println(prius.isReadyToService());
    }
}