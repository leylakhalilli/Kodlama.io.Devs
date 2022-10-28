package com.example.programminglanguage.dataAccess.concretes;

import com.example.programminglanguage.dataAccess.abstracts.ProgrammingLanguageRepository;
import com.example.programminglanguage.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProgrammingLanguage implements ProgrammingLanguageRepository {

    List<ProgrammingLanguage> programmingLanguageList;

    public InMemoryProgrammingLanguage() {
        programmingLanguageList = new ArrayList<>();
        programmingLanguageList.add(new ProgrammingLanguage(1, "Java"));
        programmingLanguageList.add(new ProgrammingLanguage(2, "C#"));
        programmingLanguageList.add(new ProgrammingLanguage(3, "Python"));
        programmingLanguageList.add(new ProgrammingLanguage(4, "JavaScript"));
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageList;
    }


    @Override
    public ProgrammingLanguage add(ProgrammingLanguage programmingLanguage) {
        programmingLanguageList.add(programmingLanguage);
        return getLanguageById(programmingLanguage.getId());
    }

    @Override
    public void delete(int id) {
        programmingLanguageList.remove(id);

    }

    @Override
    public void update(int id, ProgrammingLanguage programmingLanguage) {
        ProgrammingLanguage language = getLanguageById(id);
        language.setName(programmingLanguage.getName());

    }


    @Override
    public ProgrammingLanguage getLanguageById(int id) {
        return programmingLanguageList.stream().filter(language -> language.getId() == id).findFirst().get();
    }

}
