package ua.com.foxminder.carmanager;

public class CarManager {

    public static void main(String[] args) {

        Motorcycle suzuki = new Motorcycle("Suzuki GSX-R1000",2021, 16000,600,
                                Color.BLACK,"diesel",true);

        Motorcycle yamaha = new Motorcycle("Yamaha FZ1",2007,9000,700, Color.YELLOW,
                            "gas",false);

//        Motorcycle yamah = new Motorcycle("Yamaha FZ1",2007,9000,700, Color.YELLOW,
//                "gas",false);

        System.out.println(suzuki);
        System.out.println(yamaha);

        System.out.println(suzuki.equals(yamaha));

        suzuki.setDistance(250000);
        yamaha.setDistance(250000);

        suzuki.destroy();
        yamaha.destroy();

        System.out.println(suzuki);
        System.out.println(yamaha);

        System.out.println(suzuki.equals(yamaha));

        suzuki.repair();
        yamaha.repair();

        yamaha.painting("black");

        System.out.println(suzuki);
        System.out.println(yamaha);

        System.out.println(suzuki.equals(yamaha));
    }
}
