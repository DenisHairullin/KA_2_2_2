package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> listCars() {
        return List.of(
                new Car("Audi", "A7", "Black"),
                new Car("Jaguar", "XJ", "Dark blue"),
                new Car("Tesla", "Model X", "White"),
                new Car("Nessan", "X-Trail", "Orange"),
                new Car("Volkswagen", "Passat", "Gray")
        );
    }

    @Override
    public List<Car> listCars(int count) {
        return listCars().stream().limit(count).toList();
    }
}
