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
    public void add(ProgrammingLanguage programmingLanguage) {
        if (!isExist(programmingLanguage)) {
            if (!programmingLanguage.getName().equals("")) {
                programmingLanguageList.add(programmingLanguage);

            }
        }
    }

    @Override
    public void delete(int id) {
        for (ProgrammingLanguage language : programmingLanguageList) {
            if (language.getId() == id) {
                programmingLanguageList.remove(language);
            }
        }

    }

    @Override
    public void update(int id, ProgrammingLanguage programmingLanguage) {

        for (ProgrammingLanguage language : programmingLanguageList) {
            if (language.getId() == id) {
                language.setId(language.getId());
                language.setName(language.getName());

            }
        }
    }


    @Override
    public ProgrammingLanguage getLanguageById(int id) {
        for (ProgrammingLanguage language : programmingLanguageList) {
            if (language.getId() == id) {
                return language;
            }
        }
        return null;
    }

    public boolean isExist(ProgrammingLanguage programmingLanguage) {
        boolean result = false;
        for (ProgrammingLanguage language : programmingLanguageList) {
            if (language.getName().equals(language.getName())) {
                result = true;
            }
        }
        return result;
    }
}
