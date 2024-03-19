package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao{
    private static int ID_COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++ID_COUNT, "VAZ 2101", 1972));
        cars.add(new Car(++ID_COUNT, "VAZ 2102", 1977));
        cars.add(new Car(++ID_COUNT, "VAZ 2103", 1982));
        cars.add(new Car(++ID_COUNT, "VAZ 2104", 1987));
        cars.add(new Car(++ID_COUNT, "VAZ 2105", 1992));

    }


    @Override
    public List<Car> cars() {
        return cars;
    }

}
