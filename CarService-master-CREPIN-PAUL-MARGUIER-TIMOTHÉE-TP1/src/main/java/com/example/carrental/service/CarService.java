package com.example.carrental.service;
import com.example.carrental.Car;
import com.example.carrental.repository.CarRepository;
import com.example.carrental.broker.Broker;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class CarService {
    
    @Autowired
    
    private CarRepository testmessage;
    
    @Autowired
    private Broker broker;
    
    public List<Car> findAll() {
        
        broker.message("Ajoutez une voiture");
        return (List<Car>) testmessage.findAll();
    }
    
    public List<Car> findByPlateNumber(String plateNumber) {broker.message("obtenir les voitures en fonction des numéros de plaque d'immatriculation");
    return testmessage.findByPlateNumber(plateNumber); }
    
    public Car save(Car car) {
        
        broker.message("Enregistrer une voiture");
        return testmessage.saveAndFlush(car);
    
    }
    
        public Car update(Car car) {
        
        broker.message("mise à jour es voitures");
        return testmessage.saveAndFlush(car);
    
    }
        
        public Optional <Car> getOne(Long id){
            
            broker.message("avoir les voitures par id");
            return testmessage.findById(id);
        }
    
    
    

    
}
