package com.example.java_web_final_project.service;

import com.example.java_web_final_project.model.Candy;
import com.example.java_web_final_project.model.CandyDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandyService {

    private final CandyRepository candyRepository;

    public CandyService(CandyRepository candyRepository) {
        this.candyRepository = candyRepository;
    }

    public List<Candy> getAll(){
        return candyRepository.findAll();
    }

    public Candy getById( long candyId ) {
        return candyRepository.findById(candyId);
    }

    public void addCandy(CandyDTO newCandy){
        Candy candyToAdd = new Candy();

        candyToAdd.setName(newCandy.name());
        candyToAdd.setFlavor(newCandy.flavor());
        candyToAdd.setTexture(newCandy.texture());

        candyRepository.save(candyToAdd);
    }

    public void putCandy(Candy candy) {
        long id = candy.getId();
        Candy foundCandy = candyRepository.findById(id);
        foundCandy.setFlavor((candy.getFlavor()));
        foundCandy.setName(candy.getName());
        foundCandy.setTexture(candy.getTexture());
        candyRepository.save(foundCandy);
    }

    public void putCandy(long id, CandyDTO candy) {
        Candy foundCandy = candyRepository.findById(id);
        foundCandy.setFlavor((candy.flavor()));
        foundCandy.setName(candy.name());
        foundCandy.setTexture(candy.texture());
        candyRepository.save(foundCandy);
    }

    public void delete (long candyId) {
        candyRepository.deleteById(candyId);
    }


}
