package web.service;

import web.model.Car;

import java.util.List;

/**
 * @author pizza
 * 04.03.2024
 */
public interface CarService {
    List<Car> getCars(Integer count);
}
