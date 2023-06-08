package com.example.java_web_final_project.controller;

import com.example.java_web_final_project.model.Candy;
import com.example.java_web_final_project.model.CandyDTO;
import com.example.java_web_final_project.service.CandyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/candies")
@CrossOrigin
public class CandyController {

    private final CandyService candyService;

    public CandyController (CandyService candyService) {
        this.candyService = candyService;
    }

    @GetMapping
    public List<Candy> getAll() {
         return candyService.getAll();
    }

    @GetMapping("/{id}")
    public Candy findById(@PathVariable Long id) {
        return candyService.getById(id);
    }

    @PostMapping
    public void addCandy(@RequestBody CandyDTO candy) {
        candyService.addCandy(candy);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        candyService.delete(id);
    }

    @PutMapping
    public void putCandy(@RequestBody Candy newCandy) {

        candyService.putCandy(newCandy);
    }

    @PutMapping("/{id}")
    public void putCandy(@RequestBody CandyDTO newCandy, @PathVariable Long id) {
        candyService.putCandy(id, newCandy);
    }
}
