package com.example.programminglanguage.webApi;


import com.example.programminglanguage.business.abstracts.ProgrammingLanguageService;
import com.example.programminglanguage.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/languages")
public class ProgrammingLanguageController {


    private ProgrammingLanguageService languageService;

    @Autowired
    public ProgrammingLanguageController(ProgrammingLanguageService languageService) {
        this.languageService = languageService;
    }


    @GetMapping("/all")
    public List<ProgrammingLanguage> getAll() {
        return languageService.getAll();
    }

    @GetMapping("id/{id}")
    public ProgrammingLanguage getLanguageById(@PathVariable int id) {
        return languageService.getLanguageById(id);

    }

    @PostMapping("/add")
    public void add(@RequestBody ProgrammingLanguage language) {
        languageService.add(language);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        languageService.delete(id);
    }

    @PutMapping("/update/{id}")
    public void update(@PathVariable int id, @RequestBody ProgrammingLanguage language) {
        languageService.update(id, language);
    }

}
