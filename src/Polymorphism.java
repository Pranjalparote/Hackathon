class Car {
    private String name;
    private boolean engine;

    private int wheels;

    public Car(String name) {
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }


    public void startEngine() {
        System.out.println("Car: startEngine()");
    }

    public void accelerate() {
        System.out.println("Car:accelerate()");
    }

    public void brake() {
        System.out.println("Car:brake()");
    }
}

class Honda extends Car {
    public Honda(String name) {
        super(name);
    }

    @Override
    public void startEngine() {
        System.out.println("Honda:startEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println("Honda:accelerate()");
    }

    @Override
    public void brake() {
        System.out.println("Honda:brake()");
    }
}

class Toyota extends Car {
    public Toyota(String name) {
        super(name);
    }

    @Override
    public void startEngine() {
        System.out.println("Toyota:startEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println("Toyota:accelerate()");
    }

    @Override
    public void brake() {
        System.out.println("Toyota:brake()");
    }
}

class Nissan extends Car {
    public Nissan(String name) {
        super(name);
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " startEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println(getClass().getSimpleName() + " accelerate()");
    }

    @Override
    public void brake() {
        System.out.println(getClass().getSimpleName() + " brake()");
    }
}

public class Polymorphism {

    public static void main(String[] args) {


        for (int i = 1; i < 6; i++) {
            Car car = randomCar();
            System.out.println("Car #" + i + ": " + car.getName() + "\n"
                    + "\n");
            car.startEngine();
            car.accelerate();
            car.brake();
            System.out.println("\n");
        }

    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3 + 1);
        switch (randomNumber) {
            case 1:
                return new Honda("HondaCity");
            case 2:
                return new Toyota("I20");
            case 3:
                return new Nissan("I10");
        }
        return null;
    }
}

