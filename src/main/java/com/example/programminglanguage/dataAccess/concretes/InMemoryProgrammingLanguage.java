package com.example.programminglanguage.dataAccess.concretes;

import com.example.programminglanguage.dataAccess.abstracts.ProgrammingLanguageRepository;
import com.example.programminglanguage.entities.concretes.ProgrammingLanguage;

import java.util.ArrayList;
import java.util.List;

public class InMemoryProgrammingLanguage implements ProgrammingLanguageRepository {

    List<ProgrammingLanguage> programmingLanguageList;

    public InMemoryProgrammingLanguage() {
        programmingLanguageList = new ArrayList<>();
        programmingLanguageList.add(new ProgrammingLanguage(1, "Java"));
        programmingLanguageList.add(new ProgrammingLanguage(2, "C#"));
        programmingLanguageList.add(new ProgrammingLanguage(3, "Python"));
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageList;
    }

    @Override
    public ProgrammingLanguage add(ProgrammingLanguage programmingLanguage) {
        return null;
    }

    @Override
    public void delete(int id) {

    }


    @Override
    public ProgrammingLanguage update(int id, ProgrammingLanguage programmingLanguage) {
        return null;
    }

    @Override
    public ProgrammingLanguage getLanguageById(int id) {
        return programmingLanguageList.get(id);

    }
}
