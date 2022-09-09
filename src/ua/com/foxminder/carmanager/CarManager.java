package ua.com.foxminder.carmanager;

public class CarManager {

    public static void main(String[] args) {

        Motorcycle suzuki = new Motorcycle();

        suzuki.name = "Suzuki GSX-R1000";
        suzuki.yearOfProduction = 2021;
        suzuki.price = 16000;
        suzuki.weight = 600;
        suzuki.color = "black";
        suzuki.engineType = "diesel";
        suzuki.isReadyToDrive = true;

        Motorcycle yamaha = new Motorcycle();

        yamaha.name = "Yamaha FZ1";
        yamaha.yearOfProduction = 2007;
        yamaha.price = 9000;
        yamaha.weight = 700;
        yamaha.color = "orange";
        yamaha.engineType = "gas";
        yamaha.isReadyToDrive = false;
    }
}
