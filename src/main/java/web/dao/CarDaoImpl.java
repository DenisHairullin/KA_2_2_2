package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> CARS = List.of(
            new Car("Audi", "A7", "Black"),
            new Car("Jaguar", "XJ", "Dark blue"),
            new Car("Tesla", "Model X", "White"),
            new Car("Nessan", "X-Trail", "Orange"),
            new Car("Volkswagen", "Passat", "Gray")
    );

    @Override
    public List<Car> listCars() {
        return CARS;
    }

    @Override
    public List<Car> listCars(int count) {
        return count >= 0 ? listCars().stream().limit(count).collect(Collectors.toList())
                : Collections.emptyList();
    }
}
