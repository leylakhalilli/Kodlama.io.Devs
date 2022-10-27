package com.example.programminglanguage.dataAccess.abstracts;

import com.example.programminglanguage.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageRepository {
    List<ProgrammingLanguage> getAll();

    void add(ProgrammingLanguage programmingLanguage);

    void delete(int id);

    void update(int id, ProgrammingLanguage programmingLanguage);

    ProgrammingLanguage getLanguageById(int id);
}
