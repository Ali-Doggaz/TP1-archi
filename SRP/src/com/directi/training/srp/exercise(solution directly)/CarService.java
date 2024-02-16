package com.directi.training.srp.exercise;

import java.util.List;

public class CarService {
    private CarDb carDb;

    public CarService(CarDb carDb) {
        this.carDb = carDb;
    }

    public String getCarsNames()
    {   
        List<Car> cars = carDb.getCars();
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    public Car getBestCar()
    {   List<Car> cars = carDb.getCars();
        Car bestCar = null;
        for (Car car : cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
    
    // main method 
    public static void main(String[] args) {
        CarDb carDb = new CarDb();
        CarService carService = new CarService(carDb);
        System.out.println(carService.getCarsNames());
        System.out.println(carService.getBestCar());
    }
}
