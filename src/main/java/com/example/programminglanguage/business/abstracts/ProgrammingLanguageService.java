package com.example.programminglanguage.business.abstracts;

import com.example.programminglanguage.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {
    List<ProgrammingLanguage> getAll();

    void add(ProgrammingLanguage programmingLanguage);

    void delete(int id);

    void update(int id, ProgrammingLanguage programmingLanguage);

    ProgrammingLanguage getLanguageById(int id);

}
