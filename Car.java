class Vehicle {
    String make, model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Make: " + make + ", Model: " + model);
    }
}

class Car extends Vehicle {
    String carType;

    public Car(String make,String model,String carType) {
        super(make, model);
        this.carType = carType;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Car Type: " + carType);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Sedan", "Nexa", "Swift");
        myCar.displayInfo();
    }
}
