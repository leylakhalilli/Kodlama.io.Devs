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


    @PostMapping("/add")
    public ProgrammingLanguage add(@RequestBody ProgrammingLanguage language) throws Exception {
        return languageService.add(language);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        languageService.delete(id);
        return "delete";
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable int id, @RequestBody ProgrammingLanguage language) throws Exception {
        languageService.update(id, language);
        return "update";
    }

    @GetMapping("/{id}")
    public ProgrammingLanguage getLanguageById(@PathVariable int id) {
        return languageService.getLanguageById(id);
    }

}
