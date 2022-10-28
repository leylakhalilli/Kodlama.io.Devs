package com.example.programminglanguage.business.abstracts;

import com.example.programminglanguage.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {
    List<ProgrammingLanguage> getAll();

    ProgrammingLanguage add(ProgrammingLanguage programmingLanguage) throws Exception;

    void delete(int id);

    void update(int id, ProgrammingLanguage programmingLanguage) throws Exception;

    ProgrammingLanguage getLanguageById(int id);

}
