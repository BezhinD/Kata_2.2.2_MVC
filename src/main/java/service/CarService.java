package service;
import model.Car;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
   private final List<Car> cars;
    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", 123123, "yellow"));
        cars.add(new Car("BMW", 123, "white"));
        cars.add(new Car("Opel", 412, "green"));
        cars.add(new Car("Audi", 133221, "purple"));
        cars.add(new Car("Audi", 13, "red"));
    }
    public List<Car> getCars(int count) {
        if (count <= 0) {
            return  cars;
        } else {
            return cars.subList(0, count);
        }

    }


}
