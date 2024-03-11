package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author pizza
 * 04.03.2024
 */
public class CarServiceImpl implements CarService {
    public static final CarService carService = new CarServiceImpl();

    public CarServiceImpl() {

    }

    private final List<Car> cars = new ArrayList<>(Arrays.asList(new Car("Lada", "Grey", 1990),
                                                           new Car("Bentley", "Pink", 2024),
                                                           new Car("Mercedes", "Black", 1970),
                                                           new Car("Toyota", "White", 2001),
                                                           new Car("Honda", "Black", 1998)));

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count >= 5) {
            return cars;
        }
        List<Car> carsTemp = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            carsTemp.add(cars.get(i));
        }
        return carsTemp;
    }
}
