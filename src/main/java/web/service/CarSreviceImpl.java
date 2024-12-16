package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarSreviceImpl implements CarService{
    private List<Car> cars = Arrays.asList(
            new Car("Fors", 3, 200000),
            new Car("BMW", 4, 300000),
            new Car("Audi", 5, 100000),
            new Car("Honda", 6, 600000),
            new Car("Mercedes", 7, 700000));


    public List<Car> getCars(int count) {
        if (count >= 5) {
            return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }
}
